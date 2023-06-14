package OOPhw03LinkedList;

public class Main03 {
    public static void main(String[] args) {
        OurLinkedList<Integer> list = new OurLinkedList<>();
        list.add(20);
        list.add(30);
        for (int i:list) {
            System.out.println(i);
        }
    }

}

