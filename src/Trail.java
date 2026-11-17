public class Trail extends Sorties{
    private int deniveler;

    public Trail(String nom, double distance, int temps, int deniveler) {
        super(nom, distance, temps);
        this.deniveler = deniveler;
    }
    @Override
    public String toString() {
        return "Trail : " + super.toString() + "\nDénivelé positif : " + deniveler + "m";
    }
    @Override
    public String toCSV() {
        return "Trail;" + getNom() + ";" + getDistance() + ";" + getTemps() + ";" + deniveler;
    }
}
