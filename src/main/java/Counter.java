import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        int a, b;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк массива: ");
        a = scanner.nextInt();

        System.out.print("Введите количество столбцов массива: ");
        b = scanner.nextInt();

        int[][] array = new int[a][b];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Введите элемент array[" + i + "][" + j + "]:");
                array[i][j] = scanner.nextInt();
            }
        }
        scanner.close();

        System.out.println("Вывод первой строки матрицы на экран, где каждый элемент умножается на 3");
        for (int j = 0; j < array[0].length; j++) {
            System.out.print(array[0][j] * 3 + ", ");
        }
    }
}
