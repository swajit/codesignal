import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class forEachEg {
    static int counter=1;
    private static void wasCalled() {
        counter++;
    }
    public static void main(String[] args) {

        List<String> mylist = new ArrayList<>();
        mylist.add("Balkrishna");
        mylist.add("Simantini");
        mylist.add("Swajit");
        mylist.add("Sonali");
        mylist.add("Saanvi");
        mylist.add("Saakshi");
        mylist.add("Scout");

        //mylist.stream().forEach(s -> System.out.println(s));
//
//         mylist.stream().limit(4).forEach(s -> System.out.println(s));
//
//        Stream<Integer> streamIterated = Stream.iterate(1, n -> n + 1).limit(2);
//        streamIterated.forEach(s -> System.out.println(s));
//               // System.out.println(flag);
//
//        List<String> list = Arrays.asList("abc1","abc2", "abc3");
//        counter = 1;
//        Stream<String> ss = list.stream().filter(element -> {
//            wasCalled();
//            return element.contains("2");
//        });
//        ss.forEach(s -> System.out.println(s + " - " + counter));

        IntStream intStream = IntStream.range(1, 9);
        //intStream.ma
        Map<String, Integer> standings = new HashMap<>();
        standings.put("TeamA", 1);
        standings.put("TeamB", 3);
        standings.put("TeamC", 1);
        standings.put("TeamD", 4);
        standings.put("TeamE", 2);

        List<Map.Entry<String, Integer>> list2 = new LinkedList<Map.Entry<String, Integer>>(standings.entrySet());
        List<Map.Entry<String, Integer>> sortedlist2 = new LinkedList<Map.Entry<String, Integer>>(standings.entrySet());

//        Collections.sort(sortedlist2, new Comparator<Map.Entry<String, Integer>>() {
//            @Override
//            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
//                return o2.getValue().compareTo(o1.getValue());
//
//            }
//        });

        Stream sortedL = sortedlist2.stream().sorted((o1, o2) -> o1.getValue().compareTo(o2.getValue()));
        sortedL.forEach((k) -> System.out.println(k + "--" ));

    }
}
