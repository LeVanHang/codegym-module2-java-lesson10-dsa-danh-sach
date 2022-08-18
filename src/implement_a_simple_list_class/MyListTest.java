package implement_a_simple_list_class;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1, 10);
        listInteger.add(2, 10);
        listInteger.add(3, 10);
        listInteger.add(3, 10);
        listInteger.add(4, 10);


        System.out.println("elemant 4: " + listInteger.get(4));
        System.out.println("elemant 4: " + listInteger.get(1));
        System.out.println("elemant 4: " + listInteger.get(2));
        listInteger.get(6);

        System.out.println("element 6: " + listInteger.get(6));
    }
}
