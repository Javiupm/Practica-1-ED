public class GrupoAlumnos {
    private String nombre;
    private Alumno[] listaAlumnos;
    private int numAlumnos;
    private int MAXIMO;

    public GrupoAlumnos(){
        this.nombre = "Grupo desconocido";
        this.MAXIMO = 10;
        this.numAlumnos = 0;
        listaAlumnos = new Alumno[MAXIMO];
    }
    public GrupoAlumnos(int maximo, String nombre){
        this.MAXIMO = maximo;
        this.nombre = nombre;
        this.numAlumnos = 0;
        listaAlumnos = new Alumno[MAXIMO];
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
    public boolean insertarAlumno(Alumno alumno){
        boolean resultado = false;
        if(numAlumnos<MAXIMO){
            listaAlumnos[numAlumnos] = alumno;
            numAlumnos++;
            resultado = true;
        }
        return resultado;
    }
    public Alumno getAlumno(int i){
        if(i < 0 || i >= numAlumnos){
            return null;
        }
        return listaAlumnos[i];
    }
    public void mostrarGrupo(){

    }
}
