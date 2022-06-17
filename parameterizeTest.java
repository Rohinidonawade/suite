package com.parameterize;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class parameterizeTest {
	

	@Test(dataProvider = "getData")
	public void doLogin(String userName, String password, String strValue) {		
		System.out.println("testData----:"+userName+"---password----"+password+"---value--->"+strValue);
	}
	
	@DataProvider
	public Object[]  getData(){
	                
		Object[][]  data = new Object[3][3];
		
		data[0][0] = "xyz";
		data[0][1] = "xyz@123";
		data[0][2] = "ABC";
		
		data[1][0] = "v-khushbut";
		data[1][1] = "Summer@2018#";
		data[1][2] = "Dashboard";
				
		data[2][0] ="Rohini";
		data[2][1] ="pqr@989";
		data[2][2] ="VSTL";				
				return data;
	}
}
