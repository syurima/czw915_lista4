import java.util.List;

public class Biurowiec extends Budynek{
    private Firma firma;
    public Biurowiec(){
        super();
        this.firma = new Firma();
        this.setOwner(this.firma.getOwner()) ;
    }
    public Biurowiec(String color, int floors, Firma firma){
        super(color, floors);
        this.firma = firma;
        this.setOwner(this.firma.getOwner());
        this.setCzyZajety(true);
    }

    public Firma getFirma() {
        return firma;
    }
    public void setFirma(Firma firma) {
        this.firma = firma;
        this.setCzyZajety(true);
    }

    public void getStan(){
        System.out.println("biurowiec");
        super.getStan();
        System.out.println("Firma: " + this.firma.getNazwa());
        this.firma.wypiszPracownikow();
        System.out.println("");
    }
}
