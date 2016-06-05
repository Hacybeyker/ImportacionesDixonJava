/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c4_persistencia.postgresql;

import c3_dominio.contrato.IImagenDAO;
import c3_dominio.entidad.Imagen;
import c4_persistencia.GestorJDBC;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hacybeyker
 */
public class ImagenDAOPostgreSql implements IImagenDAO{

    GestorJDBC gestorODBC;

    public ImagenDAOPostgreSql(GestorJDBC gestorODBC) {
        this.gestorODBC = gestorODBC;
    }
    
    @Override
    public void crear(Imagen imagen) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar(Imagen imagen) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Imagen imagen) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Imagen> buscar() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Imagen buscarPorCodigo(int codigo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Imagen> buscarPorNombre(String nombre) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Imagen> buscarPorCodigoProducto(int codigo) throws Exception {
        List<Imagen> imagenes = new ArrayList<>();
        try {
            String consulta = "select codigoimagen, nombreimagen, descripcionimagen, imagenimagen, activoimagen, principalimagen from imagen where codigoproducto = " + codigo;
            ResultSet resultado = gestorODBC.ejecutarConsulta(consulta);
            while(resultado.next()){
                Imagen imagen = new Imagen();
                imagen.setCodigo(resultado.getInt(1));
                imagen.setNombre(resultado.getString(2));
                imagen.setDescripcion(resultado.getString(3));
                imagen.setImagen(resultado.getString(4));
                imagen.setActivo(resultado.getBoolean(5));
                imagen.setPrincipal(resultado.getBoolean(6));
                imagenes.add(imagen);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return imagenes;
    }
    
}
