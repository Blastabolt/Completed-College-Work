import java.util.*;

public class Lesson14_HeapSort{
   public static void main(String[] args{
      Heap<Integer> h = new Heap<>();
      h.add(4);
      h.add(6);
      h.add(1);
      h.add(8);
      h.add(9);
      System.out.println(h);
   
     while(!h.isEmpty()){
     System.out.println(h.remove());
  } 
  }
}
class Heap<E extends Comparable<E>>{
   ArrayList<E> list;
   public Heap(){
      list = new ArrayList<>();
      }
      
   public Heap(E[] objects){
   }
   
   public int getSize(){
   
   }
   
   public boolean isEmpty(){
      return list.isEmpty();
   }
   
   public String toString(){
      return list.toString();
   }
   
   public void add(E newObject){
      list.add(newObject);
   
      int currentIndex = list.size()-1;
      
      while(currentIndex > 0){
         int parentIndex = (currentIndex-1)/2;
         if(list.get(currentIndex).compareTo(list.get(parentIndex)));
   }
   
   public E remove(){
      if(list.size()==0) return null;
      E root = list.get(0);
      list.set(0,list.get(list.size()-1));
      list.remove(list.size()-1);
      }
   int currentIndex = 0;
   while(currentIndex < list.size()){
      int leftChildIndex = currentIndex*2+1;
      int rightChildIndex = currentIndex*2+2;
      int maxIndex = leftChildIndex; 
      if(leftChildIndex >= list.size()){
         break;
      }
      else if(rightChildIndex >= list.size()){
         if(list.get(currentIndex).compareTo(list.get(maxIndex))>0){
            break;
            }
       }
      else if(list.get(maxIndex).compareTo(list.get(rightChildIndex))<0{
         maxIndex = rightChildIndex;
      }
        
}
