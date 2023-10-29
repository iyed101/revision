import java.util.Scanner;

public class Lettre extends Courrier{
    private double poids;
    private String format;
    
    public Lettre(boolean expe, String add,double pd){
        super(expe, add);
        poids=pd;
        format= saisirformat() ; 
    }
    private String saisirformat(){
        try (Scanner scanner = new Scanner(System.in)) {
            String saisir;
            while(true){
                System.out.println("donner format (A3 ou A4)");
                saisir= scanner.nextLine().trim();
                if(saisir.toUpperCase().equals("A3") || saisir.toUpperCase().equals("A4")){
                    return saisir;
                }
                else{
                    System.out.println("A3 ou A4");
                }
            }
        }
    }
    @Override
    public void decrire(){
        super.decrire();
        System.out.println(" de poids "+poids+"g et de format "+format);
    }
    @Override
    public double affranchir(){
        double montant=0;
        double tarif_base=0;
        if (estValide()){
            if (format.toUpperCase().equals("A4")){
                tarif_base=2.5;
            }
            else if(format.toUpperCase().equals("A3")){
                tarif_base=3.5;
            }
            if( expedition_mode ){
                montant= (tarif_base+(tarif*poids)/1000)*2;
            }
            else{
                montant= (tarif_base+(tarif*poids)/1000);
            }
        }
        return montant;
    }
}
