import static org.testng.Assert.assertEquals;
 
import org.testng.annotations.Test;
 
import io.restassured.RestAssured;
import io.restassured.response.Response;
 
public class GetReqAutomation {
 
	@Test
	public void retrieveSpecificResource() {
 
		RestAssured.baseURI = "https://6143a99bc5b553001717d06a.mockapi.io/testapi/v1//Users";
 
		RestAssured.given().param("employee_firstname", "employee_firstname 18")
		.when()
		.get()
		.then()
		.assertThat()
		.log()
		.all()
		.statusCode(200);
	}}