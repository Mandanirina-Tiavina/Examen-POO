package groupe;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Moderateur extends Utilisateur {
    List<Publication>publications;
    public Moderateur(String id, String nom, String email) {
        super(id, nom, email);
    }

    public List<Publication> removePublications(String id) {
        publications = publications.stream()
                .filter(e -> e.getId() == id)
                .collect(Collectors.toList());
        publications.remove(id);
        return publications;
    }

}
