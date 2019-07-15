import static org.junit.Assert.*;
import org.junit.Test;


public class JavaBuzzTest {
@Test
public void javaBuzzLeavesNormalNumbersAlone() {
        JavaBuzz javabuzz = new JavaBuzz();
        assertEquals("1", javabuzz.convert(1));
        assertEquals("7", javabuzz.convert(7));
        assertEquals("13", javabuzz.convert(13));
        assertEquals("43", javabuzz.convert(43));
        assertEquals("91", javabuzz.convert(91));
        assertEquals("97", javabuzz.convert(97));
}
@Test
public void returnsJavaWhenGivenMultiplesOfThree() {
        JavaBuzz javabuzz = new JavaBuzz();
        assertEquals("Java", javabuzz.convert(3));
        assertEquals("Java", javabuzz.convert(18));
        assertEquals("Java", javabuzz.convert(66));
        assertEquals("Java", javabuzz.convert(90));
}
@Test
public void returnsJavaWhenGivenMultiplesOfFive() {
        JavaBuzz javabuzz = new JavaBuzz();
        assertEquals("Buzz", javabuzz.convert(5));
        assertEquals("Buzz", javabuzz.convert(25));
        assertEquals("Buzz", javabuzz.convert(45));
        assertEquals("Buzz", javabuzz.convert(95));
}
}
