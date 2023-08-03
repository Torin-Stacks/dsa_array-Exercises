import java.util.Arrays;


public class MyArray implements MyList {

    Object[] arr;
    private  int array_length;
    private int counterOrOccupiedSpaceInArray;

    public MyArray(){
        array_length = 1;
        arr = new Object[array_length];
                                                                                                                                                                                                                                                                                                                                                                                      arr =  new Object[array_length];
    }

    @Override
    public int size(){
        return counterOrOccupiedSpaceInArray;
    }

    @Override
    public void clear() {
        for(int index=0; index< arr.length; index++){
            arr[index] = null;
        }

    }
    @Override
    public void add(Object obj) {
        if (counterOrOccupiedSpaceInArray >= array_length){
            Object[] newArray = Arrays.copyOf(arr, arr.length + 1);
            newArray[newArray.length-1] = obj;
            arr = newArray;
        }
        arr[counterOrOccupiedSpaceInArray] = obj;
        counterOrOccupiedSpaceInArray++;
    }

    @Override
    public void add(int index, Object obj) {
        int size = arr.length;
        Object[] new_array = new Object[size+1];
        System.arraycopy(arr,index,new_array,index+1,size-index);
        System.arraycopy(arr,0,new_array,0,index);
        new_array[index] = obj;
        arr = new_array;
        counterOrOccupiedSpaceInArray++;

    }

    @Override
    public void remove(Object obj){
        int size = arr.length-1;
        Object new_array = new Object[size];
 //       System.arraycopy(arr,, new_array);
//        if (counterOrOccupiedSpaceInArray!=0){
//                for(int count = 0 ; count < arr.length; count++){
//                    if(arr[count] == obj) {arr[count] = null;}
//                    counterOrOccupiedSpaceInArray--;
//
//                }
//
//            }
        }


    @Override
    public void remove(int index) {
        if (counterOrOccupiedSpaceInArray!=0){
            for(int count = index; count < arr.length; count++){
                arr[count] = arr[count + 1];

            }
            counterOrOccupiedSpaceInArray--;
        }
    }

    @Override
    public Object get(int index){
        if(index > counterOrOccupiedSpaceInArray) outOfBound(index);
        return arr[index];
    }

    @Override
    public void set(int index, Object obj){
        arr[index] = obj;
    }

    @Override
    public int indexOf(Object obj) {
        for(int index=0; index < arr.length;index++) {
            if (arr[index] == obj) return index;

        }
        return -1;
    }

    @Override
    public void lastIndexOf(Object obj) {

    }

    @Override
    public boolean contains(Object obj){
        for(int index=0; index < arr.length;index++) {
            if (arr[index] == obj) return true;
        }
        return false;
    }

    private void outOfBound(int index){
        throw new ArrayIndexOutOfBoundsException("array out of bound for index " + index);

    }
}
