package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.response.Response;
import utils.data.UsersPage;
import utils.restClient.RestClientUsersPage;

import static org.junit.Assert.assertEquals;

public class GetUsersPageSteps {

    private UsersPage usersPage = new UsersPage();

    @Given("user sends GET request to {string}")
    public void userSendsGETRequestTo(String endpoint) {
        Response response = RestClientUsersPage.getUsersPage(endpoint);
        usersPage.setResponse(response);
    }

    @And("response status get users page should be {int}")
    public void responseStatusGetUsersPageShouldBe(int response) {
        assertEquals(response, usersPage.getResponse().statusCode());
    }
}
