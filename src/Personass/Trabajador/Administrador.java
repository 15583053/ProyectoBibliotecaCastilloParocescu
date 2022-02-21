package Personass.Trabajador;

import Material.AudioLibro;
import Personass.Cliente.Musico;
import Personass.Trabajador.Trabajador;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Administrador extends Trabajador {

    private static ArrayList<String> lBibliote = new ArrayList<String>();


    public Administrador(String nombre, String apellido, String dni, String email, int cTrabajador, String usuario, String contrasena) {
        super(nombre, apellido, dni, email, cTrabajador, usuario, contrasena);
    }

    public void CrearBibliotecario(){

        System.out.println("Introduce el numero de Bibliotecarios a introduir: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("Bienvenido al creador de bibliotecarios");
            System.out.println("Por favor introduce el nombre: ");
            String nombre = sc.nextLine();
            System.out.println("Por favor introduce el apellido: ");
            String apellido = sc.nextLine();
            System.out.println("Por favor introduzca el dni: ");
            String dni = sc.nextLine();
            System.out.println("Por favor introduzca el email: ");
            String email = sc.nextLine();
            System.out.println("Por favor introduzca el codigo del cliente: ");
            int cTrabajador = sc.nextInt();
            System.out.println("Por favor introduzca el usuario: ");
            String usuario = sc.nextLine();
            System.out.println("Por favor introduzca la contraseña : ");
            String contraseña = sc.nextLine();


            Object a1 = dni;
            System.out.println("El titulo es " + a1);
            a1 = new Bibliotecario(nombre, apellido, dni, email, cTrabajador, usuario, contraseña);
            String b1 = apellido + " " + dni + " " + cTrabajador;
            lBibliote.add(b1);
        }
    }

    public void buscarBibliotecarios(){
        System.out.println("Dime cualquier informacion que conozcas del libro(Apellido, DNI o Codigo de trabajador)");
        Scanner  scnew = new Scanner(System.in);
        String codigo = scnew.nextLine();
        for (int i = 0; i < lBibliote.size(); i++) {
            boolean Strcod = codigo.contains((CharSequence) lBibliote.get(i));
            if (Strcod = true){
                System.out.println(lBibliote.get(i));
                break;
            }
        }
    }


    public void eliminarBibliotecario(){
        System.out.println("Dime cualquier informacion que conozcas del Bibliotecario codigo trb");
        Scanner  scnew = new Scanner(System.in);
        String codigo = scnew.nextLine();
        for (int i = 0; i < lBibliote.size(); i++) {
            boolean Strcod = codigo.contains((CharSequence) lBibliote.get(i));
            if (Strcod = true){
                lBibliote.remove(i);
                break;
            }
        }
    }
    public static void mostrarBibliotecario(){
        Iterator iterator = lBibliote.iterator();
        while (iterator.hasNext()){
            Bibliotecario st=(Bibliotecario) iterator.next();
            System.out.println("El DNI de : " + st.getDni());


        }
    }



}