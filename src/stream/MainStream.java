package stream;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.lang.System.out;

public class MainStream {

    public void main() {
        List<Integer> orderedIntList = Arrays.asList(5,9,18,100,900);
        List<Integer> descOrderedIntList = Arrays.asList(900,100,18,9,5);
        List<Integer> unorderedIntList = Arrays.asList(900,9,100,18,5);
        List<String> strList = Arrays.asList("a", "", "bee", "honey", "b", "hive", "flower");

        out.println("sumOfAbove10: " + sumOfAbove10(orderedIntList.stream()) + "\n");
        out.println("sumOfAbove10SquareValues: " + sumOfAbove10SquareValues(orderedIntList.stream()) + "\n");
        prtinStreams(orderedIntList.stream());

        String str = "analyze-nlz";
        out.println("firstNonRepeatableCharacterUsingStream = " + firstNonRepeatableCharacterUsingStream(str) + "\n");

        Predicate<String> p = o -> o.toString() == null;

        parallelStream(strList);
    }

    private void parallelStream(List<String> list){
        out.println("=== Start stream ===");
        list.stream()
                .map(e -> e.toUpperCase())
                .peek(e -> out.println(e))
                .collect(Collectors.toList());
        out.println("=== End stream ===");

        out.println("=== Start parallel stream ===");
        list.parallelStream()
                .map(e -> e.toUpperCase())
                .peek(e -> out.println(e))
                .collect(Collectors.toList());
        out.println("=== End parallel stream ===");
    }

    private void collect(Stream<String> stream){
        stream.collect(Collectors.toMap(i -> i, i -> i+i));
    }

    private void prtinStreams(Stream<Integer> s){
        out.println("s = " + s);
        Stream<Integer> s2 = s.map(i -> i * i);
        out.println("s.map(i -> i * i)");
        out.println("s = " + s);
        out.println("s2 = " + s2);
        IntStream intS3 = s2.mapToInt(i -> i);
        out.println("intS3 = " + intS3);
        out.println();
    }

    private long sumOfAbove10(Stream<Integer> s) {
        return s.filter(e -> e > 10).mapToInt(i -> i).sum();
    }

    private long sumOfAbove10SquareValues(Stream<Integer> s) {
        return s.filter(e -> e > 10)
//                .peek(i -> out.print(i+". "))
                .mapToInt(i -> i*i)
//                .peek(i -> out.print(i+", "))
                .sum();
    }

    private String firstNonRepeatableCharacterUsingStream(String str) {
        LinkedHashMap<String, Integer> hash = new LinkedHashMap<>();

        List<String> list = Arrays.asList(str.split(""));
        list.stream()
                .forEach(e -> {
                    if(hash.get(e) != null) {
                        hash.replace(e, hash.get(e)+1);
                    } else {
                        hash.put(e, 1);
                    }
                })
                ;

        out.println(hash);

        return hash.entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElse(null);
    }

}
