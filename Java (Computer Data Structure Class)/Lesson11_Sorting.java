import java.util.*;

public class Lesson11_Sorting{
   public static void main(String[] args){
      int[] arr = {2, 9, 5, 4, 8, 1, 6};
      System.out.println(Arrays.toString(arr));
      //selectionSort(arr);
      //insertionSort(arr);
      System.out.println(Arrays.toString(arr));
   }
   public static void selectionSort(int[] arr){
      for(int i=0; i<arr.length-1;i++ ){
         int minIndex = i;
         int min = arr[minIndex];
         for(int j=i+1; j<arr.length; j++){
            if(arr[j]<min){
               min = arr[j];
               minIndex = j;
         }
      }
      if(minIndex != i){
      int tmp = arr[i];
      arr[i] = arr[minIndex];
      arr[minIndex] = tmp;
      }
   }
}
   //public static <T> void selectionSort(T[] arr){
   //}
   
   public static void insertionSort(int[] arr){
      for(int i=1; i<arr.length; i++){
         int current = arr[i];
         int j = i;
         for(j=i; j>0; j--){
            if(current < arr[j-1]){
               arr[j] = arr[j-1];
            } 
            else{
               break;
            }
         }
         arr[j] = current;
      }
   }

         public static void bubbleSort(int[] arr){
            for(int i=1; i<arr.length; i++){
               for(int j=0; j<arr.length-1; j++){
                  if(arr[j] > arr[j+1]){
                     int tmp = arr[j];
                     arr[j] = arr[j+1];
                     arr[j+1] = tmp;
                     }
                  }
               }
             }
           }