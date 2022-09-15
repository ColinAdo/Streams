import java.util.*;
import java.util.stream.*;
public class StreamDuplicate {
//    First approach does not indicate the frequency of duplicate
    public static <T> Set<T> duplicate(Stream<T> stream){
        Set<T> items = new HashSet<>();
        return stream
                .filter(n->!items.add(n))
                .collect(Collectors.toSet());
    }
//    Second approach using Collections.frequency()
    public static <T> Set<T> frequencyDuplicate(List<T> list){
        return list.stream()
                .filter(i -> Collections.frequency(list, i) > 1)
                .collect(Collectors.toSet());
    }

    public static void main(String[] args) {
//        First approach
        Stream<Integer> stream = Stream.of(1,1,3,2,1,5,3);
        System.out.println(duplicate(stream));
//        Second approach
        List<Integer> list = Arrays.asList(1,3,4,5,6,3,8);
        System.out.println(frequencyDuplicate(list));
    }
}
