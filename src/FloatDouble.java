public class FloatDouble {
    private float var_float;
    private double var_double;

    public FloatDouble(float var_float, double var_double) {
        this.var_float = var_float;
        this.var_double = var_double;
    }

    public float getVar_float() {
        return var_float;
    }

    public void setVar_float(float var_float) {
        this.var_float = var_float;
    }

    public double getVar_double() {
        return var_double;
    }

    public void setVar_double(double var_double) {
        this.var_double = var_double;
    }

    public void TransformarFloatDouble (double var_double){
        this.var_double = (double) var_float;
    }

    @Override
    public String toString() {
        return  "Pasar de float a double: "+"\n"+
                "Valor del float: "+var_float+"\n"+
                "Valor del double: "+var_double;
    }
}
