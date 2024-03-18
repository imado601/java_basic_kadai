public class Score_Chapter04 {

    public static void main(String[] args) {
        // Aさん～Jさんのテストの点数を出力
        System.out.println("Aさんの点数は" + "10点");
        System.out.println("Bさんの点数は" + "20点");
        System.out.println("Cさんの点数は" + "30点");
        System.out.println("Dさんの点数は" + "40点");
        System.out.println("Eさんの点数は" + "50点");
        System.out.println("Fさんの点数は" + "60点");
        System.out.println("Gさんの点数は" + "70点");
        System.out.println("Hさんの点数は" + "80点");
        System.out.println("Iさんの点数は" + "90点");
        System.out.println("Jさんの点数は" + "100点");

        // 10人のテスト合計値
        int totalScore = (10 + 20 + 30 + 40 + 50 + 60 + 70 + 80 + 90 + 100);

        // testの平均値を出力
        int averageScore = totalScore / 10;

        System.out.println("テストの平均点は" + averageScore + "点");

    }

}
