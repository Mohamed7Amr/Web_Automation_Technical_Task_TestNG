package dataReader;

import lombok.SneakyThrows;

import java.io.FileReader;
import java.util.Properties;

/**
 * @author Mohamed_Amr
 *
 */
public class Load_Properties {

    @SneakyThrows
    private static Properties load_Properties_Data(String properties_File_Name)
    {
        FileReader fr = new FileReader(properties_File_Name);
        Properties pro = new Properties();
        pro.load(fr);
        return pro;
    }

    public static Properties environment_Data =
            load_Properties_Data("src/test/resources/Properties/EnvironmentData.properties");
    public static Properties login_Data =
            load_Properties_Data("src/test/resources/Properties/Login_Data.properties");

}
