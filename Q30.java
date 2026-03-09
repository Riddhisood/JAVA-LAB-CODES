//Q30. Write a program in Java to use final variables

public class Q30 {
    final int MAX_VALUE = 100;

    public void displayMaxValue() {
        System.out.println("The maximum value is: " + MAX_VALUE);
    }

    public static void main(String[] args) {
        Q30 example = new Q30();
        example.displayMaxValue();
    }
}
