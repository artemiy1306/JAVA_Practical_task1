import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Task4 {
    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        ArrayList<String> surname = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> patronymic = new ArrayList<>();
        ArrayList<String> sex = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<Integer> id = new ArrayList<>();

        while (true) {
            System.out.println("Введите фамилию: ");
            surname.add(scanner.nextLine());
            System.out.println("Введите имя: ");
            name.add(scanner.nextLine());
            System.out.println("Введите отчество: ");
            patronymic.add(scanner.nextLine());
            System.out.println("Введите пол: ");
            sex.add(scanner.nextLine());
            System.out.println("Введите возраст: ");
            age.add(Integer.valueOf(scanner.nextLine()));
            id.add(name.size() - 1);
            System.out.println("Продолжить ввод да/нет? -> ");
            String select = scanner.nextLine();
            if (select.toLowerCase().contains("нет")) break;
        }
        for (int i = 0; i < surname.size(); i++) {
            System.out.printf("%s %s.%s. %s %s\n", surname.get(i), name.get(i).toUpperCase().charAt(0),
                    patronymic.get(i).toUpperCase().charAt(0), sex.get(i), age.get(i));
        }
        // Реализация сортировки по возрасту
        System.out.println("сортировать по возрасту да/нет: ");
        String select = scanner.nextLine();
        if (select.toLowerCase().contains("да")) {
            id.sort((o1, o2) -> age.get(o1) - age.get(o2));
            for (int i = 0; i < id.size(); i++) {
                System.out.println(surname.get(id.get(i)) + " " +
                        name.get(id.get(i)).toUpperCase().charAt(0) + "." +
                        patronymic.get(i).toUpperCase().charAt(0) + "." + " "
                        + sex.get(id.get(i)) + " " + age.get(id.get(i)));
            }
            System.out.println("выполнить сортировку по возрасту и полу да/нет: ");
            String sel = scanner.nextLine();
            if (sel.toLowerCase().contains("да")) {
              //сортируем сначало по полу потом по возрасту
                id.sort(new Comparator<Integer>() {
                        @Override
                        public int compare(Integer o1, Integer o2) {
                            String sex1 = sex.get(o1);
                            String sex2 = sex.get(o2);
                            int sComp = sex2.compareToIgnoreCase(sex1);
                            if (sComp != 0) return sComp;
                            int age1 = age.get(o1);
                            int age2 = age.get(o2);
                            return age1 - age2;
                        }
                    });


                    for (int i = 0; i < id.size(); i++) {
                        System.out.printf("%s %s.%s. %s %s\n", surname.get(id.get(i)),
                                name.get(id.get(i)).toUpperCase().charAt(0),
                                patronymic.get(id.get(i)).toUpperCase().charAt(0),
                                sex.get(id.get(i)), age.get(id.get(i)));
                    }

                }
                }
            }
        }

