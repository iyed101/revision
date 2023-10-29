public class Courrier{
    protected boolean expedition_mode;
    protected String adresse;
    protected final double tarif=0.5;
    public Courrier(boolean expe, String add){
        expedition_mode=expe;
        adresse=add;
    }
    public boolean estValide(){
        return (adresse.length()!=0);
    }
    public void decrire(){
        if (estValide()){
            if(expedition_mode == true){
            System.out.println("Le "+getClass().getSimpleName()+" express d'adresse "+adresse);
        }
            else{
            System.out.println("Le "+getClass().getSimpleName()+" normal d'adresse "+adresse);
        }
        }   
    }
    public double affranchir(){
        double aff=0;
        if(estValide()){
            if(expedition_mode){
                aff=tarif*2;
            }
            else{
                aff=tarif;
            }
        }
        return aff;
    }
}