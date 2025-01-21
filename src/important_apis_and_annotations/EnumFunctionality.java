package important_apis_and_annotations;

import java.util.ArrayList;

enum Week {
    MON, TUE, WED, THU, FRI, SAT, SUN;
}

public class EnumFunctionality {
    public static void main(String[] args) {

        enum Result {
            PASS, FAIL, NORESULT;
        }

        Week week = Week.MON;
        System.out.println(week);

        int index = Week.MON.ordinal();
        System.out.println(index);

        Week[] weekArrayList = Week.values();
        for (Week day : weekArrayList) {
            System.out.println(day + " : " + day.ordinal());
        }


//        Result result = Result.PASS;
//        System.out.println(result);
    }
}
