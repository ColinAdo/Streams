import java.util.*;
import java.util.stream.*;
public class StreamFilter {
    int id;
    float price;
    String goods;
    StreamFilter(int id, float price, String goods){
        this.id = id;
        this.price = price;
        this.goods = goods;
    }

    public static void main(String[] args) {
        ArrayList<StreamFilter> products = new ArrayList<>();
        products.add(new StreamFilter(101, 5000, "Hp Laptop"));
        products.add(new StreamFilter(102, 10000, "Love Charger"));
        products.add(new StreamFilter(103, 15000, "Laptop Bag"));

        List<Float> filters = products.stream()
                .filter(p -> p.price > 5000)
                .map(p -> p.price)
                .collect(Collectors.toList());
        System.out.println(filters);

        //How to map items using toMap()
        Map<Integer,String> filter = products.stream()
                .collect(Collectors.toMap(p->p.id,p->p.goods));
        System.out.println(filter);
    }
}
