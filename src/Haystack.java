public class Haystack {
    public static void main(String[] args) {
        System.out.println(checkForNeedle("ssjbutsad", "sad"));
    }
//    public static int checkForNeedle(String haystack, String needle){
//        //int lengthOfNeedle = needle.length();
//        for(int index = 0; index < haystack.length(); index++){
//            for (int index2 = 0; index2 < needle.length(); index2++){
//                if(haystack.charAt(index) == needle.charAt(0)){
//                    for(int index3 = 0; index3 <= needle.length(); index3++){
//                        if(needle.charAt(index2) == haystack.charAt(index)){
//                            return index2;
//                        }
//                    }
//                }
//            }
//        }
//        return -1;
//    }

    public static int checkForNeedle(String haystack, String needle) {

        if (haystack.contains(needle)) {
            for (int index = 0; index < haystack.length(); index++) {
                for (int index2 = 0; index2 < needle.length(); index2++) {
                    if (haystack.charAt(index) == needle.charAt(0))
                        return index;
                }
            }

//            for(int index = 0; index < haystack.length(); index++){
//                for (int index2 = 0; index2 < needle.length(); index2++){
//                    if(haystack.charAt(index) == needle.charAt(index2))
//                     word += haystack.charAt(index);
//                    if(word == needle){
//                        return index;


        }

        return -1;


    }
}