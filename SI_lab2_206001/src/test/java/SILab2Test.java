import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    List<String> lista = new ArrayList<>();
    List<String> result = new ArrayList<>();

    @Test
    public void EveryStatementTest(){
        IllegalArgumentException exception;

        exception = assertThrows(IllegalArgumentException.class, () -> SILab2.function(lista));
        assertTrue(exception.getMessage().contains("List length should be greater than 0"));

        lista.addAll(Arrays.asList("#", "0", "#"));
        exception = assertThrows(IllegalArgumentException.class, () -> SILab2.function(lista));
        assertTrue(exception.getMessage().contains("List length should be a perfect square"));

        lista.addAll(Arrays.asList("#", "0", "0", "0", "#", "0"));
        result.addAll(Arrays.asList("#", "2", "#", "#", "2", "1", "2", "#", "1"));
        assertEquals(result, SILab2.function(lista));
    }

    @Test
    public void EveryBranchTest(){
        IllegalArgumentException exception;

        exception = assertThrows(IllegalArgumentException.class, () -> SILab2.function(lista));
        assertTrue(exception.getMessage().contains("List length should be greater than 0"));

        lista.addAll(Arrays.asList("#", "0", "#"));
        exception = assertThrows(IllegalArgumentException.class, () -> SILab2.function(lista));
        assertTrue(exception.getMessage().contains("List length should be a perfect square"));

        lista.addAll(Arrays.asList("#", "0", "0", "0", "#", "0"));
        result.addAll(Arrays.asList("#", "2", "#", "#", "2", "1", "2", "#", "1"));
        assertEquals(result, SILab2.function(lista));
    }
}