public class BoiteCourrier {
    private Courrier[] tab_courrier ;
    private int nb;
    public BoiteCourrier(int max){
        tab_courrier= new Courrier[max];
        this.nb=0;
    }
    public void ajoutcourr(Courrier c){
        if(nb<tab_courrier.length){
            tab_courrier[nb]=c;
            nb++;
        }
    }
    public double affranchir(){
        double sommaff=0;
        for(int i=0;i<tab_courrier.length;i++){
            if (tab_courrier[i]!=null){
                sommaff+=tab_courrier[i].affranchir();
            }
        }
        return sommaff;
    }
    public int courriersInvalides(){
        int somm=0;
        for(int i=0;i<tab_courrier.length;i++){
            if (tab_courrier[i]!=null && tab_courrier[i].estValide()== false){
                somm++;
            }
        }
        return somm;
    }
    public void afficher(){
        for(int i=0;i<tab_courrier.length;i++){
            if ( tab_courrier[i]!=null){
                if(tab_courrier[i].estValide()==false){
                    tab_courrier[i].decrire();
                    System.out.println(" est non valide");
                }
                else{
                    tab_courrier[i].decrire();
                }
            }
            
        }
    }
}

