public class demoPassword {
    public static void main(String[] args) throws Exception {
        Password pass = new Password();
        try {
            pass.setPassword("n!k@sn1Kos");
        } catch (Exception e) {
            e.printStackTrace();
        }

        PasswordSimple passSimple = new PasswordSimple();
        System.out.println(passSimple.isValid("11aa"));
    }
}
