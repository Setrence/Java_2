package Sem_4;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

//        2) Реализуйте очередь с помощью LinkedList со следующими методами:
//        enqueue() - помещает элемент в конец очереди,
//        dequeue() - возвращает первый элемент из очереди и удаляет его,
//                first() - возвращает первый элемент из очереди, не удаляя.
public class DZ_2 {
    public static void main(String[] args) {

        LinkedList <Integer> list = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            enqueue(list, random.nextInt(1, 9));
        }
        System.out.println(list);
        System.out.println(first(list));
        System.out.println(dequeue(list));
        System.out.println(list);
    }
    public static void enqueue (LinkedList <Integer> list, int num) {
        list.add(num);
    }
    public static int first (LinkedList<Integer>list){
        int num = list.get(0);
        return num;
    }
    public static int dequeue (LinkedList<Integer>list){
        int num = list.get(0);
        list.remove(0);
        return num;
    }
}
