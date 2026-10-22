package id.ac.polinema.library;

public class Dvd extends LibraryItem {
    private int duration;

    public Dvd(String title, int year, int duration) {
        super(title, year);
        setDuration(duration);
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        if (duration <= 0) {
            throw new IllegalArgumentException("Durasi harus lebih dari 0");
        }
        this.duration = duration;
    }

    @Override
    public int loanDays() {
        return 3; 
    }

    @Override
    public String describe() {
        return title + " (" + year + ") [" + duration + " min]";
    }
}