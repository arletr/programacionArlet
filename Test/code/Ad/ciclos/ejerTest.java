package code.Ad.ciclos;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ejerTest {
    @Test
    @DisplayName("Número primo")
    void primo() {
        assertTrue(ejer.primo(5));
    }
}
