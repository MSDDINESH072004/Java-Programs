import java.util.Scanner;

public class program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch = sc.next().charAt(0);

        boolean found = false;
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == ch)
                found = true;

        if (found) System.out.println("Found");
        else System.out.println("Not Found");
    }
}
