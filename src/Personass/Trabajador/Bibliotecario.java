package Personass.Trabajador;

import Material.AudioLibro;
import Material.Libro;
import Material.Vinilo;
import Personass.Cliente.Cliente;
import Personass.Cliente.Musico;
import Personass.Cliente.Privado;
import Personass.Trabajador.Trabajador;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Bibliotecario extends Trabajador {


    private static ArrayList<String> vinilos = new ArrayList<String>();
    private static ArrayList<String> libros = new ArrayList<String>();
    private static ArrayList<String> cmusico = new ArrayList<String>();
    private static ArrayList<String> cprivado = new ArrayList<String>();

    public Bibliotecario(String nombre, String apellido, String dni, String email, int cTrabajador, String usuario, String contrasena) {
        super(nombre, apellido, dni, email, cTrabajador, usuario, contrasena);
    }

    public static void CrerPrivadopred(){
        Privado ppred1 = new Privado("llamazares","higueras","435212","@llama",1);
        Privado ppred2 = new Privado("pol","bove","576234","@polet",2);
        String n2 = "llamazares " + "higueras " + 1;
        String n3 = "pol " + "bove " + 2;
        cprivado.add(n2);
        cprivado.add(n3);
    }
    public static void CrerMusicopred(){
        Musico mpred1 = new Musico("fito","fitipaldi","98362","@fito",3);
        Musico mpred2 = new Musico("melendi","perez","763454","@melendi",4);
        String u2 = "fito " + "fitipaldi " + 3;
        String u3 = "melendi " + "perez " + 4;
        cmusico.add(u2);
        cmusico.add(u3);
    }




    public void CrearPrivado(){

        System.out.println("Introduce el numero de clientes privados a introduir: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("Bienvenido al creador de clientes privados");
            System.out.println("Por favor introduce el nombre: ");
            String nombre = sc.nextLine();
            System.out.println("Por favor introduce el apellido: ");
            String apellido = sc.nextLine();
            System.out.println("Por favor introduzca el dni: ");
            String dni = sc.nextLine();
            System.out.println("Por favor introduzca el email : ");
            String email = sc.nextLine();
            System.out.println("Por favor introduzca el codigo del cliente: ");
            int cCliente = sc.nextInt();


            Object p1 = dni;
            System.out.println("El titulo es " + p1);
            p1 = new Privado(nombre, apellido, dni, email, cCliente);
            String n1 = apellido + " " + dni + " " + cCliente;
            cprivado.add(n1);
        }
    }

    public void buscarprivados(){
        System.out.println("Dime cualquier informacion que conozcas del privado(Apellido, DNI o Codigo de trabajador)");
        Scanner  scnew = new Scanner(System.in);
        String codigo = scnew.nextLine();
        for (int i = 0; i < cprivado.size(); i++) {
            boolean Strcod = codigo.contains((CharSequence) cprivado.get(i));
            if (Strcod = true){
                System.out.println(cprivado.get(i));
                break;
            }
        }
    }


    public void eliminarprivados(){
        System.out.println("Dime cualquier informacion que conozcas del privado codigo trb");
        Scanner  scnew = new Scanner(System.in);
        String codigo = scnew.nextLine();
        for (int i = 0; i < cprivado.size(); i++) {
            boolean Strcod = codigo.contains((CharSequence) cprivado.get(i));
            if (Strcod = true){
                cprivado.remove(i);
                break;
            }
        }
    }
    public static void mostrarprivados(){
        Iterator iterator = cprivado.iterator();
        while (iterator.hasNext()){
            Privado st=(Privado) iterator.next();
            System.out.println("El DNI de : " + st.getDni());


        }
    }


    public void CrearMusico(){

        System.out.println("Introduce el numero de clientes privados a introduir: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("Bienvenido al creador de clientes musicos");
            System.out.println("Por favor introduce el nombre: ");
            String nombre = sc.nextLine();
            System.out.println("Por favor introduce el apellido: ");
            String apellido = sc.nextLine();
            System.out.println("Por favor introduzca el dni: ");
            String dni = sc.nextLine();
            System.out.println("Por favor introduzca el email : ");
            String email = sc.nextLine();
            System.out.println("Por favor introduzca el codigo del cliente: ");
            int cCliente = sc.nextInt();


            Object m1 = dni;
            System.out.println("El titulo es " + m1);
            m1 = new Musico(nombre, apellido, dni, email, cCliente);
            String u1 = apellido + " " + dni + " " + cCliente;
            cprivado.add(u1);
        }
    }

    public void buscarmusico(){
        System.out.println("Dime cualquier informacion que conozcas del musico(Apellido, DNI o Codigo de cliente)");
        Scanner  scnew = new Scanner(System.in);
        String codigo = scnew.nextLine();
        for (int i = 0; i < cmusico.size(); i++) {
            boolean Strcod = codigo.contains((CharSequence) cmusico.get(i));
            if (Strcod = true){
                System.out.println(cmusico.get(i));
                break;
            }
        }
    }


    public void eliminarmusico(){
        System.out.println("Dime cualquier informacion que conozcas del musico ");
        Scanner  scnew = new Scanner(System.in);
        String codigo = scnew.nextLine();
        for (int i = 0; i < cmusico.size(); i++) {
            boolean Strcod = codigo.contains((CharSequence) cmusico.get(i));
            if (Strcod = true){
                cmusico.remove(i);
                break;
            }
        }
    }
    public static void mostrarmusico(){
        Iterator iterator = cmusico.iterator();
        while (iterator.hasNext()){
            Musico st=(Musico) iterator.next();
            System.out.println("El DNI de : " + st.getDni());


        }
    }

    public void CrearLibro(){
        //objetos a introducir
        System.out.println("Introduce el numero de libros a introduir: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            Scanner sc1 = new Scanner(System.in);
            //lectura de datos
            System.out.println("Bienvenido al creador de Libros");
            System.out.println("Por favor introduce el titulo: ");
            String titulo = sc1.nextLine();
            System.out.println("Por favor introduce el código: ");
            String codigo = sc1.nextLine();
            System.out.println("Por favor introduzca el autor: ");
            String Autor = sc1.nextLine();
            System.out.println("Por favor introduzca la cantidad: ");
            int cantidad = sc1.nextInt();
            System.out.println("Por favor introduzca la Impresion: ");
            int dImpresio = sc1.nextInt();
            System.out.println("Por favor introduzca la duracion: ");
            int Paginas = sc1.nextInt();

            Object l1 = codigo;
            System.out.println("El titulo es " + l1);
            l1 = new Libro(titulo, codigo, Autor, cantidad, dImpresio, Paginas);
            String t1 = titulo + " " + codigo + " " + Autor;
            libros.add(t1);
        }
    }



    public void buscarlibroCodigo(){
        System.out.println("Dime cualquier informacion que conozcas del libro(Autor, Titulo o Codigo)");
        Scanner  scnew = new Scanner(System.in);
        String codigo = scnew.nextLine();
        for (int i = 0; i < libros.size(); i++) {
            boolean Strcod = codigo.contains((CharSequence) libros.get(i));
            if (Strcod = true){
                System.out.println(libros.get(i));
                break;
            }
        }
    }



    public void eliminarlibro(){
        System.out.println("Dime cualquier informacion que conozcas del libro(Autor, Titulo o Codigo)");
        Scanner  scnew = new Scanner(System.in);
        String codigo = scnew.nextLine();
        for (int i = 0; i < libros.size(); i++) {
            boolean Strcod = codigo.contains((CharSequence) libros.get(i));
            if (Strcod = true){
                libros.remove(i);
                break;
            }
        }
    }
    public static void mostrarlibros() {
        Iterator iterator = libros.iterator();
        while (iterator.hasNext()) {
            Libro st = (Libro) iterator.next();
            System.out.println("El titulo es : " + st.getTitulo());

        }
        }


        public void CrearVinilos () {
            //objetos a introducir
            System.out.println("Introduce el numero de vinilos a introduir: ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();


            for (int i = 0; i < n; i++) {
                Scanner sc1 = new Scanner(System.in);
                //lectura de datos
                System.out.println("Bienvenido al creador de vinilos");
                System.out.println("Por favor introduce el titulo: ");
                String titulo = sc1.nextLine();
                System.out.println("Por favor introduce el código: ");
                String codigo = sc1.nextLine();
                System.out.println("Por favor introduzca el autor: ");
                String Autor = sc1.nextLine();
                System.out.println("Por favor introduzca la cantidad: ");
                int cantidad = sc1.nextInt();
                System.out.println("Por favor introduzca el tipo de musica: ");
                String tipo = sc1.nextLine();

                Object v1 = codigo;
                System.out.println("El titulo es " + v1);
                v1 = new Vinilo(titulo, codigo, Autor, cantidad, tipo);
                String z1 = titulo + " " + codigo + " " + Autor;
                vinilos.add(z1);
            }
        }




        public void buscarviniloCodigo(){
            System.out.println("Dime cualquier informacion que conozcas del vinilo(Autor, Titulo o Codigo)");
            Scanner scnew = new Scanner(System.in);
            String codigo1 = scnew.nextLine();
            for (int i = 0; i < vinilos.size(); i++) {
                boolean Strcod1 = codigo1.contains((CharSequence) vinilos.get(i));
                if (Strcod1 = true) {
                    System.out.println(vinilos.get(i));
                    break;
                }
            }
        }


        public void eliminarvinilo(){
            System.out.println("Dime cualquier informacion que conozcas del libro(Autor, Titulo o Codigo)");
            Scanner scnew = new Scanner(System.in);
            String codigo1 = scnew.nextLine();
            for (int i = 0; i < vinilos.size(); i++) {
                boolean Strcod1 = codigo1.contains((CharSequence) vinilos.get(i));
                if (Strcod1 = true) {
                    vinilos.remove(i);
                    break;
                }
            }
        }
        public static void mostrarvinilos(){
            Iterator iterator2 = vinilos.iterator();
            while (iterator2.hasNext()) {
                Vinilo st = (Vinilo) iterator2.next();
                System.out.println("El titulo es : " + st.getTitulo());


            }
        }
    }
