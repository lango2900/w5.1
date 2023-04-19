import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the amount of rows you want:  ");
        int r = scanner.nextInt();
        System.out.println("Input the amount of columns you want:  ");
        int c = scanner.nextInt();

        int numList[][]=new int[10][10];
        int i = 1;
        for (int row = 0; row < r; row++) {
            for (int column = 0; column < c; column++) {
                int num=(int)(i++);
                numList[row][column] = num;

                System.out.print(numList[row][column] + "\t");
            }
            System.out.println("");
        }
    }
}