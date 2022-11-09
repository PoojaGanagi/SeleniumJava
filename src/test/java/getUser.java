import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class getUser {

   static String baseURI = "https://reqres.in/api/users?page=2";

    @Test
    void getUser(){


        Response response = get("https://reqres.in/api/users?page=2");

        System.out.println(response.asString());
        System.out.println(response.getStatusCode());

        System.out.println(response.getBody().asString());

        //int statuscode = response.getStatusCode();

        Assert.assertEquals(200,response.statusCode());
        System.out.println("====Assertion passed===");

    }

    @Test
    void getuser2(){

       given().get("https://reqres.in/api/users?page=2").then().statusCode(200);

    }
}
