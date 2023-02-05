public class ReplacePi {
    public static String replacePi(String s){
        if(s.length()<=1){
            //System.out.println("I am in return s block");
            return s;
        }
        //tum kayse ek hi index pe 2 chig check kar shakta hai
        if(s.charAt(0)=='p'||s.charAt(0)=='i'){
           // System.out.println("I am in  && block");
            String output =replacePi(s.substring(1));
            return "3.14"+output;
        }
        else{
            //System.out.println("I am in  else block block");
            String output=replacePi(s.substring(1));
            return s.charAt(0)+output;
        }
    }
    public static void main(String[] args) {
        //System.out.println("apiapiapia");
       System.out.println(replacePi("apiapipipiip"));
    }
    
}
