package utils.payloadBuilder;

import utils.data.Login;
import java.util.HashMap;
import java.util.Map;


public class LoginPayloadBuilder {

    public static Map<String, String> loginPayload(Login login) {
        Map<String, String> map = new HashMap<>();
        map.put("email", login.getEmail());
        map.put("password", login.getPassword());
        return map;
    }
}
