/*
 * generated by Xtext 2.12.0
 */
package com.coffee.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

//Language items 
import com.coffee.tHLCL.Model

import com.coffee.tHLCL.DomainDeclaration
import com.coffee.tHLCL.Interval
import com.coffee.tHLCL.Enumeration
import com.coffee.tHLCL.Expression
import com.coffee.tHLCL.Number
import com.coffee.tHLCL.ListOfIDs
import com.coffee.tHLCL.Relational
import com.coffee.tHLCL.Variable
import com.coffee.tHLCL.Global
import com.coffee.tHLCL.IntConstant
import com.coffee.tHLCL.BoolConstant
import com.coffee.tHLCL.VariableRef
import com.coffee.tHLCL.Function
import com.coffee.tHLCL.Unary
import com.coffee.tHLCL.Negation
import com.coffee.tHLCL.MulOrDiv
import com.coffee.tHLCL.Plus
import com.coffee.tHLCL.Minus
import com.coffee.tHLCL.Comparison
import com.coffee.tHLCL.Equality
import com.coffee.tHLCL.And
import com.coffee.tHLCL.Or
import com.coffee.tHLCL.Implies
import com.coffee.tHLCL.Iff
/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class THLCLGenerator extends AbstractGenerator implements JavaCodeStrings {
	
	private String modelName
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		modelName= modelName(resource.contents.head as Model)
		fsa.generateFile(modelName+".java", toJavaCode(resource.contents.head as Model))
		

	}
		def modelName(Model model) {
		var name = model.name.toFirstUpper
		return name
	}
	def className(Resource res) {
		var name = res.URI.lastSegment
		println(name);
		return name.substring(0, name.indexOf('.'))
	}
	
	def toJavaCode(Model model) '''
		//Java imports
		«JAVA_IMPORTS»
		//imports for hlcl 
		«HLCL_IMPORTS»
		
		//imports for solver
		«SOLVER_IMPORTS»

		«CLASS_JAVADOC»
		«CLASS_DECLARATION» «modelName» { ««« open class
			
			«CLASS_ATTRIBUTES»
			«CONSTRUCTOR_JAVADOC»
			public «modelName»(String modelName){ «««Consructor declaration
				
				«CONSTRUCTOR_CODE»
			} ««« end Consructor 
			
			public static void main(String[] args) {
				«modelName» obj = new «modelName»("«modelName»");
				obj.run();
			}
			«RUN_METHOD»
			public void transformVars() {
«««				//declaring the variable for the model
«««				Identifier «modelName»Var = factory.newIdentifier("«modelName»");
«««				BinaryDomain «modelName»Dom= new BinaryDomain();
«««				«modelName»Var.setDomain(«modelName»Dom);	
«««				variables.put("«modelName»Var", «modelName»Var); //including the variable in the map
				«FOR c : model.variables»
					«declareVars(c)»
				«ENDFOR»
			}
			public void transformConstraints() {
«««				//declaring the constraint for the model
«««				IntBooleanExpression C«modelName»= factory.equals(variables.get("«modelName»Var"), getValue("1"));
«««				constraints.put("C«modelName»", C«modelName»);
«««				hlclProgram.add(C«modelName»);
				«FOR c : model.constraints»
					«declareCons(c.exp, c.name)»
				«ENDFOR»
			}
			«EVALUATE_SATISFIABILITY»
			«GET_VALUE_JAVADOC»
			«GET_VALUE_CODE»
			«GETTERS_SETTERS»
		} ««« ends Class
	'''
	def declareVars(Variable variable) '''
		//declaring variable «variable.name»
		Identifier «variable.name» = factory.newIdentifier("«variable.name»");
		«var String myType= variable.type.toString»
		«declareDomain(variable.domain, myType, variable.name)»
		variables.put("«variable.name»", «variable.name»); //including the variable in the map
	'''
	
	def declareDomain(DomainDeclaration domain, String type, String name) '''
		«IF type=="boolean"»  ««« the domain is of type boolean
			BinaryDomain «name»Dom= new BinaryDomain();
		«ELSE»	
			«IF domain instanceof Interval» ««« the domain is numeric, and declared as an interval
				RangeDomain «name»Dom= new RangeDomain(«domain.start.value», «domain.end.value»);
			«ELSE»
				«IF domain instanceof Enumeration» ««« the domain is declared as an enumeration
					«IF type.equals("symbolic")» ««« if the domain is an enumeration of strings (symbolic)
						StringDomain «name»Dom= new StringDomain();
						«FOR e : domain.list.values»
							«name»Dom.add("«e»"); ««« add each element in the enumeration as a string
						«ENDFOR»
					«ELSE» ««« if the domain is an enumeration of numbers
						IntervalDomain «name»Dom= new IntervalDomain(); 
						«FOR e : domain.list.values»
							«name»Dom.add(«(e as Number).value»); ««« add each element in the enumeration
						«ENDFOR»
					«ENDIF»	
				«ENDIF»
			«ENDIF»
		«ENDIF»
		«name».setDomain(«name»Dom);	
	'''
	
	def declareCons(Expression exp, String name) '''
		//
		//declaring constraint «name»
		«IF exp instanceof Global»
			«declareGlobal(exp, name)»
		«ELSE»
			«IF exp instanceof Relational»
					«declareRelational(exp, name)»
«««					«var Rule rule= exp as Rule»
«««					«declareRule(rule, name)»
«««				«ELSE»
«««					«IF exp instanceof FodaNary»
«««						«var FodaNary nary= exp as FodaNary»
«««						«declareNary(nary, name)»
«««					«ELSE»
«««						«var FodaUN unary= exp as FodaUN»
«««						«declareFodaUnary(unary, name)»
«««					«ENDIF»
			«ENDIF»
		«ENDIF»
		constraints.put("«name»", «name»);
		hlclProgram.add(«name»);
	'''
	def declareGlobal(Global exp, String name) '''
		SymbolicExpression «name»= factory.newSymbolic("«exp.op»"«declareIds(exp.vars)»);
		
	'''
	def declareIds(ListOfIDs idList) '''
		«FOR id : idList.ids»
			, variables.get("«id»")
		«ENDFOR»
	'''
	def declareRelational(Relational exp, String name) '''
		
		«IF exp instanceof BoolConstant»
			«IF exp.value == "true"»
				NumericIdentifier «name»=getValue("1");
			«ELSE»
				NumericIdentifier «name»=getValue("0");
			«ENDIF»
		«ELSE»
			«IF exp instanceof IntConstant»
				NumericIdentifier «name» = getValue("«exp.value»");
			«ELSE»
				«IF exp instanceof VariableRef»
					Identifier «name» = variables.get("«exp.variable.name»");
				«ELSE»
					«IF  exp instanceof Function»
						«declareFunction(exp, name)»
					«ELSE»
						«IF exp instanceof Unary »
							«declareUnary(exp, name)»
						«ELSE»
							«IF exp instanceof Negation»
								«declareNegation(exp, name)»
							«ELSE»
								«IF exp instanceof MulOrDiv»
									«declareMulOrDiv(exp, name)»
								«ELSE»
									«IF exp instanceof Plus»
										«declarePlus(exp, name)»
									«ELSE»
										«IF exp instanceof Minus»
											«declareMinus(exp, name)»
										«ELSE»
											«IF exp instanceof Comparison»
												«declareComparison(exp, name)»
											«ELSE»
												«IF exp instanceof Equality»
													«declareEquality(exp, name)»
												«ELSE»
													«IF exp instanceof And»
														«declareAnd(exp, name)»
													«ELSE»
														«IF exp instanceof Or»
															«declareOr(exp, name)»
														«ELSE»
															«IF exp instanceof Implies»
																«declareImplies(exp, name)»
															«ELSE»
																«IF exp instanceof Iff»
																	«declareIff(exp, name)»
																«ENDIF»
															«ENDIF»
														«ENDIF»
													«ENDIF»
												«ENDIF»
											«ENDIF»
										«ENDIF»		
									«ENDIF»									
								«ENDIF»											
							«ENDIF»
						«ENDIF»
					«ENDIF»
				«ENDIF»
			«ENDIF»
		«ENDIF»		
	'''
	def declareFunction(Function exp, String name) '''
		// «name» to be implemented in Variamos HLCL
	'''
	def declareUnary(Unary exp, String name) '''
		// «name» to be implemented in Variamos HLCL
	'''
	def declareNegation(Negation exp, String name) '''
		«declareRelational(exp.expression, name+"_negation")»
		IntBooleanExpression «name»=factory.not(«name»_negation);
	'''
	def declareMulOrDiv(MulOrDiv exp, String name) '''
		«declareRelational(exp.left, name+"_left")»
		«declareRelational(exp.right, name+"_right")»
		IntNumericExpression «name»=
		«IF exp.op =="*" »
			factory.prod(«name»_left, «name»_right);
		«ELSE»
			«IF exp.op =="/" »
			// «name» to be implemented in Variamos HLCL
			//factory.div(«name»_left, «name»_right);
			«ELSE»
				«IF exp.op =="mod" »
					// «name» to be implemented in Variamos HLCL
					//factory.div(«name»_left, «name»_right);
				«ENDIF»	
			«ENDIF»
		«ENDIF»		
	'''
	def declarePlus(Plus exp, String name) '''
		«declareRelational(exp.left, name+"_left")»
		«declareRelational(exp.right, name+"_right")»
		IntNumericExpression «name»=factory.sum(«name»_left, «name»_right);	
	'''
	def declareMinus(Minus exp, String name) '''
		«declareRelational(exp.left, name+"_left")»
		«declareRelational(exp.right, name+"_right")»
		IntNumericExpression «name»=factory.diff(«name»_left, «name»_right);	
	'''
	
	def declareEquality(Equality exp, String name) '''
		«declareRelational(exp.left, name+"_left")»
		«declareRelational(exp.right, name+"_right")»
		IntBooleanExpression «name»=
		«IF exp.op=="=" »
			factory.equals(«name»_left, «name»_right);
		«ELSE»
			«IF exp.op=="!=" »
				factory.notEquals(«name»_left, «name»_right);
			«ENDIF»						
		«ENDIF»		
	'''
	def declareComparison(Comparison exp, String name) '''
		«declareRelational(exp.left, name+"_left")»
		«declareRelational(exp.right, name+"_right")»
		IntBooleanExpression «name»=
		«IF exp.op==">" »
			factory.greaterThan(«name»_left, «name»_right);
		«ELSE»
			«IF exp.op==">=" »
				factory.greaterOrEqualsThan(«name»_left, «name»_right);
			«ELSE»
				«IF exp.op=="<" »
					factory.lessThan(«name»_left, «name»_right);
				«ELSE»
					«IF exp.op=="<=" »
						factory.lessOrEqualsThan(«name»_left, «name»_right);
					«ELSE»
						«IF exp.op=="=" »
							factory.equals(«name»_left, «name»_right);
						«ELSE»
							«IF exp.op=="!=" »
								factory.notEquals(«name»_left, «name»_right);
							«ENDIF»						
						«ENDIF»
					«ENDIF»
				«ENDIF»
			«ENDIF»
		«ENDIF»		
	'''
	def declareAnd(And exp, String name) '''
		«declareRelational(exp.left, name+"_left")»
		«declareRelational(exp.right, name+"_right")»
		IntBooleanExpression «name»=factory.and(«name»_left, «name»_right);		
	'''
	def declareOr(Or exp, String name) '''
		«declareRelational(exp.left, name+"_left")»
		«declareRelational(exp.right, name+"_right")»
		IntBooleanExpression «name»=factory.or(«name»_left, «name»_right);		
	'''
	def declareImplies(Implies exp, String name) '''
		«declareRelational(exp.left, name+"_left")»
		«declareRelational(exp.right, name+"_right")»
		IntBooleanExpression «name»=factory.implies(«name»_left, «name»_right);		
	'''
	def declareIff(Iff exp, String name) '''
		«declareRelational(exp.left, name+"_left")»
		«declareRelational(exp.right, name+"_right")»
		IntBooleanExpression «name»=factory.doubleImplies(«name»_left, «name»_right);		
	'''
	
}