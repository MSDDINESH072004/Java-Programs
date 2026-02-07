import java.util.Scanner;

public class program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        int res = a.compareTo(b);

        if (res == 0) System.out.println("Equal");
        else if (res < 0) System.out.println(a + " < " + b);
        else System.out.println(a + " > " + b);
    }
}
