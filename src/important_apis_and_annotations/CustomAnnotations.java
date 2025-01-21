package important_apis_and_annotations;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface CricketPlayer {
    String country() default "india";

    int age() default 34;
}

@CricketPlayer
class Virat {
    @CricketPlayer
    private int innings;
    private int runs;

    @CricketPlayer
    public int getInnings() {
        return innings;
    }

    public void setInnings(int innings) {
        this.innings = innings;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }
}

public class CustomAnnotations {
    public static void main(String[] args) {
        Virat virat = new Virat();
        virat.setInnings(300);
        virat.setRuns(5000);

        System.out.println(virat.getInnings());
        System.out.println(virat.getRuns());

        Class viratClass = virat.getClass();
        Annotation a = viratClass.getAnnotation(CricketPlayer.class);
        CricketPlayer cp = (CricketPlayer) a;
        String country = cp.country();
        int age = cp.age();

        System.out.println(country);
        System.out.println(age);
    }
}
