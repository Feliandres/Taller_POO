import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Mostrar un dialogo
        JOptionPane.showMessageDialog(null,"Bienvenidos");
        // Pedir datos a travez de una interfaz grafica
        JOptionPane.showInputDialog(null, "Introduzca un dato: ");
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el primer numero: ","Sumando",JOptionPane.QUESTION_MESSAGE));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el segundo numero: ","Sumando",JOptionPane.QUESTION_MESSAGE));
        int total = numero1 + numero2;
        JOptionPane.showMessageDialog(null,"El resultado es: "+total,"Sumando",JOptionPane.INFORMATION_MESSAGE);
    }
}
