import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Carnet {
    private List<Sorties> sorties;

    public Carnet(){
        this.sorties = new ArrayList<>();
    }

    public void ajouter(Sorties sortie){
        this.sorties.add(sortie);
    }

    public void lister() {
        for (Sorties s : this.sorties) {
            System.out.println(s.toString());
        }
    }

    public double distanceTotale() {
        double total = 0;
        for (Sorties s : this.sorties) {
            total += s.getDistance();
        }
        return total;
    }

    public double kmEffortTotal() {
        double total = 0;
        for (Sorties s : this.sorties) {
            total += s.kmEffort();
        }
        return total;
    }

    public double denivelerTotal() {
        return 4.0; // A completer
    }

    public void exporterCSV(String nomFichier) {
        List<String> lignes = new ArrayList<>();
        lignes.add("Type;Nom;Distance;Temps;Caractéristiques");
        for (Sorties s : this.sorties) {
            lignes.add(s.toCSV());
        }
        try {
            Files.write(Path.of(nomFichier), lignes);
            System.out.println("Export réussi dans " + nomFichier);
        } catch (IOException e) {
            System.out.println("Erreur lors de l'écriture du fichier : " + e.getMessage());
        }
    }
}