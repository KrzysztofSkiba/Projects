
public class Calculator {

    public static void main(String[] args) {

        System.out.println(sum(3,2));
        System.out.println(substract(3,2));
        System.out.println(multiplication(3,2));
        System.out.println(division(3,2));


    }

    private static int sum(int x, int y) {

        return x + y;
    }

    private static int substract(int x, int y) {

        return x - y;
    }

    private static int multiplication(int x, int y) {

        return x * y;
    }

    private static int division(int x, int y) {

        return x / y;
    }
}
