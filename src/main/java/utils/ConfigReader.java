package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
    private static Properties prop = new Properties();

    static {
        try {
            prop.load(new FileInputStream("src/test/resources/config/application.properties"));
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static String getBaseUrl(){
        return prop.getProperty("base.url");
    }
}
