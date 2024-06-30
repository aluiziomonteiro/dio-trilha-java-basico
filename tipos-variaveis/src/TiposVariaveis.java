


public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        String name = "Monteiro";
        String name1 = "Monteiro";
        String name2 = new String("Monteiro");

        /*
         * The "==" operators, when used on class objects, 
         * compare values ​​and references. Therefore, "==" 
         * is only recommended for primitive type comparisons.
        */
        System.out.println(name == name1);
        System.out.println(name == name2);
        /*
         * Comparisons with the equals() method look at 
         * the contents of the variables and not their 
         * memory addresses.
        */
        System.out.println(name.equals(name1));
        System.out.println(name.equals(name2));
        
        // int a = 3, b = 4;

        // System.out.println(a == b);
        // System.out.println(a != b);
        // System.out.println(a > b);
        // System.out.println(a < b);

        // int a = 3, b = 4;
        // String result = "";

        // switch (Integer.compare(a, b)) {
        //     case 0:
        //         result = "A is equal to B";
        //         break;
        //     case 1:
        //         result = "A is greater than B";
        //         break;
        //     case -1:
        //         result = "A is smaller than B";
        //         break;
        //     default:
        //         break;
        // }
        // System.out.println(result);
    }
}
