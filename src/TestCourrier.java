public class TestCourrier {
    public static void main(String args[]){
        Courrier C1= new Colis(false, "nabeul", 5, 5);
        Courrier l1= new Lettre(true, "mrezga", 5);
        BoiteCourrier B = new BoiteCourrier(5);
        B.ajoutcourr(C1);
        B.ajoutcourr(l1);
        System.out.println(B.affranchir());
        System.out.println(B.courriersInvalides());
        B.afficher();
    }
}
