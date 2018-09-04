package DS;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class UseMap {
    public static void main(String[] args) {

        Map<String, String> cityNcountry = new LinkedHashMap<String, String>(); //HashMap is not in order
        cityNcountry.put("USA", "NY");
        cityNcountry.put("UK", "LND");
        cityNcountry.put("BD", "DHK");

        for (Map.Entry<String, String> state:cityNcountry.entrySet()){
            System.out.println(state.getKey()+ "----->"+state.getValue());
        }

    }
}
