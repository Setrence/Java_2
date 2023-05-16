// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String[] name = {"С", "е", "р", "г", "е", "й"};
        String sk = "СЕРГЕЙ КА.";
        System.out.println(sk.toLowerCase());
        System.out.println(String.join("", "С", "е", "р", "г", "е", "й"));
        System.out.println(String.join("^", "С", "е", "р", "г", "е", "й"));
    }
}