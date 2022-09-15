import  java.util.*;
public class StreamOne {
    int id;
    int age;
    String name;
    StreamOne(int id, int age, String name){
        this.id = id;
        this.age = age;
        this.name = name;
    }
//   public String toString(){
//        return id+" :"+age+" :"+" :"+name;
//    }
    public static void main(String[] args) {
        ArrayList<StreamOne> data = new ArrayList<>();
        data.add(new StreamOne(100, 20, "Colin"));
        data.add(new StreamOne(200, 25, "Sam"));
        data.add(new StreamOne(300, 30, "Nancy"));

        List<Integer> inFor = new ArrayList<>();

        for (StreamOne object: data) {
            if (object.age > 26){
                inFor.add(object.age);
            }
            System.out.println(inFor);
        }

    }
}
