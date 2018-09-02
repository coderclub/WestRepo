package sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int [] array = {8,5,9,1,3,4,6};
        for (int j = 0; j<array.length-1; j++){
            int min = j;
            for(int i = j+1; i<array.length; i++){
                if(array[i]<array[min]){
                    min = i;
                    //swap
                    int temp = array[min];
                    array[min] = array[j];
                    array[j] = temp;
                }// end of it
            for (int n = 0; n<array.length; n++){
                System.out.println(array[n]);
            }
            }//end of inner loop
        }//end of outer loop
    }
}
