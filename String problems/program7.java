import java.util.Scanner;

public class program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String copy = "";
        for (int i = 0; i < s.length(); i++)
            copy += s.charAt(i);

        System.out.println(copy);
    }
}
