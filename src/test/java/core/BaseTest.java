package core;

import org.junit.AfterClass;

public class BaseTest {
	/**
	 * Encerra o browser apos a execucao da classe de teste
	 */
	@AfterClass
	public static void afterClass() {

		DriverSingleton.closeDriver();
	}
}
