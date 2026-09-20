import model.Tienda;

import javax.swing.*;
import java.lang.classfile.constantpool.InterfaceMethodRefEntry;

public class Main {

    public static void main (String[]args){

        Tienda tienda= new Tienda ("Inversiones Abelardo","cuando el quiera abrir","carrera 20", 69, 34161625, 10027  );


        int opcion=0;

        while(opcion!=6) {

            int opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null, """
                    
                    MENU
                    
                    1. Clientes
                    2. Productos
                    3. pedidos"""));

            switch (opcion2) {

                case 1:

                    Integer.parseInt(JOptionPane.showInputDialog("""
                            Elija una de estas opciones:
                            1. Registrar Cliente
                            2. Mostrar datos del cliente
                            3. Actualixar Cliente
                            4. eliminar clientes 
                            """));
                    break;

                case 2:

                    opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                            Elija una de estas opciones:
                            1. Registrar producto
                            2. Mostrar datos producto
                            3. Actualixar Porducto
                            4. eliminar producto

                            """));
                break;
            }
        }
    }
}
