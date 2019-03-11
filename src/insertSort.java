public class insertSort {
    public static int[] insertionSort(int[] array) {
        if (array.length == 0)
            return array;
        for(int i=1;i< array.length;i++){
            for(int j=i;j>0;j--){
                if(array[j]<array[j-1]){
                    int temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                }
                else {
                    break;
                }
            }
        }
        return  array;
    }
    public static void main(String[] args) {
        int [] a={1,5,3,9,7,2,8};
        insertionSort(a);
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]);
    }
}
