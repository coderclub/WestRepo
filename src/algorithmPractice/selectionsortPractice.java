package algorithmPractice;

public class selectionsortPractice {
    public static void main(String[] args) {

int[] arr={5,6,4,86,46,35,89,24,45,63};
        System.out.println(" before sorting "+arr[6]);
for(int i=0;i<arr.length-1;i++){
    int min=i;
    for(int j=i+1;j<arr.length;j++){
        if(arr[j]<arr[min])
            min=j;
    }
    int temp=arr[min];
    arr[min]=arr[i];
    arr[i]=temp;
}
        System.out.println("After sorting data");
for(int n=0;n<arr.length;n++){
    System.out.print(arr[n]+",");
}
    }
}
