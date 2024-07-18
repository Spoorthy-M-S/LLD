package LLD.S1SOLIDprinciples;

public class Cd implements LibraryItems {
    private String title;
    private String Id;
    private double Latefee;
    private double value;

    Cd(String title, String Id, double Latefee, double value) {
        this.title = title;
        this.Id = Id;
        this.Latefee = Latefee;
        this.value = value;
    }

    public String gettitle() {
        return this.title;
    }
    public  String getUniqueId(){
        return this.Id;
    }
    public double calculateLatefee(int days){
        return days+this.Latefee;
    }
    public double getValue(){
        return this.value;
    }
}
