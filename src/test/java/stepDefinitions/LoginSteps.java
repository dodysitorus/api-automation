package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import utils.restClient.RestClientLogin;
import utils.data.Login;
import static org.junit.Assert.*;

public class LoginSteps {
    private Login login = new Login();

    @Given("user prepare header request x-api-key {string}")
    public void userPrepareHeaderRequestXApiKey(String x_api_key) {
        login.setX_api_key(x_api_key);
    }

    @Given("user prepare email login payload {string}")
    public void userPrepareEmailLoginPayload(String email) {
        login.setEmail(email);
        System.out.println(login.getEmail());
    }

    @When("user prepare password login payload {string}")
    public void userPreparePasswordLoginPayload(String password) {
        login.setPassword(password);
    }

    @When("user sends POST request to {string}")
    public void userSendsPOSTRequestTo(String endpoint) {
        Response response = RestClientLogin.postLogin(endpoint, login);
        login.setResponse(response);
    }

    @Then("response status should be {int}")
    public void responseStatusShouldBe(int statusCode) {
        assertEquals(statusCode, login.getResponse().statusCode());
    }
}
