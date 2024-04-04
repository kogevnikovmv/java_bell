import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Streammm {

    public static void main(String[] args) {

        //ArrayList<Integer> lst= new ArrayList<>();
        //Stream.generate(() -> Math.random()).limit(5).map(x -> (int)(x*100)).forEach(x -> lst.add(x));
        //System.out.println(lst);
        //lst.stream().filter(x -> x>80).forEach(x -> System.out.println(x));
        //----------------------------------------------------------------------
        //List<Log> logs = List.of(
        //        new Log("Сибирская сосна", 10),
        //        new Log("Дуб монгольский", 30),
        //        new Log("Берёза карликовая", 5));
        //IntStream intstrm= logs.stream()
        //        .map(Log::getType)
        //        .map(x->x.split(" "))
        //        .flatMap(Arrays::stream)
        //        .map(x-> x.chars())
        //        .flatMapToInt(x->x);
        //intstrm.forEach(x -> System.out.println((char)x));
        //-----------------------------------------------------
        //List<Log> logs = List.of(
        //        new Log("Сибирская сосна", 10),
        //        new Log("Дуб монгольский", 30),
        //        new Log("Берёза карликовая", 5));
        //List<String> nwarray;
        //nwarray=logs.stream()
        //       .map(Log::getType)
        //        .map(x->x.split(""))
        //        .flatMap(Arrays::stream)
        //        .distinct()
        //        .sorted()
        //        .collect(Collectors.toList());
        //System.out.println(nwarray);
        //---------------------------------------------------------------
        List<Log> logs = List.of(
                new Log("Сибирская сосна", 10),
                new Log("Дуб монгольский", 30),
                new Log("Берёза карликовая", 5));
        Map<String, String> nwarray;
        List<String> tstlst=new ArrayList<>();
        nwarray=logs.stream()
                .map(x-> x.getType()+"="+x.getCount())
                .map(x-> x.split("="))
                .collect(Collectors.toMap(x->x[0],x->x[1]));
        System.out.println(nwarray.entrySet());
        //------------------------------------

    }
}
class Log{
    String type;
    int count;
    public Log(String type, int count) {
        this.type = type;
        this.count = count;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
