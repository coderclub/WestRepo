public class Factorial {
    int result=1;
    public int factorial(int num){
        if(num==1) return this.result;
        else
            this.result =  num * factorial(num-1);

        return this.result;
    }
    public static void main(String[] args) {
        Factorial fc = new Factorial();
        int fact = fc.factorial(5);
        System.out.println(fact);
    }
}
