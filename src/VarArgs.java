public class VarArgs {
    public int add(int... numbers){
        int total = 0;
        int average = 0;
         for(int number: numbers){
             total = total + number;
              average = total/numbers.length;
         }
         return average;
    }
}
