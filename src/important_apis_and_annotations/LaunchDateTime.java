package important_apis_and_annotations;

//import java.util.Date;
//import java.util.ArrayList;

public class LaunchDateTime {
    public static void main(String[] args) {
        java.util.ArrayList arrayList = new java.util.ArrayList<>();

        java.util.Date date = new java.util.Date();
        System.out.println(date);
        long timeInMs = date.getTime();

        java.sql.Date date1 = new java.sql.Date(timeInMs);
        System.out.println(date1);


    }
}
