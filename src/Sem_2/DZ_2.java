package Sem_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

//Дана строка (получение через обычный текстовый файл!!!)
//
//        "фамилия":"Иванов","оценка":"5","предмет":"Математика"
//        "фамилия":"Петрова","оценка":"4","предмет":"Информатика"
//
//        Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
//        Студент [фамилия] получил [оценка] по предмету [предмет].
//
//        Пример вывода в консоль:
//        Студент Иванов получил 5 по предмету Математика.
//        Студент Петрова получил 4 по предмету Информатика.
//        Студент Краснов получил 5 по предмету Физика.
public class DZ_2 {
    public static void main(String[] args) {
        String file = "school.txt";
        StringBuilder result = new StringBuilder();
        String [] rest;
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;{
                while ((line = br.readLine()) != null) {
                    rest = line.replace("\"", "").split(":|,");
                    result.append("Студент ").append(rest[1]).append(" получил ").append(rest[3]).append(" по предмету ")
                            .append(rest[5]).append("\n");
                }
                System.out.println(result);
            }
            br.close();
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
