package practice;

import java.util.*;

public class CoolNumbers {

    public static List<String> generateCoolNumbers() {
        List<String> coolNumbersList = new ArrayList<>();
        String[] carLetters = new String[] {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
        for (String letter : carLetters) {
            for (int figure = 0; figure < 10; figure++) {
                for (String letter2 : carLetters) {
                    for (String letter3 : carLetters) {
                        for (int m = 1; m <= 199; m++) {
                            String numberCar = String.format("%s%d%d%d%s%s%d", letter, figure,
                                    figure, figure, letter2, letter3, m);
                            coolNumbersList.add(numberCar);
                        }
                    }
                }
            }
        }
        return coolNumbersList;
    }

    public static boolean bruteForceSearchInList(List<String> list, String number) {
        for (int index = 0; index < list.size(); index++) {
            if (list.contains(number)){
                return true;
            }
        }
        return false;
    }

    public static boolean binarySearchInList(List<String> sortedList, String number) {
        int index = Collections.binarySearch(sortedList, number);
        if (index == -1) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
        return hashSet.contains(number);
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {
        return treeSet.contains(number);
    }

}