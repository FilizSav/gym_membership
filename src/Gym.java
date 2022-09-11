import java.util.Random;

public class Gym {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            StandardMember member = StandardMember.getStandardMember();
            member.scanning();
            member.workingOut("10 minutes");
            member.buyingProducts(10.5);
            member.getTanned("3 minutes", "dark");
            member.getMassage("deep tissue", "hard");
            System.out.println(member);
        }
        for (int i = 0; i < 3; i++) {
            PremiumMember member = PremiumMember.getPremiumMember();
            member.scanning();
            member.workingOut("10 minutes");
            member.buyingProducts(10.5);
            member.getTanned("3 minutes", "dark");
            member.getMassage("deep tissue", "hard");
            System.out.println(member);
        }
        System.out.println("\n ======================");
        for (int i = 0; i < 5; i++) {
            int random1 = GeneratorUtils.getARandomNumber(0,1);
            if (random1 == 0){
                StandardMember standardMember = StandardMember.getStandardMember();
                standardMember.scanning();
                standardMember.workingOut("30 minutes");
                standardMember.buyingProducts(30.0);
                System.out.println(standardMember);
        }else {
                PremiumMember premiumMember = PremiumMember.getPremiumMember();
                premiumMember.scanning();
                premiumMember.workingOut("1 hour 30 minutes");
                premiumMember.buyingProducts(20.0);
                premiumMember.getMassage("full","hard");
                premiumMember.getTanned("5 minutes", "dark");
                System.out.println(premiumMember);
            }
            System.out.println("--------------------------------------");
        }
    }
}
