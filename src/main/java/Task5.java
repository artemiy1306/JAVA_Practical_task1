import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*Реализуйте структуру телефонной книги с помощью HashMap.
Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами,
их необходимо считать, как одного человека с разными телефонами.
Вывод должен быть отсортирован по убыванию числа телефонов. */

public class Task5 {
    public static void main(String[] args) {
            String[] name = new String[]{"Петрова Ева Игоревна", "Булгаков Михаил Константинович", "Смирнова Полина Назаровна",
                    "Островская София Евгеньевна", "Пономарева Василиса Кирилловна", "Дементьев Лев Макарович",
                    "Пономарева Василиса Кирилловна", "Смирнова София Андреевна", "Пономарева Василиса Кирилловна", "Дементьев Лев Макарович"};
            Integer[] numbers = new Integer[]{11111, 22222, 333333, 444444, 555555,
                    666666, 777777, 888888, 999999, 10101010};
            Map< String, ArrayList<Integer>> phone = new HashMap<>();

            for (int i = 0; i < name.length; i++) {
                ArrayList<Integer> ph = new ArrayList<>();
                if (phone.containsKey(name[i])) {
                    phone.get(name[i]).add(numbers[i]);
                }else{
                    ph.add(numbers[i]);
                    phone.put(name[i],ph);
                }
            }
            System.out.println(phone);
        List<Map.Entry<String, ArrayList<Integer>>> toSort = new ArrayList<>();
        for (Map.Entry<String, ArrayList<Integer>> stringArrayListEntry : phone.entrySet()) {
            toSort.add(stringArrayListEntry);
        }
        toSort.sort(Map.Entry.comparingByValue((o1, o2) -> o2.size() - o1.size()));
        for (Map.Entry<String, ArrayList<Integer>> stringArrayListEntry : toSort) {
            System.out.println(stringArrayListEntry);
        }
            }
        }





