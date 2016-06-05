/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c1_presentacion.pagina.controlador;

import c1_presentacion.pagina.controlador.gestionarproducto.ProductoAccion;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Carlos Alfredo Osorio Perez <hacybeyker@hotmail.com>
 */
public class GestionarProductoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String urlServlet = request.getServletPath();
        ProductoAccion productoAccion = ProductoAccion.instanciarAccion(urlServlet.substring(1));
        String url = productoAccion.ejecutar(request,response);
        RequestDispatcher despachador = request.getRequestDispatcher(url);
        despachador.forward(request, response);
    }
}
