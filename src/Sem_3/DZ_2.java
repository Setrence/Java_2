package Sem_3;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.
public class DZ_2 {
    public static void main(String[] args) {

        int max;
        int min;
        int sum = 0;
        double srednee;
        ArrayList <Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i ++){
            list.add(random.nextInt(1, 10));
        }
        System.out.println(list);
        max = list.get(0);
        min = list.get(0);
        for (int i = 0; i < list.size(); i ++){
            if (list.get(i) > max){
                max = list.get(i);

            }else if (list.get(i) < min){
                min = list.get(i);
            }
        }
        System.out.println("Максимальное значение равно: " + max);
        System.out.println("Минимальное значение равно: " + min);
        for (int i = 0; i < list.size(); i++){
            sum += list.get(i);
        }
        srednee = (double) sum / list.size();
        System.out.println("Среднее арифметическое равно: "+ srednee);
    }
}
