package arraylist_name;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NamesArrayListTest {

    @Test
    public void name() {
        NamesArrayList myNames = new NamesArrayList();
        myNames.addName("Pelle");
        assertEquals("Pelle", myNames.getNames());
    }

    @Test
    public void names() {
        NamesArrayList myNames = new NamesArrayList();
        myNames.addName("Pelle");
        myNames.addName("Olle");
        assertEquals("Pelle Olle", myNames.getNames());
    }

    @Test
    public void namesWithStop() {
        NamesArrayList myNames = new NamesArrayList();
        assertTrue(myNames.addName("Pelle"));
        assertTrue(myNames.addName("Olle"));
        assertTrue(myNames.addName("Nisse"));
        assertFalse(myNames.addName("stop"));
        assertEquals("Pelle Olle Nisse", myNames.getNames());
    }

    @Test
    public void namesRenewFirst() {
        NamesArrayList myNames = new NamesArrayList();
        assertTrue(myNames.addName("Pelle"));
        assertTrue(myNames.addName("Olle"));
        assertTrue(myNames.addName("Nisse"));
        assertFalse(myNames.addName("stop"));
        myNames.renew(0, "Nilla");
        assertEquals("Nilla Olle Nisse", myNames.getNames());
    }

    @Test
    public void namesReplaceFirstAndLast() {
        NamesArrayList myNames = new NamesArrayList();
        assertTrue(myNames.addName("Pelle"));
        assertTrue(myNames.addName("Olle"));
        assertTrue(myNames.addName("Nisse"));
        assertFalse(myNames.addName("stop"));
        myNames.replace(0, 2);
        assertEquals("Nisse Olle Pelle", myNames.getNames());
    }

}
