import java.util.*;

public class Lesson10_BigO{
   public static void main(String[] args){
   }

public static long fib2(int n){
   long f0 = 0;
   long f1 = 1;
   long f2 = f0+f1;
   
   if(n==0) return f0;
   if(n==1) return f1;
   
   for(int i=2; i<=n; i++){
      f2 = f1 + f0;
      f0 = f1;
      f1 = f2;
   }
   public static int gcd1(int a, int b){
      int m = Math.max(a,b);
      int n = Math.min(a,b);
      int result = 1;
      for(int k=n; k>=2; k--){
         if(m%k==0 && n%k==0){
         result = k;
         break;
         }
      }
   return result;
   }
   public static int gcd3(int a, int b){
      int m = Math.max(a,b);
      int n = Math.min(a,b);
      if(m%n==0) return n;
      else
         return gcd3(n, m%n);
   }
   T(n) = T(n/2)
   T(n/2) = T(n/4)
   ... 
   public static boolean checkPrime1(int n){
      for(int i=2; i<n; i++){
         if(n%i==0){
            return false;
         }
      }
      return true;
   }
   public static boolean checkPrime2(int n){
      int root = (int)Math.sqrt(n);
      for(int i=2; i<n; i++){
         if(n%i==0){
            return false;
         }
      }
      return true;
   }
}
   