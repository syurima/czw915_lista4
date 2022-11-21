import java.util.ArrayList;
import java.util.List;

public class Dom extends Budynek{
    private List<Osoba> mieszkancy;

    public Dom(){
        super();
        mieszkancy = new ArrayList<Osoba>();
    }
    public Dom(String color, int floors){
        super(color, floors);
        mieszkancy = new ArrayList<Osoba>();
    }

    public void join(Osoba o){
        this.mieszkancy.add(o);
        this.setCzyZajety(true);
    }
    public void leave(Osoba o){
        this.mieszkancy.remove(o);
        if (this.mieszkancy.size() == 0) this.setCzyZajety(false);
    }
    public void leaveAll(){
        this.mieszkancy = new ArrayList<Osoba>();
    }

    public void wypiszMieszkancow(){
        System.out.println("mieszkańcy: ");
        for(int i = 0; i < mieszkancy.size(); i++){
            System.out.println("- " + mieszkancy.get(i).getImie() + " " + mieszkancy.get(i).getNazwisko() );
        }
    }
    public void getStan(){
        System.out.println("budynek mieszkalny");
        super.getStan();
        wypiszMieszkancow();
        System.out.println("");
    }
}
