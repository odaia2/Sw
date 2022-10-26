import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class year_Test {

    @Test
    public void when_divided_by_4_not_100() {assertEquals( true, year.isLoopYear(1916));}
    @Test
    public void not_divides_by_4() {assertEquals(false, year.isLoopYear(1800));
    }

    @Test
    public void when_divided_by_400_() {assertEquals(true, year.isLoopYear(2000));
    }

    @Test
    public void not_divides_by_400() {assertEquals(false, year.isLoopYear(2100));
    }

}