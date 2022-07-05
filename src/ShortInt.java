public class ShortInt {
    private short short1;
    private int entero;

    public ShortInt(short short1, int entero) {
        this.short1 = short1;
        this.entero = entero;
    }

    public short getShort1() {
        return short1;
    }

    public void setShort1(short short1) {
        this.short1 = short1;
    }

    public int getEntero() {
        return entero;
    }

    public void setEntero(int entero) {
        this.entero = entero;
    }

    public void TransformarShort (int entero){
        this.entero = (int) short1;
    }

    @Override
    public String toString() {
        return "Valor del short: "+short1+"\n"+
                "Valor del entero: "+entero;
    }

}
