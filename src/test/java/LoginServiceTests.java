import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import se.distansakademin.models.Admin;
import se.distansakademin.models.User;
import se.distansakademin.services.LoginService;

public class LoginServiceTests {

    @Test
    public void testAdminLogin(){
        // Arrange
        LoginService service = new LoginService();

        // Act
        User user = service.login("adminUser", "adminPass");
        boolean isAdmin = user instanceof Admin;

        // Assert
        Assertions.assertTrue(isAdmin);
    }

    @Test
    public void testIncorrectLogin(){
        // Arrange
        LoginService service = new LoginService();

        // Act
        User user = service.login("incorrect", "incorrect");
        boolean isCorrect = user != null;

        // Assert
        Assertions.assertFalse(isCorrect);
    }


}
