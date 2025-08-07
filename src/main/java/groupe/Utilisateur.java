package groupe;

import java.time.LocalDate;
import java.util.Date;

public class Utilisateur {
    private String id;
    private String nom;
    private String email;
    private LocalDate date_de_creation;

    public Utilisateur(String id, String nom, String email) {
        this.id = id;
        this.nom = nom;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDate_de_creation() {
        return date_de_creation = LocalDate.now();
    }
}
