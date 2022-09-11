public class GeneratorUtils {

    public static int getARandomNumber(int i1, int i2) {
        return (int) (Math.random() * (Math.abs(i1 - i2) + 1)) + Math.min(i1, i2);
    }
    public static String getMemberId(String membershipType){
        String memberId = membershipType.equalsIgnoreCase("Standard") ? "SD" : "PR";
        // adding the 18 characters
        for (int i = 0; i < 18; i++) {
            memberId += getARandomNumber(0,9);
        }
        return memberId;
    }
    public static int getAge(){
        return getARandomNumber(14,100);
    }

    public static double getHeight(){
        double height = 0.0;
           height += getARandomNumber(4,8);
           height += (double) getARandomNumber(0,9) / 10;
        return height;
    }
    public static double getWeight(){
        return (double) getARandomNumber(900,30000) / 100;
    }

    public static void main(String[] args) {
        System.out.println(getMemberId("Standard"));
        System.out.println(getMemberId("Premium"));
        System.out.println(getHeight());
        System.out.println(getWeight());
    }

}
