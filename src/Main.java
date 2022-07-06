import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Mostrar un dialogo
        JOptionPane.showMessageDialog(null,"Bienvenidos");
        //Menú de transformaciones
        int opc = 1;
        while (opc!=6){
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, "Menú de transformaciones:\n1. De byte a short\n2. De short a int\n3. De int a long\n4. De long a float\n5. De float a double\n6. Salir","Calculando",JOptionPane.QUESTION_MESSAGE));

            switch (opc){
                case 1:
                    short num_short = 0;
                    byte num_byte = Byte.parseByte(JOptionPane.showInputDialog(null, "Ingresa el tipo de dato byte:","De byte a short",JOptionPane.QUESTION_MESSAGE));
                    Byte_Short byteToShort = new Byte_Short(num_byte, num_short);
                    byteToShort.ConvertirByteShort(num_short);
                    JOptionPane.showMessageDialog(null,byteToShort.toString(),"Mostrando byte a short",JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    int num_int = 0;
                    short num_short1 = Byte.parseByte(JOptionPane.showInputDialog(null, "Ingresa el tipo de dato short:","De short a int",JOptionPane.QUESTION_MESSAGE));
                    ShortInt shortToInt = new ShortInt(num_short1, num_int);
                    shortToInt.TransformarShortInt(num_int);
                    JOptionPane.showMessageDialog(null,shortToInt.toString(),"Mostrando short a int",JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 3:
                    long num_long = 0;
                    int num_int1 = Byte.parseByte(JOptionPane.showInputDialog(null, "Ingresa el tipo de dato entero:","De int a long",JOptionPane.QUESTION_MESSAGE));
                    EnteroLong intToLong = new EnteroLong(num_int1, num_long);
                    intToLong.ConvertirEnteroLong(num_long);
                    JOptionPane.showMessageDialog(null,intToLong.toString(),"Mostrando int a long",JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 4:
                    float num_float = 0;
                    long num_long1 = Byte.parseByte(JOptionPane.showInputDialog(null, "Ingresa el tipo de dato long:","De long a float",JOptionPane.QUESTION_MESSAGE));
                    LongFloat longToFloat = new LongFloat(num_long1, num_float);
                    longToFloat.TransformarLongFloat(num_float);
                    JOptionPane.showMessageDialog(null,longToFloat.toString(),"Mostrando long a float",JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 5:
                    double num_double = 0;
                    float num_float1 = Byte.parseByte(JOptionPane.showInputDialog(null, "Ingresa el tipo de dato float:","De float a double",JOptionPane.QUESTION_MESSAGE));
                    FloatDouble floatToDouble = new FloatDouble(num_float1, num_double);
                    floatToDouble.TransformarFloatDouble(num_double);
                    JOptionPane.showMessageDialog(null,floatToDouble.toString(),"Mostrando float a double",JOptionPane.INFORMATION_MESSAGE);
                    break;
            }



        }

    }
}
