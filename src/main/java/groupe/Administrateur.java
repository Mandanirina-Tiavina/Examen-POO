package groupe;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Administrateur extends Moderateur{
    public List<Utilisateur> utilisateur;
    public Administrateur(String id, String nom, String email) {
        super(id, nom, email);
    }

    public List <Utilisateur> removeUtilisateurs(String idUtilisateur) {
        utilisateur = utilisateur.stream()
                .filter(e -> e.getId() == idUtilisateur)
                .collect(Collectors.toList());
        utilisateur.remove(idUtilisateur);
        return utilisateur;
    }

}