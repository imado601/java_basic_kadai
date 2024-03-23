class KatoTaro_Chapter17 extends Kato_Chapter17 {
    public KatoTaro_Chapter17() {
        givenName = "太郎";
        address = "東京都中野区〇×";
    }

    @Override
    public void eachIntroduce() {
        commonIntroduce();
        System.out.println("Javaが得意です");
    }
}
