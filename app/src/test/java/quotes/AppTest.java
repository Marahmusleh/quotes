package quotes;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class AppTest {

    @Test
    public void name(){
        Gson gson = new Gson();
        try {
            Reader reader = new FileReader("recentquotes.json");
            Quotes[] quotes = gson.fromJson(reader,Quotes[].class);
            System.out.println(quotes[0].toString());
            Random r = new Random();
            int low = 0;
            int high = quotes.length-1;
            int result = r.nextInt(high-low) + low;
            Object actual = null;
            Object expected = quotes[result];
            for (int i = 0; i < quotes.length; i++) {
                actual = quotes[result];
                break;
            }
            assertEquals(expected,actual);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}