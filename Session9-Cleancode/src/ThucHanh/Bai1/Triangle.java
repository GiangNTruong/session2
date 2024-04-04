package ThucHanh.Bai1;

public class Triangle {
    private float a;
    private float b;
    private float c;

    public Triangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }
    public float tinhChuVi(){
        return a+b+c;
    }
    public float tinhDienTich(){

        float p =tinhChuVi()/2;
        float dienTich = (float) Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return dienTich;
    }
}
