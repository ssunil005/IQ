	package parameters;

	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

	public class ParametersThroughXML  {
		
		@Parameters("confBeforeParameter")
		@BeforeMethod
		public void configurationBeforeMethod(String confBeforeParameters) {
			System.out.println("parameters for before method configuration :" + confBeforeParameters);
		}
		
		@Parameters({"testParameters1","testParameters2"})
		@Test
		public void testMethod(String testparameters) {
			System.out.println("parameters for test method :" + testparameters);
		}
		@Parameters({"confAfterParameter"})
		@AfterMethod
		public void configurationAfterMethod(String confAfterParameters) {
			System.out.println("Parameters for after configuration method : " + confAfterParameters);
		}
		

	}



