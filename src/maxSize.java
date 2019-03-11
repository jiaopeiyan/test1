import java.util.HashMap;
import java.util.Map;
    public class maxSize {
        public static void main(String[] args) throws Exception {
            String Str = "aaaaaabbcddddee";
            char[] StrArr = Str.toCharArray();

            Map<Character, Integer> map = new HashMap();
            if (!(StrArr == null || StrArr.length == 0))
                for (int i = 0; i < StrArr.length; i++)
                    if (null != map.get(StrArr[i]))
                        map.put(StrArr[i], map.get(StrArr[i]) + 1);
                    else
                        map.put(StrArr[i], 1);

            int maxValue = map.get(StrArr[0]);
            char ch = StrArr[0];
            for (int j = 0; j < StrArr.length; j++)
                if (maxValue < map.get(StrArr[j])) {
                    maxValue = map.get(StrArr[j]);
                    ch = StrArr[j];
                }
            System.out.println("现次数最多的字符：" + ch + " 出现次数：" + maxValue);
        }
}
