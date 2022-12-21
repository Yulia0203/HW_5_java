// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.

import java.util.*;

public class Names {
    public static void main(String[] args) {

        List<String> listOfEmployees = new ArrayList<>();

        addEmployeeNames(listOfEmployees, new String[] {
                "Дмитрий", "Василий", "Евгений", "Алексей",
                "Дмитрий", "Иван", "Дмитрий", "Светлана",
                "Василий", "Василий", "Алексей", "Анна",
                "Антон", "Анна", "Павел", "Мария",
                "Мария", "Наталья","Марина","Алексей",
                "Антон", "Александр", "Павел", "Александр"
        });

        System.out.println(howManyNames(listOfEmployees));
    }
    static TreeMap<String, Integer> howManyNames(List<String> names) {
        HashMap<String, Integer> result = new HashMap<>();
        for (String name : names) {
            if (result.containsKey(name)) {
                result.replace(name, result.get(name) + 1);
            } else {
                result.put(name, 1);
            }
        }
        TreeMap<String, Integer> sorted = new TreeMap<>(result);
        return sorted;
    }

    static void addEmployeeNames(List<String> listOfEmployees, String[] newEmployeeNames) {
        Collections.addAll(listOfEmployees, newEmployeeNames);
    }
}