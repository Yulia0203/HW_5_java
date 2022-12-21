// // Реализуйте структуру телефонной книги с помощью HashMap,
// // учитывая, что 1 человек может иметь несколько телефонов.


import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    public static void main(String[] args) {
        Map<String, String> bookPhone = new HashMap<>();
        bookPhone.put("Руслан", "1-23-25, 5-47-56");
        bookPhone.put("Света", "3-45-33");
        bookPhone.put("Дима", "3-33-52, 5-88-99");
        bookPhone.put("Алиса", "2-33-66");

        System.out.println("Справочник: \n" + bookPhone);

        add(bookPhone, "Мама", "8-99-66");
        System.out.println("После добавления: \n" + bookPhone);

        remove(bookPhone, "Света");
        System.out.println("После удаления: \n" + bookPhone);
    }

    public static void add(Map<String, String> note, String name, String num){
        note.put(name, num);
    }

    public static void remove(Map<String, String> note, String name){
        note.remove(name);
    }
}