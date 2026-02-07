public class Alumno {
    private String nombre;
    private String matricula;
    private double calificacion;
    private String asignaturas[];
    private int numAisgnaturas;

    public Alumno() {
        this.calificacion = 0;
        this.nombre = "";
        this.matricula = "";
        this.numAisgnaturas = 0;
        asignaturas = new String[numAisgnaturas];
    }

    public Alumno(String nombre, String matricula, double calificacion) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.calificacion = calificacion;
        this.numAisgnaturas = 0;
        asignaturas = new String[numAisgnaturas];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nom) {
        this.nombre = nom;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double cal) {
        this.calificacion = cal;
    }

    public void matricularAisgnatura(String asignatura) {
        if(numAisgnaturas>=5) System.out.println("No se pueden añadir mas asignaturas");
       else {
            asignaturas[numAisgnaturas] = asignatura;
            numAisgnaturas++;
        }
    }
    public int getNumAisgnaturas(){
        return numAisgnaturas;
    }
    public void mostrarAsignaturas(){
        if(numAisgnaturas == 0) System.out.println("No esta matriculado en ninguna asignatura");
        else {
            System.out.println(getNumAisgnaturas() + " asignaturas: ");
            for (int i = 0; i < numAisgnaturas; i++) {
                System.out.println("    - " + asignaturas[i]);
            }
        }
    }
    public void mostrarAlumno(){
        System.out.println(nombre+". "+matricula+" ("+calificacion+")");
        mostrarAsignaturas();
    }
}
