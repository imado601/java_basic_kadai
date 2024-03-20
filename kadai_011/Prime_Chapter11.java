public class Prime_Chapter11 {
    public static void main(String[] args) {

        // 0から100までの整数を判定するため、配列のサイズは101
        int N = 101;

        // 素数判定用の配列
        boolean[] isPrime = new boolean[N];

        // 初期化してすべての要素をtrueに設定
        for (int i = 2; i < N; i++) {
            isPrime[i] = true;
        }

        // 素数の判定
        for (int i = 2; i * i < N; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < N; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // 結果を出力
        for (int i = 2; i < N; i++) {
            if (isPrime[i]) {
                System.out.println(i);
            }
        }
    }
}
