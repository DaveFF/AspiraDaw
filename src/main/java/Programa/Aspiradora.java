package Programa;

import javax.swing.JOptionPane;

public class Aspiradora {

    public static void main(String[] args) {
        
        int Bateria;
        int SeleccionUsuario;
        String IPIN = JOptionPane.showInputDialog(null,
                "Introduzca su PIN de seguridad para la AspiradoraDaw");
        int PIN = Integer.parseInt(IPIN);
        //PIN=1234
        while (PIN != 1234) {
            String FalloPIN = JOptionPane.showInputDialog(null,
                    "El PIN introducido no es correcto, intentelo otra vez");
            PIN = Integer.parseInt(FalloPIN);

        }
        do {            
            
        
        String Menu = JOptionPane.showInputDialog(null, "Elige opción:\n"
                + "1.- Configuración del Sistema\n"
                + "2.- Cargar\n"
                + "3.- Aspirar\n"
                + "4.- Aspirar y Fregar\n"
                + "5.- Estado General\n"
                + "6.- Buscar Base de Carga\n"
                + "0.- Apagar");
        SeleccionUsuario = Integer.parseInt(Menu);

        switch (SeleccionUsuario) {

            case 1:

            case 2:
                String BateriaO = JOptionPane.showInputDialog(null, "Has escogido cambiar la bateria\n"
                        + "Escoga un porcentaje valido de bateria");
                Bateria = Integer.parseInt(BateriaO);
                if (Bateria < 1 | Bateria > 100) {
                    BateriaO = JOptionPane.showInputDialog(null, "El valor introducido no es correcto\n"
                            + "Recuerde que su valor tiene que ser Mayor que 0 y Menor 100");
                    Bateria = Integer.parseInt(BateriaO);
                }
                JOptionPane.showMessageDialog(null, "El nivel de bateria se ha establecido en un " + Bateria + "%");
                

                break;
            case 3:

            case 4:

            case 5:

            case 6:

            case 0:
                JOptionPane.showMessageDialog(null, "Apagando");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion no valida");
                } 
        
        }while (SeleccionUsuario!=0);

    }
}
