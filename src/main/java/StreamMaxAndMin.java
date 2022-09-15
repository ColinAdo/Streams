import java.util.ArrayList;
//A program to find the max and min price in a given list
public class StreamMaxAndMin {
    int id;
    float price;
    String name;
    StreamMaxAndMin(int id, float price, String name){
        this.id = id;
        this.price = price;
        this.name = name;
    }
    public static void main(String[] args) {
        ArrayList<StreamMaxAndMin> products = new ArrayList<>();
        products.add(new StreamMaxAndMin(1, 1000, "unga"));
        products.add(new StreamMaxAndMin(2, 5000, "oil"));
        products.add(new StreamMaxAndMin(3, 400, "Chai"));
        //Max
        StreamMaxAndMin maximum = products.stream()
                .max((p1,p2)->p1.price > p2.price ? 1:-1)
                .get();
        System.out.println(maximum.name+" : "+maximum.price);
        //Min
        StreamMaxAndMin minimum = products.stream()
                .min((p1,p2)->p1.price > p2.price ? 1:-1)
                .get();
        System.out.println(minimum.name+" : "+minimum.price);
    }
}
