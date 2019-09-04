import java.util.Scanner;

public class BookStoreCredit {
    public static void main(String[] args) {
        System.out.println("Please enter your name");
        Scanner input = new Scanner(System.in);
        String userName = input.nextLine();
        System.out.println("Please enter your GPA");
        Double userGpa = input.nextDouble();
        calculate(userName, userGpa);
    }
    public static void calculate(String name, Double gpa){
        Double credit = gpa * 10;
        System.out.println("Hi " + name + " your bookstore credit is $" + credit);
    }
}
