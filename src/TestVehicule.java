public class TestVehicule {
    public static void main (String[] args){
        AgenceMobiliere ag= new AgenceMobiliere(7);
        Vehicule V= new Vehicule("BMW", "X5", 2005,400);
        Vehicule V2= new Vehicule("clio", "classique", 2000, 20);
        Vehicule V3= new Vehicule("Mercedes", "fantome", 2008, 60);
        Vehicule V4= new Vehicule("KIA", "Picanto", 2012, 35);
        Vehicule V5= new Vehicule("BMW", "X3", 2003,150);
        ag.ajoutVehicule(V);
        ag.ajoutVehicule(V2);
        ag.ajoutVehicule(V3);
        ag.ajoutVehicule(V4);
        ag.ajoutVehicule(V5);
        ag.decritTab();
        //ag.selection("BMW");
        //ag.selection(40.0);
        //ag.PlusAncienne();
    }
    
}
