import Material.Web;
import Personass.Cliente.Musico;
import Personass.Cliente.Privado;
import Personass.Trabajador.Administrador;
import Personass.Trabajador.Bibliotecario;


import java.util.Scanner;

public class main {


    public static void main(String[] args) {
        int ac1 = 0;
        int ac2 = 0;
        int ac3 = 0;
        int ac4 = 0;
        int ac5 = 0;
        int ac6 = 0;
        int oportvuel1 = 3;

        System.out.println("Bienvenido, que quieres hacer");
        Administrador a1 = new Administrador("GR", "Cast", "43589330y", "grecasveg@gmail.com", 5053, "admin", "admin");
        Bibliotecario b1 = new Bibliotecario("Flo", "Paro", "1212112z", "fparo@gmail.com", 5050, "bibl", "bibl");
        Web w1 = new Web("Flex", "CUB", 123123, "Avenida meridiana", 633470574);
        while (ac1 <= 20) {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Bienvenido, 1 para Admins, 2 para Bibliotecarios");
            int opor1 = sc1.nextInt();
            if (opor1 == 1) {


                Scanner sc2 = new Scanner(System.in);
                System.out.println("Dime el nombre de tu usuario de administrador");
                String ad1 = sc2.nextLine();
                if (ad1.equals("admin")) {
                    System.out.println("Dime la Psw de admin");
                    String psw1 = sc2.nextLine();
                    if (ad1.equals("admin")) {
                        System.out.println("Bienvenido admin");
                        ac3 = 0;
                        int intent2 = 3;
                        while (ac3 <= 20) {
                            System.out.println("Que quieres hacer?\n1) Crear Bibliotecario\n2)Mostrar Bibliotecarios\n3)Despedir un Bibliotecario\n4)Cerrar sesion");
                            int adb1 = sc2.nextInt();
                            if (adb1 == 1) {
                                System.out.println("1");
                                a1.CrearBibliotecario();
                            }
                            if (adb1 == 2) {
                                System.out.println("2");
                                Administrador.mostrarBibliotecario();
                            }
                            if (adb1 == 3) {
                                System.out.println("3");
                                a1.eliminarBibliotecario();
                            }
                            if (adb1 == 4) {
                                System.out.println("4");
                                break;
                            }
                            if (adb1 >= 5) {
                                intent2--;
                                System.out.println("No te he entendido, te quedan " + intent2 + " oportunidades o se cerrar el usuario.");
                                if (intent2 == 0) {
                                    ac3 = 21;
                                }


                            }


                        }


                    }
                }


            }
            if (opor1 == 2) {
                Scanner sc3 = new Scanner(System.in);
                System.out.println("Dime el nombre de tu usuario de Bibliotecario");
                String rb1 = sc3.nextLine();
                if (rb1.equals("Bibl")) {
                    System.out.println("Dime la Psw de admin");
                    String rb2 = sc3.nextLine();
                    if (rb2.equals("pasw")) {
                        System.out.println("Bienvenido trabajador");
                        Scanner sc5 = new Scanner(System.in);

                        ac4 = 0;
                        int intent3 = 3;
                        while (ac3 <= 20) {
                            System.out.println("Que quieres hacer\n1)Crear Vinillo\n2)Crear Libro\n3)Crear Usuario\n4)Alquilar\n5)Mostrar Usuarios\n6)Dar de baja libro\n7)Mostar usuarios\n8)Mostar usuarios\n9)Salir");
                            int adb2 = sc5.nextInt();
                            if (adb2 == 1) {
                                System.out.println("1");
                                b1.CrearVinilos();
                            }
                            if (adb2 == 2) {
                                System.out.println("2");
                                b1.CrearLibro();
                            }
                            if (adb2 == 3) {
                                System.out.println("3");
                                b1.CrearPrivado();
                            }
                            if (adb2 == 4) {
                                System.out.println("4");
                                Scanner sc1a = new Scanner(System.in);
                                System.out.println("El usuarios es Privado o Musico?");
                                String af1 = sc1a.nextLine();
                                if (af1 == "Privado"){
                                    System.out.println("Dime que usuario quiere alquilar un libro");
                                    Privado Privado1 = sc1a.nextLine();
                                    Privado priv1 = new Privado();
                                    Privado1.Alquilar();





                                }
                                if (af1 == "Musico"){
                                    System.out.println("Dime que usuario quiere alquilar un libro");



                                }else {System.out.println("No te he entendido");}




                            }
                            if (adb2 == 5) {
                                System.out.println("5");

                            }
                            if (adb2 == 6) {
                                System.out.println("5");
                            }
                            if (adb2 == 7) {
                                System.out.println("7");
                            }
                            if (adb2 == 7) {
                                System.out.println("8");

                            }
                            if (adb2 == 8) {
                                System.out.println("8");
                                break;
                            }
                            if (adb2 >= 9) {
                                intent3--;
                                System.out.println("No te he entendido, te quedan " + intent3 + " oportunidades o se cerrar el usuario.");
                                if (intent3 == 0) {
                                    ac3 = 21;
                                }


                            } else {

                                System.out.println("No te he entendido, prueba a poner algun numero");
                            }


                        }
                    }

                }
                if (opor1 == 3) {

                    Scanner sc4 = new Scanner(System.in);
                    System.out.println("Dime el nombre de tu usuario de Web");
                    String rw1 = sc4.nextLine();
                    if (rw1.equals("Bibl")) {
                        System.out.println("Dime la Psw de Web");
                        String rw2 = sc4.nextLine();
                        if (rw2.equals("pasw")) {
                            System.out.println("Bienvenido trabajador");
                            Scanner sc5 = new Scanner(System.in);

                            ac5 = 0;
                            int intent5 = 3;
                            while (ac5 <= 20) {

                            }


                        }
                        if (opor1 >= 4) {
                            oportvuel1--;
                            System.out.println("No te he entendido, te quedan " + oportvuel1 + " oportunidades o se cerrar el programa.");
                            if (oportvuel1 == 0) {
                                ac1 = 21;
                            }
                        } else {

                            System.out.println("No te he entendido, prueba a poner algun numero");
                        }


                    }

                }
            }
        }
    }
}