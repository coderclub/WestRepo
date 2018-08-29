package DS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UseHashMap {
    public static void main(String[] args) {
        List<String> cityOfUSA = new ArrayList<String>();
        cityOfUSA.add("NY");
        cityOfUSA.add("NJ");
        cityOfUSA.add("CA");
        cityOfUSA.add("NC");

        List<String> cityOfUK = new ArrayList<String>();
        cityOfUK.add("London");
        cityOfUK.add("Birmingham");
        cityOfUK.add("Manchester"); //manchester in uk

        List<String> cityOfBD = new ArrayList<String>();
        cityOfBD.add("Dhaka");
        cityOfBD.add("Comilla");
        cityOfBD.add("Narayanganj");

        Map<String, List<String>> listOfCountryNcity = new HashMap<String, List<String>>();
        listOfCountryNcity.put("USA",cityOfUSA);
        listOfCountryNcity.put("UK", cityOfUK);
        listOfCountryNcity.put("BD", cityOfBD);

        for (Map.Entry<String, List<String>> state:listOfCountryNcity.entrySet()){
            if (listOfCountryNcity.get("UK").contains("Manchester")){
                System.out.println(state.getKey()+"--->"+state.getValue());
            }
        }




    }
}
