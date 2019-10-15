/**
 * generated by Xtext 2.12.0
 */
package com.coffee.hlvl.impl;

import com.coffee.hlvl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HlvlFactoryImpl extends EFactoryImpl implements HlvlFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static HlvlFactory init()
  {
    try
    {
      HlvlFactory theHlvlFactory = (HlvlFactory)EPackage.Registry.INSTANCE.getEFactory(HlvlPackage.eNS_URI);
      if (theHlvlFactory != null)
      {
        return theHlvlFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new HlvlFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HlvlFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case HlvlPackage.MODEL: return createModel();
      case HlvlPackage.ELM_DECLARATION: return createElmDeclaration();
      case HlvlPackage.DECLARATION: return createDeclaration();
      case HlvlPackage.CONSTANT_DECL: return createConstantDecl();
      case HlvlPackage.VARIABLE_DECL: return createVariableDecl();
      case HlvlPackage.OPTIONS_DECLARATION: return createOptionsDeclaration();
      case HlvlPackage.INTERVAL: return createInterval();
      case HlvlPackage.ENUMERATION: return createEnumeration();
      case HlvlPackage.REL_DECLARATION: return createRelDeclaration();
      case HlvlPackage.RELATION: return createRelation();
      case HlvlPackage.COMMON: return createCommon();
      case HlvlPackage.PAIR: return createPair();
      case HlvlPackage.COMPLEX_IMPLIES: return createComplexImplies();
      case HlvlPackage.COMPLEX_MUTEX: return createComplexMutex();
      case HlvlPackage.VAR_LIST: return createVarList();
      case HlvlPackage.DECOMPOSITION: return createDecomposition();
      case HlvlPackage.GROUP: return createGroup();
      case HlvlPackage.RANGE: return createRange();
      case HlvlPackage.VISIBILITY: return createVisibility();
      case HlvlPackage.ORDER: return createOrder();
      case HlvlPackage.CONSTRAINT: return createConstraint();
      case HlvlPackage.RELATIONAL: return createRelational();
      case HlvlPackage.QUALIFIED_NAME: return createQualifiedName();
      case HlvlPackage.OPERATIONS: return createOperations();
      case HlvlPackage.OPERATION: return createOperation();
      case HlvlPackage.LIST_OF_VALUES: return createListOfValues();
      case HlvlPackage.LIST_OF_IDS: return createListOfIDs();
      case HlvlPackage.LIST_OF_REL_REFS: return createListOfRelRefs();
      case HlvlPackage.MIXED_LIST: return createMixedList();
      case HlvlPackage.NAMED_ITEM: return createNamedItem();
      case HlvlPackage.VALUATION: return createValuation();
      case HlvlPackage.LIST_OF_VALUATION: return createListOfValuation();
      case HlvlPackage.IFF: return createIff();
      case HlvlPackage.IMPLIES: return createImplies();
      case HlvlPackage.OR: return createOr();
      case HlvlPackage.AND: return createAnd();
      case HlvlPackage.EQUALITY: return createEquality();
      case HlvlPackage.COMPARISON: return createComparison();
      case HlvlPackage.PLUS: return createPlus();
      case HlvlPackage.MINUS: return createMinus();
      case HlvlPackage.MUL_OR_DIV: return createMulOrDiv();
      case HlvlPackage.NEGATION: return createNegation();
      case HlvlPackage.UNARY_FUNCTION: return createUnaryFunction();
      case HlvlPackage.INSTANCES: return createInstances();
      case HlvlPackage.ENTAILED: return createEntailed();
      case HlvlPackage.BINARY_FUNCTION: return createBinaryFunction();
      case HlvlPackage.BOOL_CONSTANT: return createBoolConstant();
      case HlvlPackage.VARIABLE_REF: return createVariableRef();
      case HlvlPackage.ATTRIBUTE_REF: return createAttributeRef();
      case HlvlPackage.SYMBOL_CONSTANT: return createSymbolConstant();
      case HlvlPackage.INT_CONSTANT: return createIntConstant();
      case HlvlPackage.SINGLE_INSTRUCTION: return createSingleInstruction();
      case HlvlPackage.VALID_CONF: return createValidConf();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElmDeclaration createElmDeclaration()
  {
    ElmDeclarationImpl elmDeclaration = new ElmDeclarationImpl();
    return elmDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declaration createDeclaration()
  {
    DeclarationImpl declaration = new DeclarationImpl();
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantDecl createConstantDecl()
  {
    ConstantDeclImpl constantDecl = new ConstantDeclImpl();
    return constantDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDecl createVariableDecl()
  {
    VariableDeclImpl variableDecl = new VariableDeclImpl();
    return variableDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OptionsDeclaration createOptionsDeclaration()
  {
    OptionsDeclarationImpl optionsDeclaration = new OptionsDeclarationImpl();
    return optionsDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interval createInterval()
  {
    IntervalImpl interval = new IntervalImpl();
    return interval;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Enumeration createEnumeration()
  {
    EnumerationImpl enumeration = new EnumerationImpl();
    return enumeration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelDeclaration createRelDeclaration()
  {
    RelDeclarationImpl relDeclaration = new RelDeclarationImpl();
    return relDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Relation createRelation()
  {
    RelationImpl relation = new RelationImpl();
    return relation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Common createCommon()
  {
    CommonImpl common = new CommonImpl();
    return common;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pair createPair()
  {
    PairImpl pair = new PairImpl();
    return pair;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexImplies createComplexImplies()
  {
    ComplexImpliesImpl complexImplies = new ComplexImpliesImpl();
    return complexImplies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexMutex createComplexMutex()
  {
    ComplexMutexImpl complexMutex = new ComplexMutexImpl();
    return complexMutex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarList createVarList()
  {
    VarListImpl varList = new VarListImpl();
    return varList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Decomposition createDecomposition()
  {
    DecompositionImpl decomposition = new DecompositionImpl();
    return decomposition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Group createGroup()
  {
    GroupImpl group = new GroupImpl();
    return group;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Range createRange()
  {
    RangeImpl range = new RangeImpl();
    return range;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Visibility createVisibility()
  {
    VisibilityImpl visibility = new VisibilityImpl();
    return visibility;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Order createOrder()
  {
    OrderImpl order = new OrderImpl();
    return order;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constraint createConstraint()
  {
    ConstraintImpl constraint = new ConstraintImpl();
    return constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Relational createRelational()
  {
    RelationalImpl relational = new RelationalImpl();
    return relational;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualifiedName createQualifiedName()
  {
    QualifiedNameImpl qualifiedName = new QualifiedNameImpl();
    return qualifiedName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operations createOperations()
  {
    OperationsImpl operations = new OperationsImpl();
    return operations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation createOperation()
  {
    OperationImpl operation = new OperationImpl();
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListOfValues createListOfValues()
  {
    ListOfValuesImpl listOfValues = new ListOfValuesImpl();
    return listOfValues;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListOfIDs createListOfIDs()
  {
    ListOfIDsImpl listOfIDs = new ListOfIDsImpl();
    return listOfIDs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListOfRelRefs createListOfRelRefs()
  {
    ListOfRelRefsImpl listOfRelRefs = new ListOfRelRefsImpl();
    return listOfRelRefs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MixedList createMixedList()
  {
    MixedListImpl mixedList = new MixedListImpl();
    return mixedList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedItem createNamedItem()
  {
    NamedItemImpl namedItem = new NamedItemImpl();
    return namedItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Valuation createValuation()
  {
    ValuationImpl valuation = new ValuationImpl();
    return valuation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListOfValuation createListOfValuation()
  {
    ListOfValuationImpl listOfValuation = new ListOfValuationImpl();
    return listOfValuation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Iff createIff()
  {
    IffImpl iff = new IffImpl();
    return iff;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Implies createImplies()
  {
    ImpliesImpl implies = new ImpliesImpl();
    return implies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Or createOr()
  {
    OrImpl or = new OrImpl();
    return or;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public And createAnd()
  {
    AndImpl and = new AndImpl();
    return and;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Equality createEquality()
  {
    EqualityImpl equality = new EqualityImpl();
    return equality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Comparison createComparison()
  {
    ComparisonImpl comparison = new ComparisonImpl();
    return comparison;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Plus createPlus()
  {
    PlusImpl plus = new PlusImpl();
    return plus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Minus createMinus()
  {
    MinusImpl minus = new MinusImpl();
    return minus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MulOrDiv createMulOrDiv()
  {
    MulOrDivImpl mulOrDiv = new MulOrDivImpl();
    return mulOrDiv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Negation createNegation()
  {
    NegationImpl negation = new NegationImpl();
    return negation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryFunction createUnaryFunction()
  {
    UnaryFunctionImpl unaryFunction = new UnaryFunctionImpl();
    return unaryFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instances createInstances()
  {
    InstancesImpl instances = new InstancesImpl();
    return instances;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entailed createEntailed()
  {
    EntailedImpl entailed = new EntailedImpl();
    return entailed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryFunction createBinaryFunction()
  {
    BinaryFunctionImpl binaryFunction = new BinaryFunctionImpl();
    return binaryFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoolConstant createBoolConstant()
  {
    BoolConstantImpl boolConstant = new BoolConstantImpl();
    return boolConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableRef createVariableRef()
  {
    VariableRefImpl variableRef = new VariableRefImpl();
    return variableRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeRef createAttributeRef()
  {
    AttributeRefImpl attributeRef = new AttributeRefImpl();
    return attributeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SymbolConstant createSymbolConstant()
  {
    SymbolConstantImpl symbolConstant = new SymbolConstantImpl();
    return symbolConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntConstant createIntConstant()
  {
    IntConstantImpl intConstant = new IntConstantImpl();
    return intConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleInstruction createSingleInstruction()
  {
    SingleInstructionImpl singleInstruction = new SingleInstructionImpl();
    return singleInstruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValidConf createValidConf()
  {
    ValidConfImpl validConf = new ValidConfImpl();
    return validConf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HlvlPackage getHlvlPackage()
  {
    return (HlvlPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static HlvlPackage getPackage()
  {
    return HlvlPackage.eINSTANCE;
  }

} //HlvlFactoryImpl
