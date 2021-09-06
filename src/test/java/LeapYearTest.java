import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeapYearTest {

    @ParameterizedTest
    @CsvSource({
            "1999,false",
            "1996,true",
            "1900,false",
            "2000, true",
            "2400, true"
    })
    void LeapYearShouldReturnTrueIfLeapYear(int input, boolean output) {
        LeapYear leapYear = new LeapYear();
        assertEquals(output, leapYear.isLeapYear(input));
    }
}
