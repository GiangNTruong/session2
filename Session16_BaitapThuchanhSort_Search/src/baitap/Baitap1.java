package baitap;

public class Baitap1 {
    public static void main(String[] args) {
      //B1 Tạo 1 mảng só nguyên gọi hàm
        int[] arr =getArr();

        //in ra mảng
        System.out.println("Mảng so nguyen: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+ " ");
        }
        System.out.println();

        //cai dat thuat toan tuyen tinh de tim max
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >max){
                max=arr[i];
            }
        }
        System.out.println("Số max là : "+max);
    }

    private static int[] getArr() {
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }
}
