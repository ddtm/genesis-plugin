/*
* generated by Xtext
*/
package org.csail.genesis;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class GenesisStandaloneSetup extends GenesisStandaloneSetupGenerated{

	public static void doSetup() {
		new GenesisStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

