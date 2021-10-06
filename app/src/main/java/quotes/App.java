
package quotes;

import com.google.gson.Gson;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
       quotesAPI("http://api.forismatic.com/api/1.0/?method=getQuote&format=json&lang=en");
    }
        public static String quotesAPI(String apiURL) throws Exception {
        try {
            Gson apiGson = new Gson();
            HttpURLConnection connection = (HttpURLConnection) new URL(apiURL).openConnection();
            connection.setRequestMethod("GET");
            int status = connection.getResponseCode();
            InputStream inputStream = connection.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line = bufferedReader.readLine();
            API MyQuote = apiGson.fromJson(line, API.class);

                FileWriter apiFile = new FileWriter("API.json", true);
                    System.out.println(line);
                    line = bufferedReader.readLine() + "\n";
                    apiFile.write(MyQuote.toString());
                    apiFile.close();

            bufferedReader.close();
        } catch (Exception e) {
                Gson json = new Gson();
                    Reader reader = new FileReader("recentquotes.json");
                    Quotes[] qout = json.fromJson(reader, Quotes[].class);
                    Random r = new Random();
                    int low = 0;
                    int high = qout.length-1;
                    int RandVal = r.nextInt(high-low) + low;
                    for (int i = 0; i < qout.length; i++) {
                        System.out.println(qout[RandVal]);
                        break;}
        }
        return apiURL;
    }
    }
