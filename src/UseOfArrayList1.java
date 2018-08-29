//import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.lang.String;

public class UseOfArrayList1 {
    public static void main(String[] args) {
       // ArrayList<Integer> fahim=new ArrayList<Integer>();
        //fahim.add(3);
       // fahim.add(4);
        //fahim.add(2,5);
      //  fahim.add(45);
        //fahim.remove(0);
      //  System.out.println(fahim);
        LinkedList <String> list=new LinkedList<String>();
        list.add("hbh");
        list.add("Nasir");
        list.add("Fahim");
        list.add("Ahmed");

        //list.remove(1);
        //System.out.println(list);
        for (String jj: list ){
            System.out.println(jj);
        }
    }
}
