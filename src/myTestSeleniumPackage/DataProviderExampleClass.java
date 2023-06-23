package myTestSeleniumPackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExampleClass {

	@DataProvider(name = "dataProvider1")
	public Object[][] dataProviderMethod1() {
		return new Object[][] { { "Dan", "Vinnie" }, { "d1", "v1" }, { "d2", "v2" } };
	}

	// This method is bound to the above data provider
	// The test case will run 3 times with different set of values
	@Test(dataProvider = "dataProvider1")
	public void sampleTest(String str1, String str2) {
		System.out.println(str1 + " " + str2);
	}

}