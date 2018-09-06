
public class CoderClub {
 String a;//static variable & static method
 static String b;
public  static void showMember(String a){
    b=a;
    System.out.println(a+" our member");

}//vgfgfhgf
}

class Test{

    public static void main(String[] args) {
        CoderClub.showMember("Fahim");
        CoderClub.showMember("Siddique");
        CoderClub.showMember("Ahmed");
        CoderClub.showMember("Nasir");
        CoderClub.showMember("Afia");
        CoderClub.showMember("Shams");
        System.out.println("Siddique & Nasir added");

    }}
