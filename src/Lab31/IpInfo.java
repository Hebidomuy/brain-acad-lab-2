package Lab31;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.util.Properties;

public class IpInfo {
    public static void main(String[] args) {
        try {
//            System.setProperty("http.proxyUser", "u036168");
//            System.setProperty("http.proxyPassword", "24092001Bandit");

//            Properties systemSettings = System.getProperties();
//            systemSettings.put("proxySet", "true");
//            systemSettings.put("http.proxyHost", "www.corp.iskra.zp.ua");
//            systemSettings.put("http.proxyPort", "8059");
//            systemSettings.put("http.proxyUser", "praktikant");
//            systemSettings.put("http.proxyPassword", "1");

            URL url = new URL("http://asup-insertion/asup-insertion-backend/actuator/");
//            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

//            Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(
//                    "http://u036168:24092001Bandit@www.corp.iskra.zp.ua",
//                    8059));
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

            httpURLConnection.connect();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            String line;
            StringBuilder stringBuilder = new StringBuilder();
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
            }
            bufferedReader.close();

            System.out.println(stringBuilder.toString());

            httpURLConnection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
