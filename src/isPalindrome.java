public class isPalindrome {
    private static boolean isPal(int x){
//        int a = x, h = 1;
//        if (a < 0) return false;
//        while (a / h >= 10) {
//            h = h * 10;
//        }
//        while (a > 0) {
//            if (a / h != a % 10) return false;
//            a = a % h;
//            a = a / 10;
//            h = h / 100;
//        }
//        return true;
        int oldX=x;
        int temp=0;
        while (x>0){
            temp=temp*10+x%10;
            x /=10;
        }
        return temp==oldX;
    }
    public static void main(String[] args) {
        for(int i=1;i<1000;i++){
            if(isPal(i))
                System.out.print(i+" ");
        }

    }
}
