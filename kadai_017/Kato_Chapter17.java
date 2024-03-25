public abstract class Kato_Chapter17 {
    public String familyName = "加藤";
    public String givenName;
    public String address = "東京都中野区〇×";

    public void commonIntroduce() {
        System.out.println("名前は" + this.familyName + this.givenName + "です");
        System.out.println("住所は" + this.address + "です");
    }

    public abstract void setGivenName();

    public abstract void eachIntroduce();

    public void execIntroduce() {
        this.setGivenName();
        this.commonIntroduce();
        this.eachIntroduce();
    }
}