package SortingAndSwapping;
import java.util.*;
public class swapExample{
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int num1 = stdin.nextInt();
        int num2 = stdin.nextInt();
        System.out.println("Before swapping: "+num1+" "+num2);
        int temp=num1;
        num1 = num2;
        num2=temp;
        System.out.println("After swapping: "+num1+" "+num2);
    }

}