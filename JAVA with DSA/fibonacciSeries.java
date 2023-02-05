import javax.lang.model.util.ElementScanner6;

public class fibonacciSeries {
    // public static int Fib(int n){
    //     if(n==1||n==2){
    //         return 1;
    //     }
    //     int a=Fib(n-1);
    //     int b=Fib(n-2);
    //     int c=a+b;
    //     return c;
    // }
    public static int fib(int num)
    {
        if(num == 0)
        {
            return 0;
        }
        else if(num == 1)
        {
            return 1;
        }
        else 
        {
            return fib(num -1) + fib(num -2);
        }
    }
    public static void main(String[] args) {
         //System.out.println(fib(10));
         for(int i = 0;i<10;i++)
         {
            System.out.println(fib(i));
         }
    }
}

