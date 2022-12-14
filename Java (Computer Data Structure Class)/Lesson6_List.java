import java.util.*;

public class Lesson6_List{
   public static void main(String[] args){
      Collection<String> c1 =
         new ArrayList<>();
      c1.add("ella");
      c1.add("ryan");
      c1.add("nan");
      
      c1.forEach(e -> System.out.println(e.toUpperCase()));
      
      List<Integer> l1 = new ArrayList<>();
      l1.add(1);
      l1.add(8);
      l1.add(0);
      l1.add(2);
      
      System.out.println(l1);
      l1.add(2, 9);
      System.out.println(l1);
      l1.remove(new Integer(9));
      System.out.println(l1);
    
      /*
      l1.remove(1);
      System.out.println(l1);
      */
      System.out.println(l1.subList(1,2));
      
      l1.set(1,1);
      System.out.println(l1);
      
      Iterator<String> itl = cl.iterator();
      while(itl.hasNext()){
         System.out.println(it1.next());
      }
      ListIterator<Integer> it2 = l1.listIterator();
      while(it2.hasNext()){
         System.out.println(it2.next());
      }
      
      while(it2.hasPrevious()){
         System.out.println(it2.previous());
      }
      
      ListIterator<Integer> it2 = l1.listIterator();
      while(it2.hasNext()){
         Integer old = it2.next();
         if(old == 1){
            it2.set(9);
         }   
      }
      System.out.println(l1);
      
      ArrayList<Integer> arrList =
         new ArrayList<>(l1);
      System.out.println(arrList);
      
      System.out.println(arrList);
      arrList.add(3);
      System.out.println(l1);
      System.out.println(arrList);
      
      Student s1 = new Student("Ella", 17);
      Student s2 = new Student("Ryan", 14);
      System.out.println(s1.compareTo(s2));  
      
      Collection<Student> c2 = new ArrayList<>();
      c2.add(s1);
      c2.add(s2);
      
      System.out.println(c2);
      c2.sort(null);    
   }
   }
    

class Student implements Comparable<Student>{
   String name;
   int age;
   public Student(String n, int a){
      name = n;
      age  = a;
   }
   
   @Override
   public String toString(){
      return "("name+" "+age")";
   }
   
   @Override
   public int compareTo(Student o){
      //return age-o.age;
      return name.compareTo(o.name);
   }
}                                                                                                                                                                                                                                                                                                                                                                                                                     