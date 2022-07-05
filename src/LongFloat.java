public class LongFloat {
    private long var_long;
    private float var_float;

    public LongFloat(long var_long, float var_float) {
        this.var_long = var_long;
        this.var_float = var_float;
    }

    public long getVar_long() {
        return var_long;
    }

    public void setVar_long(long var_long) {
        this.var_long = var_long;
    }

    public float getVar_float() {
        return var_float;
    }

    public void setVar_float(float var_float) {
        this.var_float = var_float;
    }

    public void TransformarLongFloat(int var_float){
        this.var_float = (float) var_long;
    }

    @Override
    public String toString() {
        return  "Pasar de long a float: "+"\n"+
                "Valor del float: "+var_float+"\n"+
                "Valor del long: "+var_long;
    }
}
