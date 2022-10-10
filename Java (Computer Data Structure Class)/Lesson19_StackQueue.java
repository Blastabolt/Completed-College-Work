import java.util.*;

public class Lesson19_StackQueue{
   public static void main(String[] args){
      Mystack<Integer> s = new MyStack<>();
      s.push(5);
      s.push(1);
      s.push(6);
      s.push(2);
      s.push(0);
      System.out.println(s);
      while(!s.empty()){
         System.out.println(s.pop());
         System.out.println(s);
   }
   
   MyQueue<Integer> q = new MyQueue<>();
   for(int i = 0; i<5; i++){
      q.push((int)(Math.random()*10));
   }
   System.out.println(q);
   while(!q.empty()){
      System.out.println(q.pop());
      System.out.println(q);
   }
}

class MyStack<E> extends ArrayList<E>{
   Public Mystack(){
   }
   
   public boolean empty(){
      return isEmpty();
   }
   
   public E peek(){
      return get(size()-1);
   }
   
   public E pop(){
      return remove(size()-1);
   }
   
   public void push(E e){
      add(e);
   }   
}

class MyQueue<E> extends LinkedList<E>{
   public MyQueue(){}
   
   public boolean empty(){
   }
   
   public E peek(){
      return getFirst();
   }
   
   public E pop(){
      return removeFirst();
   }
   
   public void push(E e){
      addLast(e);
   }
}   

class MyPriorityQueue<E>{
}

class Heap<E extends Comparable<E>>{
   ArrayList<E> list;
   public Heap(){
      list = new ArrayList<>();
   }
      
   public void add(E e){
      list.add(e);
      int currentIndex = list.size()-1;
      while(currentIndex > 0){
         int parentIndex = (currentIndex-1)/2;
         if(list.get(currentIndex).compareTo(list.get(parentIndex){
         
         E tmp = list.get(currentIndex);
         list.set(currentIndex, list.get(parentIndex));
         list.set(parentIndex, tmp);
         }
         else{
            break;
         }
         
         currentIndex = parentIndex;
         }
         
         public E remove(){
            if(list.size()==0 return null;
            E root = list.get(0);
            list.set(0, list.get(size()-1));
            list.remove(list.size()-1);
            
            int currentIndex = 0;
            while(currentIndex < list.size()){
               int leftChildIndex = currentIndex * 2 + 1;
               int rightChildIndex = currentIndex * 2 + 2;
               int maxIndex = -1;
               
               if(leftChildIndex >= list.size()){
                  break;
               }
               
               else if(rightChildIndex >= list.size()){
                  if(list.get(currentIndex.compareTo(list.get(leftChildIndex))>=0{
                  break;
                  }
                  else{
                     maxIndex = leftChildIndex;
                     }
                 }
                 
                 else if(list.get(leftChildIndex).compareTo(
                  maxIndex = leftChildIndex
                  }
                 else if(list.get(leftChildIndex).compareTo(
                  maxIndex = rightChildIndex
                  }
                  
                 
}
