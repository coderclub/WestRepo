import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;




public class useOfHashMap {

    public static void main(String[] args) {
        HashMap<String,String> BDDivisions=new HashMap<String, String>();
        //adding elements to the Hashmap.

        BDDivisions.put("BANGLADESH","DHAKA");
        BDDivisions.put("BANGLADESH","CHATTAGRAM");
        BDDivisions.put("BANGLADESH","COMILLA");
        BDDivisions.put("BANGLADESH","SYLHET");
        BDDivisions.put("BANGLADESH","RAJSHAHI");
        BDDivisions.put("BANGALDESH","RANGPUR");

        //for(HashMap.Entry<String,String> data: BDDivisions){
          //  System.out.println(data);

        Set set = BDDivisions.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
            //Map.Entry mentry = (Map.Entry)iterator.next();
            //System.out.print("key is: "+ mentry.getKey() + " & Value is: "
           // +mentry.getValue());
        }


    }
}
