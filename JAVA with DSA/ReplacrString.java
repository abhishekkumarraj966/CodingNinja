public class ReplacrString {
    /*WAP To replace a character  */
public static String ReplaceChar(String s,char a, char b){
    if(s.length()==0){
        return s;
    }
    String SmallOutpur = ReplaceChar(s.substring(1),a ,b);
    if(s.charAt(0)==a){
        return b+SmallOutpur;
    }
    else{
        return s.charAt(0)+SmallOutpur;
    }
}
public static void main(String[] args) {
    System.out.println(ReplaceChar("asdfghjkxyxyl", 'x', 'z'));
}
    
}
