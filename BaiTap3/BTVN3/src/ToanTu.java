public class ToanTu {
          public static void main(String[] args) {

            int a = 5;
            int b = 10;
            int c = 3;

            boolean sosanh1 = (a > b) && (b < c);
            boolean sosanh2 = (a < b) || (b == c);
            boolean sosanh3 = (a > c) && (b > c);

            System.out.println("(a > b) && (b < c): " + sosanh1);
            System.out.println("(a < b) || (b == c): " + sosanh2);
            System.out.println("(a > c) && (b > c): " + sosanh3);
        }
    }

