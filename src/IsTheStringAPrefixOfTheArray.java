public class IsTheStringAPrefixOfTheArray {
    public static void main(String[] args) {
        String word = "ilove";
        String[] arr = {"i", "love", "leetcode", "apples"};
        System.out.println(isTheStringAPrefixOfTheArray(word, arr));
    }

    public static boolean isTheStringAPrefixOfTheArray(String word, String[] arr) {
        String newWord = "";
        for (int i = 0; i < arr.length; i++) {
            newWord += arr[i];
            if(word.equals(newWord)) return true;}
             return false;
    }
}