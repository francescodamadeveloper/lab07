package it.unibo.nestedenum;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;

/**
 * Implementation of {@link MonthSorter}.
 */
public final class MonthSorterNested implements MonthSorter {
        private static final int SHORT_MONTH=28;
        private static final int USUAL_MONTH=30;
        private static final int LONG_MONTH=31;
    public static enum Month{
        JANUARY("January",LONG_MONTH),
        FEBRUARY("February",SHORT_MONTH),
        MARCH("March",LONG_MONTH),
        APRIL("April",USUAL_MONTH),
        MAY("May",LONG_MONTH),
        JUNE("June",USUAL_MONTH),
        JULY("July",LONG_MONTH),
        AUGUST("August",LONG_MONTH),
        SEPTEMBER("September",USUAL_MONTH),
        OCTOBER("October",LONG_MONTH),
        NOVEMBER("November",USUAL_MONTH),
        DECEMBER("December",LONG_MONTH);
        private final String ActualName;
        private final int Days;
        private Month(final String name, final int days){
            this.ActualName=name;
            this.Days=days;
        }
        public String getActualName(final Month month){
            return month.ActualName;
        }
        public Month fromString(final String month){
            int equal_months=0;
            Month result=null;
            for(final Month name : Month.values()){
                if(name.getActualName(name).compareToIgnoreCase(month) == 0){
                    result=name;
                    equal_months++;
                }
            }
            if(equal_months==1){
                return result;
            } else {
                throw new IllegalArgumentException("no month found or inconclusive string received");
            }
        }
    }

    @Override
    public Comparator<String> sortByDays() {
        return null;
    }

    @Override
    public Comparator<String> sortByOrder() {
        return null;
    }
}
