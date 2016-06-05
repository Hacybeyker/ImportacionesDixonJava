/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c1_presentacion.pagina.controlador.gestionarproducto;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Carlos Alfredo Osorio Perez <hacybeyker@hotmail.com>
 */
public abstract class ProductoAccion {
    
    public abstract String ejecutar(HttpServletRequest request, HttpServletResponse response);
    
    public static ProductoAccion instanciarAccion(String claseTipoAccion) {
        ProductoAccion productoAccion;
        String nombreClaseAccion;
        try{
            nombreClaseAccion = "c1_presentacion.pagina.controlador.gestionarproducto." + claseTipoAccion;
            productoAccion = (ProductoAccion)Class.forName(nombreClaseAccion).newInstance();      
            return productoAccion;
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            return null;
        }
    }
}
