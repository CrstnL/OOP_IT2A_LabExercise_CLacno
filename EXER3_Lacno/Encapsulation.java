import java.util.Scanner;

public class Encapsulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account user1 = new Account("Crestine Lacno", "Lacno123!");

        System.out.print("Enter username: ");
        String inputUser = sc.nextLine();

        System.out.print("Enter password: ");
        String inputPass = sc.nextLine();

        if (user1.login(inputUser, inputPass)) {
            System.out.println("Login successful! Welcome " + user1.getUsername());
        } else {
            System.out.println("Login failed! Invalid username or password.");
        }

        sc.close();
    }
}

