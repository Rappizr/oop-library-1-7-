package id.ac.polinema.library;

public class Dvd extends LibraryItem{
    private int duration;

    public Dvd(String title, int year, int duration){
        super(title, year);
        this.duration = duration;
    }

    public int getDuration(){
        return duration;
    }

    public void setDuration(int duration){
        this.duration = duration;
    }
}