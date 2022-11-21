public abstract class Budynek {
    private String color;
    private int floors;
    private boolean czyOdnowiony;
    private boolean czyZajety;
    private Osoba owner;
    public Budynek(){
        this.color  = "biały";
        this.floors = 1;
        this.czyOdnowiony = false;
        this.czyZajety = false;
        this.owner = null;
    }
    public Budynek(String color, int floors) {
        this.color = color;
        this.floors = floors;
        this.owner = null;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getFloors() {
        return floors;
    }
    public void setFloors(int floors) {
        this.floors = floors;
    }
    public boolean isCzyOdnowiony() {
        return czyOdnowiony;
    }
    public void setCzyOdnowiony(boolean czyOdnowiony) {
        this.czyOdnowiony = czyOdnowiony;
    }
    public boolean isCzyZajety() {
        return czyZajety;
    }
    public void setCzyZajety(boolean czyZajety) {
        this.czyZajety = czyZajety;
    }
    public Osoba getOwner() {
        return this.owner;
    }
    public void setOwner(Osoba owner) {
        this.owner = owner;
    }
    public void getStan(){
        System.out.println("kolor: " + this.color);
        System.out.println("ilość pięter: " + this.floors);
        System.out.println("czy odnowiony?: " + this.czyOdnowiony);
        System.out.println("czy zajęty?: " + this.czyZajety);
        if(this.owner == null) System.out.println("brak właściciela");
        else System.out.println("właściciel: " + this.owner.imie + " " + this.owner.nazwisko);
    }
    public void join(Osoba o){
        if (this instanceof Dom) this.join(o);
        if (this instanceof Biurowiec) ((Biurowiec) this).getFirma().leave(o);

    }
    public void leave(Osoba o){
        if (this instanceof Dom) this.leave(o);
        if (this instanceof Biurowiec) ((Biurowiec) this).getFirma().leave(o);
    }
    public void abandon(){
        if(this instanceof Biurowiec){
            ((Biurowiec) this).setFirma(new Firma());
            this.setOwner(null);
            this.setCzyZajety(false);
        }
        if(this instanceof Dom){
            this.setOwner(null);
            this.setCzyZajety(false);
            ((Dom) this).leaveAll();
        }
    }

}
