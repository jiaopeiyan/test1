public class printAll {
    public static int count = 0;
    private static String[] mustExistNumber=new String[]{"1","2","2","3","4","5"};
    public static void main(String[] args) {
        String s = "122345";
        for(int i=122345;i<=543221;i++){
            if(validateNum(i+"")){
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean validateNum(String num){
        for(String number:mustExistNumber){
            if(num.indexOf(number)<0){
                return false;
            }
            if(num.indexOf("2")==num.lastIndexOf("2")){
                return false;
            }
        }
        return true;
    }
}
