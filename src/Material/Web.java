package Material;
import Material.AudioLibro;
import Material.Libro;

import java.util.*;


public class Web {
    private String NombreWeb;
    private String nEmpresa;
    private int IdWeb;
    private String Domicilio;
    private int telefono;
    private static ArrayList<String> lAudio = new ArrayList<String>();
    private Object lAudio1;


    public Web(){
    super();
    }

    public Web(String nombreWeb, String nEmpresa, int idWeb, String domicilio, int telefono) {
        this.NombreWeb = nombreWeb;
        this.nEmpresa = nEmpresa;
        this.IdWeb = idWeb;
        this.Domicilio = domicilio;
        this.telefono = telefono;


    }


    public void CrearAlibro(){
        //objetos a introducir
        System.out.println("Introduce el numero de coches a introduir: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //creacion del array de passwords i de boleanos
        AudioLibro[] laudio = new AudioLibro[n];

        for (int i = 0; i < n; i++) {
            Scanner sc1 = new Scanner(System.in);
            //lectura de datos
            System.out.println ("Bienvenido al creador de AudioLibros");
            System.out.println ("Por favor introduce el titulo: ");
            String titulo = sc1.nextLine();
            System.out.println ("Por favor introduce el código: ");
            String codigo = sc1.nextLine();
            System.out.println ("Por favor introduzca el autor: ");
            String Autor = sc1.nextLine();
            System.out.println ("Por favor introduzca la cantidad: ");
            int cantidad = Integer.parseInt(sc1.nextLine());
            System.out.println ("Por favor introduzca la duracion: ");
            int duracion = Integer.parseInt(sc1.nextLine());
            //creacion de cada uno de los objetos

            Object a1 = codigo;
            System.out.println("El titulo es " + a1);
            a1 = new AudioLibro(titulo,codigo,Autor,cantidad,duracion);
            String b1 = titulo + " " + codigo + " " + Autor;
            lAudio.add(b1);
        }
    }


        /*public void CrearAlibro(){
        Scanner sc = new Scanner(System.in);
        //ArrayList lAudio1 = new ArrayList();

        System.out.println ("Bienvenido al creador de AudioLibros");
        System.out.println ("Por favor introduce el titulo: ");
        String titulo = sc.nextLine();
        System.out.println ("Por favor introduce el código: ");
        String codigo = sc.nextLine();
        System.out.println ("Por favor introduzca el autor: ");
        String Autor = sc.nextLine();
        System.out.println ("Por favor introduzca la cantidad: ");
        int cantidad = Integer.parseInt(sc.nextLine());
        System.out.println ("Por favor introduzca la duracion: ");
        int duracion = Integer.parseInt(sc.nextLine());
        AudioLibro al1 = new AudioLibro(titulo,codigo,Autor,cantidad,duracion);
        lAudio.add(al1);
    }*/


    public void buscarAlibroCodigo(){
        System.out.println("Dime cualquier informacion que conozcas del libro(Autor, Titulo o Codigo)");
        Scanner  scnew = new Scanner(System.in);
        String codigo = scnew.nextLine();
        for (int i = 0; i < lAudio.size(); i++) {
            boolean Strcod = codigo.contains((CharSequence) lAudio.get(i));
            if (Strcod = true){
                System.out.println(lAudio.get(i));
                break;
            }
        }
    }



    public void eliminarAudiolibro(){
        System.out.println("Dime cualquier informacion que conozcas del libro(Autor, Titulo o Codigo)");
        Scanner  scnew = new Scanner(System.in);
        String codigo = scnew.nextLine();
        for (int i = 0; i < lAudio.size(); i++) {
            boolean Strcod = codigo.contains((CharSequence) lAudio.get(i));
            if (Strcod = true){
                lAudio.remove(i);
                break;
            }
        }
    }
    public static void mostrarAudiolibros(){
        Iterator iterator = lAudio.iterator();
        while (iterator.hasNext()){
            AudioLibro st=(AudioLibro) iterator.next();
            System.out.println("El DNI de : " + st.getTitulo());


        }
    }




















    public String getNombreWeb() {
        return NombreWeb;
    }

    public void setNombreWeb(String nombreWeb) {
        NombreWeb = nombreWeb;
    }

    public String getnEmpresa() {
        return nEmpresa;
    }

    public void setnEmpresa(String nEmpresa) {
        this.nEmpresa = nEmpresa;
    }

    public int getIdWeb() {
        return IdWeb;
    }

    public void setIdWeb(int idWeb) {
        IdWeb = idWeb;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String domicilio) {
        Domicilio = domicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public ArrayList getlAudio() {
        return lAudio;
    }

    public void setlAudio(ArrayList lAudio) {
        this.lAudio = lAudio;
    }
}


