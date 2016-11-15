/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.test.generator;

import com.google.common.collect.Iterables;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.xtext.example.test.myDsl.Attribut;
import org.xtext.example.test.myDsl.Classe;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class MyDslGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<Classe> _filter = Iterables.<Classe>filter(_iterable, Classe.class);
    for (final Classe e : _filter) {
      String _name = e.getName();
      String _plus = ("entities/" + _name);
      String _plus_1 = (_plus + ".java");
      CharSequence _compile = this.compile(e);
      fsa.generateFile(_plus_1, _compile);
    }
  }
  
  public CharSequence compile(final Classe c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public interface ");
    String _name = c.getName();
    _builder.append(_name, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      EList<Attribut> _attributs = c.getAttributs();
      for(final Attribut f : _attributs) {
        _builder.append("\t");
        _builder.append("void set ");
        String _name_1 = f.getName();
        _builder.append(_name_1, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        String _name_2 = f.getName();
        _builder.append(_name_2, "\t");
        _builder.append(" get");
        String _name_3 = f.getName();
        String _firstUpper = StringExtensions.toFirstUpper(_name_3);
        _builder.append(_firstUpper, "\t");
        _builder.append("();");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}