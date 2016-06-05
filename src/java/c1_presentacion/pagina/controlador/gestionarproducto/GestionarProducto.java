/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c1_presentacion.pagina.controlador.gestionarproducto;

import c2_aplicacion.GestionarProductoServicio;
import c3_dominio.entidad.Producto;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Carlos Alfredo Osorio Perez <hacybeyker@hotmail.com>
 */
public class GestionarProducto extends ProductoAccion{

    @Override
    
    public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
        String paginaretorno = "WEB-INF/c1_presentacion/vista/pagina/GestionarProducto.jsp";
        int codigolineasubcategoria = Integer.parseInt(request.getParameter("codigo"));
        try {
            GestionarProductoServicio gestionarProductoServicio = new GestionarProductoServicio();
            List<Producto> productos = gestionarProductoServicio.buscarPorCodigoLineSubCategoria(codigolineasubcategoria);
            if(productos != null){
                request.setAttribute("productos", productos);
                paginaretorno = "WEB-INF/c1_presentacion/vista/pagina/GestionarProducto.jsp";
            }
        } catch (Exception e) {
        }
        return paginaretorno;
    }
    
}
