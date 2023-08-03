public class MySet {
     private MyArray arr = new MyArray();
     private int counter;


     public void add(Object object) {
          if (!arr.contains(object)) {
               arr.add(object);
               counter++;
          }
//          for(Object obj : arr){
//               if (obj != object) {
//                    arr[counter] = obj;
//                    counter++;
//               }
//     }
     }

     public void addAll(Object[] array) {
          for (Object obj : array) {
               if (!arr.contains(obj)) {
                    arr.add(obj);
                    counter++;
               }

//               for(Object obj2:arr) {
//                    if (obj != obj2) {
//                         arr[counter]=obj;
//                    }
//               }
          }
     }

     public int size() {
          return counter;
     }

     public void clear() {
         arr.clear();
     }

     public Boolean contains(Object obj) {
          if (arr.contains(obj))
               return true;
          return false;
     }

     public Boolean containsAll(String[] array) {

          for (int index =0; index < array.length; index++) {
               if (!arr.contains(array[index]))
                    return false;
          }
               return true;

     }

     public boolean isEmpty() {
          if (counter == 0) return true;
          return false;
     }

//     public Object iterator() {
//          Object iterator;
//          for(int index = 0; index < arr.size();index++)
//          {
//               iterator = index;
//
//          }
//     }

     public Object[] toArray() {
          Object[] array = new Object[arr.size()];
          for(int index =0; index< array.length; index++){
               array[index] = arr.get(index);
          }
          return array;
     }

     public void remove(Object obj) {
          if(arr.contains(obj)){
               arr.remove(obj);
          }
     }
}