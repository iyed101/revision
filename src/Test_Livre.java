public class Test_Livre {
    public static void main(String[] args){
        Livre[] Livres= new Livre[3];
        Livres[0]= new Livre("L'alchimiste", "Coelho", 225);
        Livres[1]= new Livre("Le Coran", 508);
        Livres[2]= new Livre("jk Rowling", "Harry Potter");
        Livres[0].setAuteur("Paulo Coelho");
        Livres[2].setNpages(461);
        for (Livre livre : Livres) {
            livre.decrire();
            System.out.println(); 
        }
        Livres[0].setPrix(50);
        System.out.println(Livres[0].testPrix());
        Livres[0].setPrix(60);
    }
}
