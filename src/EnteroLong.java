public class EnteroLong {
    private int var_entero;
    private long var_long;

    public EnteroLong(int var_entero, long var_long) {
        this.var_entero = var_entero;
        this.var_long = var_long;
    }

    public int getVar_entero() {
        return var_entero;
    }

    public void setVar_entero(int var_entero) {
        this.var_entero = var_entero;
    }

    public long getVar_long() {
        return var_long;
    }

    public void setVar_long(long var_long) {
        this.var_long = var_long;
    }

    public void ConvertirEnteroLong (long var_long){
        this.var_long = (long)var_entero ;
    }

    @Override
    public String toString() {
        return  "Pasar de entero a long: "+"\n"+
                "Valor de byte: "+var_entero+"\n"+
                "Valor de short: "+var_long;
    }
}
