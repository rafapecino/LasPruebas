package org.example;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CadenaTest {

    @Test
    public void devuelveIniciales_CadenaVacia_DebeDevolverCadenaVacia() {
        String iniciales = ClaseCadena.DevuelveIniciales("");
        assertEquals("", iniciales);
    }

    @Test
    public void devuelveIniciales_ArgumentoIncorrecto_DebeDevolverCadenaVacia() {
        String iniciales = ClaseCadena.DevuelveIniciales(null);
        assertEquals("", iniciales);
    }

    @Test
    public void devuelveIniciales_UnNombreYApellido_DebeDevolverIniciales() {
        String iniciales = ClaseCadena.DevuelveIniciales("Andreas Dulac");
        assertEquals("A.D.", iniciales);
    }

    @Test
    public void devuelveIniciales_VariosNombresYApellidos_DebeDevolverIniciales() {
        String iniciales = ClaseCadena.DevuelveIniciales("Andreas Dulac John Smith");
        assertEquals("A.D.J.S.", iniciales);
    }

    @Test
    public void devuelveIniciales_NombresYApellidosConEspaciosExtra_DebeDevolverIniciales() {
        String iniciales = ClaseCadena.DevuelveIniciales("  Andreas   Dulac    ");
        assertEquals("A.D.", iniciales);
    }

}