public class printOneToTen {
    public static void pri(int a){
        if(a==0){
            return ;
        }
        pri(a-1);
        System.out.println(a);
    }
    public static void main(String[] args) {
       pri(10);
    }

    
}
