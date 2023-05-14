package Sem_1;

import java.util.Scanner;

public class DZ_1 {
    public static void main(String[] args) {
//        1) Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
//        Ввод:5
//        Треугольное число 1 + 2 + 3 + 4 + 5 = 15
//        n! 1 * 2 * 3 * 4 * 5 = 120

//    int n = 5;
//    int treug = 0;
//    int umn = 1;
//    for (int i = 0; i <= n; i++){
//        treug += i;}
//    System.out.println(treug);
//    for (int i = 1; i <= n; i++) {
//        umn *= i;}
//    System.out.println(umn);

//        2) Вывести все простые числа от 1 до 1000

//    int n = 1000;
//    for (int i = 1; i <= n; i ++){
//        if (i % 2 != 0){
//            System.out.println(i);
//        }
//    }

//        3) Реализовать простой калькулятор (+ - / *)
//        Ввод числа ->
//        Ввод знака ->
//        Ввод числа ->

//        int c = 0;
//        Scanner iScanner = new Scanner(System.in);
//        System.out.printf("Введите первое число: ");
//        int x = iScanner.nextInt();
//        System.out.printf("Введите знак (*, /, +, -): ");
//        String znak = iScanner.next();
//        System.out.printf("Введите второе число: ");
//        int y = iScanner.nextInt();
//        if (znak.equals("+")) c = x + y;
//        if (znak.equals("-")) c = x - y;
//        if (znak.equals("*")) c = x * y;
//        if (znak.equals("/")) c = x / y;
//        System.out.println(c);
//        iScanner.close();

//        4) (ДОПОЛНИТЕЛЬНАЯ) +Задано уравнение вида q + w = e, q, w, e >= 0.
//        Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69 (пользователь).
//                Требуется восстановить выражение до верного равенства.
//                Предложить хотя бы одно решение или сообщить, что его нет.
//        под знаками вопроса - одинаковые цифра
//        Ввод: 2? + ?5 = 69
//        Вывод: 24 + 45 = 69
//
//        Scanner iScanner = new Scanner(System.in);
//        System.out.printf("Введите первое число: ");
//        String chislo_1 = iScanner.next();
//        System.out.printf("Введите второе число: ");
//        String chislo_2 = iScanner.next();
//        System.out.printf("Введите ответ: ");
//        int otvet = iScanner.nextInt();
//
//        for (int i = 0; i <= 9; i ++){
//            String zamena = Integer.toString(i);
//            String ch_3 = chislo_1.replace("?", zamena);
//            String ch_4 = chislo_2.replace("?", zamena);
//            int x = Integer.parseInt(ch_3.trim());
//            int y = Integer.parseInt(ch_4.trim());
//            if (x + y == otvet){
//                System.out.println(x + "+" + y + "=" + otvet);
//            }
//        }
//        iScanner.close();
//        System.out.println("Найти сумму чисел невозможно");
//    }
//}
