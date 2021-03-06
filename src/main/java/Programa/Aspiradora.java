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
        int SeleccionUsuario, SeleccionAspirar, SeleccionFregar;
        int MCocina = 0, MSalon = 0, MBano = 0, MDormitorio1 = 0, MDormitorio2 = 0;
        double consumoAspirado = 1.5, consumoFregado = 2.25;
        int acumuladorBateria = 0;//Este acumulador se utiliza para calcular si la 
        //aspiradora tiene suficiente bateria para hacer las operaciones que se le piden
        String BateriaO, CocinaO, SalonO, BanoO, Dormitorio1O, Dormitorio2O;

        Date Fecha = new Date();
        //Con esto y con los imports Date se muestra la fecha en el estado general

        String IUsuario = JOptionPane.showInputDialog(null,
                "Introduzca su usuario (usuario)");
        if (USUARIO.equals(IUsuario)) {
            //ifelses con dowhile para que el usuario y la contraseña sean los correctos
        } else {
            do {
                IUsuario = JOptionPane.showInputDialog(null,
                        "Usuario incorrecto, introduzca un usuario valido");
            } while (IUsuario == null ? USUARIO != null : !IUsuario.equals(USUARIO));

        }
        String IContrasena = JOptionPane.showInputDialog(null,
                "Introduzca su contraseña (contraseña)");
        if (CONTRASENA.equals(IContrasena)) {

        } else {
            do {
                IContrasena = JOptionPane.showInputDialog(null,
                        "Contraseña incorrecta, introduzca la contraseña correcta");
            } while (IContrasena == null ? CONTRASENA != null : !IContrasena.equals(CONTRASENA));

        }
        do {
//Bucle dowhile para que el menú se repita todas las veces que el usuario desee

            String Menu = JOptionPane.showInputDialog(null, "Elige opción:\n"
                    + "1.- Configuración del Sistema (Empezar aqui)\n"
                    + "2.- Establecer carga actual\n"
                    + "3.- Aspirar\n"
                    + "4.- Aspirar y Fregar\n"
                    + "5.- Estado General\n"
                    + "6.- Buscar Base de Carga (Cargar al 100%)\n"
                    + "0.- Apagar");
            SeleccionUsuario = Integer.parseInt(Menu);

            switch (SeleccionUsuario) {

                case 1:
                    JOptionPane.showMessageDialog(null, "Se iniciara la configuracion del sistema\n"
                            + "(Una configuracion inapropiada podria resultar en un servicio no eficiente)");
                    String Cocina = JOptionPane.showInputDialog(null,
                            "Introduzca los Metros cuadrados de la cocina");
                    MCocina = Integer.parseInt(Cocina);
                    if (MCocina < 1) {
                        CocinaO = JOptionPane.showInputDialog(null, "El valor introducido no es correcto\n"
                                + "Recuerde que el valor tiene que ser Mayor que 0");
                        MCocina = Integer.parseInt(CocinaO);
                    }
                    String Salon = JOptionPane.showInputDialog(null,
                            "Introduzca los Metros cuadrados del salón");
                    MSalon = Integer.parseInt(Salon);
                    if (MSalon < 1) {
                        SalonO = JOptionPane.showInputDialog(null, "El valor introducido no es correcto\n"
                                + "Recuerde que el valor tiene que ser Mayor que 0");
                        MSalon = Integer.parseInt(SalonO);
                    }
                    String Baño = JOptionPane.showInputDialog(null,
                            "Introduzca los Metros cuadrados del baño");
                    MBano = Integer.parseInt(Baño);
                    if (MBano < 1) {
                        BanoO = JOptionPane.showInputDialog(null, "El valor introducido no es correcto\n"
                                + "Recuerde que el valor tiene que ser Mayor que 0");
                        MBano = Integer.parseInt(BanoO);
                    }
                    String Dormitorio1 = JOptionPane.showInputDialog(null,
                            "Introduzca los Metros cuadrados del dormitorio 1");
                    MDormitorio1 = Integer.parseInt(Dormitorio1);
                    if (MDormitorio1 < 1) {
                        Dormitorio1O = JOptionPane.showInputDialog(null, "El valor introducido no es correcto\n"
                                + "Recuerde que el valor tiene que ser Mayor que 0");
                        MDormitorio1 = Integer.parseInt(Dormitorio1O);
                    }
                    String Dormitorio2 = JOptionPane.showInputDialog(null,
                            "Introduzca los Metros cuadrados del dormitorio 2");
                    MDormitorio2 = Integer.parseInt(Dormitorio2);
                    if (MDormitorio2 < 1) {
                        Dormitorio2O = JOptionPane.showInputDialog(null, "El valor introducido no es correcto\n"
                                + "Recuerde que el valor tiene que ser Mayor que 0 o menor que 100");
                        MDormitorio2 = Integer.parseInt(Dormitorio2O);
                    }
                    BateriaO = JOptionPane.showInputDialog(null, "Escoja un porcentaje valido de bateria");
                    Bateria = Integer.parseInt(BateriaO);
                    if (Bateria < 1 | Bateria > 100) {
                        BateriaO = JOptionPane.showInputDialog(null, "El valor introducido no es correcto\n"
                                + "Recuerde que su valor tiene que ser Mayor que 0 y Menor 100");
                        Bateria = Integer.parseInt(BateriaO);
                    }

                    JOptionPane.showMessageDialog(null, "Esta es la configuracion actual:\n"
                            + "Cocina: " + MCocina + " Metros cuadrados\n"
                            + "Salón: " + MSalon + " Metros cuadrados\n"
                            + "Baño: " + MBano + " Metros cuadrados\n"
                            + "Dormitorio 1: " + MDormitorio1 + " Metros cuadrados\n"
                            + "Dormitorio 2: " + MDormitorio2 + " Metros cuadrados\n"
                            + "El nivel de bateria se ha establecido en un " + Bateria + "%");

                    break;
                case 2:

                    BateriaO = JOptionPane.showInputDialog(null, "Has escogido cambiar la bateria (Valor actual " + Bateria + "%)\n"
                            + "Escoja un porcentaje valido de bateria");
                    Bateria = Integer.parseInt(BateriaO);
                    if (Bateria < 1 | Bateria > 100) {
                        BateriaO = JOptionPane.showInputDialog(null, "El valor introducido no es correcto\n"
                                + "Recuerde que su valor tiene que ser Mayor que 0 y Menor 100");
                        Bateria = Integer.parseInt(BateriaO);
                    }
                    JOptionPane.showMessageDialog(null, "El nivel de bateria se ha establecido en un " + Bateria + "%");

                    break;
                case 3:

                    JOptionPane.showMessageDialog(null, "Se iniciara el Aspirado");
                    String Aspirado = JOptionPane.showInputDialog(null, "Elige un metodo de aspirado:\n"
                            + "1.- Aspirado completo\n"
                            + "2.- Aspirar zonas");

                    int seleccionAspirado = Integer.parseInt(Aspirado);
                    switch (seleccionAspirado) {

                        case 1:
                            JOptionPane.showMessageDialog(null, "Se iniciara un aspirado completo");
                            acumuladorBateria = Bateria;
                            acumuladorBateria -= (consumoAspirado * MCocina);
                            if (acumuladorBateria > 3) {
                                JOptionPane.showMessageDialog(null, "Limpiando cocina");
                                Bateria -= (consumoAspirado * MCocina);
                                acumuladorBateria -= (consumoAspirado * MSalon);
                                JOptionPane.showMessageDialog(null, "Cocina limpia");
                                if (acumuladorBateria > 3) {
                                    JOptionPane.showMessageDialog(null, "Limpiando Salon");
                                    acumuladorBateria -= (consumoAspirado * MBano);
                                    Bateria -= (consumoAspirado * MSalon);
                                    JOptionPane.showMessageDialog(null, "Salón limpio");
                                    if (acumuladorBateria > 3) {
                                        JOptionPane.showMessageDialog(null, "Limpiando Baño");
                                        acumuladorBateria -= (consumoAspirado * MDormitorio1);
                                        Bateria -= (consumoAspirado * MBano);
                                        JOptionPane.showMessageDialog(null, "Baño limpio");
                                        if (acumuladorBateria > 3) {
                                            JOptionPane.showMessageDialog(null, "Limpiando Dormitorio 1");
                                            acumuladorBateria -= (consumoAspirado * MDormitorio2);
                                            Bateria -= (consumoAspirado * MDormitorio2);
                                            JOptionPane.showMessageDialog(null, "Dormitorio 1 limpio");
                                            if (acumuladorBateria > 3) {
                                                JOptionPane.showMessageDialog(null, "Limpiando Dormitorio 2");
                                                Bateria -= (consumoAspirado * MDormitorio2);
                                                JOptionPane.showMessageDialog(null, "Todo limpio");
                                            } else {
                                                JOptionPane.showMessageDialog(null, "No se ha podido limpiar el Dormitorio 2 \n"
                                                        + " (Bateria baja)");
                                            }
                                        } else {
                                            JOptionPane.showMessageDialog(null, "No se ha podido limpiar el Dormitorio 1 y 2 \n"
                                                    + " (Bateria baja)");
                                        }

                                    } else {
                                        JOptionPane.showMessageDialog(null, "No he podido limpiar el baño ni las habitaciones 1 y 2 \n"
                                                + " (Bateria baja)");
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "No he podido limpiar el salon, el baño ni las habitaciones 1 y 2 \n"
                                            + " (Bateria baja)");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "No he podido limpiar nada \n"
                                        + " (Bateria baja)");
                            }
                            JOptionPane.showMessageDialog(null, "Volviendo al menú");
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null, "Se iniciara un aspirado por zonas\n"
                                    + "A continuacion seleccione que areas desea que sean limpiadas");
                            do {
                                String MenuAspirar = JOptionPane.showInputDialog(null, "Elige que aspirar (Bateria restante: " + Bateria + "%):\n"
                                        + "1.- Cocina " + MCocina + "m cuadrados\n"
                                        + "2.- Salón " + MSalon + "m cuadrados\n"
                                        + "3.- Baño: " + MBano + " Metros cuadrados\n"
                                        + "4.- Dormitorio 1 " + MDormitorio1 + "m cuadrados\n"
                                        + "5.- Dormitorio 2 " + MDormitorio2 + "m cuadrados\n"
                                        + "0.- Volver al menu"
                                );
                                SeleccionAspirar = Integer.parseInt(MenuAspirar);

                                switch (SeleccionAspirar) {
                                    case 1:
                                        acumuladorBateria = Bateria;
                                        acumuladorBateria -= (consumoAspirado * MCocina);
                                        if (acumuladorBateria < 3) {
                                            //Estos ifs actuan en el caso de que el 
                                            //acumulador no sea mayor de 3
                                            JOptionPane.showMessageDialog(null, "La aspiradora no tiene suficiente bateria asignada\n"
                                                    + "Asigna un valor optimo o enviala a la base de carga");
                                            break;
                                        }
                                        JOptionPane.showMessageDialog(null, "Limpiando Cocina");
                                        Bateria -= (consumoAspirado * MCocina);
                                        JOptionPane.showMessageDialog(null, "Cocina limpia");
                                        break;
                                    case 2:
                                        acumuladorBateria = Bateria;
                                        acumuladorBateria -= (consumoAspirado * MSalon);
                                        if (acumuladorBateria < 3) {
                                            JOptionPane.showMessageDialog(null, "La aspiradora no tiene suficiente bateria asignada\n"
                                                    + "Asigna un valor optimo o enviala a la base de carga");
                                            break;
                                        }
                                        JOptionPane.showMessageDialog(null, "Limpiando Salon");
                                        Bateria -= (consumoAspirado * MSalon);
                                        JOptionPane.showMessageDialog(null, "Salon limpio");
                                        break;
                                    case 3:
                                        acumuladorBateria = Bateria;
                                        acumuladorBateria -= (consumoAspirado * MBano);
                                        if (acumuladorBateria < 3) {
                                            JOptionPane.showMessageDialog(null, "La aspiradora no tiene suficiente bateria asignada\n"
                                                    + "Asigna un valor optimo o enviala a la base de carga");
                                            break;
                                        }
                                        JOptionPane.showMessageDialog(null, "Limpiando Baño");
                                        Bateria -= (consumoAspirado * MBano);
                                        JOptionPane.showMessageDialog(null, "Baño limpio");
                                        break;
                                    case 4:
                                        acumuladorBateria = Bateria;
                                        acumuladorBateria -= (consumoAspirado * MDormitorio1);
                                        if (acumuladorBateria < 3) {
                                            JOptionPane.showMessageDialog(null, "La aspiradora no tiene suficiente bateria asignada\n"
                                                    + "Asigna un valor optimo o enviala a la base de carga");
                                            break;
                                        }
                                        JOptionPane.showMessageDialog(null, "Limpiando Dormitorio 1");
                                        Bateria -= (consumoAspirado * MDormitorio1);
                                        JOptionPane.showMessageDialog(null, "Dormitorio 1 limpio");
                                        break;
                                    case 5:
                                        acumuladorBateria = Bateria;
                                        acumuladorBateria -= (consumoAspirado * MDormitorio2);
                                        if (acumuladorBateria < 3) {
                                            JOptionPane.showMessageDialog(null, "La aspiradora no tiene suficiente bateria asignada\n"
                                                    + "Asigna un valor optimo o enviala a la base de carga");
                                            break;
                                        }
                                        JOptionPane.showMessageDialog(null, "Limpiando Dormitorio 2");
                                        Bateria -= (consumoAspirado * MDormitorio2);
                                        JOptionPane.showMessageDialog(null, "Dormitorio 2 limpio");
                                        break;
                                    case 0:
                                        break;
                                    default:
                                        JOptionPane.showMessageDialog(null, "Opcion no valida");
                                }
                            } while (SeleccionAspirar != 0);
                            break;
                    }
                    break;
                case 4:

                    JOptionPane.showMessageDialog(null, "Se iniciara el Aspirado y Fregado");
                    String Fregado = JOptionPane.showInputDialog(null, "Elige un metodo de aspirado y fregado:\n"
                            + "1.- Aspirado y Fregado completo\n"
                            + "2.- Aspirar y Fregar zonas");

                    int seleccionFregado = Integer.parseInt(Fregado);
                    switch (seleccionFregado) {

                        case 1:
                            JOptionPane.showMessageDialog(null, "Se iniciara un aspirado y fregado completo ");
                            acumuladorBateria = Bateria;
                            acumuladorBateria -= (consumoFregado * MCocina);
                            //Varios ifelse que actuan como limitador para la bateria
                            //usando un acumulador
                            if (acumuladorBateria > 3) {
                                JOptionPane.showMessageDialog(null, "Fregando cocina");
                                Bateria -= (consumoFregado * MCocina);
                                acumuladorBateria -= (consumoFregado * MSalon);
                                if (acumuladorBateria > 3) {
                                    JOptionPane.showMessageDialog(null, "Fregando Salon");
                                    acumuladorBateria -= (consumoFregado * MBano);
                                    Bateria -= (consumoFregado * MSalon);
                                    if (acumuladorBateria > 3) {
                                        JOptionPane.showMessageDialog(null, "Fregando Baño");
                                        acumuladorBateria -= (consumoFregado * MDormitorio1);
                                        Bateria -= (consumoFregado * MBano);
                                        if (acumuladorBateria > 3) {
                                            JOptionPane.showMessageDialog(null, "Fregando Dormitorio 1");
                                            acumuladorBateria -= (consumoFregado * MDormitorio2);
                                            Bateria -= (consumoFregado * MDormitorio1);
                                            if (acumuladorBateria > 3) {
                                                JOptionPane.showMessageDialog(null, "Fregando Dormitorio 2");
                                                Bateria -= (consumoFregado * MDormitorio2);
                                            } else {
                                                JOptionPane.showMessageDialog(null, "No se ha podido fregar el Dormitorio 2 \n"
                                                        + " (Bateria baja)");
                                            }
                                        } else {
                                            JOptionPane.showMessageDialog(null, "No se ha podido fregar el Dormitorio 1 y 2 \n"
                                                    + " (Bateria baja)");
                                        }

                                    } else {
                                        JOptionPane.showMessageDialog(null, "No he podido fregar el baño ni las habitaciones 1 y 2 \n"
                                                + " (Bateria baja)");
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "No he podido fregar el salon, el baño ni las habitaciones 1 y 2 \n"
                                            + " (Bateria baja)");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "No he podido fregar nada \n"
                                        + " (Bateria demasiado baja)");
                            }
                            JOptionPane.showMessageDialog(null, "Volviendo al menú");

                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null, "Se iniciara un aspirado y fregado por zonas\n"
                                    + "A continuacion seleccione que areas desea que sean limpiadas");
                            do {
                                String MenuFregar = JOptionPane.showInputDialog(null, "Elige que aspirar y fregar"
                                        + " (Bateria restante: " + Bateria + "%):\n"
                                        + "1.- Cocina " + MCocina + "m cuadrados\n"
                                        + "2.- Salón " + MSalon + "m cuadrados\n"
                                        + "3.- Baño: " + MBano + " Metros cuadrados\n"
                                        + "4.- Dormitorio 1 " + MDormitorio1 + "m cuadrados\n"
                                        + "5.- Dormitorio 2 " + MDormitorio2 + "m cuadrados\n"
                                        + "0.- Volver al menu"
                                );
                                SeleccionFregar = Integer.parseInt(MenuFregar);
                                switch (SeleccionFregar) {
                                    case 1:
                                        acumuladorBateria = Bateria;
                                        acumuladorBateria -= (consumoFregado * MCocina);
                                        if (acumuladorBateria < 3) {
                                            JOptionPane.showMessageDialog(null, "La aspiradora no tiene suficiente bateria asignada\n"
                                                    + "Asigna un valor optimo o enviala a la base de carga");
                                            break;
                                        }
                                        JOptionPane.showMessageDialog(null, "Limpiando Cocina");
                                        Bateria -= (consumoFregado * MCocina);
                                        JOptionPane.showMessageDialog(null, "Cocina limpia");
                                        break;
                                    case 2:
                                        acumuladorBateria = Bateria;
                                        acumuladorBateria -= (consumoFregado * MSalon);
                                        if (acumuladorBateria < 3) {
                                            JOptionPane.showMessageDialog(null, "La aspiradora no tiene suficiente bateria asignada\n"
                                                    + "Asigna un valor optimo o enviala a la base de carga");
                                            break;
                                        }
                                        JOptionPane.showMessageDialog(null, "Limpiando Salon");
                                        Bateria -= (consumoFregado * MSalon);
                                        JOptionPane.showMessageDialog(null, "Salon limpio");
                                        break;
                                    case 3:
                                        acumuladorBateria = Bateria;
                                        acumuladorBateria -= (consumoFregado * MBano);
                                        if (acumuladorBateria < 3) {
                                            JOptionPane.showMessageDialog(null, "La aspiradora no tiene suficiente bateria asignada\n"
                                                    + "Asigna un valor optimo o enviala a la base de carga");
                                            break;
                                        }
                                        JOptionPane.showMessageDialog(null, "Limpiando Baño");
                                        Bateria -= (consumoFregado * MBano);
                                        JOptionPane.showMessageDialog(null, "Baño limpio");
                                        break;
                                    case 4:
                                        acumuladorBateria = Bateria;
                                        acumuladorBateria -= (consumoFregado * MDormitorio1);
                                        if (acumuladorBateria < 3) {
                                            JOptionPane.showMessageDialog(null, "La aspiradora no tiene suficiente bateria asignada\n"
                                                    + "Asigna un valor optimo o enviala a la base de carga");
                                            break;
                                        }
                                        JOptionPane.showMessageDialog(null, "Limpiando Dormitorio 1");
                                        Bateria -= (consumoFregado * MDormitorio1);
                                        JOptionPane.showMessageDialog(null, "Dormitorio 1 limpio");
                                        break;
                                    case 5:
                                        acumuladorBateria = Bateria;
                                        acumuladorBateria -= (consumoFregado * MDormitorio2);
                                        if (acumuladorBateria < 3) {
                                            JOptionPane.showMessageDialog(null, "La aspiradora no tiene suficiente bateria asignada\n"
                                                    + "Asigna un valor optimo o enviala a la base de carga");
                                            break;
                                        }
                                        JOptionPane.showMessageDialog(null, "Limpiando Dormitorio 2");
                                        Bateria -= (consumoFregado * MDormitorio2);
                                        JOptionPane.showMessageDialog(null, "Dormitorio 2 limpio");
                                        break;
                                    case 0:
                                        break;
                                    default:
                                        JOptionPane.showMessageDialog(null, "Opcion no valida");
                                }
                            } while (SeleccionFregar != 0);
                            break;
                    }
                    break;

                case 5:
                    DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
                    JOptionPane.showMessageDialog(null, "Hora y fecha: " + hourdateFormat.format(Fecha) + "\n"
                            + "Bateria establecida: " + Bateria + "%\n");
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "La Aspiradora esta de camino a su base de carga");
                    JOptionPane.showMessageDialog(null, "Cargando...");
                    Bateria = 100;
                    JOptionPane.showMessageDialog(null, "La bateria se ha cargado al 100%");
                    break;

                case 0:
                    JOptionPane.showMessageDialog(null, "Apagando");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
            }

        } while (SeleccionUsuario != 0);
        //Si el usuario introduce un 0 se ejecuta el case 0 y sale del bucle dowhile

    }
}
