import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest extends TestCase {

    public void testCheckFName() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.checkFName("Dhanshri");
        Assert.assertEquals(true,result);
    }

    public void testLname() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.checkFName("Zingade");
        Assert.assertEquals(true,result);
    }
    public void testFirstNameInvalidMustReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isFnameValid = userRegistration.checkFName("rajshri");
        Assert.assertEquals(false,isFnameValid);
    }
    public void test() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isLnameValid = userRegistration.Lname("Zingade");
        Assert.assertEquals(true,isLnameValid);
    }
    @Test
    public void testLast_mustReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isLnameInValid = userRegistration.Lname("zingade");
        Assert.assertEquals(false,isLnameInValid);
    }

    @Test
    public void testEmailId_MustReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isEmailValid = userRegistration.checkEmail("rajshri.ab@gmail.com");
        Assert.assertEquals(true,isEmailValid);
    }

    @Test
    public void testEmailId_MustReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isEmailInvalid = userRegistration.checkEmail("raajshri5@.com");
        Assert.assertEquals(false,isEmailInvalid);
    }

    @Test
    public void testPhoneNumber_MustReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isPhoneNumberValid = userRegistration.checkPhoneNum("91 9686127142");
        Assert.assertEquals(true,isPhoneNumberValid);
    }

    @Test
    public void testPhoneNumber_MustReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isPhoneNumberInValid = userRegistration.checkPhoneNum("9686127142");
        Assert.assertEquals(false,isPhoneNumberInValid);
    }

    @Test
    public void testPassword_MustReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isPasswordValid = userRegistration.checkPassword("Abc@123gjyg");
        Assert.assertEquals(true,isPasswordValid);
    }

    @Test
    public void testPassword_MustReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isPasswordInValid = userRegistration.checkPassword("abcdefghi");
        Assert.assertEquals(false,isPasswordInValid);
    }

    @Test
    public void mood_Analyser_Test_Sad() {
        UserRegistration userRegistration = new UserRegistration();
        String isMoodSad = userRegistration.moodAnalyzer("rajshri", "Zingade", "9686127142", "rajshri006@.com", "W821201");
        Assert.assertEquals("Sad", isMoodSad);
    }

}

