package factorial_finder;

public class Factorial {

    public static void main(String[] args) {
      

        Factorial mn = new Factorial();
        int factorial = mn.multiplyNumbers(5);
        System.out.println("relult = " + factorial);
    }

    int multiplyNumbers(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * multiplyNumbers(num - 1);
        }
    }
}
