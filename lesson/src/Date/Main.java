package Date;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        var start = LocalDate.of(2000,1,1);
        var end = LocalDate.of(2099,12,31);
        int count = 0;
        while (true) {
            if(start.getYear() == 2099 && start.getMonthValue() == 12 && start.getDayOfMonth() == 31) {
                break;
            }
            if(start.getDayOfMonth() == 13 && start.getDayOfWeek() == DayOfWeek.FRIDAY) {
                System.out.println(start);
                count++;
            }
            start = start.plusDays(1) ;
        }
        System.out.println(count);
    }
}
