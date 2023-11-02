public class Code1 {
    static void insertionsort(int[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            // j points that element which we have to keep at 0th index
            int j = i;
            while (j > 0 && a[j] < a[j - 1])// j>0 should be compared first coz if j>0 then only a[j]<a[j-1] is checked
            // if j<0 then a[j]<a[j-1] will not be checked only
            {
                // swap and do j--
                int temp = a[j];
                a[j] = a[j - 1];
                a[j - 1] = temp;
                j--;
            }

        }
    }

    public static void main(String[] args) {
        int[] a = { 8, 3, 6, 5, 4, 2 };
        insertionsort(a);
        for (int val : a) {
            System.out.println(val + " ");
        }
    }
}