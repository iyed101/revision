public class test {
    public static void main(String[] args){
        Personne P= new Personne("iyed","bencheikh","sidiMadhkour");
        Personne P2= new Personne("doudou", "bnch", "zaghouan");
        Compte C=new Compte(P);
        Compte Cx=new Compte(P2);
        System.out.println(P);
        C.crediter(700);
        C.retrait(200);
        C.Virment_V1(100, Cx);
        Compte.Virment_V2(C, Cx, 300);
        System.out.println(C);
        System.out.println(Cx);
    }
}
