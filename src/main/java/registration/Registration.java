package registration;

import authorization.Authorization;
import authorization.User;

import java.util.Scanner;

public class Registration {
    Authorization authorization = new Authorization();

    public void enter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - регистрация\n2 - авторизация");
        String numOfChoose = scanner.nextLine();

        if (numOfChoose.equals("1")){
            Scanner reg = new Scanner(System.in);
            System.out.println("Введите логин");
            String newUserLog = reg.nextLine();

            System.out.println("Введите пароль");
            String newUserPass = reg.nextLine();

            
        } else if (numOfChoose.equals("2")) {
            Scanner auto = new Scanner(System.in);
            System.out.println("Введите логин");
            String userLog = auto.nextLine();

            System.out.println("Введите пароль");
            String userPass = auto.nextLine();

            authorization.readDatabaseFile();

            if (userLog.equals(authorization.data.get(0).getUsername()) && userPass.equals(authorization.data.get(0).getPassword())){
                System.out.println("Добро пожаловать!");
            } else if (!userLog.equals(authorization.data.get(0).getUsername()) || !userPass.equals(authorization.data.get(0).getPassword())) {
                System.out.println("Повторите попытку");
            }

        }
    }

}
