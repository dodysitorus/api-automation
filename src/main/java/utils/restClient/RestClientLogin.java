package utils.restClient;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utils.ConfigReader;
import utils.data.Login;
import utils.payloadBuilder.LoginPayloadBuilder;

public class RestClientLogin {
    private static String baseUrl = ConfigReader.getBaseUrl();

    public static Response postLogin(String endpoint, Login login) {
        return RestAssured
                .given()
                .header("x-api-key", "reqres-free-v1")
                .contentType(ContentType.JSON)
                .body(LoginPayloadBuilder.loginPayload(login))
                .post(baseUrl + endpoint)
                .then()
                .log().all()
                .extract().response();
    }
}
