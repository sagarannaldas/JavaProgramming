package strings;

public class Strings1 {
    public static void main(String[] args) {
        String brand1 = "PWSkills";
        System.out.println(brand1);
        brand1.concat("Mumbai");
        System.out.println(brand1);

        StringBuilder brand2 = new StringBuilder("PWSkills");
        System.out.println(brand2);
        brand2.append("Bengaluru");
        System.out.println(brand2);

        String s1 = "PWSkill";
        String s2 = "PWSkill";
        String s3 = "pwskill";
        String s4 = new String("PWSkill");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
    }
}
