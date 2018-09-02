package sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int next = 0;
        int prev = 1;
        for (int i = 0; i < 20; i++) {
            System.out.println(next);
            next = next + prev;
            prev = next - prev;
        }
    }
}
