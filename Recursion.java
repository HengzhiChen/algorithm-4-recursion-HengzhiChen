public class Recursion{
   //part1: factorial non-recursion
   public static int Factorial1(int n){
   int factorial = 1;
   for(int i = 1;i<=n;i++){
      factorial*=i;
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
      public static int Factorial1(int n){
        int a = 1;
        int b = 1;
        int c=1;
	for(int i = 1;i<n;i++) {
	     c = a+b;
	     a = b;
	     b = c;
	}
	return c;
}}
   //part4: fibonacci sequence recursion

    public static int FS(int n) {
	    	if(n==1||n==2) {
	    		return 1;
	    	}
	    	return FS(n-2)+FS(n-1);
	    }
}
