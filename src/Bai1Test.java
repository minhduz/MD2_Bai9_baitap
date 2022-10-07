import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Bai1Test {
    @Test
    @DisplayName("Test ngày bất kỳ")
    void testNextDayRandom(){
        int dayInput = 6;
        int monthInput = 10;
        int yearInput = 2022;
        int dayExpected = 7;

        int result = Bai1.getNextDay(dayInput,monthInput,yearInput);
        assertEquals(dayExpected,result);
    }

    @Test
    @DisplayName("Test ngày cuối của tháng có 30 ngày")
    void testLastDayOf_30_DaysMonth(){
        int dayInput = 30;
        int monthInput = 4;
        int yearInput = 2022;
        int dayExpected = 1;
        int monthExpected = 5;

        int resultDay = Bai1.getNextDay(dayInput,monthInput,yearInput);
        int resultMonth = Bai1.getNextMonth(dayInput,monthInput,yearInput);
        assertEquals(dayExpected,resultDay);
        assertEquals(monthExpected,resultMonth);

    }

    @Test
    @DisplayName("Test ngày cuối của tháng có 31 ngày")
    void testLastDayOf_31_DaysMonth(){
        int dayInput = 31;
        int monthInput = 5;
        int yearInput = 2022;
        int dayExpected = 1;
        int monthExpected = 6;

        int resultDay = Bai1.getNextDay(dayInput,monthInput,yearInput);
        int resultMonth = Bai1.getNextMonth(dayInput,monthInput,yearInput);
        assertEquals(dayExpected,resultDay);
    }

    @Test
    @DisplayName("Test ngày 28/2 của năm không nhuận")
    void testNextDay_28_February(){
        int dayInput = 28;
        int monthInput = 2;
        int yearInput = 2022;
        int dayExpected = 1;
        int monthExpected = 3;

        int resultDay = Bai1.getNextDay(dayInput,monthInput,yearInput);
        int resultMonth = Bai1.getNextMonth(dayInput,monthInput,yearInput);
        assertEquals(dayExpected,resultDay);
    }


    @Test
    @DisplayName("Test ngày 29/2 của năm nhuận")
    void testNextDay_29_February(){
        int dayInput = 29;
        int monthInput = 2;
        int yearInput = 2020;
        int dayExpected = 1;
        int monthExpected = 3;

        int resultDay = Bai1.getNextDay(dayInput,monthInput,yearInput);
        int resultMonth = Bai1.getNextMonth(dayInput,monthInput,yearInput);
        assertEquals(dayExpected,resultDay);

    }
}
