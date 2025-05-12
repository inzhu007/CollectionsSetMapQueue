import java.util.HashMap;

public class Main3 {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Inzhu" , 17);
        map.put("Alice" , 18);
        map.put("Bob" , 19);
        map.put("Zhuldyz" ,18);
        map.put("Jack", 21);
        map.put("Tom" , 22);
        for (HashMap.Entry<String, Integer> x: map.entrySet()) {
            System.out.print(x.getKey() + " ");
        }
    }
}
