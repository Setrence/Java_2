package Sem_4;

import java.util.Arrays;
import java.util.LinkedList;

//1) Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.
public class DZ_1 {
    public static void main(String[] args) {
        LinkedList <Integer> list = new LinkedList<>(Arrays.asList(2, 3, 4, 5, 6, 7, 8));
        System.out.println(list);
        for (int i = list.size() + 1; i > 1 ; i--) {
            list.add(i);
            list.remove();
        }
        System.out.println(list);
    }
}
