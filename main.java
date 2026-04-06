import java.util.*;
import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {

        int edad;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa la edad");
        edad = Integer.parseInt(JOptionPane.showInputDialog("ingrese a edad"));

        if (edad <18){
            JOptionPane.showMessageDialog(null, "es mayor de edad");

        }else{
            JOptionPane.showMessageDialog(null, "es menor de edad");
        }

       

    }
}