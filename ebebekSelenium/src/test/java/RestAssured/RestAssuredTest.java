package RestAssured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class RestAssuredTest {
    @Test
    public void getRequest(){

        RestAssured.baseURI = "https://reqres.in/api/users";
        Response getResponse = given().param("page","3").when().get();
        if(getResponse.statusCode()<300)
            System.out.println("“HTTP Status Code” "+getResponse.statusCode()+" (başarılı)");
        else
            System.out.println("başarısız");
    }


    @Test
    public void postRequest(){
        String  postData = "{\n" +
                " \"name\": \"morpheus\"," +
                " \"job\": \"leader\"" +
                "}";

        given()
                .contentType(ContentType.JSON)
                .body(postData)
                .when()
                .post("https://reqres.in/api/users")
                .then()
                .statusCode(201);

    }
}
