/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c2_aplicacion;

import c3_dominio.contrato.IProductoDAO;
import c3_dominio.entidad.Producto;
import c4_persistencia.GestorJDBC;
import c4_persistencia.postgresql.ConexionPostgreSql;
import c4_persistencia.postgresql.ProductoDAOPostgreSql;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carlos Alfredo Osorio Perez <hacybeyker@hotmail.com>
 */
public class GestionarProductoServicio {
    
    GestorJDBC gestorODBC;
    IProductoDAO productoDAO;

    public GestionarProductoServicio() {
        this.gestorODBC = new ConexionPostgreSql();
        this.productoDAO = new ProductoDAOPostgreSql(gestorODBC);
    }
    
    
    public void crear(Producto producto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public void modificar(Producto producto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public void eliminar(Producto producto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public List<Producto> buscar() throws Exception {
        List<Producto> productos = new ArrayList<>();
        try {
            gestorODBC.abrirConexion();
            productos = productoDAO.buscar();
            gestorODBC.cerrarConexion();
        } catch (Exception e) {            
            gestorODBC.cerrarConexion();
        }
        return productos;
    }

    
    public Producto buscarPorCodigo(int codigo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public List<Producto> buscarPorNombre(String nombre) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public List<Producto> buscarPorCodigoLineSubCategoria(int codigo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}