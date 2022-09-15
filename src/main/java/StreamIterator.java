import java.util.stream.*;
public class StreamIterator {
    public static void main(String[] args) {
        Stream.iterate(2, p->p+2)
                .limit(5)
                .forEach(System.out::println);
    }
}
