package Thuchiencua2so;

public class Calulator {
    double a;
    double b;
    public Calulator(){

    }

    public Calulator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    //Phương thức tính tổng
    public double add(){
        return a+b;
    }
    //Phương thức trừ
    public double sub(){
        return a-b;
    }
    public double nulti(){
        return a*b;
    }
    public double div(){
        return a/b;
    }
}
