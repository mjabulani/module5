import org.example.figures.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {


    @Test
    void area0IfBaseLessThanZero() {
        Triangle t = new Triangle(1,-2);
        Assertions.assertEquals(0, t.calculateArea());
    }

    @Test
    void area0IfHeightLessThanZero() {
        Triangle t = new Triangle(-5,3);
        Assertions.assertEquals(0, t.calculateArea());
    }

}
