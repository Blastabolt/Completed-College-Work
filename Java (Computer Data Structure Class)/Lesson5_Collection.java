import java.util.*;

public class Lesson5_Collection{
   public static void main(String[] args){
   
      Collection<Integer> c1 = new ArrayList<>();
      c1.add(1);
      c1.add(8);
      c1.add(2);
      c1.add(0);
      System.out.println(c1);
      
      Collection<Integer> c2 = new ArrayList<>();
      c2.add(1);
      c2.add(8);
      c2.add(2);
      c2.add(3);
      System.out.println(c2);
      
      c1.addAll(c2);
      System.out.println(c1);
      
      c1.remove(new Integer(1));
      System.out.println(c1);
      
      //cl.removeAll(c2);
      //System.out.println(c1);
      
      System.out.println(c1.contains(new Integer(4)));
      System.out.println(c1.containsAll(c2));
      
      c2.add(10);
      System.out.println(c2);
      
      System.out.println(c1.retainAll(c2));
      System.out.println(c1);
      
      Object[] objArr = c1.toArray();
      for(Object e : objArr){
         System.out.println(e);
      }
      
      Integer[] intArr =new Integer[c1.size()];
      //intArr = (Integer[]) objArr;
      
      cl.toArray(intArr);
      for(Integer e: intArr){
         System.out.println(e);
      }
      Integer[] intArr = new Integer[c1.size]
      
      
      
      
      
      for(Integer e: intArr){
         System.out.println(e);
         }
      
      System.out.println(c1);
      Iterator<Integer> it = c1.iterator();
      while(it.hasNext()){
         System.out.println(it.next());
      }
      
      System.out.println(it.hasNext());
      it = c1.iterator();
      while(it.hasNext)){
         it.next();
         it.remove();
         System.out.println(c1);
         }
   }
}