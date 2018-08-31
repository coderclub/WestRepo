package HomeWork5;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Iterator;

public class useOflinkedHashMap {
    public static void main(String[] args) {


        LinkedHashMap<Integer, String> students = new LinkedHashMap<Integer, String>();
        students.put(100, "Ahmed");
        students.put(101, "Nasir");
        students.put(102, "Fahim");
        students.put(103, "Siddiki");


       Iterator it = students.entrySet().iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
/*
        for (LinkedHashMap.Entry<Integer,String> s1: students
             ) {
            
        }*/
        }
    }}