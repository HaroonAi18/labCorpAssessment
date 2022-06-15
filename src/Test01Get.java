import org.testng.Assert;
import org.testng.annotations.Test;



import io.restassured.RestAssured;
import io.restassured.response.Response;



public class Test01Get {

@Test
void test_01() {

Response response = RestAssured.get("https://6143a99bc5b553001717d06a.mockapi.io/testapi/v1//Users");


System.out.println(response.getStatusCode());
System.out.println(response.asString());
System.out.println(response.getBody().asString());



System.out.println(response.getStatusLine());
System.out.println(response.getTime());
System.out.println(response.getHeader("content-type"));

int statuscode = response.getStatusCode();

Assert.assertEquals(statuscode, 200);





}



}