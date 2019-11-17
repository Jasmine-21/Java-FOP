
import java.util.*;

class Source {
    public static Deque<Integer> deque = new LinkedList<Integer>();

    public static void add_atend(int data) {
        deque.addLast(data);
    }

    public static void add_athead(int data) {
        deque.addFirst(data);
    }

    public static void delete_atend() {
        if(deque.isEmpty()){
            System.out.println("Not possible");
        }else{
            deque.removeLast();
        }

    }

    public static void delete_athead() {
        if(deque.isEmpty()){
            System.out.println("Not possible");
        }else{
            deque.removeFirst();
        }

    }

    public static int return_head() {
        return deque.getFirst();
    }

    public static int return_tail() {
        return deque.getLast();
    }

    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int value;
        for (int j = 0; j < n; j++) {
            value = in.nextInt();
            switch (value) {
                case 1:
                    add_atend(in.nextInt());
                    break;
                case 2:
                    add_athead(in.nextInt());
                    break;
                case 3:
                    delete_atend();
                    break;
                case 4:
                    delete_athead();
                    break;
                case 5:
                    System.out.println(return_head());
                    break;
                case 6:
                    System.out.println(return_tail());
                    break;
            }
        }
        System.out.println(deque);
    }
}
