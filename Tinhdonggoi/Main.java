package Tinhdonggoi;

public class Main {
    public static void main(String[] args) {
        Sinhvien sv = new Sinhvien();
        sv.setTen("ha");
        sv.setTuoi(40);
        System.out.println("Ten là "+ sv.getTen());
        System.out.println("Tuoi la "+ sv.getTuoi());
    }
}
