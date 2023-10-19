public class Salarie {
    protected int matricule;
    protected String nom;
    protected double recrutement ;
    public Salarie(int matricule, String nom,double recrutement){
        this.matricule=matricule;
        this.nom=nom;
        this.recrutement=recrutement;
    }
    public int getMatricule(){
        return matricule;
    }
    public String getNom(){
        return nom;
    }
    public double getRecrutement(){
        return recrutement;
    }
    public void setMatricule(int mat){
        matricule=mat;
    }
    public void setNom(String nm){
        nom=nm;
    }
    public void setRecru(double recru){
        recrutement=recru;
    }
    public void affiche(){
        System.out.println(this.getClass().getSimpleName()+" de la matricule "+matricule+" de nom "+nom+" et recrute en "+recrutement);
    }
    public double salaire (){
        if (recrutement>0 && recrutement<=2055.0){
            return 400.00;
        }
        else if(recrutement>2005.0){
            return 280.00;
        }
        else return 0.0;
    }
}
