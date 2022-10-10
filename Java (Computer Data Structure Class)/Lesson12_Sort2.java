import java.util.*;

public class Lesson12_Sort2{
   public static void main(String[] args){
      int[] arr = {2, 9, 5, 4, 8, 1, 6};
      System.out.println(Arrays.toString(arr));
      mergeSort(arr, 0, arr.length-1);
   }
   public static void mergeSort(int[] arr){
      mergeSort(arr,0, arr.length-1);
   }
   public static void mergeSort(int[] arr,
                                int low,
                                int middle,
                                int high)
   {
   
      if(low>=high) return;
      int middle = (low+high)/2;
      mergeSort(arr,low,middle);
      mergeSort(arr,middle+1, high);
      merge(arr,low,middle,high);
   
   }
   
   public static void merge(int[] arr,
                            int low,
                            int middle,
                            int high)
   {
      int i = low;
      int j = middle+1;
      int[] tArr = new int[high-low+1];
      while(i<=middle && j<=high ){
         if(arr[i]<arr[j]){
            tArr[t] = arr[i];
            t++;
            i++;
         }
         else{
            tArr[t] = arr[j];
            t++;
            j++;      
      }
   }
   
   for(int ii=i; ii<middle+1; ii++){
      tArr[t] = arr[ii];
   }
   
   for(int t=0; t<tArr.length; t++){
      arr[low+t] = tArr[t];
      }
   
   for(int tt=0; tt<tArr.length; t++){
      arr[low+tt] = tArr[tt];
   }
   System.out.println(Arrays.toString(tArr));
  }
  public static void quickSort(int[]  arr){
   
  }
  
  public static void quickSort(int[]  arr,
                               int low,
                               int high)
  {
      if(low < high){
         int pivotIndex = partition(arr, low, high);
         quickSort(arr, low, pivotIndex-1);
         quickSort(arr, pivotIndex+1, high);
      }
  }
  public static int partition(int[] arr, int low, int high)
  {
      int
  }
}