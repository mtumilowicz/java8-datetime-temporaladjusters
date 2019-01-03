# java8-datetime-temporaladjusters

_Reference_: https://docs.oracle.com/javase/8/docs/api/java/time/temporal/TemporalAdjusters.html

# project description
* `TemporalAdjuster dayOfWeekInMonth(int ordinal, DayOfWeek dayOfWeek)` - 
Returns the day-of-week in month adjuster, which returns a new date in the same month with the ordinal day-of-week.
    ```
    var firstMondayInMonth = TemporalAdjusters.dayOfWeekInMonth(1, DayOfWeek.MONDAY);
    var secondTuesdayInMonth = TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.TUESDAY);
    
    assertThat(LocalDate.parse("2019-01-12").with(firstMondayInMonth), 
            is(LocalDate.parse("2019-01-07")));
    assertThat(LocalDate.parse("2019-01-12").with(secondTuesdayInMonth), 
            is(LocalDate.parse("2019-01-08")));
    ```
* `TemporalAdjuster firstDayOfMonth()` - 
Returns the "first day of month" adjuster, which returns a new date set to the first day of the current month.
    ```
    assertThat(LocalDate.parse("2019-01-12").with(TemporalAdjusters.firstDayOfMonth()), 
            is(LocalDate.parse("2019-01-01")));
    
    assertThat(LocalDate.parse("2019-02-22").with(TemporalAdjusters.firstDayOfMonth()),
            is(LocalDate.parse("2019-02-01")));
    ```
* `TemporalAdjuster firstDayOfNextMonth()` - 
Returns the "first day of next month" adjuster, which returns a new date set to the first day of the next month.
    ```
    assertThat(LocalDate.parse("2019-01-12").with(TemporalAdjusters.firstDayOfNextMonth()),
            is(LocalDate.parse("2019-02-01")));
    
    assertThat(LocalDate.parse("2019-02-22").with(TemporalAdjusters.firstDayOfNextMonth()),
            is(LocalDate.parse("2019-03-01")));
    ```
* `TemporalAdjuster firstDayOfNextYear()` - 
Returns the "first day of next year" adjuster, which returns a new date set to the first day of the next year.
    ```
    assertThat(LocalDate.parse("2019-01-12").with(TemporalAdjusters.firstDayOfNextYear()),
            is(LocalDate.parse("2020-01-01")));
    ```
* `TemporalAdjuster firstDayOfYear()` - 
Returns the "first day of year" adjuster, which returns a new date set to the first day of the current year.
    ```
    assertThat(LocalDate.parse("2019-01-12").with(TemporalAdjusters.firstDayOfYear()),
            is(LocalDate.parse("2019-01-01")));
    ```
* `TemporalAdjuster firstInMonth(DayOfWeek dayOfWeek)` - 
Returns the first in month adjuster, which returns a new date in the same month with the first matching day-of-week.
    ```
    assertThat(LocalDate.parse("2019-01-01").with(TemporalAdjusters.firstInMonth(DayOfWeek.SATURDAY)),
            is(LocalDate.parse("2019-01-05")));
    ```
* `TemporalAdjuster lastDayOfMonth()` - 
Returns the "last day of month" adjuster, which returns a new date set to the last day of the current month.
    ```
    assertThat(LocalDate.parse("2019-01-01").with(TemporalAdjusters.lastDayOfMonth()),
            is(LocalDate.parse("2019-01-31")));
    ```
* `TemporalAdjuster lastDayOfYear()` - 
Returns the "last day of year" adjuster, which returns a new date set to the last day of the current year.
    ```
    assertThat(LocalDate.parse("2019-01-01").with(TemporalAdjusters.lastDayOfYear()),
            is(LocalDate.parse("2019-12-31")));
    ```
* `TemporalAdjuster lastInMonth(DayOfWeek dayOfWeek)` - 
Returns the last in month adjuster, which returns a new date in the same month with the last matching day-of-week.
    ```
    assertThat(LocalDate.parse("2019-01-01").with(TemporalAdjusters.lastInMonth(DayOfWeek.FRIDAY)),
            is(LocalDate.parse("2019-01-25")));
    ```
* `TemporalAdjuster next(DayOfWeek dayOfWeek)` - 
Returns the next day-of-week adjuster, which adjusts the date to the first occurrence of the specified day-of-week 
after the date being adjusted.
    ```
    assertThat(LocalDate.parse("2019-01-03").with(TemporalAdjusters.next(DayOfWeek.FRIDAY)),
            is(LocalDate.parse("2019-01-04")));
    
    assertThat(LocalDate.parse("2019-01-04").with(TemporalAdjusters.next(DayOfWeek.FRIDAY)),
            is(LocalDate.parse("2019-01-11")));
    ```
* `TemporalAdjuster nextOrSame(DayOfWeek dayOfWeek)` - 
Returns the next-or-same day-of-week adjuster, which adjusts the date to the first occurrence of the specified 
day-of-week after the date being adjusted unless it is already on that day in which case the same object is returned.
    ```
    assertThat(LocalDate.parse("2019-01-03").with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY)),
            is(LocalDate.parse("2019-01-04")));
    
    assertThat(LocalDate.parse("2019-01-04").with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY)),
            is(LocalDate.parse("2019-01-04")));
    ```
* `TemporalAdjuster ofDateAdjuster(UnaryOperator<LocalDate> dateBasedAdjuster)` - 
Obtains a TemporalAdjuster that wraps a date adjuster.
    ```
    assertThat(LocalDate.parse("2019-01-01").with(TemporalAdjusters.ofDateAdjuster(date -> date.plusWeeks(4))),
            is(LocalDate.parse("2019-01-29")));
    ```
* `TemporalAdjuster previous(DayOfWeek dayOfWeek)` - 
Returns the previous day-of-week adjuster, which adjusts the date to the first occurrence of the specified 
day-of-week before the date being adjusted.
    ```
    assertThat(LocalDate.parse("2019-01-04").with(TemporalAdjusters.previous(DayOfWeek.FRIDAY)),
            is(LocalDate.parse("2018-12-28")));
    
    assertThat(LocalDate.parse("2019-01-11").with(TemporalAdjusters.previous(DayOfWeek.FRIDAY)),
            is(LocalDate.parse("2019-01-04")));
    ```
* `TemporalAdjuster previousOrSame(DayOfWeek dayOfWeek)` - 
Returns the previous-or-same day-of-week adjuster, which adjusts the date to the first occurrence of the 
specified day-of-week before the date being adjusted unless it is already on that day in which case the same 
object is returned.
    ```
    assertThat(LocalDate.parse("2019-01-05").with(TemporalAdjusters.previousOrSame(DayOfWeek.FRIDAY)),
            is(LocalDate.parse("2019-01-04")));
    
    assertThat(LocalDate.parse("2019-01-04").with(TemporalAdjusters.previousOrSame(DayOfWeek.FRIDAY)),
            is(LocalDate.parse("2019-01-04")));
    ```
    
# project description
