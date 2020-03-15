import java.util.Scanner;

public class colorTester extends color {
    public void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        color c1 = new color(i);
        int j = scan.nextInt();
        color c2 = new color(j);

        checkDirectColorMatch(c1, c2);
        checkTypeColorMatch(c1, c2);

    }
}
