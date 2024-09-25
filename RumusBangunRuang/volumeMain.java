package RumusBangunRuang;
public class volumeMain {
    public static void main(String[] args) {
        volume Balok = new volume(3, 2, 4);
        volume Kubus = new volume(2);
        
        System.out.println("-----Volume Kubus & Balok-----");
        System.out.println("\t---Balok---");
        System.out.println("Panjang\t\t\t: " + Balok.p );
        System.out.println("Lebar\t\t\t: " + Balok.l);
        System.out.println("Tinggi\t\t\t: " + Balok.t);
        System.out.println("Maka Volume nya\t\t: " + Balok.volumeBalok());
        System.out.println("Luas Permukaannya\t: " + Balok.luasPermukaan(3, 2, 4) + "\n");
        System.out.println("------------------------------");
        System.out.println("\n\t---Kubus---");
        System.out.println("Sisi\t\t\t: " + Kubus.s);
        System.out.println("Maka Volume nya\t\t: " + Kubus.volumeKubus());
        System.out.println("Luas Permukaannya\t: " + Kubus.luasPermukaan(2));
    }
    
}
