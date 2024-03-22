abstract class Kato_Chapter17 {
    public String familyName;
    public String givenName;
    public String address;

    public abstract void eachIntroduce();

    public void execIntroduce() {
        eachIntroduce();
        System.out.println();
    }
}