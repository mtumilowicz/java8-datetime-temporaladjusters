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
        assertThat(LocalDate.parse("2019-01-12").with(TemporalAdjusters.firstDayOfNextYear()),
                is(LocalDate.parse("2020-01-01")));
    }

    @Test
    public void firstDayOfYear() {
        assertThat(LocalDate.parse("2019-01-12").with(TemporalAdjusters.firstDayOfYear()),
                is(LocalDate.parse("2019-01-01")));
    }

    @Test
    public void firstInMonth() {
        assertThat(LocalDate.parse("2019-01-01").with(TemporalAdjusters.firstInMonth(DayOfWeek.SATURDAY)),
                is(LocalDate.parse("2019-01-05")));
    }

    @Test
    public void lastDayOfMonth() {
        assertThat(LocalDate.parse("2019-01-01").with(TemporalAdjusters.lastDayOfMonth()),
                is(LocalDate.parse("2019-01-31")));
    }

    @Test
    public void lastDayOfYear() {
        assertThat(LocalDate.parse("2019-01-01").with(TemporalAdjusters.lastDayOfYear()),
                is(LocalDate.parse("2019-12-31")));
    }

    @Test
    public void lastInMonth() {
        assertThat(LocalDate.parse("2019-01-01").with(TemporalAdjusters.lastInMonth(DayOfWeek.FRIDAY)),
                is(LocalDate.parse("2019-01-25")));
    }

    @Test
    public void next() {
        assertThat(LocalDate.parse("2019-01-03").with(TemporalAdjusters.next(DayOfWeek.FRIDAY)),
                is(LocalDate.parse("2019-01-04")));
        
        assertThat(LocalDate.parse("2019-01-04").with(TemporalAdjusters.next(DayOfWeek.FRIDAY)),
                is(LocalDate.parse("2019-01-11")));
    }

    @Test
    public void nextOrSame() {
        assertThat(LocalDate.parse("2019-01-03").with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY)),
                is(LocalDate.parse("2019-01-04")));
        
        assertThat(LocalDate.parse("2019-01-04").with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY)),
                is(LocalDate.parse("2019-01-04")));
    }

    @Test
    public void ofDateAdjuster() {

    }

    @Test
    public void previous() {
        assertThat(LocalDate.parse("2019-01-04").with(TemporalAdjusters.previous(DayOfWeek.FRIDAY)),
                is(LocalDate.parse("2018-12-28")));

        assertThat(LocalDate.parse("2019-01-11").with(TemporalAdjusters.previous(DayOfWeek.FRIDAY)),
                is(LocalDate.parse("2019-01-04")));
    }

    @Test
    public void previousOrSame() {
        assertThat(LocalDate.parse("2019-01-05").with(TemporalAdjusters.previousOrSame(DayOfWeek.FRIDAY)),
                is(LocalDate.parse("2019-01-04")));

        assertThat(LocalDate.parse("2019-01-04").with(TemporalAdjusters.previousOrSame(DayOfWeek.FRIDAY)),
                is(LocalDate.parse("2019-01-04")));
    }
}


