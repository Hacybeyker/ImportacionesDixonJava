/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c1_presentacion.pagina.controlador.gestionarproducto;

import c2_aplicacion.GestionarProductoServicio;
import c3_dominio.entidad.Producto;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Carlos Alfredo Osorio Perez <hacybeyker@hotmail.com>
 */
public class DetalleProducto extends ProductoAccion{

    @Override
    public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
        String paginaretorno = "WEB-INF/c1_presentacion/vista/pagina/DetalleProducto.jsp";
        int codigoproducto = Integer.parseInt(request.getParameter("codigo"));
        try {
            GestionarProductoServicio gestionarProductoServicio = new GestionarProductoServicio();
            Producto producto = gestionarProductoServicio.buscarPorCodigo(codigoproducto);
            if(producto != null){
                request.setAttribute("producto", producto);
                paginaretorno = "WEB-INF/c1_presentacion/vista/pagina/DetalleProducto.jsp";
            }
        } catch (Exception e) {
        }
        return paginaretorno;
    }
    
}
