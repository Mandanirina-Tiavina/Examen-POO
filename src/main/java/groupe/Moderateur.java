package groupe;

import java.util.Date;
import java.util.List;

public class Moderateur extends Utilisateur {
    public Moderateur(String id, String nom, String email, Date date_de_creation) {
        super(id, nom, email, date_de_creation);
    }

    public List<Publication> remove_post(int id) {

    }

}
