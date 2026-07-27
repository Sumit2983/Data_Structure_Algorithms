import java.util.ArrayList;
public class demo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");//insert elemtnt at last
        System.out.println(list);

        list.add(1,"E");//insert element at index 1
        System.out.println(list);
        list.set(2, null);
        System.out.println(list);
        list.remove("C");
           System.out.println(list);
           boolean tell = list.contains("E");
        System.out.println(tell);

        for(String s : list){
            System.out.println(s);
        }
    }
}
