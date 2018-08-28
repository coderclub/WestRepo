package HomeWork5;

public class coderClubMember {

    ccMemberReq innerMem1=new ccMemberReq();
    public void coderClubInfo(){
        System.out.println("World Best CODER CLUB");
    }

    public void memberInfo(){
        System.out.println("Our Members Information");
    }
    public class ccMemberReq {
        public void reqDoc() {
            ccMRkey mm = new ccMRkey();
            mm.memPass();
            {
                System.out.println("They have to be the members of PNT.");
            }
        }

        public class ccMRkey {
            private void memPass() {
                System.out.println("PNT is the key pass for members");
            }
        }
    }}





