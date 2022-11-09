import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class postApi {

    @Test(dataProvider="BooksData")
    public void addBook(String isbn, String asile) {

        baseURI = "http://216.10.245.166";
        String response = given().header("Content-Type", "application/json").body(payload.addBook(isbn,asile)).
                when().post("/Library/Addbook.php").then().assertThat().statusCode(200).extract().response().asString();
        System.out.println(response);
        reusableMethod.rawToJson(response);
        //js.getString()
    }

    public void createUser() {

    }


@DataProvider(name = "BooksData")
    public Object[][] getData() {

         return new Object[][]{{"daad","sfdsd"},{"sdfs","drgdr"},{"dsf4","hytyh"}};
}


}
