/*Given the number 'n', find out and return the number of digits present in a number . */
public class NumberofDigits {
   
    public static int count(int n){
        if(n==0){
            return 0;
        }
        int smallans= count(n/10);
        return smallans +1;
    } 
    public static void main(String[] args) {
    count(15);
 }   
}


