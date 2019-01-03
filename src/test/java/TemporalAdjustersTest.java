import org.junit.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


/**
 * Created by mtumilowicz on 2019-01-03.
 */
public class TemporalAdjustersTest {
    
    @Test
    public void dayOfWeekInMonth() {
        var firstMondayInMonth = TemporalAdjusters.dayOfWeekInMonth(1, DayOfWeek.MONDAY);
        var secondTuesdayInMonth = TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.TUESDAY);
        
        assertThat(LocalDate.parse("2019-01-12").with(firstMondayInMonth), 
                is(LocalDate.parse("2019-01-07")));
        assertThat(LocalDate.parse("2019-01-12").with(secondTuesdayInMonth), 
                is(LocalDate.parse("2019-01-08")));
    }
    
    @Test
    public void firstDayOfMonth() {
        assertThat(LocalDate.parse("2019-01-12").with(TemporalAdjusters.firstDayOfMonth()), 
                is(LocalDate.parse("2019-01-01")));

        assertThat(LocalDate.parse("2019-02-22").with(TemporalAdjusters.firstDayOfMonth()),
                is(LocalDate.parse("2019-02-01")));
    }
    
    @Test
    public void firstDayOfNextMonth() {
        assertThat(LocalDate.parse("2019-01-12").with(TemporalAdjusters.firstDayOfNextMonth()),
                is(LocalDate.parse("2019-02-01")));

        assertThat(LocalDate.parse("2019-02-22").with(TemporalAdjusters.firstDayOfNextMonth()),
                is(LocalDate.parse("2019-03-01")));
    }
    
    @Test
    public void firstDayOfNextYear() {

    }

    @Test
    public void firstDayOfYear() {

    }

    @Test
    public void firstInMonth() {

    }

    @Test
    public void lastDayOfMonth() {

    }

    @Test
    public void lastDayOfYear() {

    }

    @Test
    public void lastInMonth() {

    }

    @Test
    public void next() {

    }

    @Test
    public void nextOrSame() {

    }

    @Test
    public void ofDateAdjuster() {

    }

    @Test
    public void previous() {

    }

    @Test
    public void previousOrSame() {

    }
}


