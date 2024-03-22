class KatoIchiro_Chapter17 extends Kato_Chapter17 {
    public KatoIchiro_Chapter17() {
        givenName = "一郎";
        address = "東京都中野区〇×";
    }

    @Override
    public void eachIntroduce() {
        System.out.println("名前は加藤" + givenName + "です");
        System.out.println("住所は" + address + "です");
        System.out.println("好きな食べ物はリンゴです");
    }
}