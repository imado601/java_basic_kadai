class KatoHanako_Chapter17 extends Kato_Chapter17 {
    public KatoHanako_Chapter17() {
        givenName = "花子";
        address = "東京都中野区〇×";
    }

    @Override
    public void eachIntroduce() {
        commonIntroduce();
        System.out.println("趣味は読書です");
    }
}