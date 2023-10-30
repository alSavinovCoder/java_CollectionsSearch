package practice;

import java.util.*;

import static practice.CoolNumbers.*;

public class Main {
    /*
    TODO:
     - реализовать методы класса CoolNumbers
     - посчитать время поиска введимого номера в консоль в каждой из структуры данных
     - проанализоровать полученные данные
     */

    public static void main(String[] args) {

        System.out.println("Введите номер");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        CoolNumbers coolNumbers = new CoolNumbers();

        List<String> coolNumbersList = coolNumbers.generateCoolNumbers();
        List<String> coolNumbersSortedList = coolNumbers.generateCoolNumbers();
        HashSet<String> coolNumbersHashSet = new HashSet<>(coolNumbersList);
        TreeSet<String> coolNumbersTreeSet = new TreeSet<>(coolNumbersList);

        Collections.sort(coolNumbersSortedList);

        //линейный поиск
        long t1 = System.currentTimeMillis();
        if (bruteForceSearchInList(coolNumbersList, userInput) == true) {
            System.out.println("Поиск перебором: номер найден, поиск занял "+(System.currentTimeMillis()-t1)+"нс");
        } else {
            System.out.println("Поиск перебором: номер не найден, поиск занял "+(System.currentTimeMillis()-t1)+"нс");
        }

        //бинарный поиск
        long t2 = System.currentTimeMillis();
        if (binarySearchInList(coolNumbersSortedList, userInput) == true) {
            System.out.println("Бинарный поиск: номер найден, поиск занял "+(System.currentTimeMillis()-t2)+"нс");
        } else {
            System.out.println("Бинарный поиск: номер не найден, поиск занял "+(System.currentTimeMillis()-t2)+"нс");
        }

        //поиск в HashSet
        long t3 = System.currentTimeMillis();

        if (searchInHashSet(coolNumbersHashSet, userInput) == true) {
            System.out.println("Поиск в HashSet: номер найден, поиск занял "+(System.currentTimeMillis()-t3)+"нс");
        } else {
            System.out.println("Поиск в HashSet: номер не найден, поиск занял "+(System.currentTimeMillis()-t3)+"нс");
        }

        //поиск в ThreeSet
        long t4 = System.currentTimeMillis();

        if (searchInTreeSet(coolNumbersTreeSet, userInput) == true) {
            System.out.println("Поиск в TreeSet: номер найден, поиск занял "+(System.currentTimeMillis()-t4)+"нс");
        } else {
            System.out.println("Поиск в TreeSet: номер не найден, поиск занял "+(System.currentTimeMillis()-t4)+"нс");
        }
    }
}