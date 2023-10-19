public class TestSalarie {
    public static void main(String args[]){
        Salarie S= new Salarie(123, "iyed", 2004);
        Employe Em= new Employe(1234, "iyed", 2003, 5, 5);
        Vendeur Ven= new Vendeur(12345, "iyed", 2002, 7, 3);
        S.affiche();
        System.out.println(S.salaire());
        Em.affiche();
        System.out.println(Em.salaire());
        Ven.affiche();
        System.out.println(Ven.salaire());
    }   
}
