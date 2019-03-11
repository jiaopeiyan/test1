public class selectSort {
    public static int[] selectionSort(int[] array) {
        if (array.length == 0)
            return array;
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex])
                    minIndex = j;
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }
    public static void main(String[] args) {
        int [] a={1,5,3,9,7,2,8};
        selectionSort(a);

        for(int i=0;i<a.length;i++)
            System.out.print(a[i]);
    }
}
