package RumusBangunRuang;
public class volume {
    double p, l, s, t;
    
    public volume(double p, double l, double t){
        this.p = p;
        this.l = l;
        this.t = t; 
    }
    public volume(double s){
        this.s = s;
    }
    public double luasPermukaan(double p, double l, double t){
        this.p = p;
        this.l = l;
        this.t = t;
        return 2 * ((p * l) + (p*t) + (l*t) );
    }
    public double luasPermukaan(double s){
        this.s = s;
        return 6*s*s;
    }
    public double volumeBalok(){
        return p * l * t;
    }
    public double volumeKubus(){
        return s*s*s;
    }
}
