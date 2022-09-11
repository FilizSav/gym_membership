public abstract class Member {
    public Member(String firstName, String lastName, String memberId, int age, double height, double weight, String memberShipType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.memberId = memberId;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.memberShipType = memberShipType;
    }

    public String firstName;
    public String lastName;
    public String memberId; // SD - standard // PR - premium - random digits (20-characters)

    public int age;
    public double height;
    public double weight;
    public String memberShipType;

    public abstract void workingOut(String duration);
    public abstract void scanning();
    public abstract void buyingProducts(double money); // 50% discount for members


    @Override
    public String toString() {
        return getClass().getSimpleName()+ "{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", memberId='" + memberId + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", memberShipType='" + memberShipType + '\'' +
                '}';
    }
}
