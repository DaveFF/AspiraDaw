package Programa;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Aspiradora {

    public static void main(String[] args) {

        final String USUARIO = "usuario";
        final String CONTRASENA = "contraseña";
        int Bateria = 0;
        int SeleccionUsuario;
        int MCocina, MSalon, MBaño, MDormitorio1, MDormitorio2;
        boolean Configurado = false;
        boolean Cargado = false;

        Date Fecha = new Date();

        String IUsuario = JOptionPane.showInputDialog(null,
                "Introduzca su usuario");
        if (USUARIO.equals(IUsuario)) {

        } else {
            do {
                IUsuario = JOptionPane.showInputDialog(null,
                        "Usuario incorrecto, introduzca un usuario valido");
            } while (IUsuario == null ? USUARIO != null : !IUsuario.equals(USUARIO));

        }
        String IContrasena = JOptionPane.showInputDialog(null,
                "Introduzca su contraseña");
        if (CONTRASENA.equals(IContrasena)) {

        } else {
            do {
                IContrasena = JOptionPane.showInputDialog(null,
                        "Contraseña incorrecta, introduzca la contraseña correcta");
            } while (IContrasena == null ? CONTRASENA != null : !IContrasena.equals(CONTRASENA));

        }

        do {

            String Menu = JOptionPane.showInputDialog(null, "Elige opción:\n"
                    + "1.- Configuración del Sistema\n"
                    + "2.- Establecer carga actual\n"
                    + "3.- Aspirar\n"
                    + "4.- Aspirar y Fregar\n"
                    + "5.- Estado General\n"
                    + "6.- Buscar Base de Carga (Cargar al 100%)\n"
                    + "0.- Apagar");
            SeleccionUsuario = Integer.parseInt(Menu);

            switch (SeleccionUsuario) {

                case 1:
                    JOptionPane.showMessageDialog(null, "Se iniciara la configuracion del sistema");
                    String Cocina = JOptionPane.showInputDialog(null,
                            "Introduzca los Metros cuadrados de la cocina");
                    MCocina = Integer.parseInt(Cocina);
                    String Salon = JOptionPane.showInputDialog(null,
                            "Introduzca los Metros cuadrados del salón");
                    MSalon = Integer.parseInt(Salon);
                    String Baño = JOptionPane.showInputDialog(null,
                            "Introduzca los Metros cuadrados del baño");
                    MBaño = Integer.parseInt(Baño);
                    String Dormitorio1 = JOptionPane.showInputDialog(null,
                            "Introduzca los Metros cuadrados del dormitorio 1");
                    MDormitorio1 = Integer.parseInt(Dormitorio1);
                    String Dormitorio2 = JOptionPane.showInputDialog(null,
                            "Introduzca los Metros cuadrados del dormitorio 2");
                    MDormitorio2 = Integer.parseInt(Dormitorio2);

                    JOptionPane.showMessageDialog(null, "Esta es la configuracion actual:\n"
                            + "Cocina: " + MCocina + " Metros cuadrados\n"
                            + "Salón: " + MSalon + " Metros cuadrados\n"
                            + "Baño: " + MBaño + " Metros cuadrados\n"
                            + "Dormitorio 1: " + MDormitorio1 + " Metros cuadrados\n"
                            + "Dormitorio 2: " + MDormitorio2 + " Metros cuadrados\n");

                    Configurado = true;
                    break;
                case 2:
                    if (Cargado = true) {
                        JOptionPane.showMessageDialog(null, "Ya has cargado la bateria y no se requiere introducir los valores otra vez"
                                + "(Bateria al " + Bateria + "%)");
                        break;

                    }
                    String BateriaO = JOptionPane.showInputDialog(null, "Has escogido cambiar la bateria (Valor actual " + Bateria + "%)\n"
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

                    if (Configurado = false) {
                        JOptionPane.showMessageDialog(null, "No ha establecido una cofiguracion inicial\n"
                                + "Configure el sistema antes de iniciar una operación");
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Se iniciara el Aspirado");
//                        ASPIRACIÓN.Modo completo
//                        . En este modo
//                        , la aspiradora limpia el piso entero
//                        . El robot va  limpiando habitaciones en función de su batería
//                        . Si al entrar en una habitación no le llega la batería para poder completarla entonces la aspiradora se para e informa al usuario que no puede terminar y también informa de las dependencias que ha podido limpiar.Modo dependencias
//                        . Sólo limpia las habitaciones que se le indiquen, si tiene batería
//                        .
//                      En ambos modos
//                        , cada metro cuadrado de limpieza agota un 1,5% de batería
//                        . Cada vez que se limpia una habitación se actualiza el estado de la batería,
//                                para controlar si puede limpiar la siguiente habitación.En ningún caso
//                        , si está limpiando la casa o una dependencia, el nivel de batería no puede ser inferior al 3%, para que el robot tenga autonomía y pueda
//                        volver a su base de carga
                    
                

                        
                        
                    }
                case 4:
                    if (Configurado = false) {
                        JOptionPane.showMessageDialog(null, "No ha establecido una cofiguracion inicial\n"
                                + "Configure el sistema antes de iniciar una operación");
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Se iniciara el Aspirado y Fregado");

                    }

                case 5:
                    JOptionPane.showMessageDialog(null, "Se mostrara la informacion del dispositivo");
                    DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
                    JOptionPane.showMessageDialog(null, "Hora y fecha: " + hourdateFormat.format(Fecha) + "\n"
                            + "Bateria establecida: " + Bateria + "%\n");
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "La Aspiradora esta de camino a su base de carga");
                    JOptionPane.showMessageDialog(null, "Cargando...");
                    Bateria = 100;
                    JOptionPane.showMessageDialog(null, "La bateria se ha cargado al 100%");
                    Cargado = true;
                    break;

                case 0:
                    JOptionPane.showMessageDialog(null, "Apagando");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
            }

        } while (SeleccionUsuario != 0);

    }
}
