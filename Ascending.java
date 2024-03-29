
package Array;

public class Ascending {
    public static void main(String[] args) {
        int arr[] = {1, 25, 34, 23, 43, 21, 12, 23, 12, 23, 43, 23, 32, 12, 2, 3, 4};
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
