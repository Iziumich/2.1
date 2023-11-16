import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class AddressTest {

    @Test
    public void test_Equality_Address() {
        Address address1 = new Address("Россия", "Москва");
        Address address2 = new Address("Россия", "Москва");
        Assertions.assertEquals(address1, address2);
    }

    @Test
    public void test_Inequality_Address() {
        Address address1 = new Address("Россия", "Москва");
        Address address2 = new Address("Германия", "Берлин");
        Assertions.assertNotEquals(address1, address2);
    }

    @Test
    public void testAddressHashCode() {
        Address address1 = new Address("Россия", "Москва");
        Address address2 = new Address("Россия", "Москва");
        Assertions.assertEquals(address1.hashCode(), address2.hashCode());
    }
}
