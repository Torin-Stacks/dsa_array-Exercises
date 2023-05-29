public class Validator {

    private String cardNo;
    public String validateLength(String cardNo) {
        this.cardNo = cardNo;

        if ( (cardNo.length() < 13 && !cardNo.matches("^[0-9]+$")) || (cardNo.length() > 16 && !cardNo.matches("^[0-9]+$")) ){
            return null;
        }
        return cardNo;
    }

    public String validateFirstDigit(String cardNo) {
               if (cardNo.charAt(0) == '4'){
            return "Card Type: MasterCard";

        } else if (cardNo.charAt(0) == '5'){
                   return "Card Type: VisaCard";

        } else if (cardNo.charAt(0) == '6') {
            return "Card Type: DiscoverCard";

        }else if (cardNo.charAt(0) == '3' && cardNo.charAt(1) == '7') {
            return "Card Type: AmericaExpress";

        }
               return null;
    }

    public int[] doubleEverySecondDigit(String cardNo) {
        int[] numbers = new int[cardNo.length()];

        for(int index = 0; index < cardNo.length(); index++){
            numbers[index] = Character.getNumericValue(cardNo.charAt(index));
        }
        for(int count = numbers.length-2; count >= 0; count-=2){
            numbers[count] = numbers[count] * 2;
        }

        return numbers;
    }

    public int[] addDoubleDigits(int[] numbers) {
        int totalOfTwoDigits=0;
       for(int count2 = numbers.length-2; count2>= 0; count2-=2){
           if(numbers[count2]%10 != numbers[count2]){
               totalOfTwoDigits=numbers[count2]%10 + numbers[count2]/10;
               numbers[count2] = totalOfTwoDigits;}
       }
        return numbers;
    }

    public int addEverySecondDigitThatIsASingleDigit(int[] numbers) {
        int singleDigits =0;
        for(int count = numbers.length-2; count>= 0; count-=2){
            singleDigits += numbers[count];
        }
        return singleDigits;

    }

    public int addEverySecondDigitFromInitialArray(int[] numbers) {
        int oddDigits = 0;
       for(int count = numbers.length-1; count >= 0; count-=2){
           oddDigits = oddDigits + numbers[count];
       }
        return oddDigits;


    }

    public String cardValidity(int[] numbers) {
        int sum =0;
       sum = addEverySecondDigitThatIsASingleDigit(numbers) + addEverySecondDigitFromInitialArray(numbers);
        System.out.println(sum);

       if(sum% 10 ==0){
           System.out.println("Card number is valid");
       }
       return "invalid card";
    }


//    public void validateCardLength(String cardNo){
//        while (cardNo.length() < 13 || cardNo.length() > 16){
//            Scanner input = new Scanner(System.in);
//            System.out.println("Enter a correct card number: ");
//            cardNo = input.nextLine();
//        }
//    }
//
//
//    public void determineCardType(String cardNo){
//        validateCardLength(cardNo);
//
//        if (cardNo.charAt(0) == '4' && cardNo.matches("^[0-9]+$")) {
//            System.out.println("Card Type: VisaCard");
//            System.out.println("Card NUmber: " + cardNo);
//
//        } else if (cardNo.charAt(0) == '5' && cardNo.matches("^[0-9]+$")) {
//            System.out.println("Card Type: MasterCard");
//            System.out.println("Card NUmber: " + cardNo);
//
//        } else if (cardNo.charAt(0) == '6' && cardNo.matches("^[0-9]+$")) {
//            System.out.println("Card Type: DiscoverCard");
//            System.out.println("Card NUmber: " + cardNo);
//
//        }else if (cardNo.charAt(0) == '3' && cardNo.charAt(1) == '7' && cardNo.matches("^[0-9]+$")) {
//            System.out.println("Card Type: America Express");
//            System.out.println("Card NUmber: " + cardNo);
//
//        }
//        System.out.println("Credit card digit length: " + cardNo.length());
//
//
//    }
////    public void determineCardTypeANdNumber(String cardNo) {
////        Scanner input = new Scanner(System.in);
////
////            while (cardNo.length() >= 13 || cardNo.length() <= 16) {
////
////                if (cardNo.charAt(0) == '4' && cardNo.matches("^[0-9]+$")) {
////                    System.out.println("Card Type: VisaCard");
////                    System.out.println("Card NUmber: " + cardNo);
////                    break;
////                } else if (cardNo.charAt(0) == '5' && cardNo.matches("^[0-9]+$")) {
////                    System.out.println("Card Type: MasterCard");
////                    System.out.println("Card NUmber: " + cardNo);
////                    break;
////                } else if (cardNo.charAt(0) == '6' && cardNo.matches("^[0-9]+$")) {
////                    System.out.println("Card Type: DiscoverCard");
////                    System.out.println("Card NUmber: " + cardNo);
////                    break;
////                } else {
////                    System.out.println("Enter a correct card number");
////                    cardNo = input.nextLine();
////
////                }
////
////            }
////
////        System.out.println("Credit card digit length: " + cardNo.length());
////
////    }
//
//
//
//
//
//
//    public void determineValidity(String cardNo) {
//
//
//        int[] numbers = new int[cardNo.length()];
//
//        for(int index = 0; index < cardNo.length(); index++){
//            numbers[index] = Character.getNumericValue(cardNo.charAt(index));
//        }
//        System.out.println(Arrays.toString(numbers));
//
//        for(int count = numbers.length-2; count >= 0; count-=2){
//            numbers[count] = numbers[count] * 2;
//        }
//        System.out.println(Arrays.toString(numbers));
//
//
//        int totalOfTwoDigits=0;
//       for(int count2 = numbers.length-2; count2>= 0; count2-=2){
//           if(numbers[count2]%10 != numbers[count2]){
//               totalOfTwoDigits=numbers[count2]%10 + numbers[count2]/10;
//               numbers[count2] = totalOfTwoDigits;}
//       }
//        System.out.println(Arrays.toString(numbers));
//
//        int singleDigits =0;
//        for(int count4 = numbers.length-2; count4>= 0; count4-=2){
//            singleDigits += numbers[count4];
//        }
//        System.out.println(singleDigits);
//
//
//       int oddDigits = 0;
//       for(int count3 = numbers.length-1; count3 >= 0; count3-=2){
//           oddDigits = oddDigits + numbers[count3];
//       }
//        System.out.println(oddDigits);
//
//       int sum =0;
//       sum = singleDigits + oddDigits;
//        System.out.println(sum);
//       if(sum% 10 ==0){
//           System.out.println("Card number is valid");
//       }
//       else{
//           System.out.println("Card number is invalid");
//       }
//
//    }
//
//

}
