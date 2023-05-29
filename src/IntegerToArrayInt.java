import java.util.Arrays;

public class IntegerToArrayInt {
        public static void main(String[] args) {
            convertIntToArray("1234");
        }
        public static void convertIntToArray(String number) {
            char[] array = new char[number.length()];
            if (number.matches("^[0-9]+$")) {
                for (int index = 0; index < number.length(); index++) {
                    array[index] = number.charAt(index);
                }
            }
            System.out.println(Arrays.toString(array));
        }
        }


