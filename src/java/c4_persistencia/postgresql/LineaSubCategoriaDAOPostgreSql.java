/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c4_persistencia.postgresql;

import c3_dominio.contrato.ILineaSubCategoriaDAO;
import c3_dominio.entidad.LineaSubCategoria;
import c4_persistencia.GestorJDBC;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carlos Alfredo Osorio Perez <hacybeyker@hotmail.com>
 */
public class LineaSubCategoriaDAOPostgreSql implements ILineaSubCategoriaDAO{

    GestorJDBC gestorODBC;

    public LineaSubCategoriaDAOPostgreSql(GestorJDBC gestorODBC) {
        this.gestorODBC = gestorODBC;
    }
    
    @Override
    public void crear(LineaSubCategoria lineaSubCategoria) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar(LineaSubCategoria lineaSubCategoria) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(LineaSubCategoria lineaSubCategoria) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<LineaSubCategoria> buscar() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public LineaSubCategoria buscarPorCodigo(int codigo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<LineaSubCategoria> buscarPorNombre(String nombre) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<LineaSubCategoria> buscarPorCodigoSubCategoria(int codigo) throws Exception {
        List<LineaSubCategoria> lineaSubCategorias = new ArrayList<>();
        try {
            String consulta = "select codigolineasubcategoria, nombrelineasubcategoria, descripcionlineasubcategoria, activolineasubcategoria, principallineasubcategoria from lineasubcategoria where codigosubcategoria = " + codigo;
            ResultSet resultado = gestorODBC.ejecutarConsulta(consulta);
            while(resultado.next()){
                LineaSubCategoria subCategoria = new LineaSubCategoria();
                subCategoria.setCodigo(resultado.getInt(1));
                subCategoria.setNombre(resultado.getString(2));
                subCategoria.setDescripcion(resultado.getString(3));
                subCategoria.setActivo(resultado.getBoolean(4));
                subCategoria.setPrincipal(resultado.getBoolean(5));
                lineaSubCategorias.add(subCategoria);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return lineaSubCategorias;
    }
    
}
