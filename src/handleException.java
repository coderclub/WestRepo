
package src;
import java.util.Scanner;

public class handleException {
    public static void main(String[] args) {

        int num=5;

        try{int result=num/0;

                System.out.println(result);

        }catch (Exception ex){
            System.out.println("Criterion doesn't Match .");
        }
    }

}
