import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Bai2Test {
    @Test
    void Test01(){
        int a = 2;
        int b = 2;
        int c = 2;
        String expected = "Tam giác đều";
        String result = Bai2.tamGiac(a,b,c);

        assertEquals(result,expected);
    }

    @Test
    void Test02(){
        int a = 2;
        int b = 2;
        int c = 3;
        String expected = "Tam giác cân";
        String result = Bai2.tamGiac(a,b,c);

        assertEquals(result,expected);
    }

    @Test
    void Test03(){
        int a = 4;
        int b = 5;
        int c = 6;
        String expected = "Tam giác thường";
        String result = Bai2.tamGiac(a,b,c);

        assertEquals(result,expected);
    }

    @Test
    void Test04(){
        int a = 12;
        int b = 5;
        int c = 6;
        String expected = "Không phải tam giác";
        String result = Bai2.tamGiac(a,b,c);

        assertEquals(result,expected);
    }

}
