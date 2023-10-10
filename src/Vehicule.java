public class Vehicule {
    private static int count=0;
    private int Num;
    private String Marque;
    private String Modele;
    private int AnneCreation;
    private double Prix;
    public Vehicule(String marque,String modele,int anne,double prix){
        this.Num=count;
        this.Marque=marque;
        this.Modele=modele;
        this.AnneCreation=anne;
        this.Prix=prix;
        count++;
    }
    public void decrisVehicule(){
        System.out.println("Vehicule numero "+Num+" de la marque "+Marque+" de la modele "+Modele+" d'anne de creation "+AnneCreation+" et de prix "+Prix);
    }
    public String getMarque(){
        return this.Marque;
    }
    public String getModele(){
        return this.Modele;
    }
    public double getprix(){
        return this.Prix;
    }
    public void setMarque(String marque){
        this.Marque=marque;
    }
    public void setModele(String modele){
        this.Modele=modele;
    }
    public void setprix(double prix){
        this.Prix=prix;
    }
    public int getCount(){
        return this.Num;
    }
    public int getAnne(){
        return this.AnneCreation;
    }

}
