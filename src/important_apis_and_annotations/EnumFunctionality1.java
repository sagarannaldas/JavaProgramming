package important_apis_and_annotations;

enum Results {

    PASS, FAIL, NORESULT;

    // Behind the scene this class extend java.util.Enum class
    // public static final Result PASS = new Result();
    // public static final Result FAIL = new Result();
    // public static final Result NORESULT = new Result();

    int marks;

    Results() {
        System.out.println("Constructor in enum");
    }

    void setMarks(int marks) {
        this.marks = marks;
    }

    int getMarks() {
        return marks;
    }
}

public class EnumFunctionality1 {
    public static void main(String[] args) {
        Results.PASS.setMarks(50);
        int passMarks = Results.PASS.getMarks();
        System.out.println(passMarks);

        Results.FAIL.setMarks(35);
        int failMarks = Results.FAIL.getMarks();
        System.out.println(failMarks);

        int noResults = Results.NORESULT.getMarks();
        System.out.println(noResults);
    }
}
