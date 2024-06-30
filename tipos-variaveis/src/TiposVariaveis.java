


public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        
        int a, b;
        String result = "";
        a = 5;
        b = 6;

        // if (a == b){
        //     result = "true";
        // }else{
        //     result = "false";
        // }

        result = a == b ? "true" : "false";
        System.out.println("Result: "+result);

        /*The ternary operator can be used with 
        * expressions that are not Boolean, 
        * as long as the result type is compatible 
        * with the expected return value types
        *
        */

        int biggest = (a > b)? a : b;
        System.out.println(biggest+" is the biggest number");
        }
}
