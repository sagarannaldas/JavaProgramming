package exception;

// Handling vs Ducking Exception
class Demo {
    public void a() throws Exception {
        b();
//        try {
//            b();
//        } catch (Exception e) {
//            System.out.println("error.. " + e);
//        }
    }

    public void b() throws Exception {
        int num1 = 9;
        int num2 = 0;
//        try {
//            int result = num1 / num2;
//            System.out.println(result);
//        } catch (Exception e) {
//            System.out.println("error... " + e.getMessage());
//        }
        int result = num1 / num2;
        System.out.println(result);
    }
}

public class ThrowsException {
    public static void main(String[] args) {
        Demo demo = new Demo();
        try {
            demo.a();
        } catch (Exception e) {
            System.out.println("error..." + e);
        }
    }
}
