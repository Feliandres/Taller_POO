public class Byte_Short {

    private byte var_byte;
    private short var_short;

    public Byte_Short(byte var_byte, short var_short) {
        this.var_byte = var_byte;
        this.var_short = var_short;
    }

    public byte getVar_byte() {
        return var_byte;
    }

    public void setVar_byte(byte var_byte) {
        this.var_byte = var_byte;
    }

    public short getVar_short() {
        return var_short;
    }

    public void setVar_short(short var_short) {
        this.var_short = var_short;
    }

    //Metodos
    public void ConvertirByteShort (short var_short){
        this.var_short = (short)var_byte ;
    }

    @Override
    public String toString() {
    return "Valor de byte: "+var_byte+"\n"+
            "Valor de short: "+var_short;
    }
}
