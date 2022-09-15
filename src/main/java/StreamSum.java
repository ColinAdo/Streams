import java.util.ArrayList;
//A program to calculate the sum of given products
public class StreamSum {
    int id;
    float price;
    String goods;
    StreamSum(int id, float price, String goods){
        this.id = id;
        this.price = price;
        this.goods = goods;
    }
    public static void main(String[] args) {
        ArrayList<StreamFilter> products = new ArrayList<>();
        products.add(new StreamFilter(101, 5000, "Hp Laptop"));
        products.add(new StreamFilter(102, 10000, "Love Charger"));
        products.add(new StreamFilter(103, 15000, "Laptop Bag"));

        // Method one Using reduce
        Float totalSum = products.stream()
                .map(p->p.price)
                .reduce(0.0f,(s,p)->s+p);//ordinary code
        System.out.println(totalSum);

        Float total = products.stream()
                .map(s->s.price)
                .reduce(0.0f,Float::sum);//using reference
        System.out.println(total);
        // Method two using summingDouble()
        /*double sum = products.stream()
                .collect(Collectors.summingDouble(p->p.price));*/
        double sum = 0.0;
        for (StreamFilter p : products) {
            sum += p.price;
        }
        System.out.println(sum);
    }
}
