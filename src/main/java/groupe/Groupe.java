package groupe;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Groupe {
    private String nom;
    private List<Utilisateur> utilisateurs;
    private List<Publication> publications;

    public Groupe(String nom) {
        this.nom = nom;
    }

    public List<Publication> chercherPublicationsParMotCle(String motCle) {
        return publications.stream()
                .filter(e -> e.getDescription().toLowerCase().contains(motCle.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Utilisateur> getUtilisateurs() {
        return utilisateurs.stream()
                .sorted(Comparator.comparing(Utilisateur::getId))
                .collect(Collectors.toList());
    }

}