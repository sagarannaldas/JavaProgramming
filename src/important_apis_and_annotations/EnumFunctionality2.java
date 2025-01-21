package important_apis_and_annotations;

enum Result1 {
    PASS, FAIL, NORESULT;
}

public class EnumFunctionality2 {
    public static void main(String[] args) {
        Result1 result1 = Result1.FAIL;

        switch (result1) {
            case PASS -> {
                System.out.println("Passed!");
                break;
            }
            case FAIL -> {
                System.out.println("Failed!");
                break;
            }
            case NORESULT -> {
                System.out.println("Noresult!");
                break;
            }
        }
    }
}
