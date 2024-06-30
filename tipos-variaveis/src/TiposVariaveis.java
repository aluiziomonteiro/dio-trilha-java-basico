


public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        
        boolean STATUS1 = true;
        boolean STATUS2 = false;

        if (STATUS1 && STATUS2){
            System.out.println("Both expressions are true.");
        } else if (STATUS1 || STATUS2){
            System.out.println("Only one of the two expressions is true.");
        }

        if (STATUS1 && !STATUS2){
            System.out.println("They were forced to be equals.");
        }

        System.out.println(STATUS1 && (3 > 9));
    }
}
