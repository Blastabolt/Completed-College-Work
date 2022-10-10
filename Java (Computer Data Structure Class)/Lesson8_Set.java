import java.util.*;

public class Lesson8_Set{
   public static void main(String[] args){
      Set<Integer> s1 = new HashSet<>();
      s1.add(2);
      s1.add(1);
      s1.add(4);
      s1.add(3);
      s1.add(2);
      System.out.println(s1);
      s1.remove(new Integer(3));
      System.out.println(s1);
      
      Set<Integer> s2 = new HashSet<>();
      s2.add(9);
      s2.add(8);
      s2.add(3);
      s2.add(1);
      s2.add(2);
      System.out.println(s2);
      
      s1.addAll(s2);
      System.out.println(s1);
      
      s1.removeAll(s2);
      System.out.println(s1);
      
      Set<Integer> s3 = new LinkedHashSet<>();
      s3.add(2);
      s3.add(1);
      s3.add(4);
      s3.add(3);
      s3.add(2);
      System.out.println(s3);
      
      Set<Integer> s4 = new TreeSet<>();
      s4.add(2);
      s4.add(1);
      s4.add(4);
      s4.add(3);
      s4.add(2);
      s4.add(6);
      System.out.println(s4);
      
      //System.out.println(s4.pollFirst());
      //System.out.println(s4);
      System.out.println(s4.lower(4));
      System.out.println(s4.higher(2));
      
      System.out.println(s4.floor(4));
      System.out.println(s4.ceiling(4));
      
      Map<Integer, String> m1 =
         new HashMap<>();
      m2.put(111, "Nan");
      m2.put(333, "Ella");
      m2.put(222, "Ryan");
      m2.put(777, "Nan");
      System.out.println(m2);
      //m1.remove(111);
      //System.out.println(m1);
      Set<Integer> ks1 = m1.keySet();
      System.out.println(ks1);
      
      Collection<String> vs1 = m1.values();
      System.out.println(vs1);
      
      Set<Map.Entry<Integer, String>> es1 = 
         m1.entrySet();
      System.out.println(es1);
      
      System.out.println(m2.firstkey());
      System.out.println(m2.firstEntry());
      
      
   }
}