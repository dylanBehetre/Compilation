/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.test.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.example.test.ui.internal.TestActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MyDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return TestActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return TestActivator.getInstance().getInjector(TestActivator.ORG_XTEXT_EXAMPLE_TEST_MYDSL);
	}
	
}