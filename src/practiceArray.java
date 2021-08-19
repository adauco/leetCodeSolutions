public class practiceArray {
/*
Rotate an array 1 to the left
{1,3,4,2,4} to {3,4,2,4,1}
 */
        static public int[] rotation(int[] ints, int n) {
            int temp = 0, j = 0;
            for(int i=0;i<n;i++) {
                temp = ints[0];
                for(j=0; j<ints.length-1; j++) {
                    ints[j] = ints[j+1];
                }
                ints[ints.length-1] =temp;
            }
            return ints;
        }

        void leftRotate(int arr[], int d, int n) {
            for (int i = 0; i < d; i++)
                leftRotatebyOne(arr, n);
        }

        void leftRotatebyOne(int arr[], int n) {
            int i, temp;
            temp = arr[0];
            for (i = 0; i < n - 1; i++)
                arr[i] = arr[i + 1];
            arr[i] = temp;
        }

        void printArray(int arr[]) {
            for (int i = 0; i < arr.length; i++)
                System.out.print(arr[i] + " ");
        }
        static int findElement(int[] arr, int value) {
            for(int i = 0; i < arr.length; i++)
                if(value == arr[i])
                    return i;
            return -1;
            //O(n) solution, depends on the length of the array
        }

    static int[] deleteElement(int[] arr, int value) {
        //int delpos = findElement(arr,value);
        boolean found = false;
        for(int i=0; i < arr.length-1; i++){
            if(arr[i]==value || found) {
                arr[i] = arr[i + 1];
                found = true;
            }
        }
        return arr;
        //O(n) solution, depends on the length of the array
    }

        static int insertSorted(int arr[], int value, int max) {
            if(max >= arr.length)
                return max;
            arr[max] = value;
            return max +1;
            //O(1), doesnt matter size of array, it only makes one iteration.
            //
        }

        static int minDistance(int arr[], int value1, int value2) {
            int distance = 0, pos1=-arr.length, pos2=-arr.length;
            for(int i = 0; i < arr.length; i++) {
                if(arr[i]==value1)
                    pos1=i;
                else if(arr[i]==value2)
                    pos2=i;
                if(pos1-pos2 < distance)
                    distance = Math.abs(pos1-pos2);
            }
            return distance;
            //O(n) complexity
            //0(4) space?
        }

    public static void main(String args[]) {

            practiceArray rotate = new practiceArray();
        int[] arr = new int[10];
        arr[0] = 10;
        arr[1] = 16;
        arr[2] = 20;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 70;
        arr[6] = 340;
        int capacity = 20;
        int n = 6;
        int i, key = 26;
        System.out.println("Imprime " + minDistance(arr, 10, 20));
        //deleteElement(arr,100);
        //rotate.leftRotate(arr, 2, 7);
            //rotate.printArray(arr, 7);
            //rotation(arr,2);
            //rotate.printArray(arr,arr.length);
        //n = insertSorted(arr, key, n);

        //for (i = 0; i < n; i++)
        //System.out.print(arr[i]+" ");

        //System.out.println("Found at " + findElement(arr,8));
        //System.out.println("Found at " + findElement(arr,7));
        //System.out.println("Found at " + findElement(arr,5));
        rotate.printArray(arr);
    }
}
