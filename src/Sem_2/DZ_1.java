package Sem_2;

import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;

public class DZ_1 {
    //    Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
//    результат после каждой итерации запишите в лог-файл.
    public static void main(String[] args) {
        int[] arr = {3, 6, 8, 4, 5, 9, 7};
        int item;
        String file = "booble.txt";
        File files = new File(file);
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < arr.length; i ++){
            for (int j = 1; j < arr.length; j ++){
                if (arr[j - 1] > arr[j]){
                    item = arr [j];
                    arr [j] = arr [j - 1];
                    arr [j - 1] = item;
                    result.append(Arrays.toString(arr)).append("\n");
                }
            }
        }
        try {
            FileWriter writer = new FileWriter(file, false);
            writer.write(result.toString());
            writer.close();
            System.out.println("True");
        }catch (Exception e){
            System.out.println("False");
        }
    }
}