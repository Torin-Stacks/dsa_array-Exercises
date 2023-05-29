public class MyStack {
    private boolean isEmpty = true;
    private int counter =0;

    private  int size ;
    private String [] elementsArray = new String[size];

    public MyStack(int sizeOfStack) {
    size=sizeOfStack;
    }

    public boolean isEmpty() {
        return counter==0;
    }

    public void push(String element) {
        elementsArray[counter]=element;
        counter++;

    }

    public String pop() {
        counter--;
        return elementsArray[counter];
    }
}
