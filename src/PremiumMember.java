public class PremiumMember extends Member implements TanningBed, MassageBed{

    public PremiumMember(String firstName, String lastName, String memberId, int age, double height, double weight, String memberShipType) {
        super(firstName, lastName, memberId, age, height, weight, memberShipType);
    }

    @Override
    public void workingOut(String duration) {
        System.out.println("Premium member is working out for " + duration);
        if (duration.toLowerCase().contains("hour")) {
            System.out.println("Beast mode!");
        } else {
            int mins = Integer.parseInt(duration.substring(0, duration.indexOf(" ")));
            if (mins <= 30) {
                System.out.println("Not a good workout!");
            } else {
                System.out.println("Not bad!");
            }
        }
    }

    @Override
    public void scanning() {
        System.out.println("Welcome " + firstName + " " + lastName + "!" +
                "\nMembership type = " + memberShipType);
    }

    @Override
    public void buyingProducts(double money) {
        System.out.println("Amount due = " + money + "\nYou get 50% discount");
    }


    public static PremiumMember getPremiumMember(){
        String firstName = Values.firstNames.get(
                GeneratorUtils.getARandomNumber(0,Values.firstNames.size() -1));
        String lastName = Values.lastNames.get(
                GeneratorUtils.getARandomNumber(0,Values.lastNames.size() -1));
        String memberId = GeneratorUtils.getMemberId("Premium");
        int age = GeneratorUtils.getAge();
        double height = GeneratorUtils.getHeight();
        double weight = GeneratorUtils.getWeight();
        String membershipType = "Premium";
        return new PremiumMember(firstName,lastName,memberId,age,height,weight,membershipType);
    }

    public static void main(String[] args) {
        System.out.println(getPremiumMember());
    }

    @Override
    public void getMassage(String type, String intensity) {
        System.out.println("Massage type is " + type + " and intensity is " + intensity + "!");
    }

    @Override
    public void getTanned(String duration, String shade) {
        System.out.println("Tan duration is " + duration + " and shade is " + shade + "!");
    }
}
