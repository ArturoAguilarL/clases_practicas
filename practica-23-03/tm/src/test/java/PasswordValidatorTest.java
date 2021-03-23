import org.junit.Test;
import org.junit.Assert;

public class PasswordValidatorTest {


    @Test
    public void test01CreoUnPasswordYVeoSiCumple(){
        Password pass = new Password();
        Assert.assertEquals(true,pass.isValid("Geeks@portal120"));
    }

    @Test
    public void test02CreoUnPasswordQueNoCumpleConElPatronDeRegex(){
        Password pass = new Password();
        Assert.assertEquals(false,pass.isValid("1234"));
    }
}
