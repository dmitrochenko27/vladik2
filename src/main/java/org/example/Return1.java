package org.example;

public class Return1 {
    public static void main(String[] args) {
        signIn("user");
        System.out.println("пшел вон");

    }

    public static void signIn(String username){
        if (username.equals("user")){
            return;
        }
        //напишите тут ваш код
        System.out.println("Добро пожаловать " + username);
        System.out.println("Очень скучали по Вам, " + username);
    }
}
