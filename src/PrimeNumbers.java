public class PrimeNumbers {
    public static void main(String[] args) {
        int counter = 0;
        for (int i=2; i<10000; i++){
            if(i==2) {
                System.out.println(i);
            }else{
                if(isPrime(i)) {
                    counter++;
                    System.out.println("prime " + i);
                }else{
                    //System.out.println("non prime " +i);



                }
            }
        }
    }
    public static boolean isPrime(int n) {
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
    }
