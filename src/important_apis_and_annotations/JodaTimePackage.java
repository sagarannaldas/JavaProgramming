package important_apis_and_annotations;

import java.time.*;

public class JodaTimePackage {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now(); //there's no constructor method in this class so we use now method to create object
        System.out.println(localDate);

        int day = localDate.getDayOfMonth();
        int monthValue = localDate.getMonthValue();
        int year = localDate.getYear();

        System.out.println(day +"/"+monthValue+"/"+year);


        LocalTime localTime = LocalTime.now(); //there's no constructor method in this class so we use now method to create object
        System.out.println(localTime);

        int hour = localTime.getHour();
        int min = localTime.getMinute();
        int seconds = localTime.getSecond();
        int nanoSeconds = localTime.getNano();

        System.out.println(hour+":"+min+":"+seconds+":"+nanoSeconds);


    }
}
