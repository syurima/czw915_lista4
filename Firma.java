import java.util.ArrayList;
import java.util.List;

public class Firma {
    private String  nazwa;
    private Osoba owner;
    private List<Osoba> pracownicy;

    public Firma() {
        this.nazwa = "brak";
        this.owner = null;
        this.pracownicy = new ArrayList<Osoba>();
    }
    public Firma(String nazwa, Osoba owner) {
        this.nazwa = nazwa;
        this.owner = owner;
        this.pracownicy = new ArrayList<Osoba>();
    }

    public String getNazwa() {
        return nazwa;
    }
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Osoba getOwner() {
        return owner;
    }
    public void setOwner(Osoba owner) {
        this.owner = owner;
    }

    public void join(Osoba o){
        this.pracownicy.add(o);
    }
    public void leave(Osoba o){
        this.pracownicy.remove(o);
    }
    public void wypiszPracownikow(){
        System.out.println("pracownicy: ");
        if (pracownicy == null) System.out.println("brak");
        else for(int i = 0; i < pracownicy.size(); i++){
            System.out.println("- " + pracownicy.get(i).getImie() + " " + pracownicy.get(i).getNazwisko() );
        }
    }
}
