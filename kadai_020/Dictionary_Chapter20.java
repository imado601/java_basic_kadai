import java.util.HashMap;

class Dictionary_Chapter20 {
    private HashMap<String, String> dictionary;

    public Dictionary_Chapter20() {
        dictionary = new HashMap<>();
        dictionary.put("apple", "りんご");
        dictionary.put("peach", "桃");
        dictionary.put("banana", "バナナ");
        dictionary.put("lemon", "レモン");
        dictionary.put("pear", "梨");
        dictionary.put("kiwi", "キウィ");
        dictionary.put("strawberry", "いちご");
        dictionary.put("grape", "ぶどう");
        dictionary.put("muscat", "マスカット");
        dictionary.put("cherry", "さくらんぼ");
    }

    public String search(String word) {
        if (dictionary.containsKey(word)) {
            return dictionary.get(word);
        } else {
            return null;
        }
    }
}