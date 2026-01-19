package es.fplumara.dam1.actividades.alumnos;

public class Alumno {
    private final String dni;
    private final String nombre;

    public Alumno(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;

    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Alumno{dni='" + dni + "', nombre='" + nombre + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Alumno nombre = (Alumno) obj;
        return dni.equals(nombre.dni);
    }

    @Override
    public int hashCode() {
        return dni.hashCode();
    }

}
