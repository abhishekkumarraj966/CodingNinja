/*Write a program to find x to the power n (i.e. x^n). Take x and n
 from the user. You need to return the answer.Do this recursively. */

public class CalculatePower {
    public static int power(int x,int y){
        if(x==0){
            return 1;

        }
        if(y==0){
            return 0;
        }
        int smallinput=power(x,y-1);
        int result=x * smallinput;
         return result;
    }
    
}
