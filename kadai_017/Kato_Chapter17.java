abstract class Kato_Chapter17 {
    public String familyName;
    public String givenName;
    public String address;

    public abstract void eachIntroduce();

    public void execIntroduce() {
        eachIntroduce();
        System.out.println();
    }

    public void commonIntroduce() {
        System.out.println("名前は加藤" + givenName + "です");
        System.out.println("住所は" + address + "です");
    }
}