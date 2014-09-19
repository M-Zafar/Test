import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleTest {

    public double get_length(int x1, int y1, int x2, int y2) {
        double a_lgth = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        return a_lgth;
    }

    @Test
    public void testTr() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 1;
        int y2 = 4;
        int x3 = 5;
        int y3 = 1;

        double a_length = get_length(x1, y1, x2, y2);
        double b_length = get_length(x2, y2, x3, y3);
        double c_length = get_length(x1, y1, x3, y3);

        String tr_type = "b";
        if (a_length + b_length > c_length && a_length + c_length > b_length && b_length + c_length > a_length) {
            if (a_length * a_length + b_length * b_length == c_length * c_length ||
                    a_length * a_length + c_length * c_length == b_length * b_length ||
                    b_length * b_length + c_length * c_length == a_length * a_length) {

                tr_type = "restangle";
            }
        }
        String type = Triangle.tr(x1, y1, x2, y2, x3, y3);
        if (tr_type.compareTo(type) != 0) {
            System.out.println("Test failed");
        }
    }
}
