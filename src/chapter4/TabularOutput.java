package chapter4;

public class TabularOutput {
    public static void main(String[] args) {
        System.out.println("N\t\tN2\t\tN3\t\tN4");
        System.out.println();
        for (int row = 1; row <= 5; row++) {
            for (int column = row; column <= row; column++) {
                System.out.printf("%d\t\t", column);
                System.out.printf("%d\t\t", column * column);
                System.out.printf("%d\t\t", column * column * column);
                System.out.printf("%d\t\t", column * column * column * column);
                System.out.println();
            }
        }
    }
}
