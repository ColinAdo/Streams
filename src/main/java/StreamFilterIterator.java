import java.util.ArrayList;
public class StreamFilterIterator {
    int id;
    float price;
    String name;
    StreamFilterIterator(int id, float price, String name){
        this.id = id;
        this.price = price;
        this.name = name;
    }
    public static void main(String[] args) {
        ArrayList<StreamFilterIterator> goods = new ArrayList<>();
        goods.add(new StreamFilterIterator(101, 5000, "pen"));
        goods.add(new StreamFilterIterator(106,7500, "exercise"));
        goods.add(new StreamFilterIterator(103, 4000, "bag"));

        goods.stream()
                .filter(p->p.price < 6000)
                .forEach(product-> System.out.println(product.name));
    }
}
