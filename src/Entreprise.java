public class Entreprise {
    public static void main(String[] args){
        Salarie[] tabSalaries= new Salarie[5];
        tabSalaries[0]= new Employe(12345, "Walid", 2002, 15, 4);
        tabSalaries[1]= new Vendeur(23445, "Yessine", 2007, 1000, 0.1);
        tabSalaries[2]= new Vendeur(65478, "Nassime", 2000, 700, 0.1);
        tabSalaries[3]= new Employe(87698, "Aymen", 2003, 19, 5);
        tabSalaries[4]= new Employe(12345, "Khaled", 2008, 7, 4);
        System.out.println("****************Liste des Employes*****************");
        for (Salarie salariee : tabSalaries){
            if(salariee instanceof Employe){
                salariee.affiche();
            } 
        }
        System.out.println("****************************************************");
        System.out.println("****************Liste des vendeurs*****************");
        for (Salarie salariee : tabSalaries){
            if(salariee instanceof Vendeur){
                salariee.affiche();
            } 
        }
        System.out.println("****************************************************");
        System.out.println("** Nom du salarié le plus ancien dans l'entreprise **");
        Salarie sa=tabSalaries[0];
        for(int i=1;i<tabSalaries.length;i++){
            if(tabSalaries[i].getRecrutement()<sa.getRecrutement()){
                sa=tabSalaries[i];
            }
        }
        System.out.println("Nom: "+sa.getNom()+" recrute en l'an "+(int)sa.getRecrutement());
        System.out.println("*********************************************************");
        System.out.println("** Matricule du vendeur disposant du plus grand salaire **");
        Salarie Smax=null;
        for(int i=1;i<tabSalaries.length;i++){
            if(tabSalaries[i] instanceof Vendeur){
                if(Smax==null){
                    Smax=tabSalaries[i];
                }
                else if(tabSalaries[i].salaire()>Smax.salaire()){
                    Smax=tabSalaries[i];
                }
            }
        }
        System.out.println("Matricule: "+Smax.getMatricule()+" de salaire "+Smax.salaire()+"Dt");
        System.out.println("*********************************************************");
    }
        
}
