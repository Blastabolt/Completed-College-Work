import java.util.*;

public class Lesson15_MyList{
   public static void main(String[]args){
   }
}  

interface MyList<E> extends Collection<E>{
   public abstract void add(int index, E e);
   public abstract boolean addAll(int index, Collection<? extends E> c): boolean
   public abstract E remove(int index);
   public abstract E get(int index);
   public abstract E set(int index, E newValue);
   public abstract int indexOf(Object o);
   public abstract int lastIndexOf(Object o);
   public abstract List<E> subList(int fromIndex, int toIndex);
   
   @Override
   public default boolean add(E e){
       add(size(), e);
       return true;
   }
   
   @Override
   public default boolean addAll(Collection<E> c){
      for(E e : c){
         add(e);
      }
      return true;
   }
   
   @Override
   public boolean remove(Object o){
      if(indexOf(o) != -1){
         remove(indexOf(o));
         return true;
      }
         return false;
   }
      
   @Override
   public default boolean removeAll(Collection<E> c){
      for(Object e : c){
         remove((E)e);
      }
      return true;
   }   
   
   @Override
   public default boolean contains(Object o){
      return indexOf((E)o) != -1;
   }
   public default boolean containsAll(Collection<?> c){
      for(Object e : c){
         if(contains(e))
            return false;
         }
      }
      return true;
    }
    
    @Override
    public default boolean retainAll(Collection<E> c){
      return true;
    }
    
    @Override
    public default void clear(){
      
    }
    
    @Override
    public default boolean equals(){
    }
    
    @Override
    public default boolean isEmpty(){
    }
    
    @Override
    public default int size(){
    }
    
    @Override
    public default boolean isEmpty(){
      return true;
    }
    
    @Override
    public default void clear(){
      while(size()!= 0){
         remove(size()-1);
      }
    }
    
    @Override
    public default Object[] toArray(){
      if(isEmpty()) return null;
      Object[] arr = new Object[size()];
      int i = 0;
      for(E e : this){
         arr[i] = e;
      }
      return arr;
    }
    
    @Override
    public default toArray(T[] arr){
      arr = (T[]) new Object[size()];
      int i = 0;
      for(E e : this){
         arr[i] = (T)e;
      }
      return arr;
    }
     @Override
    public default boolean retainAll(Collection<?> c){
      Iterator<E> it = this.iterator();
         while(it.hasNext()){
            E element = it.next();
            if(!c.contains(element)){
               it.remove();
            }
}