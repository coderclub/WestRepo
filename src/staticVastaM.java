package HomeWork5;

public class staticVastaM {
    static int houseSize;
    public void houseInfo(){
        System.out.println("Its a 4 wall square type home."+houseSize);
    }
    public static void houseland(int sqft){
        houseSize=sqft;
        System.out.println("this house size is "+sqft);
    }
}