public class SumOfnNumber {
    public static int sum(int a){
        if(a==0){
            return 0;
        }
        int sumNumber=sum(a-1);
        int output= a+sumNumber;
        return output;

    }
    public static void main(String[] args) {
        System.out.println(sum(10));
    }
    
}
