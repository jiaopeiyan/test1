import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class listTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("jpy");
        list.add("gmn");
        list.add("lxy");
        System.out.println(list);
        System.out.println(list.get(0));
        for(String l:list){
            System.out.println(l);
        }
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        Iterator iterator=list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
