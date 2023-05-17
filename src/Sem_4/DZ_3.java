package Sem_4;

import java.util.LinkedList;
import java.util.Scanner;

//3) В калькулятор добавьте возможность отменить последнюю операцию.
public class DZ_3 {
    public static void main(String[] args) {
        LinkedList <Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите часло: ");
        int x = sc.nextInt();
        list.add(x);
        int y;
        while (true){
            System.out.print("Введите (+, -, *, отмена, закончить): ");
            String znak = sc.next().toLowerCase();
            if (znak.equals("+")){
                System.out.print("Число: ");
                y = sc.nextInt();
                int otvet = list.getLast() + y;
                System.out.println("Ответ равен: " + otvet);
                list.add(otvet);
            }else if (znak.equals("-")){
                System.out.print("Число: ");
                y = sc.nextInt();
                int otvet = list.getLast() - y;
                System.out.println("Ответ равен: " + otvet);
                list.add(otvet);
            }else if (znak.equals("*")){
                System.out.print("Число: ");
                y = sc.nextInt();
                int otvet = list.getLast() * y;
                System.out.println("Ответ равен: " + otvet);
                list.add(otvet);
            }else if (znak.equals("отмена")){
                System.out.println("Ответ " + list.getLast() + " отменен");
                list.removeLast();
            }else if (znak.equals("закончить")){
                break;
            }
        }
    }
}
