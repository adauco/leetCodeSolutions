package data_structure;

public class Sorts {

    public void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int l[] = new int[mid];
        int r[] = new int[n-mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }

        mergeSort(l, mid);
        mergeSort(r, n-mid);

        merge(a, l, r, mid, n-mid);
        }

    public void merge(int[] a, int[] l, int[] r, int le, int ri ) {
            int i = 0, j = 0, k = 0;
            while (i < le && j < ri) {
                if (l[i] <= r[j]) {
                    a[k++] = l[i++];
                }
                else {
                    a[k++] = r[j++];
                }
            }
            while (i < le) {
                a[k++] = l[i++];
            }
            while (j < ri) {
                a[k++] = r[j++];
            }
    }

    public static void main(String args[]) {
        int[] actual = { 5, 1, 6, 2, 3, 4 };
        int[] expected = { 1, 2, 3, 4, 5, 6 };
        Sorts m = new Sorts();
        m.mergeSort(actual, actual.length);
        System.out.println(" " + actual);
        //assertArrayEquals(expected, actual);
    }
}
