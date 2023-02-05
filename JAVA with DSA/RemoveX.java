public class RemoveX {
    public static String ReplaceChar(String s,char c, char d){
        if(s.length()==0){
            return s;
        }
        String output=ReplaceChar(s.substring(1), c, d);
        if(s.charAt(0)==c){
            return d+output;
        }
        else{
            return s.charAt(0)+output;
        }
    }
    public static void main(String[] args) {
        System.out.println(ReplaceChar("XXXXRUDDDFDDJ", 'X', 'A'));
    }
}
