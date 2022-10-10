import java.util.*;

public class Lesson7_Collections{
   public static void main(String[] args){
   
      Student s1 = new Student("Ella", 17);
      Student s2 = new Student("Ryan", 14);
      System.out.println(s1.compareTo(s2));
      
      List<Student> c2 = new ArrayList<>();
      c2.add(s1);
      c2.add(s2);
      c2.add(new Student("Nan",21));
      System.out.println(c2);
      Collections.sort(c2);
      System.out.println(c2);
      Student newStudent = new Student("Junxiao",22);
      
      Collections.sort(c2, new StudentNameComparator());
      System.out.println(c2);
            
      System.out.println(Collections.binarySearch(c2, s2));
   
      List<Integer> 12 = new List<>();
      12.add(3);
      12.add(1);
      12.add(4);
      12.add(9);
      12.add(0);
      12.add(2);
      12.add(6);
      System.out.println(12);
      List<Integer> 13 = new ArrayList<>(12);
      
      Collections.sort(12);
      System.out.println(12);
      System.out.println(Collections.binarySearch(12, 8));
      
      Collections.reverse(12);
      System.out.println(12);
   
      System.out.println(13);
      Collections.sort(13, Collections.reverseOrder());
      System.out.println(13);
      
      Collections.shuffle(13);
      System.out.println(13);
      
      Collections.fill(13, 99);
      System.out.println(13);
      
      System.out.println(Collections.frequence(13, 99));
      
      Stack<Integer> st = new Stack<>();
      
      st.push(3);
      st.push(1);
      st.push(9);
      st.push(5);

      System.out.println(st);
      System.out.println(st.peek());
      System.out.println(st.pop());
      System.out.println(st);
      System.out.println(st.search(3));
      
      Queue<Integer> q = new LinkedList<>();
      q.offer(2);
      q.offer(4);
      q.offer(1);
      q.offer(0);
      q.offer(9);
      q.offer(3);
      System.out.println(q); 
      
      System.out.println(q.peek());
      System.out.println(q.poll());
      System.out.println(q);  
   }         
}

class Student implements Comparable<Student>{
   String name;
   int age;
   public Student(String n, int a){
   name = n;
   age = a;
}      
   
class StudentNameComparator implements Comparator<Student>
{
   @Override
   public int compare(Student o1, Student o2){
      return o1.name.compareTo(o2.name);
   }
}

class StudentAgeComparator implements Comparator<Student>
{
   @Override
   public int compare(Student o1, Student o2){
      return o1.age - o2.age;
   }
}