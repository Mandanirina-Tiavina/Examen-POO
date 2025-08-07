package groupe;

import java.util.Date;

public class Publication{
    private String id;
    private String auteur;
    private String description;

    public Publication( String id, String auteur, String description) {
        this.id = id;
        this.auteur = auteur;
        this.description = description;
    }

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
