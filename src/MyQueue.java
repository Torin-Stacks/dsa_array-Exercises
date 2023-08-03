public class MyQueue {

    Object[] queue ;
    int counter;
    int front;
    int end;

    public MyQueue(int sizeOfQueue) {
        queue = new Object[sizeOfQueue];
    }

    public boolean add(Object obj) {
        if(end != queue.length-1) {
            queue[end] = obj;
            end+=1;
            counter++;
            return true;
        }

            System.out.println("overflow");//throwIllegalStateException
        return false;

    }

    public boolean offer(Object obj) {
        if(end != queue.length-1) {
            queue[end] = obj;
            end+=1;
            counter++;
            return true;
        }
         return false;
    }

    public  Object remove() {
        if(front==-1 && end == -1){
            return ("underflow");//throw NoSuchElementException
        }
        else if(front == end){
            front=end=-1;
        }
        front+=1;
        counter--;
        return queue[front];
    }

    public  Object poll() {
        if(front==-1 && end == -1){
            return null;
        }
        else if(front == end){
            front=end=-1;
        }
        front+=1;
        counter--;
        return queue[front];
    }

    public Object peek(){
        if(front == -1 && end == -1){
            return null;
        }
        return queue[front];
    }

    public Object element(){
        if(front == -1 && end == -1){
            return "NoSuchElementException";
        }
        return queue[front];
    }
}
