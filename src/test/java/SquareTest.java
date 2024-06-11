import org.example.figures.Square;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTest {

    @Test
    void diameter0WhenaLessThan0() {
        Square s = new Square(-3);
        Assertions.assertEquals(0, s.calculateDiameter());
    }

}
