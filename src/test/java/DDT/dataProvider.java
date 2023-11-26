package DDT;

import org.testng.annotations.DataProvider;

public class dataProvider {
	
	@DataProvider(name = "getTestData",parallel = true)
	public Object[][] dataSupplier() {
		Object [][] credentials = {{"amootoricap1@gmail.com","12345"},{"amootoricap3@gmail.com","12345"},
				{"amootoricap9@gmail.com","12345"}};
		
		return credentials;
	}

}
