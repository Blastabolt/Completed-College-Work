public class Lesson4_Generics{
   public static void main(String[] args){
      Circle cl = new Circle(3);
      Rectangle rl = new Rectangle(2,4);
      System.out.println(equalArea(c1, r1));
      
      Cell<Circle> cel = new Cell(c1);
      
      Cell<Circle>[] cellArr = new Cell[2];
      
      cellArr[0] = cel;
      cellArr[2] = new Cell<Circle>(new Circle(2));
      
      for(Cell<Circle> e : cellArr){
         System.out.println(e);
      }
      
      Cell<Rectangle> rCel = new Cell<>(new Rectangle(2,3));
      Cell<Rectangle> rCel = new Cell<>(new Rectangle());
      
      System.out.println(rCel.compareTo(rCel2));
   }

public static <T extends GeometricShape> 
   boolean equalArea(T t1, T t2){
   return t1.area() == t2.area();
  }
}

abstract class Geometric Shape{
   public abstract double area();
}

class Circle extends Geometric Shape
             implements






@Override
public int compareTo(Circle obj){
}


class B<T> implements Comparable<B<T>>
{
}
class Cell<T>



class Cell<T extends Comparable<T>>
      implements Comparable<Cell<T>>
{
   T prisoner;
   public Cell(T p){
   prison = p;
   }
   
   public T getPrisoner(){
      return prisoner;
}

   @Override
   public String toString(){
      return prisoner.toString();
   }
   
   @Override
   public int compareTo(Cell<T> objCell){
      return (this.prisoner).compareTo(objCell.prisoner);
   }
}

class A<E>{
   E obj;
   E[] arr;
   
   public A(){
      obj = (E)new Object();
      
      arr = (E[]) new Object[10];
   }
}

/*
class C<T extends Comparable<T>>{

}

class T implements Comparable<T>{
}

}
*/