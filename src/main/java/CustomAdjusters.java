import java.time.DayOfWeek;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

import static java.time.temporal.ChronoField.DAY_OF_WEEK;
import static java.time.temporal.ChronoUnit.DAYS;

/**
 * Created by mtumilowicz on 2019-01-03.
 */
class CustomAdjusters {
    static TemporalAdjuster firstWorkingDayOfMonth() {
        return temporal -> nextWorkingDay().adjustInto(temporal.with(TemporalAdjusters.firstDayOfMonth()));
    }

    static TemporalAdjuster nextWorkingDay() {
        return temporal -> {
            var workingDay = temporal;
            switch (DayOfWeek.of(temporal.get(DAY_OF_WEEK))) {
                case SUNDAY: {
                    workingDay = temporal.plus(1, DAYS);
                    break;
                }
                case SATURDAY: {
                    workingDay = temporal.plus(2, DAYS);
                    break;
                }
            }
            return workingDay;
        };
    }
}
