/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c2_aplicacion;

import c3_dominio.contrato.IImagenDAO;
import c3_dominio.entidad.Imagen;
import c4_persistencia.GestorJDBC;
import c4_persistencia.postgresql.ConexionPostgreSql;
import c4_persistencia.postgresql.ImagenDAOPostgreSql;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hacybeyker
 */
public class GestionarImagenServicio {
    
    GestorJDBC gestorODBC;
    IImagenDAO imagenDAO;

    public GestionarImagenServicio() {
        this.gestorODBC = new ConexionPostgreSql();
        this.imagenDAO = new ImagenDAOPostgreSql(gestorODBC);
    }    
    
    public void crear(Imagen imagen) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void modificar(Imagen imagen) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void eliminar(Imagen imagen) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public List<Imagen> buscar() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Imagen buscarPorCodigo(int codigo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public List<Imagen> buscarPorNombre(String nombre) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public List<Imagen> buscarPorCodigoProducto(int codigo) throws Exception {
        List<Imagen> imagenes = new ArrayList<>();
        try{
            gestorODBC.abrirConexion();
            imagenes = imagenDAO.buscarPorCodigoProducto(codigo);
            gestorODBC.cerrarConexion();
        }catch(Exception e){
            gestorODBC.cerrarConexion();
        }
        return imagenes;        
    }
    
}