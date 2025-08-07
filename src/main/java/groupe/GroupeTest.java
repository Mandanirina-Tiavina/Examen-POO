package groupe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
public class GroupeTest {
    @BeforeEach
    void setUp() {
        var HEI_club = new Groupe("HEI_club");
        var Manda = new Utilisateur("STD24083", "Manda", "hei.manda.16@gmail.com");
        var Tiavina = new Administrateur("Tiavina", "Tiavina", "mandatiavina@gmail.com");
    }

    @Test
    void
}
