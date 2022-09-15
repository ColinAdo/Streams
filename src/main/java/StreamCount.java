import java.util.*;
public class StreamCount {
    int id;
    float price;
    String item;
    StreamCount(int id, float price, String item){
        this.id = id;
        this.price = price;
        this.item = item;
    }

    public static void main(String[] args) {
        ArrayList<StreamCount> goods = new ArrayList<>();
        goods.add(new StreamCount(10, 1200, "Earphone"));
        goods.add(new StreamCount(102, 50000, "iPhone"));
        goods.add(new StreamCount(105, 1500, "Charger"));

        long count = goods.stream()
                .filter(p->p.price < 5000)
                .count();
        System.out.println(count);
    }
}
