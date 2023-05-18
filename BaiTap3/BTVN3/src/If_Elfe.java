public class If_Elfe {
    static int number = 100;
    public static void main(String[] args) {
        int n = 300;
        if (n == If_Elfe.number){
            System.out.println("n = 100");
        }else if (n < If_Elfe.number){
            System.out.println("n < 100");
        }else {
            System.out.println("n > 100");
        }
    }
}
