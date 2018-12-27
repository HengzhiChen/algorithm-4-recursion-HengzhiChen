public class Recursion{
   //part1: factorial non-recursion
   public static int Factorial1(int n){
   int factorial = 1;
   for(int i = n;i>0;i--){
      factorial*=n
   }
   return factorial;
   }
   
   //part2: factorial recursion
  public static int factoria(int n) {
    	if(n==1||n==0) {
    		return 1;
    	}
    	return n*factoria(n-1);
   
   //part3: fibonacci sequence non-recursion
   public static int Fibonacci(int n){
      for(
   
   
   //part4: fibonacci sequence recursion

    public static int FS(int n) {
	    	if(n==1||n==2) {
	    		return 1;
	    	}
	    	return FS(n-2)+FS(n-1);
	    }
}
