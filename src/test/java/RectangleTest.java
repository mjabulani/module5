import org.example.figures.Rectangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTest {


    @Test
    public void calculateAreaWhenNegativeA() {
        Rectangle rect = new Rectangle(-5, 3);
        Assertions.assertEquals(-15, rect.calculateArea());
    }
}
