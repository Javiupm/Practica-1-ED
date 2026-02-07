public class GrupoAlumnos {
    private String nombre;
    private Alumno[] listaAlumnos;
    private int numAlumnos;
    private int MAXIMO;

    public GrupoAlumnos(){
        this.nombre = "Grupo desconocido";
        this.MAXIMO = 10;
        this.numAlumnos = 0;
        listaAlumnos = new Alumno[numAlumnos];
    }
    public GrupoAlumnos(int maximo, String nombre){
        this.MAXIMO = maximo;
        this.nombre = nombre;
        this.numAlumnos = 0;
        listaAlumnos = new Alumno[numAlumnos];
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nom){
        this.nombre = nom;
    }
    public int getMaximo(){
        return MAXIMO;
    }

}
