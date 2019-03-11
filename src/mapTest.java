import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;

public class mapTest {
    //HashMap 是最常用的Map，它它根据键的HashCode 值存储数据,根据键可以直接获取它的值，具有很快的访问速度。
    // HashMap最多只允许一条记录的键为Null(多条会覆盖);允许多条记录的值为 Null。非同步的。
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("jpy", "true");
        map.put("gmn", "terw");
//        System.out.println(map);
//        map.get("jpy");
//        System.out.println(map.get("gmn"));
//        map.remove("gmn");
//        System.out.println(map);
//        map.clear();
//        System.out.println(map);
//      Iterator<Map.Entry<String,String>> iterator=map.entrySet().iterator();
//        while(iterator.hasNext()){
//            Map.Entry<String,String> entry=iterator.next();
//            System.out.println(entry.getKey()+":"+entry.getValue());
//        }
        //keySet() 返回Map中所包含键的 Set 视图。删除 Set 中的元素还将删除 Map 中相应的映射（键和值）
        //entrySet() 返回 Map 中所包含映射的 Set 视图。Set 中的每个元素都是一个 Map.Entry 对象，
        // 可以使用 getKey() 和 getValue() 方法（还有一个 setValue() 方法）访问后者的键元素和值元素
        Iterator<String> iterator=map.keySet().iterator();
        while(iterator.hasNext()){
            String key=iterator.next();
            System.out.println(key+":"+map.get(key));
        }
    }
}
