import org.junit.Test
import static org.junit.Assert.assertEquals

class ArithmeticTest {
    @Test
    void additionIsWorking() {
			assertEquals 4, 2+2
    }

    @Test(expected=ArithmeticException)
    void divideByZero() {
			1/0
    }

}