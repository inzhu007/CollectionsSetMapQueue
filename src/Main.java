import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(1);
        queue.add(18);
        queue.add(3);
        queue.add(7);
        queue.add(21);
        queue.add(6);
        queue.add(8);
        queue.add(8);
        queue.add(9);
        queue.add(10);

        int index=0;
        while (!queue.isEmpty()) {
            int x = queue.poll();
            if(index==2){
                System.out.println(x);
            }
            index++;
        }

    }
}

