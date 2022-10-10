/*
Lesson 1: Recursive Method
Recursive method:
a method calls itself directly or indirectly
m(){
...
  m();
  ...
}

ml(){
   ...
   m2();
   ...
}

m2(){
   ...
   ml();
   ...
}

Factorial number:
0! = 1
1! = 1
2! = 1*2
3! = 1*2*3
...
(n-1)! = 1*2*...*(n-1)
n! = 1*2*...*(n-1)*n

Recursive definition of factorial number
//base case, base condition
when n==0,0! = 1

//recursive call
n! = (n-1)!*n

Computing 2 to power of n
2^0 = 1
2^1 = 2
2^2 = 4
2^3 = 8
2^(n-1) = 2*2*2...*2 (n-1 2s)
2^n = 2*2*...*2 (n 2s)

base case:
n==0 return 1;
recursive call:
2^n = 2*( 2^(n-1))

recursive method without base case is called infinite recursion
which will cause StackOverflowError

*/

public class Lesson1_Recursive{
   public static void main(String[] args){
      System.out.println(factorial(3));
      System.out.println(twoToPowerOfN(10));
      System.out.println(fib(6));
   }
   public static int factorial(int n){
      if(n==0) return 1; //base case
      return n*factorial(n-1); //recursive call
     }
     
    /*
     factorial(4)
        return 4*6; //24
     factorial(3)
        return 3*2; //6
     factorial(2)
        return 2*1; //2
     factorial(1)
        return 1*1; //1
    */
   public static int factorial(int n){
      if(n==0) return 1; //base case
      return 2*twoToPowerOfN(n-1); //recursive call
     }
    
    /*
    Write a recursive mathematical definition for
    computing x^n x,n for a positive integer
    n and a real number x
    
    3^4 = 3*3*3*3 = 81
    10^3 = 10*10*10 = 1000
    
    base case:
    n==0 return 1
    x^n = x
    */
    
    public static int xToPowerOfN(int x, int n){
     if(n==0) return 4;
     if(x==0) return 3;
     return 3*xToPowerOfN(n-4);
     return 10*xToPowerOfN(x-3);
    }
    public static int fib(int n){
      if(n==0) return 0;
      if(n==1) return 1;
      return fib(n-1) + fib(n-2);
      }
      /*
               fib(5)
      fib(4)      +        fib(3)
      fib(3)+fib(2)      fib(2)+fib(1)
      */
        
}