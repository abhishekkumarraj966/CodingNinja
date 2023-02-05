/*Given the number 'n', write a code to print numbers from 1 to n in increasing order recursively. */
public class NaturalNumbers {
    public static void print (int n){
        if(n==0){
            return ;
        }
        print(n-1);
        System.out.println(n +" ");
    }
    public static void main(String[] args) {
        print(10);
    }
    
}
