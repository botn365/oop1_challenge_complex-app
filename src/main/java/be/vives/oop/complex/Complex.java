package be.vives.oop.complex;

/**
 * Complex
 */
public class Complex {
    public Complex(){
        this(0,0);
    }
    public Complex(double real,double imaginair) {
        this.setReal(real);
        this.setImaginary(imaginair);
    }
    public Complex(Complex original){
        this(original.getRael(),original.getImaginary());
    }
    public void setReal(double real){
        this.real=real;
    }
    public void setImaginary(double imaginair){
        this.imaginair=imaginair;
    }
    public double getRael(){
        return real;
    }
    public double getImaginary(){
        return imaginair;
    }
    public Complex add(Complex second){
        Complex result = new Complex();
        result.setImaginary(this.getImaginary());
        result.setReal(this.getRael());
        return result;
    }
    @Override
    public String toString(){
        return this.getRael()+" + "+this.getImaginary()+"i";
    }


    //privare
    private double real=0;
    private double imaginair=0;

    
}