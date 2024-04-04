package Thuchanh.Thuchanh1;

public class EmailExampleTest {
    private static Thuchanh1 Thuchanh1;
    public static final String[] valiEmail = new String[]{"a@gmail.com","ab@yahoo.com", "abc@hotmail.com" };
    public static final String[] invalidEmail = new String[] { "@gmail.com", "ab@gmail.", "@#abc@gmail.com" };

    public static void main(String[] args) {
        Thuchanh1 = new Thuchanh1();
        for(String email : valiEmail){
            boolean isValid = Thuchanh1.validate(email);
            System.out.println("Email is  "+email + "is valid  "+isValid);

        }
        for (String email:invalidEmail){
            boolean isValid  = Thuchanh1.validate(email);
            System.out.println("Email is  "+email + "is valid   "+isValid);
        }

    }
}
