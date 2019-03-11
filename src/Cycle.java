import java.util.LinkedList;
import java.util.List;

public class Cycle {
    public static int cycle(int total, int k){
        List<Integer> dataList=new LinkedList<Integer>();
        for (int i=0;i<total;i++)
            dataList.add(new Integer(i+1));
            int index=-1;
            while (dataList.size()>1){
                index=(index+k)%dataList.size();
                dataList.remove(index--);
            }
            return ((Integer)dataList.get(0)).intValue();
        }
    public static void main(String[] args) {
        System.out.println(cycle(50,3));
    }
}
