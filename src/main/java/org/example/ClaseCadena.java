package org.example;

public class ClaseCadena {

    public static String DevuelveIniciales(String nombresApellidos) {
        if (nombresApellidos == null || nombresApellidos.isEmpty()) {
            return "";
        }
        StringBuilder iniciales = new StringBuilder();
        String[] nombresApellidosArr = nombresApellidos.split(" ");
        for (String nombreApellido : nombresApellidosArr) {
            if (!nombreApellido.isEmpty()) {
                iniciales.append(nombreApellido.charAt(0)).append(".");
            }
        }
        iniciales.deleteCharAt(iniciales.length() - 1); // Elimina el último espacio
        iniciales.append(".");
        return iniciales.toString().toUpperCase();
    }
    public static void main(String[] args) {
        System.out.println(DevuelveIniciales("Andreas Dulac John Smith"));
    }
}