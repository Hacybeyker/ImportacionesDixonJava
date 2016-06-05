/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c2_aplicacion;

import c3_dominio.contrato.ISubCategoriaDAO;
import c3_dominio.entidad.SubCategoria;
import c4_persistencia.GestorJDBC;
import c4_persistencia.postgresql.ConexionPostgreSql;
import c4_persistencia.postgresql.SubCategoriaDAOPostgreSql;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carlos Alfredo Osorio Perez <hacybeyker@hotmail.com>
 */
public class GestionarSubCategoriaServicio {

    GestorJDBC gestorODBC;
    ISubCategoriaDAO subCategoriaDAO;

    public GestionarSubCategoriaServicio() {
        this.gestorODBC = new ConexionPostgreSql();
        this.subCategoriaDAO = new SubCategoriaDAOPostgreSql(gestorODBC);
    }    
    
    public void crear(SubCategoria subCategoria) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public void modificar(SubCategoria subCategoria) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public void eliminar(SubCategoria subCategoria) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public List<SubCategoria> buscar() throws Exception {
        List<SubCategoria> subCategorias = new ArrayList<>();
        try {
            gestorODBC.abrirConexion();
            subCategorias = subCategoriaDAO.buscar();
            gestorODBC.cerrarConexion();
        } catch (Exception e) {            
            gestorODBC.cerrarConexion();
        }
        return subCategorias;        
    }

    
    public SubCategoria buscarPorCodigo(int codigo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public List<SubCategoria> buscarPorNombre(String nombre) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public List<SubCategoria> buscarPorCodigoCategoria(int codigo) throws Exception {
        List<SubCategoria> subCategorias = new ArrayList<>();
        try {
            gestorODBC.abrirConexion();
            subCategorias = subCategoriaDAO.buscarPorCodigoCategoria(codigo);
            gestorODBC.cerrarConexion();
        } catch (Exception e) {            
            gestorODBC.cerrarConexion();
        }
        return subCategorias;        
    }
    
}