package notinteresting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class firstSolutionStream {
    public static void main(String[] args) {
        ArrayList<Map<String, String>> ppls = new ArrayList<>(4);
        ppls.add(new HashMap<>(4){{
            put("имя", "Кирилл");
            put("возраст", "26");
            put("должность", "middle Java dev");
            put("зарплата", "150000 руб");
        }});

        ppls.add(new HashMap<>(4){{
            put("имя", "Виталий");
            put("возраст", "28");
            put("должность", "senior Java automation QA");
            put("зарплата", "2000 $");
        }});

        ppls.add(new HashMap<>(4){{
            put("имя", "Александр");
            put("возраст", "31");
            put("должность", "junior functional tester");
            put("зарплата", "50000 руб");
        }});

        ppls.add(new HashMap<>(4){{
            put("имя", "Дементий");
            put("возраст", "35");
            put("должность", "dev-ops");
            put("зарплата", "1500 $");
        }});

        System.out.println("Решение №1");
        ppls.stream()
                .filter(x->Integer.parseInt(x.get("возраст"))<30)
                .forEach(x->System.out.println(x.get("имя")));

        System.out.println("Решение №2");
        ppls.stream()
                .filter(x->x.get("зарплата").contains("руб"))
                .forEach(x->System.out.println(x.get("имя")));

        System.out.println("Решение №3");
        int age=ppls.stream()
                .map(x-> Integer.parseInt(x.get("возраст")))
                .reduce((x,y)->x+y).get();
        System.out.println((age/ppls.size()));



    }
}