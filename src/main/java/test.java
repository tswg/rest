
import org.json.JSONObject;
import org.junit.Test;

import static io.restassured.RestAssured.*;

public class test {

    @Test
    public void authorize() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("username", "1");
        jsonObject.put("password", "111");


        given()
                .log().body()
                .contentType("application/json").body(jsonObject.toString())
        .when()
                .post("http://195.209.51.25:34009/api/authorize")
        .then()
                .log().body();
    }
    @Test
    public void auth() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("doctorId", 11388);
        jsonObject.put("specCode", 101);
        jsonObject.put("lpuName", "стационар 2Б");
        jsonObject.put("placeName", "терапевтическоеее");
        jsonObject.put("specName", "РЕАБИЛИТОЛОГ");
        jsonObject.put("lid", 113);
        jsonObject.put("typeSub", 1);
        jsonObject.put("slpuId", 29);

        given()
                .log().body()
                .contentType("application/json")
                .body(jsonObject.toString())
        .when()
                .post("http://195.209.51.25:34009/api/authenticate")
        .then()
                .log().body();
    }
}
