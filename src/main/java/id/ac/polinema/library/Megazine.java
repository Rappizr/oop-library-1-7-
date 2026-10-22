package id.ac.polinema.library;

public class Megazine extends LibraryItem{
    private int issueNumber;

    public Megazine(String title, int year, int issueNumber){
        super(title, year);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber(){
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber){
        this.issueNumber = issueNumber;
    }
}
