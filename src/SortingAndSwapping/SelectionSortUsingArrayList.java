package SortingAndSwapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SelectionSortUsingArrayList {

        public static void main(String[] args) {
            // My code

            Scanner stdin = new Scanner(System.in);
            List<Integer> inputList = new ArrayList<Integer>();
            System.out.println("Please enter a negative number to exit.");
            while(true){
                System.out.println("Waiting for your response.");
                int number = stdin.nextInt();
                if(number<0) break;
                inputList.add(number);
            }

            int min,index=0;

            for(int i=0;i<inputList.size();i++) {
                System.out.println("ArrayList : ");
                for (Integer k : inputList) System.out.print(k + " ");
                System.out.println("");
                min = inputList.get(i);
                for (int j = i + 1; j < inputList.size(); j++) {
                    if (min > inputList.get(j)) {
                        min = inputList.get(j);
                        index = j;

                    }
                }
                System.out.println("Minimum of this iteration: "+min + "\nIndex of minimum: " + index);
                if (min < inputList.get(i)) {
                    int temp = inputList.get(i);
                    inputList.set(i, min);
                    inputList.set(index, temp);
                }

            }

        }
    }




