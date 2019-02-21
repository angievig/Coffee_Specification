package com.coffee.generator.XCSP3;

import com.coffee.generator.CoffeeFactory;
import com.coffee.generator.FODAFactory;
import com.coffee.generator.TypeOfProblem;
import com.coffee.generator.XCSP3.XCSP3Factory;
import com.coffee.pLEC.Assignment;
import com.coffee.pLEC.Attributes;
import com.coffee.pLEC.BoolVal;
import com.coffee.pLEC.Refinement;
import com.coffee.pLEC.Structural;
import com.coffee.pLEC.Value;
import com.coffee.pLEC.VarDeclaration;
import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class CSPFactory extends XCSP3Factory implements FODAFactory, CoffeeFactory {
  /**
   * List with the constraints autogenerated for dealing with feature instances
   */
  private ArrayList<String> clonConstraints;
  
  public CSPFactory(final TypeOfProblem type) {
    super(type);
    ArrayList<String> _arrayList = new ArrayList<String>();
    this.clonConstraints = _arrayList;
  }
  
  /**
   * ===================================================================
   * ===================================================================
   * Methods Forthe FODAFactory interface
   */
  @Override
  public CharSequence getVariable(final VarDeclaration variable) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<var id=\"");
    String _name = variable.getName();
    _builder.append(_name);
    _builder.append("\">");
    CharSequence _valuesDeclaration = this.getValuesDeclaration(variable, variable.getVariants());
    _builder.append(_valuesDeclaration);
    _builder.append("</var>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  @Override
  public CharSequence getOptional(final VarDeclaration parent, final VarDeclaration child) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ge(");
    String _name = parent.getName();
    _builder.append(_name);
    _builder.append(", ");
    String _name_1 = child.getName();
    _builder.append(_name_1);
    _builder.append(")");
    return _builder;
  }
  
  @Override
  public CharSequence getMandatory(final VarDeclaration parent, final VarDeclaration child) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("eq(");
    String _name = parent.getName();
    _builder.append(_name);
    _builder.append(", ");
    String _name_1 = child.getName();
    _builder.append(_name_1);
    _builder.append(")");
    return _builder;
  }
  
  @Override
  public CharSequence getExcludes(final VarDeclaration left, final VarDeclaration right) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("le(add(");
    String _name = left.getName();
    _builder.append(_name);
    _builder.append(", ");
    String _name_1 = right.getName();
    _builder.append(_name_1);
    _builder.append("), 1) ");
    return _builder;
  }
  
  @Override
  public CharSequence getRequires(final VarDeclaration left, final VarDeclaration right) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("imp(");
    String _name = left.getName();
    _builder.append(_name);
    _builder.append(",gt(");
    String _name_1 = right.getName();
    _builder.append(_name_1);
    _builder.append(",1) )");
    return _builder;
  }
  
  @Override
  public CharSequence getGroupCardinality(final Structural exp, final Map<String, VarDeclaration> parents) {
    String _xblockexpression = null;
    {
      String idsSum = "add(";
      String implies = "";
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("and(");
      String output = _builder.toString();
      EList<VarDeclaration> _ids = exp.getGroup().getIds();
      for (final VarDeclaration child : _ids) {
        {
          String _implies = implies;
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("imp(");
          String _name = child.getName();
          _builder_1.append(_name);
          _builder_1.append(", ");
          String _name_1 = exp.getParent().getName();
          _builder_1.append(_name_1);
          _builder_1.append("),");
          implies = (_implies + _builder_1);
          String _idsSum = idsSum;
          String _name_2 = child.getName();
          String _plus = (_name_2 + ", ");
          idsSum = (_idsSum + _plus);
          parents.put(child.getName(), exp.getParent());
        }
      }
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("le(");
      int _length = idsSum.length();
      int _minus = (_length - 2);
      String _substring = idsSum.substring(0, _minus);
      _builder_1.append(_substring);
      _builder_1.append("), ");
      int _value = exp.getMin().getValue();
      _builder_1.append(_value);
      _builder_1.append(")");
      final String sumLessThan = _builder_1.toString();
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("ge(");
      int _length_1 = idsSum.length();
      int _minus_1 = (_length_1 - 2);
      String _substring_1 = idsSum.substring(0, _minus_1);
      _builder_2.append(_substring_1);
      _builder_2.append("), ");
      int _value_1 = exp.getMax().getValue();
      _builder_2.append(_value_1);
      _builder_2.append(")");
      final String sumGreaterThan = _builder_2.toString();
      String _output = output;
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append(implies);
      _builder_3.append(" imp(ge(");
      String _name = exp.getParent().getName();
      _builder_3.append(_name);
      _builder_3.append(", 1), and(");
      _builder_3.append(sumLessThan);
      _builder_3.append(", ");
      _builder_3.append(sumGreaterThan);
      _builder_3.append(")) )");
      _xblockexpression = output = (_output + _builder_3);
    }
    return _xblockexpression;
  }
  
  /**
   * ===================================================================
   * ===================================================================
   * Methods For cardinalities AttributesFactory interface
   */
  @Override
  public CharSequence getAttributes(final Attributes exp) {
    String _xblockexpression = null;
    {
      final String left = exp.getVar1().getName();
      String out = "";
      EList<VarDeclaration> _ids = exp.getAtt().getIds();
      for (final VarDeclaration att : _ids) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("imp(");
        _builder.append(left);
        _builder.append(", gt(");
        String _name = att.getName();
        _builder.append(_name);
        _builder.append(", 0))");
        out = _builder.toString();
      }
      _xblockexpression = out;
    }
    return _xblockexpression;
  }
  
  /**
   * TODO: cómo poner un refinement:  es decir que una restriccion implique otra, conun if???
   */
  @Override
  public CharSequence getRule(final CharSequence left, final CharSequence right) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public CharSequence getRefinement(final Refinement exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("a refinement");
    return _builder;
  }
  
  @Override
  public CharSequence getAssignement(final Assignment exp) {
    CharSequence _xblockexpression = null;
    {
      String output = "";
      CharSequence _xifexpression = null;
      Value _valu = exp.getValu();
      String _value = ((BoolVal) _valu).getValue();
      boolean _equals = Objects.equal(_value, "selected");
      if (_equals) {
        StringConcatenation _builder = new StringConcatenation();
        String _name = exp.getVariable().getName();
        _builder.append(_name);
        _builder.append(" = 1");
        _xifexpression = output = _builder.toString();
      } else {
        CharSequence _xifexpression_1 = null;
        Value _valu_1 = exp.getValu();
        String _value_1 = ((BoolVal) _valu_1).getValue();
        boolean _equals_1 = Objects.equal(_value_1, "unselected");
        if (_equals_1) {
          StringConcatenation _builder_1 = new StringConcatenation();
          String _name_1 = exp.getVariable().getName();
          _builder_1.append(_name_1);
          _builder_1.append(" = 0");
          _xifexpression_1 = output = _builder_1.toString();
        } else {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("eq(");
          String _name_2 = exp.getVariable().getName();
          _builder_2.append(_name_2);
          _builder_2.append(", ");
          Value _valu_2 = exp.getValu();
          int _value_2 = ((com.coffee.pLEC.Number) _valu_2).getValue();
          _builder_2.append(_value_2);
          _builder_2.append(")");
          _xifexpression_1 = _builder_2;
        }
        _xifexpression = _xifexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
}