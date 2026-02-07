import java.util.Scanner;

public class program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c) && "aeiouAEIOU".indexOf(c) == -1)
                System.out.print("#");
            else
                System.out.print(c);
        }
    }
}
