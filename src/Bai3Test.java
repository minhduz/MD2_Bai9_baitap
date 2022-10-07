import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Bai3Test {
    @Test
    void Test01(){
        int n = 15;
        String expected = "FizzBuzz";
        String result = Bai3.FizzBuzz(n);
        assertEquals(result,expected);
    }

    @Test
    void Test02(){
        int n = 9;
        String expected = "Fizz";
        String result = Bai3.FizzBuzz(n);
        assertEquals(result,expected);
    }

    @Test
    void Test03(){
        int n = 20;
        String expected = "Buzz";
        String result = Bai3.FizzBuzz(n);
        assertEquals(result,expected);
    }
}
