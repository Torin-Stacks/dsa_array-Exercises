public class VariableLengthArgumentLists {

    public static void main(String[] args) {
        System.out.println(add(1,2,3,4,6,5,7,8,9,10));
    }
    public static double add(double... numbers){
        double total = 0;
        for(double number: numbers){
            total = total + number;
        }
        return total;
    }
}
