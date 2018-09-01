package HomeWork5;

public class TestHouse {
    public static void main(String[] args) {
        staticVastaM fahimhouse=new staticVastaM();
        fahimhouse.houseInfo();
        staticVastaM.houseland(1200);//static method.
        fahimhouse.houseSize=3000;
        fahimhouse.houseInfo();
        staticVastaM nasirHouse=new staticVastaM();//static variable
        nasirHouse.houseSize=1500;
        nasirHouse.houseInfo();
        fahimhouse.houseInfo();
    }

}
