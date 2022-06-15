import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static org.hamcrest.Matcher.*;

public class PostReqAutomation {
	
	@Test
	public void postAPIAutomation () {
		RestAssured.baseURI=" https://6143a99bc5b553001717d06a.mockapi.io/testapi/v1//Users";
	
		String json = "{\r\n"
				+ "        \"createdAt\": 1631825833,\r\n"
				+ "        \"employee_firstname\": \"TestData12345\",\r\n"
				+ "        \"employee_lastname\": \"TestData12345\",\r\n"
				+ "        \"employee_phonenumbe\": \"264-783-9453\",\r\n"
				+ "        \"ademployee_emaildress\": \"ademployee_emaildress 1\",\r\n"
				+ "        \"citemployee_addressy\": \"citemployee_addressy 1\",\r\n"
				+ "        \"stateemployee_dev_level\": \"stateemployee_dev_level 1\",\r\n"
				+ "        \"employee_gender\": \"employee_gender 1\",\r\n"
				+ "        \"employee_hire_date\": \"2025-10-31T16:35:45.426Z\",\r\n"
				+ "        \"employee_onleave\": true,\r\n"
				+ "        \"tech_stack\": [],\r\n"
				+ "        \"project\": []\r\n"
				+ "    }\r\n"
				+ "";
				
		RestAssured.given().body(json).post().then().log().all().assertThat().statusCode(201);
		
	/*	RestAssured.given().body("        \"createdAt\": 1631825833,\r\n"
				+ "        \"employee_firstname\": \"TestData12345\",\r\n"
				+ "        \"employee_lastname\": \"TestData12345\",\r\n"
				+ "        \"employee_phonenumbe\": \"264-783-9453\",\r\n"
				+ "        \"ademployee_emaildress\": \"ademployee_emaildress 1\",\r\n"
				+ "        \"citemployee_addressy\": \"citemployee_addressy 1\",\r\n"
				+ "        \"stateemployee_dev_level\": \"stateemployee_dev_level 1\",\r\n"
				+ "        \"employee_gender\": \"employee_gender 1\",\r\n"
				+ "        \"employee_hire_date\": \"2025-10-31T16:35:45.426Z\",\r\n"
				+ "        \"employee_onleave\": true,\r\n"
				+ "        \"tech_stack\": [],\r\n"
				+ "        \"project\": []\r\n"
				+ "").post().then()
				.log()
				.all()
				.assertThat()
				.statusCode(201);
		
	}
	*/

}
	
	
}
