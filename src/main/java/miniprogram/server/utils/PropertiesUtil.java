package miniprogram.server.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {
    //获取获取配置文件中的全局变量信息,以后期方便维护修改

    public static String getValue(String key){
        Properties prop = new Properties();
        InputStream in = PropertiesUtil.class.getResourceAsStream("/application.properties");
        try {
            prop.load(in);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
}
