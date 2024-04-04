package test1.Optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        String[] str = new String[10];
        Optional<String> checkNull = Optional.ofNullable(str[4]);
        if (checkNull.isPresent()){
            String lowCase = str[4].toLowerCase();
            System.out.println(lowCase);
        }else {
            System.err.println("String value is not present");
        }
        Optional<User> user1 = Optional.empty();

    }



}
