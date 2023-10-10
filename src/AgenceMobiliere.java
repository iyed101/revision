public class AgenceMobiliere {
    private Vehicule[] tab;
    private final int max;
    private int nb;
    public AgenceMobiliere (int max){
        this.max=max;
        tab= new Vehicule[max];
    }
    public int getNb() {
        return nb;
    }
    public void ajoutVehicule(Vehicule V){
        if (nb<max){
            tab[nb]= V;
            nb++;
        }
        else{
            System.out.println("erreur !!");
        }
    }
    public void selection(int n){
        if (n>=0 && n<nb){
            tab[n].decrisVehicule();
        }
        else{
            System.out.println("erreur !!");
        }
    }
    public void selection(String mq){
        boolean vrai=false;
        for(int i=0;i<nb;i++){
            if(tab[i].getMarque()==mq){
                tab[i].decrisVehicule();
                vrai=true;
            }
        }
        if (vrai==false){
            System.out.println("il n'y a pas de véhicules de cette marque");
        }
    }
    public void selection(double px){
        boolean vrai=false;
        for(int i=0;i<nb;i++){
            if(tab[i].getprix()<=px){
                tab[i].decrisVehicule();
                vrai=true;
            }
        }
        if(vrai==false){
            System.out.println("il n'y a pas de véhicules dans cette marge de prix ");
        }
    }
    public void decritTab(){
        for(int i=0;i<nb;i++){
            this.selection(i);
        }
    }
    public void PlusAncienne(){
        if (nb!=0){
            Vehicule v=tab[0];
            for(int i=1;i<nb;i++){
                if (tab[i].getAnne()<v.getAnne()){
                    v=tab[i];
                }
            }
            v.decrisVehicule(); 
        }
        
    }
}
