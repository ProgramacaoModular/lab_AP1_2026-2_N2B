
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CorridaTest {

    @Test
    void nasceNaoConcluida() {
        Corrida c = new Corrida("C1", 12.5, 30.0);
        assertFalse(c.estaConcluida());
        assertEquals(12.5, c.getKm(), 0.001);
        assertEquals(30.0, c.getValor(), 0.001);
    }

    @Test
    void concluiCorrida() {
        Corrida c = new Corrida("C1", 12.5, 30.0);
        c.concluir();
        assertTrue(c.estaConcluida());
    }

    @Test
    void valoresNegativosViramZero() {
        Corrida c = new Corrida("C1", -3, -10);
        assertEquals(0.0, c.getKm(), 0.001);
        assertEquals(0.0, c.getValor(), 0.001);
    }
}
