public class payload {



    public static String addBook(String isbn, String asile){
        String payload = "{\n" +
                "    \"name\": \"Love asfsfst first sight\",\n" +
                "    \"isbn\": \""+isbn+"\",\n" +
                "    \"aisle\": "+asile+",\n" +
                "    \"author\": \"sdfsd\"\n" +
                "}";
        return payload;


    }
    public static String addPlace() {
        String payload = "{\n" +
                "    \"location\": {\n" +
                "        \"lat\": -38.383494,\n" +
                "        \"lng\": 33.427362\n" +
                "    },\n" +
                "    \"accuracy\": 50,\n" +
                "    \"name\": \"Frontline house\",\n" +
                "    \"phone_number\": 9838933937,\n" +
                "    \"address\": \"29,side layout cohen 09\",\n" +
                "    \"types\": [\n" +
                "        \"shoe park\",\n" +
                "        \"shop\"\n" +
                "    ],\n" +
                "    \"website\": \"http://google.com\",\n" +
                "    \"language\": \"French-IN\"\n" +
                "}";
        return payload;
    }
}
