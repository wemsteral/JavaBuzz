import static org.junit.Assert.*;
import org.junit.Test;


public class JavaBuzzTest {
@Test
public void javaBuzzLeavesNormalNumbersAlone() {
        JavaBuzz javabuzz = new JavaBuzz();
        assertEquals("1", javabuzz.convert(1));

}
}
