package hashmap_nameage;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class NameAgeTest {
    @Test
    public void testNameAge(){
        NameAge nameAge = new NameAge();
        nameAge.addPerson("Pelle",14);
        assertEquals(14,nameAge.getAge("Pelle"));
    }
    @Test
    public void testMultipleNamesAge(){
        NameAge nameAge = new NameAge();
        nameAge.addPerson("Pelle",14);
        nameAge.addPerson("Olle",15);
        nameAge.addPerson("Nilla",12);
        assertEquals(14,nameAge.getAge("Pelle"));
        assertEquals(15,nameAge.getAge("Olle"));
        assertEquals(12,nameAge.getAge("Nilla"));
    }
    @Test
    public void testKeyNameNotExist() {
        NameAge nameAge = new NameAge();
        assertNull(nameAge.getAge("Pelle"));
    }
    @Test
    public void testRetypeKey(){
        // testkod
    }
    @Test
    public void testAgeMissing(){
        // testkod
    }
}
