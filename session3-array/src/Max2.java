public class Max2 {
    public static void main(String[] args) {
        int[] arr = {-4,-4,-4, -4, -4, -4, -4};
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max2 = max;
                max = arr[i];
            } else if (arr[i] > max2 && arr[i] != max) {
                max2 = arr[i];
            }
        }
        if (max2 == Integer.MIN_VALUE) {
            System.out.println("Không có phần tử lớn thứ hai trong mảng.");
        } else {
            System.out.println("Phần tử lớn thứ hai trong mảng là: " + max2);
        }

    }

}