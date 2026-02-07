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
    }
}
