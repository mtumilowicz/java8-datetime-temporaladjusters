import org.junit.Test;

import java.time.LocalDate;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by mtumilowicz on 2019-01-03.
 */
public class CustomAdjustersTest {

    @Test
    public void firstWorkingDayOfMonth_starts_not_weekend() {
        assertThat(LocalDate.parse("2019-01-15").with(CustomAdjusters.firstWorkingDayOfMonth()), 
                is(LocalDate.parse("2019-01-01")));
    }

    @Test
    public void firstWorkingDayOfMonth_starts_saturday() {
        assertThat(LocalDate.parse("2019-06-15").with(CustomAdjusters.firstWorkingDayOfMonth()),
                is(LocalDate.parse("2019-06-03")));
    }

    @Test
    public void firstWorkingDayOfMonth_starts_sunday() {
        assertThat(LocalDate.parse("2019-09-15").with(CustomAdjusters.firstWorkingDayOfMonth()),
                is(LocalDate.parse("2019-09-02")));
    }

    @Test
    public void firstWorkingDayOfMonth_weekend() {
        assertThat(LocalDate.parse("2019-01-03").with(CustomAdjusters.nextWorkingDay()),
                is(LocalDate.parse("2019-01-03")));
    }

    @Test
    public void firstWorkingDayOfMonth_saturday() {
        assertThat(LocalDate.parse("2019-01-05").with(CustomAdjusters.nextWorkingDay()),
                is(LocalDate.parse("2019-01-07")));
    }

    @Test
    public void firstWorkingDayOfMonth_sunday() {
        assertThat(LocalDate.parse("2019-01-06").with(CustomAdjusters.nextWorkingDay()),
                is(LocalDate.parse("2019-01-07")));
    }
}