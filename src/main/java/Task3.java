import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;
public class Task3 {
    /*Пусть дан произвольный список целых чисел.
    1) Нужно удалить из него чётные числа
    2) Найти минимальное значение
    3) Найти максимальное значение
    4) Найти среднее значение
     */
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 5; i++) {
            numbers.add(rnd.nextInt(100));
        }
        System.out.println("numbers: " + numbers);

        numbers.removeIf(number -> number % 2 == 0);

        System.out.println("odd numbers: " + numbers);
        Integer max = Collections.max(numbers);
        System.out.println("max numbers: " + max);
        Integer min = Collections.min(numbers);
        System.out.println("min numbers: " + min);
        double sum = 0;
        for (double i : numbers){
            sum +=i;
        }
        double aver = sum / numbers.size();
          aver = (Math.round(aver* 100.0) / 100.0);
        System.out.print("average value: " + aver );

    }



}
