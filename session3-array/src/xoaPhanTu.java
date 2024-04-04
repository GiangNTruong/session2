import java.util.Scanner;

public class xoaPhanTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = {1,4,6,7};
        System.out.println("Nhạp phần tử cần xóa");
        int x = scanner.nextInt();
        int indexDel = -1;
        for (int i = 0; i< array.length;i++){
            if(array[i] == x){
                indexDel=i;
                break;
            }
        }

        if (indexDel!=-1) {
            for (int i = indexDel; i <array.length-1 ; i++) {
                array[i]=array[i+1];
            }
            System.out.println("Mảng sau khi xoa");
            for (int j : array) {
                System.out.print(j + ", ");
            }


        }else {
            System.out.println("Phần tử "+x+"không có trong mảng ");
        }

    }
}
