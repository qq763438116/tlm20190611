package util;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpUtil {

    //判断网络
    public static String dataGet(String Dataurl){
        try {
            URL url1 = new URL(Dataurl);
            HttpURLConnection connection = (HttpURLConnection) url1.openConnection();
            connection.setRequestMethod("GET");
            int code = connection.getResponseCode();
            if (code == HttpURLConnection.HTTP_OK){
                StringBuilder builder = new StringBuilder();
                InputStreamReader reader = new InputStreamReader(connection.getInputStream());
                String str = "";

                return builder.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }


}
