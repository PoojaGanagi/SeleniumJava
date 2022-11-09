

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;


public class reusableMethod {

    public static void main(String[] args) throws IOException {
        readDynamicValueForPayload();
    }
    static String sp = System.getProperty("user.dir");




    public static JsonPath rawToJson(String response) {
        JsonPath js = new JsonPath(response);

        return js;
    }

    public static String generateStringFromResource() throws IOException, IOException {


        return new String(Files.readAllBytes(Paths.get(sp+"\\src\\test\\Data\\createUser.json")));

    }

    public static void readDynamicValueForPayload() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper(); {
            //Addjson add = objectMapper.readValue(new File(sp+"\\src\\test\\Data\\createUser.json"),
                    //Addjson.class);
           // System.out.println(add);
            //add.setAisle(212454);
            //System.out.println(add);

        };


    }

    public void readDynamicPayloadUsingMap() {

        ObjectMapper objectMapper = new ObjectMapper();
        {
            //objectMapper.readValue(new File(sp+"\\src\\test\\Data\\createUser.json")),new TypeReference(<Map<String,Object>>());
        }

    }

    public static RequestSpecification specBuildForRequest() {
        RequestSpecification request =  new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").
                addQueryParam("key","qaclick123").
                setContentType(ContentType.JSON).build();

        return request;
    }

    public static ResponseSpecification specBuilderforResponse() {

        ResponseSpecification response = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
        return response;
    }
}
