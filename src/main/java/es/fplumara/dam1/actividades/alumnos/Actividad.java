package es.fplumara.dam1.actividades.alumnos;

import java.net.URI;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Actividad {

        int hashCode =  0;

        public void procesar(List<Alumno> alumnosEntrada) {
            System.out.println("Actividad procesando alumnos");
            Set<Alumno> actividad = new HashSet<>(alumnosEntrada);
            actividad.forEach(alumno -> {System.out.println(alumno.getNombre());});
            System.out.printf("Tamaño alumnos: %s", actividad.size());
        }

}