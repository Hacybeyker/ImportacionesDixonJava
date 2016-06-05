/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c4_persistencia.postgresql;

import c3_dominio.contrato.ISubCategoriaDAO;
import c3_dominio.entidad.SubCategoria;
import c4_persistencia.GestorJDBC;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carlos Alfredo Osorio Perez <hacybeyker@hotmail.com>
 */
public class SubCategoriaDAOPostgreSql implements ISubCategoriaDAO{

    GestorJDBC gestorODBC;

    public SubCategoriaDAOPostgreSql(GestorJDBC gestorODBC) {
        this.gestorODBC = gestorODBC;
    }
    
    @Override
    public void crear(SubCategoria subCategoria) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar(SubCategoria subCategoria) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(SubCategoria subCategoria) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SubCategoria> buscar() throws Exception {
        List<SubCategoria> categorias = new ArrayList<>();
        try {
            String consulta = "select codigosubcategoria, nombresubcategoria, descripcionsubcategoria, activosubcategoria, principalsubcategoria from subcategoria";
            ResultSet resultado = gestorODBC.ejecutarConsulta(consulta);
            while(resultado.next()){
                SubCategoria subCategoria = new SubCategoria();
                subCategoria.setCodigo(resultado.getInt(1));
                subCategoria.setNombre(resultado.getString(2));
                subCategoria.setDescripcion(resultado.getString(3));
                subCategoria.setActivo(resultado.getBoolean(4));
                subCategoria.setPrincipal(resultado.getBoolean(5));
                categorias.add(subCategoria);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return categorias;
    }
    
    @Override
    public SubCategoria buscarPorCodigo(int codigo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SubCategoria> buscarPorNombre(String nombre) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SubCategoria> buscarPorCodigoCategoria(int codigo) throws Exception {
        List<SubCategoria> categorias = new ArrayList<>();
        try {
            String consulta = "select codigosubcategoria, nombresubcategoria, descripcionsubcategoria, activosubcategoria, principalsubcategoria from subcategoria where codigocategoria = " + codigo;
            ResultSet resultado = gestorODBC.ejecutarConsulta(consulta);
            while(resultado.next()){
                SubCategoria subCategoria = new SubCategoria();
                subCategoria.setCodigo(resultado.getInt(1));
                subCategoria.setNombre(resultado.getString(2));
                subCategoria.setDescripcion(resultado.getString(3));
                subCategoria.setActivo(resultado.getBoolean(4));
                subCategoria.setPrincipal(resultado.getBoolean(5));
                categorias.add(subCategoria);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return categorias;
    }
    
}
