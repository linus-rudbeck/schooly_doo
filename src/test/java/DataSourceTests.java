import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import se.distansakademin.data.DataSource;
import se.distansakademin.models.Admin;
import se.distansakademin.models.User;

public class DataSourceTests {


    @Test
    public void testAddAdmin(){
        // Arrange
        DataSource dataSource = new DataSource();

        // Act
        User newAdmin = new Admin("New Admin");
        boolean success = dataSource.addUser(newAdmin);
        User createdAdmin = dataSource.getUser("New Admin");
        boolean isAdmin = createdAdmin instanceof Admin;

        // Assert
        Assertions.assertTrue(success);
        Assertions.assertTrue(isAdmin);
    }
}
