import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CountVowelsTest {
    @Test public void testCount() { assertEquals(3, CountVowels.count("Hello World")); }
}
