import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Task2_2 {
    /*Дана json-строка (можно сохранить в файл и читать из файла)
    [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
    Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
    Пример вывода:
    Студент Иванов получил 5 по предмету Математика.
    Студент Петрова получил 4 по предмету Информатика.
    Студент Краснов получил 5 по предмету Физика.
    */
    public static void main(String[] args) {
        File file = new File("./src/2_2JSON.txt");
        String[] student;
        String name = "";
        String grade = "";
        String subject = "";
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                student = scanner.nextLine().replaceAll("[\"\\[\\]}{]", "").split(",");
                StringBuilder builder = new StringBuilder();
                for (int i = 0; i < student.length; i++) {
                    name = student[i].substring(student[i].indexOf(":") + 1);
                    i++;
                    grade = student[i].substring(student[i].indexOf(":") + 1);
                    i++;
                    subject = student[i].substring(student[i].indexOf(":") + 1);
                    String tmp = String.format("Студент %s получил %s по предмету %s\n", name, grade, subject);
                    builder.append(tmp);
                }
                String str = builder.toString();
                System.out.println(str);
            }
        } catch(FileNotFoundException e){
            System.out.println("Файл не найден");
        }
    }
}
