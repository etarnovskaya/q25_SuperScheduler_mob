import org.testng.annotations.Test;

public class LoginTest extends  TestBase{
    @Test
    public void testLogin(){
        app.user().login("NewYear@gmail.com", "Happy2021");
    }
}
