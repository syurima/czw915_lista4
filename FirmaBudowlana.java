public class FirmaBudowlana {
    public static void paint(Budynek B, String color){
        B.setColor(color);
    }
    public static void budujPietro(Budynek B){
        B.setFloors(B.getFloors()+1);
    }
    public static void odnow(Budynek B){
        B.setCzyOdnowiony(true);
    }

    public static int wycen(Budynek B){
        int price = B.getFloors()*1000;
        if (B.getColor().equals("biały")) price+= 15;
        if (B.isCzyOdnowiony()) price*= 2;
        return price;
    }

/*
    public static void abandon(Budynek B){
        if(B instanceof Biurowiec){
            ((Biurowiec) B).setFirma(null);
            B.setCzyZajety(false);
        }
        if(B instanceof Dom){
            B.setOwner(null);
            ((Dom) B).leaveAll();
            B.setCzyZajety(false);
        }
    }

 */
}
