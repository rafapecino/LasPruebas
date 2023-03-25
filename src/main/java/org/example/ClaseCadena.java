package org.example;

public class ClaseCadena {
    public static String DevuelveInciciales(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            return "";
        }
        StringBuilder iniciales = new StringBuilder();
        String[] nombresApellidosArr = nombre.split(" ");
        for (String nombreApellido : nombresApellidosArr) {
            if (!nombreApellido.isEmpty()) {
                iniciales.append(nombreApellido.charAt(0)).append(".");
            }
        }
        if (iniciales.length() > 0) {
            iniciales.deleteCharAt(iniciales.length() - 1); // Elimina el último punto
        }
        return iniciales.toString().toUpperCase();

    }
}