package ab08;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    Person person;

    @BeforeEach
    public void setUp() {
        person = new Person("Niko", "Ullrich");
    }

    @Test
    public void testGetFirstName() {
        assertEquals("Niko", person.getFirstName());
    }

    @Test
    public void testGetLastName() {
        assertEquals("Ullrich", person.getLastName());
    }
}