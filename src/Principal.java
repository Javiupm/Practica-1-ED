import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        Alumno a0 = new Alumno("Felipe Arias González", "aa1253", 3.50);
        Alumno a1 = new Alumno("Manuel García Sacedón", "ax0074", 8.35);
        Alumno a2 = new Alumno("Magarita López Medina", "mj7726", 7.70);
        Alumno a3 = new Alumno("Estela Sánchez Arellano", "bc2658", 6.75);
        a0.matricularAisgnatura("Estructuras de Datos");
        a1.matricularAisgnatura("Estructuras de Datos");
        a2.matricularAisgnatura("Estructuras de Datos");
        a3.matricularAisgnatura("Estructuras de Datos");
        a3.matricularAisgnatura("Algebra");
        a3.matricularAisgnatura("Estructuras de Computadores");
        a3.mostrarAsignaturas();
        a0.mostrarAlumno();
        a3.mostrarAlumno();

        GrupoAlumnos g1 = new GrupoAlumnos(20, "GX11");
        g1.insertarAlumno(a0);
        g1.insertarAlumno(a1);
        g1.insertarAlumno(a2);
        g1.insertarAlumno(a3);
        g1.mostrarGrupo();
        g1.getAlumno(1);
    }
}
