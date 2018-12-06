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
        this(original.getReal(),original.getImaginary());
    }
    public void setReal(double real){
        this.real=real;
    }
    public void setImaginary(double imaginair){
        this.imaginair=imaginair;
    }
    public double getReal(){
        return real;
    }
    public double getImaginary(){
        return imaginair;
    }
    public Complex add(Complex second){
        Complex result = new Complex();
        result.setReal(this.getReal()+second.getReal());
        result.setImaginary(this.getImaginary()+second.getImaginary());
        return result;
    }
    public Complex subtract(Complex second){
        Complex result = new Complex();
        result.setReal(this.getReal()-second.getReal());
        result.setImaginary(this.getImaginary()-second.getImaginary());
        return result;
    }
    public Complex multiply(Complex second){
        Complex result = new Complex();
        result.setReal(this.getReal()*second.getReal()-this.getImaginary()*second.getImaginary());
        result.setImaginary(this.getReal()*second.getImaginary()+this.getImaginary()*second.getReal());
        return result;
    } 
    public Complex divide(Complex second){
        Complex result = new Complex();
        result.setReal((this.getReal()*second.getReal()
            +this.getImaginary()*second.getImaginary())
            /(second.getReal()*second.getReal()
            +second.getImaginary()*second.getImaginary())
            );
        result.setImaginary((this.getImaginary()*second.getReal()-
            this.getReal()*second.getImaginary())
            /(second.getReal()*second.getReal()
            +second.getImaginary()*second.getImaginary()));
        return result;
    } 
    public Complex divide(double factor){
        Complex result = new Complex();
        result.setReal(this.getReal()/factor);
        result.setImaginary(this.getImaginary()/factor);
        return result;
    } 

    @Override
    public String toString(){
        if(this.getImaginary()<0){
            return "("+this.getReal()+" - "+Math.abs(this.getImaginary()) +"j)";
        }
        else{
            return "("+this.getReal()+" + "+this.getImaginary()+"j)";
        }
        
    }


    //privare
    private double real=0;
    private double imaginair=0;

    
}