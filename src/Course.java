public class Course extends Sorties{
    private boolean competition;

    public Course(String nom, double distance, int temps, boolean competition) {
        super(nom, distance, temps);
        this.competition = competition;
    }
    @Override
    public String toString() {
        return "Course sur route : " + super.toString() + "\nCompetition : " + competition;
    }
    @Override
    public String toCSV() {
        return "Course sur route;" + getNom() + ";" + getDistance() + ";" + getTemps() + ";" + competition;
    }
}
