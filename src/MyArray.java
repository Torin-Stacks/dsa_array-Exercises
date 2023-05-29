import java.util.Arrays;


public class MyArray implements MyList {

    Object[] arr;
    private  int array_size;
    private int counter;

    public MyArray(){
        array_size = 1;
        arr =  new Object[array_size];
    }

    public int size(){
        return counter;
    }

    @Override
    public void add(Object obj) {
        if (counter >= array_size){
            Object[] newArray = new Object[counter + 1];
            newArray = Arrays.copyOf(arr, newArray.length + 1);
            arr = newArray;
        }
        arr[counter] = obj;
        counter++;
    }

    @Override
    public void remove(Object obj){

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public Object get(int index){
        return arr[index];

    }

    @Override
    public void set(int index, Object obj){
        arr[index] = obj;
    }

    @Override
    public void indexOf(Object obj) {

    }

    @Override
    public void lastIndexOf(Object obj) {

    }

    @Override
    public void contains(Object Obj){

    };
}
