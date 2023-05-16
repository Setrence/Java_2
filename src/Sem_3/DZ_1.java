package Sem_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

//Пусть дан произвольный список целых чисел, удалить из него чётные числа
public class DZ_1 {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++){
            list.add(random.nextInt(1,10));
        }
        System.out.println(list);
        Iterator <Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            if (iterator.next() % 2 == 0){
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}
