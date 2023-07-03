public class Task2 {
    /*
    Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса,
    используя StringBuilder или String.
    Данные для фильтрации приведены ниже в виде json-строки.
    Если значение null, то параметр не должен попадать в запрос.
    Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
    */
    public static void main(String[] args) {
        String req = "select * from students where ";
        String st_sql = "\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"";
        String[] res = st_sql.split(",");
        StringBuilder str_form = new StringBuilder();
        for (String str : res) {
            if (!str.contains("null")) str_form.append(str);
            if (str.contains("name")) str_form.append(str_form = new StringBuilder(str_form.toString().replace("\"name\"", "name ")));
            if (str.contains("country")) str_form.append(str_form = new StringBuilder(str_form.toString().replace("\"country\"", "country ")));
            if (str.contains("city")) str_form.append(str_form = new StringBuilder(str_form.toString().replace("\"city\"", "city ")));
        }

//        str_form = new StringBuilder(str_form.toString().replace(":", "="));
//        str_form = new StringBuilder(str_form.toString().replaceAll("\"", "'"));
//        str_form = new StringBuilder(str_form.toString().replaceAll("' ", "' AND "));
        String result = str_form.toString();
//        String answer = String.join(" ", req, result);
//        System.out.println(answer);
        System.out.println(result);




    }

}
