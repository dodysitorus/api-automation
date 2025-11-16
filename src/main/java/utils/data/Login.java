package utils.data;

import io.restassured.response.Response;

public class Login {
    private Response response;
    private String email;
    private String password;

    public String getX_api_key() {
        return x_api_key;
    }

    public void setX_api_key(String x_api_key) {
        this.x_api_key = x_api_key;
    }

    private String x_api_key;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }
}
