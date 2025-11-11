package hashmap_alfabetet;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AlfabetetKodningTest {

    @Test
    public void bokstavenA(){
        assertEquals("!",AlfabetetKodning.kryptera("A"));
    }
//    @Test
//    public void bokstavenYUR(){
//        assertEquals(";~}",AlfabetetKodning.kryptera("YUR"));
//    }
}
