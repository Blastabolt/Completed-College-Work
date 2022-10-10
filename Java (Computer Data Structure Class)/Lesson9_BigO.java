import java.util.*;

public class Lesson9_BigO{
   public static void main(String[] args){
      /*
      getTime(100000);
      getTime(1000000);
      getTime(10000000);
      getTime(100000000);
   */
      int[] a = new int[10000];
      for(int i=0; i<a.length; i++){
         a[i] = (int)(Math.random()*100);
         
      System.out.println(Arrays.toString(a));
      Arrays.sort(a);
      System.out.println(Arrays.toString(a));
      System.out.println(linearSearch(a, 50));
      System.out.println(binarySearch(a, 50));
   
   }
   public static void getTime(long n){
      long startTime = System.currentTimeMillis();
      long k = 0;
      for(int i=1; i<=n; i++){
         k+=5;
      }
      long endTime = System.currentTimeMillis();
      System.out.println("n= " + n);
      System.out.println("T=" + (endTime-startTime));
   }
   public static void getTime2(long n){
      long startTime = System.currentTimeMillis();
      long k = 0;
      for(int i=1; i<=n; i++){
         k+=5;
      }
      
      long endTime = System.currentTimeMillis();
      System.out.println("n= " + n);
      System.out.println("T=" + (endTime-startTime));
   }
   public static int linearSearch(int[] arr, int key){
      for(int i=0; i<arr.length; i++){
         if(key == arr[i]){
            return i;
         }
      }
      return -1;
   }
   
   public static int binarySearch(int[] arr, int key){
      int startIndex = 0;
      int endIndex = arr.length-1;
      int middleIndex = (startIndex + endIndex)/2;
      
      while(startIndex < endIndex){
         if(key < arr[middleIndex])
           endIndex = middleIndex-1;
           middleIndex = (startIndex + endIndex)/2;
         }
         else if(key > arr[middleIndex]){
            startIndex = middleIndex + 1;
            middleIndex = (startIndex + endIndex)/2;
            
         }
         else{
            return middleIndex;
            }
         }
         return -1;
}
}