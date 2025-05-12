import java.util.HashSet;

public class Main2  {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(5);
        set.add(3);
        set.add(3);
        set.add(4);
        set.add(1);
         for (int x : set){
             System.out.print(x + " ");
         }
         System.out.println(" number of unique numbers:" + set.size());
    }
}
