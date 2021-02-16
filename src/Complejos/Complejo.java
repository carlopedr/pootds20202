/*
 1.Crea una clase Complejo que permita trabajar con números 
complejos (parte real y parte imaginaria). 
Incluye los siguientes métodos: constructores (por defecto y 
parametrizado), getters, setters, suma, resta, multiplicación, 
división, Producto por escalar y print().
 */
package Complejos;

/**
 *
 * @author Carlos Pedraza
 */
public class Complejo {
    private double pReal; //Parte Real
    private double pImag; //Parte Imaginaria

    public Complejo() {
    }

    public Complejo(double pReal, double pImag) {
        this.pReal = pReal;
        this.pImag = pImag;
    }

    public double getpReal() {
        return pReal;
    }

    public double getpImag() {
        return pImag;
    }

    public void setpReal(double pReal) {
        this.pReal = pReal;
    }

    public void setpImag(double pImag) {
        this.pImag = pImag;
    }
    
    public Complejo suma(Complejo s){
        Complejo r=new Complejo();
        r.setpReal(this.pReal+s.getpReal());
        r.setpImag(this.pImag+s.getpImag());
        return r;
    }
    
    public Complejo resta(Complejo s) {
        Complejo r = new Complejo();
        r.setpReal(this.pReal - s.getpReal());
        r.setpImag(this.pImag - s.getpImag());
        return r; 
    }
    public Complejo division(Complejo d){
        Complejo r = new Complejo(); 
        r.setpReal(((this.pReal * d.getpReal()) + 
            (this.pImag * d.getpImag()))/
            ((d.getpReal() * d.getpReal())+
            (d.getpImag() * d.getpImag())));
        r.setpImag((((this.pReal * d.getpImag()) - 
            (this.pImag * d.getpReal()))/
            ((d.getpReal() * d.getpReal())+(d.getpImag() * 
            d.getpImag()))));
        return r;
    }    
    
    public Complejo producto(Complejo m){
        Complejo p = new Complejo();
        p.setpReal((this.pReal*m.getpReal())-(this.pImag*m.getpImag()));
        p.setpImag((this.pReal*m.getpImag())+(this.pImag*m.getpReal()));
        return p;
        
    }
    public String print(){
         String cad;
         if (this.pImag < 0) {
             cad = this.pReal + "  " + this.pImag + " i";
         } else {
             cad = this.pReal + " + " + this.pImag + " i";;
         }

         return cad;
    }
    @Override
    public String toString() {
        return "Complejo{" + "pReal=" + pReal + ", pImag=" + pImag + '}';
    }
    
    
    
    
    
}
