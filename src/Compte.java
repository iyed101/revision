public class Compte {
    static int count;
    private int num=count;
    private Personne titulaire;
    private double solde;
    private double decouvertMax=800;
    private double debitMax=1000;
    Compte (Personne p){
        this.titulaire=p;
        count++;
    }
    Compte(Personne p,double solde,double decouvertMax,double debitMax){
        this.titulaire=p;
        this.solde=solde;
        this.decouvertMax=decouvertMax;
        this.debitMax=debitMax;
        count++;
    }
    public double getSolde(){
        return solde;
    }
    public double getDecouvertMax(){
        return decouvertMax;
    }
    public double getDebitMax(){
        return debitMax;
    }
    public String toString(){
        return "compt numero "+num+" de "+ titulaire+" de solde "+solde;
    }
    void crediter(double x){
        if(x>0){
            solde+=x;
        }
    }
    private void debiter(double x){
        if((solde+decouvertMax)>=x){
            solde-=x;
        }
        else{
            System.out.println("decouvert maximal est "+decouvertMax);
        }
    }
    void retrait(double x){
        if(x<debitMax){
            debiter(x);
        }
        else{
            System.out.println("debit maximal est "+debitMax);
        }
    }
    boolean estaDecouvert(){
        return (solde<0);
    }
    double MontantDecouvert(){
        if (estaDecouvert()){
            return this.solde;
        }
        else{
            return 0;
        }
    }
    void Virment_V1(double x,Compte C){
        if(x<this.debitMax && this.solde+this.decouvertMax>x && x<=this.solde){
            this.retrait(x);
            C.crediter(x);
        }

    }
    static void Virment_V2(Compte C,Compte C2,double x){
        if(x<C.debitMax && C.solde+C.decouvertMax>x && x<=C.solde){
            C.retrait(x);
            C2.crediter(x);
        }
    }

}
