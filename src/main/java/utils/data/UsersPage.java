package utils.data;

import io.restassured.response.Response;

public class UsersPage {
    private Response response;

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }
}
