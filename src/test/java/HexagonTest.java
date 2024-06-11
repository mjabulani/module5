import org.example.figures.Hexagon;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HexagonTest {

    @Test
    void area0WhenALessThanZero() {
        Hexagon h = new Hexagon(-3);
        Assertions.assertEquals(0, h.calculateArea());
    }
}
