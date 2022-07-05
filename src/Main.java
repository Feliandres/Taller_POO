import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;
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

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
            }



        }
        
    }
}
