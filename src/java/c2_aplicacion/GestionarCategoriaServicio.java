/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c2_aplicacion;

import c3_dominio.contrato.ICategoriaDAO;
import c3_dominio.entidad.Categoria;
import c4_persistencia.GestorJDBC;
import c4_persistencia.postgresql.CategoriaDAOPostgreSql;
import c4_persistencia.postgresql.ConexionPostgreSql;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carlos Alfredo Osorio Perez <hacybeyker@hotmail.com>
 */
public class GestionarCategoriaServicio {

    GestorJDBC gestorODBC;
    ICategoriaDAO categoriaDAO;

    public GestionarCategoriaServicio() {
        this.gestorODBC = new ConexionPostgreSql();
        this.categoriaDAO = new CategoriaDAOPostgreSql(gestorODBC);
    }    
    
    public void crear(Categoria categoria) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void modificar(Categoria categoria) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public void eliminar(Categoria categoria) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public List<Categoria> buscar() throws Exception {
        List<Categoria> categorias = new ArrayList<>();
        try {
            gestorODBC.abrirConexion();
            categorias = categoriaDAO.buscar();
            gestorODBC.cerrarConexion();
        } catch (Exception e) {            
            gestorODBC.cerrarConexion();
        }
        return categorias;
    }
    
    public Categoria buscarPorCodigo(int codigo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public List<Categoria> buscarPorNombre(String nombre) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public List<Categoria> buscarPorCodigoCategoria(int codigo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}