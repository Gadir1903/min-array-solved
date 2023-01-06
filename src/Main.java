public class Main {
    public static void main(String[] args) {
        int arr[] = {4, -2, 14, 56};
        int minArr = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                minArr = arr[i];
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >0 && minArr > arr[i]) {
                minArr = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                arr[i] -= minArr;
                System.out.print(arr[i] + ",");
            }
        }
    }
}
