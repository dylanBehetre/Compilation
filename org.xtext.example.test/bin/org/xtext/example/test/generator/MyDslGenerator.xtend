/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.test.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.example.test.myDsl.Function
import org.xtext.example.test.myDsl.Affectation
import org.xtext.example.test.myDsl.Nop

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MyDslGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
	for (e : resource.allContents.toIterable.filter(typeof(Function))){
		fsa.generateFile(
		"entities/" + e.name + ".test",
		e.compile)
}
	}
	def compile (Function c){'''
		function �c.name� :
		�FOR f : c.reads�
		read�FOR param: f.name SEPARATOR ','� �param��ENDFOR�
		�ENDFOR�
		%
		�FOR f : c.commands�
		�IF f instanceof Affectation�
			�"	"��f.name� :=�f.valeur�
		�ENDIF�
		�IF f instanceof Nop�
			�"	"�nop
		�ENDIF�
		�ENDFOR�
		%
		�FOR f : c.writes�
		write�FOR param: f.name SEPARATOR ','� �param��ENDFOR�
		�ENDFOR�
	'''	
	}
}