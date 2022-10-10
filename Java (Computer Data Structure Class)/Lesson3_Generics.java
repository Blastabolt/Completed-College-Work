import java.util.*;

public class Lesson3_Generics{
   public static void main(String[] args){
      Cell<Integer> c1 = new Cell<Integer>(new Integer(5));
      System.out.println(c1);
      
      Cell<String> c2 = new Cell<String>(new String("abc"));
      System.out.println(c2);
      
      Cell<Circle> c3 = new Cell<Circle>(new Circle(5));
      System.out.println(c3);
      
      Pair<Integer, String> p1 =
         new Pair<Integer, String>(123, "Nan");
      System.out.println(p1);
      System.out.println(p1.getKey());
      System.out.println(p1.getValue());
      
      Pair<Integer, Circle> p2 =
         new Pair<Integer, Circle>(1234, new Circle(10));
      
      System.out.println(p2);
      
      ArrayList<String> sList = new ArrayList<String>();
      sList.add("cs209");
      
      ArrayList<Integer> intList = new ArrayList<Integer>();
      
      ArrayList<Cell<Circle>> cList = 
         new ArrayList<Cell<Circle>>();
      
      cList.add(c3);
      
      cList.add(new Cell<Circle>(new Circle (20)));
         System.out.println(cList);
      
      Cell<Integer>[] cArr = new Cell[3];
      
      cArr[0] = new Cell<Integer>(new Integer(123));
      cArr[1] = new Cell<Integer>(new Integer(234));
      cArr[2] = new Cell<Integer>(new Integer(345));
   
      for(Cell<Integer> e : cArr){
         System.out.println(e);
      }
      
      Pair<String, Integer>[] pArr = 
         new Pair[2];
      
      pArr[0] = new Pair<String, Integer>("Nan",123);
      pArr[1] = new Pair<String, Integer>("Ella",234);
      
      for(Pair<String, Integer> e : pArr ){
         System.out.println(e);
      }
     
      
      Integer[] intArr = new Integer[]{1,2};
      String[] sArr = new String[]{"Nan","Ella"};
      Circle[] ccArr = new Circle[]{new Circle(1), new Circle(2)};
      
      display(intArr);
      display(sArr);
      display(ccArr);
      display(pArr);
      
      Lesson3_Generics.<Integer>display(intArr);
      Lesson3_Generics.<Pair<String, Integer>>display(pArr);
   };
   
   public static <T> void display(T[] arr){
      for(T e : arr){
         System.out.println(e);
       }
   }
}

class Cell<T>{
   private T prisoner;
   
   public Cell(T p){
      prisoner = p;
   }
   
   @Override
   public String toString(){
      return prisoner.toString();
      
   }
}
class Pair<K, V>{
   private K key;
   private V value;

   public Pair(K k, V v){
      key = k;
      value = v;
   }
   
   public K getKey(){
      return key;
   }
   
   public V getValue(){
      return value;
   }
   
   @Override
   public String toString(){
      return "("+key.toString()+"->"+value.toString()+")";
   }
}
class Circle implements Comparable<Circle>{
   double radius;
   
   public Circle(){
      this(1);
   }
   
   public Circle(double r){
      radius = r;
   }
   
   public double area(){
      return Math.PI * radius * radius;
   }
   @Override
   public String toString(){
      return "Circle:"+radius;
   }
   @Override
   public int compareTo(Circle other){
      if(radius > other.radius) return 1;
      else if(radius < other.radius) return -1;
      else return 0;
   }
}
      