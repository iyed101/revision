public class Colis extends Courrier {
    private double poids ;
    private double volume;
    Colis(boolean expe, String add,double pd,double vol){
        super(expe,add);
        poids=pd;
        volume=vol;
    }
    @Override
    public void decrire(){
        super.decrire();
        System.out.println(" de poids "+poids+"g et de volume "+volume+"L");
    }
    @Override
    public double affranchir(){
        double montant=0;
        if(estValide()){
            montant=0.25*volume+poids/1000;
        }
        return montant;
    }
}
