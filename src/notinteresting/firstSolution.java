package notinteresting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class firstSolution {
    public static void main(String[] args) {
        double ageSum=0;
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
        for(Map<String, String> ppl: ppls) {
            if (Integer.parseInt(ppl.get("возраст"))<30) {
                System.out.println(ppl.get("имя"));
            }
        }
        System.out.println("Решение №2");
        for(Map<String, String> ppl: ppls) {
            if (ppl.get("зарплата").contains("руб")) {
                System.out.println(ppl.get("имя"));
            }
        }
        System.out.println("Решение №3");
        for(Map<String, String> ppl: ppls) {
            ageSum +=Integer.parseInt(ppl.get("возраст"));
        }
        System.out.println(ageSum/ppls.size());


        }
    }