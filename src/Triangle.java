/**
 * Created by Zafar Mahmudov on 15.09.2014.
 */
import java.util.*;

public class Triangle {
    public static String tr(int x1, int y1, int x2, int y2, int x3, int y3) {
        String type = "a";
        double a_length = (double) (Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)));
        double b_length = (double) (Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3)));
        double c_length = (double) (Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3)));

        if (a_length + b_length > c_length && a_length + c_length > b_length && b_length + c_length > a_length) {
            if (a_length * a_length + b_length * b_length == c_length * c_length ||
                    a_length * a_length + c_length * c_length == b_length * b_length ||
                    b_length * b_length + c_length * c_length == a_length * a_length) {

                type = "restangle";
            }
        }
        return type;
    }
}

/*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        System.out.println(tr(x1, y1, x2, y2, x3, y3));
    }
}*/
