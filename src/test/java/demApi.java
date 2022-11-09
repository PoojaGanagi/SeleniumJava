
import static io.restassured.RestAssured.*;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static org.hamcrest.Matchers.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class demApi {


    public static void main(String[] args) throws IOException {


    }
    public static void getUser() throws IOException {

        baseURI ="https://rahulshettyacademy.com";

        String sp = System.getProperty("user.dir");
         Response response = (Response) given().queryParam("key","qaclick123").header("Content-Type", "application/json").body(new String(Files.readAllBytes(Paths.get(sp+ "\\src\\test\\Data\\Payload.json")))).when().post("/maps/api/place/add/json").then().log().all().assertThat().statusCode(200).body("status", equalTo("success"));

         System.out.println(response);


    }




}
