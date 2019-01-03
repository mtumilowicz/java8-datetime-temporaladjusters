# java8-datetime-temporaladjusters

_Reference_: https://docs.oracle.com/javase/8/docs/api/java/time/temporal/TemporalAdjusters.html

# static methods
* `TemporalAdjuster dayOfWeekInMonth(int ordinal, DayOfWeek dayOfWeek)` - 
Returns the day-of-week in month adjuster, which returns a new date in the same month with the ordinal day-of-week.
* `TemporalAdjuster firstDayOfMonth()` - 
Returns the "first day of month" adjuster, which returns a new date set to the first day of the current month.
* `TemporalAdjuster firstDayOfNextMonth()` - 
Returns the "first day of next month" adjuster, which returns a new date set to the first day of the next month.
* `TemporalAdjuster firstDayOfNextYear()` - 
Returns the "first day of next year" adjuster, which returns a new date set to the first day of the next year.
* `TemporalAdjuster firstDayOfYear()` - 
Returns the "first day of year" adjuster, which returns a new date set to the first day of the current year.
* `TemporalAdjuster firstInMonth(DayOfWeek dayOfWeek)` - 
Returns the first in month adjuster, which returns a new date in the same month with the first matching day-of-week.
* `TemporalAdjuster lastDayOfMonth()` - 
Returns the "last day of month" adjuster, which returns a new date set to the last day of the current month.
* `TemporalAdjuster lastDayOfYear()` - 
Returns the "last day of year" adjuster, which returns a new date set to the last day of the current year.
* `TemporalAdjuster lastInMonth(DayOfWeek dayOfWeek)` - 
Returns the last in month adjuster, which returns a new date in the same month with the last matching day-of-week.
* `TemporalAdjuster next(DayOfWeek dayOfWeek)` - 
Returns the next day-of-week adjuster, which adjusts the date to the first occurrence of the specified day-of-week after the date being adjusted.
* `TemporalAdjuster nextOrSame(DayOfWeek dayOfWeek)` - 
Returns the next-or-same day-of-week adjuster, which adjusts the date to the first occurrence of the specified day-of-week after the date being adjusted unless it is already on that day in which case the same object is returned.
* `TemporalAdjuster ofDateAdjuster(UnaryOperator<LocalDate> dateBasedAdjuster)` - 
Obtains a TemporalAdjuster that wraps a date adjuster.
* `TemporalAdjuster previous(DayOfWeek dayOfWeek)` - 
Returns the previous day-of-week adjuster, which adjusts the date to the first occurrence of the specified day-of-week before the date being adjusted.
* `TemporalAdjuster previousOrSame(DayOfWeek dayOfWeek)` - 
Returns the previous-or-same day-of-week adjuster, which adjusts the date to the first occurrence of the specified day-of-week before the date being adjusted unless it is already on that day in which case the same object is returned.

# project description
