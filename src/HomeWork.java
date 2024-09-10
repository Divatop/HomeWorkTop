import java.util.Random;
import java.util.Scanner;

public class HomeWork {

    public static void main(String[] args) {

        //Дополнение предыдущего кода
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = sc1.nextInt();
        System.out.print("Введите число: ");
        int b = sc1.nextInt();
        int primer1 = a + b;
        int primer2 = a - b;
        int primer3 = a * b;
        int primer4 = a / b;
        int primer5 = a % b;

        System.out.println("Сложение: " + primer1);
        System.out.println("Вычитание: " + primer2);
        System.out.println("Умножение: " + primer3);
        System.out.println("Деление: " + primer4);
        System.out.println("Остаток от деления: " + primer5);


        Random ran1 = new Random();
        int sum1 = ran1.nextInt(70, 150);
        int sum2 = ran1.nextInt(70, 150);
        int sum3 = ran1.nextInt(70, 150);
        int sum4 = ran1.nextInt(70, 150);

        char num1 = (char) sum1;
        char num2 = (char) sum2;
        char num3 = (char) sum3;
        char num4 = (char) sum4;

        //System.out.println("Полученный результат: " + num1 + num2 + num3 + num4);


        int fil = 3_157_875;
        long fil2 = 4_785_734_125L;
        int fil3 = (int) fil2;
        System.out.println("Результат long: " + fil2);
        System.out.println("Результат переполненного int: " + fil3);


    }
}