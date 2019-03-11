public class bubbleSort {
    public static int[] bubblesort(int[] array) {
        if (array.length == 0)
            return array;
        for (int i = 0; i < array.length; i++)
            for (int j = 1; j < array.length - i; j++)
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
        return array;
    }

    public static void main(String[] args) {
        int [] a={1,9,7,4,8,2,3};
        bubblesort(a);
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]);
    }
}
