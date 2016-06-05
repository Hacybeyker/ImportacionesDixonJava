/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c2_aplicacion;

import c3_dominio.contrato.ILineaSubCategoriaDAO;
import java.util.List;
import c3_dominio.entidad.LineaSubCategoria;
import c4_persistencia.GestorJDBC;
import c4_persistencia.postgresql.ConexionPostgreSql;
import c4_persistencia.postgresql.LineaSubCategoriaDAOPostgreSql;
import java.util.ArrayList;

/**
 *
 * @author Carlos Alfredo Osorio Perez <hacybeyker@hotmail.com>
 */
public class GestionarLineaSubCategoriaServicio {

    GestorJDBC gestorODBC;
    ILineaSubCategoriaDAO lineaSubCategoriaDAO;

    public GestionarLineaSubCategoriaServicio() {
        this.gestorODBC = new ConexionPostgreSql();
        this.lineaSubCategoriaDAO = new LineaSubCategoriaDAOPostgreSql(gestorODBC);
    }
    
    public void crear(LineaSubCategoria lineaSubCategoria) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public void modificar(LineaSubCategoria lineaSubCategoria) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public void eliminar(LineaSubCategoria lineaSubCategoria) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public List<LineaSubCategoria> buscar() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public LineaSubCategoria buscarPorCodigo(int codigo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public List<LineaSubCategoria> buscarPorNombre(String nombre) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public List<LineaSubCategoria> buscarPorCodigoSubCategoria(int codigo) throws Exception {
        List<LineaSubCategoria> lineaSubCategorias = new ArrayList<>();
        try {
            gestorODBC.abrirConexion();
            lineaSubCategorias = lineaSubCategoriaDAO.buscarPorCodigoSubCategoria(codigo);
            gestorODBC.cerrarConexion();
        } catch (Exception e) {            
            gestorODBC.cerrarConexion();
        }
        return lineaSubCategorias;        
    }
}