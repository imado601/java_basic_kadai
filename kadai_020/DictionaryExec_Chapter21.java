public class DictionaryExec_Chapter21 {
    class DictionaryExec_Chapter20 {
        public static void main(String[] args) {
            Dictionary_Chapter20 dict = new Dictionary_Chapter20();
            String[] words = { "apple", "banana", "grape", "orange" };

            for (String word : words) {
                String meaning = dict.search(word);
                if (meaning != null) {
                    System.out.println(word + "の意味は" + meaning);
                } else {
                    System.out.println(word + "は辞書に存在しません");
                }
            }
        }
    }
}
