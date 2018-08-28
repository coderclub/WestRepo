package DS;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQue {
    public static void main(String[] args) {
        Queue<String> que = new LinkedList<String>();
        que.add("Nasir");
        que.add("Ali Pathan");
        que.add("Uzzal Pathan");

        System.out.println(que.poll());
        System.out.println(que.poll());

        Iterator it = que.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        for (String st:que) { //for each loop
            System.out.println(st);
        }
        while (!que.isEmpty()){
            System.out.println(que.poll());
        }


    }
}
