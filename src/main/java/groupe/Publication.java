package groupe;

import java.util.Date;

public class Publication extends Utilisateur{
    private String id;
    private String auteur;
    private String description;

    public Publication(String id, String nom, String email, String id1, String auteur, String description) {
        super(id, nom, email);
        this.id = id1;
        this.auteur = auteur;
        this.description = description;
    }

    @Override
    public String getId() {
        return id;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getDescription() {
        return description;
    }
}
