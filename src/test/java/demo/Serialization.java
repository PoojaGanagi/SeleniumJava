package demo;

import io.restassured.response.Response;
import pojo.AddPlace;
import pojo.Location;

import java.util.ArrayList;

import static io.restassured.RestAssured.*;


public class Serialization {


    public static void main(String[] args) {

     AddPlace place = new AddPlace();
        place.setAccuracy(50);
        place.setAddress("Bangalore");
        place.setName("PoojaG");
        place.setLanguage("English");
        place.setPhone_number((756756757));
        place.setWebsite("https://google.com");
        ArrayList<String> arraylist = new ArrayList<String>();
        arraylist.add("park");
        arraylist.add("Home");
        place.setTypes(arraylist);
        Location loc = new Location();
        loc.setLng(34234.24);
        loc.setLat(32423.00);
        place.setLocation(loc);
        System.out.println(place);
        Response response = given().header("Content-type", "application/json").queryParam("key", "qaclick123").
                body(place).
                when().post("https://rahulshettyacademy.com/maps/api/place/add/json").then().extract().response();

        System.out.println(response.prettyPrint());
        System.out.println(response.getBody().asString());

    }


}
