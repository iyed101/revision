public class Livre {
    private String titre,auteur;
    private float nbPages;
    private double Prix;
    public Livre(){}
    public Livre(String titre,float nbPages){
        this.titre=titre;
        this.nbPages=nbPages;
    }
    public Livre(String titre,String auteur,float nbPages){
        this.titre=titre;
        this.auteur=auteur;
        this.nbPages=nbPages;
    }
    public Livre (String auteur,String titre){
        this.auteur=auteur;
        this.titre=titre;
    }
    public Livre (String titre,String auteur,float nbPages,double Prix){
        this.titre=titre;
        this.auteur=auteur;
        this.nbPages=nbPages;
        this.Prix=Prix;
    }
    public String getAuteur(){
        return auteur;
    }
    public String getTitre(){
        return titre;
    }
    public float getNbPages(){
        return nbPages;
    }
    public double getPrix(){
        return Prix;
    }
    public void setNpages(float nb){
        if(nb>=20){
            this.nbPages=nb;
        }
        else{
            System.out.println("pour livre "+this.titre+" nombre indique est faible");
        }
    }
    public void setAuteur(String aut){
        this.auteur=aut;
    }
    public void setTitre(String tit){
        this.titre=tit;
    }
    public void setPrix(double Prix){
        if(!(this.PrixFix())){
            this.Prix=Prix;
        }
        else{
            System.out.println("Prix est fixe");
        }
        
    }
    public String toString(){
        return "livre "+titre+" d'auteur "+auteur+" le nombre de pages est "+nbPages;
    }
    public void decrire(){
        System.out.println(this);
    }
    public boolean testPrix(){
        return !(Prix==0);
    }
    public boolean PrixFix(){
        return this.testPrix();
    }
}
