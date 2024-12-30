import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueProgram
{
    public static void main(String[] args) {
//        Queue<Integer> que=new LinkedList<>();
//        que.add(23);
//        que.add(443);
//        que.add(34);
//        que.add(35);
//        que.add(55);
//
//        que.forEach((n)->System.out.print(n+" "));
//     que.remove();
//
//        System.out.println();
//        que.forEach((n) -> System.out.print(n+" "));
//       que.add(366);
//        System.out.println();
//        que.forEach((n)-> System.out.print(n+" "));
//    }

        Queue<Integer> que = new PriorityQueue<>();
        que.add(23);
        que.add(443);
        que.add(34);
        que.add(35);
        que.add(55);

        que.forEach((n) -> System.out.println(n + " "));
    }

}
