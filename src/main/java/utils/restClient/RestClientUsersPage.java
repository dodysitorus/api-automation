package utils.restClient;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utils.ConfigReader;
import utils.data.UsersPage;

public class RestClientUsersPage {

    private static String baseUrl = ConfigReader.getBaseUrl();
    private static String secretKey = ConfigReader.getSecretKey();

    public static Response getUsersPage(String endpoint) {
        return RestAssured
                .given()
                .header("x-api-key", secretKey)
                .contentType(ContentType.JSON)
                .get(baseUrl + endpoint)
                .then()
                .log().all()
                .extract().response();
    }
}
