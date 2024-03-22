class KatoHanako_Chapter17 extends Kato_Chapter17 {
    public KatoHanako_Chapter17() {
        givenName = "花子";
        address = "東京都中野区〇×";
    }

    @Override
    public void eachIntroduce() {
        System.out.println("名前は加藤" + givenName + "です");
        System.out.println("住所は" + address + "です");
        System.out.println("趣味は読書です");
    }
}