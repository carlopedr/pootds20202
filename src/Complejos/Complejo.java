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
    
    public Complejo suma(Complejo s1,Complejo s2){
        Complejo r=new Complejo();
        r.setpReal(s1.getpReal()+s2.getpReal());
        r.setpImag(s1.getpImag()+s2.getpImag());
        return r;
    }

    @Override
    public String toString() {
        return "Complejo{" + "pReal=" + pReal + ", pImag=" + pImag + '}';
    }
    
    
    
    
    
}
