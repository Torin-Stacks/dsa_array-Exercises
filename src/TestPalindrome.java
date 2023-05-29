public class TestPalindrome {
    public static void main(String[] args){
        checkForPalindrome("maDAM");
    }

    public static void checkForPalindrome(String word) {
        String swapped = "";
        for (int index = word.length()-1; index >= 0; index--){
            swapped = swapped + word.charAt(index);}
            if(word.toLowerCase().equals(swapped.toLowerCase())){
                System.out.println(word + " is a palindrome ");
            }
            else{
                System.out.println(word + " is not a palindrome");
            }


    }
}
