public class MyClass {
     /*
     * To call a method, within another static method, 
     * we must change its access to static as well. 
     * This allows it to be called without being instantiated.
     */
    public static double addition(int a, int b) {
        return a + b;
    }

    public static double performDivision(double divisor, double quotient){
        return (divisor / quotient);
    }
}
