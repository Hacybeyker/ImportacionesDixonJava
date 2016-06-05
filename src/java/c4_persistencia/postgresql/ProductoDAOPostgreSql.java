/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c4_persistencia.postgresql;

import c3_dominio.contrato.IProductoDAO;
import c3_dominio.entidad.Imagen;
import c3_dominio.entidad.Producto;
import c4_persistencia.GestorJDBC;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carlos Alfredo Osorio Perez <hacybeyker@hotmail.com>
 */
public class ProductoDAOPostgreSql implements IProductoDAO {

    GestorJDBC gestorODBC;

    public ProductoDAOPostgreSql(GestorJDBC gestorODBC) {
        this.gestorODBC = gestorODBC;
    }
    
    @Override
    public void crear(Producto producto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar(Producto producto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Producto producto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Producto> buscar() throws Exception {
        List<Producto> productos = new ArrayList<>();
        try {
            String consulta = "select codigoproducto, nombreproducto, descripcionproducto, nuevoproducto, ofertaproducto, porcentajeofertaproducto, detalleproducto, precioproducto, activoproducto, principalproducto from Producto";
            ResultSet resultado = gestorODBC.ejecutarConsulta(consulta);
            while(resultado.next()){
                Producto producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setDescripcion(resultado.getString(3));
                producto.setNuevo(resultado.getBoolean(4));
                producto.setOferta(resultado.getBoolean(5));
                producto.setPorcentajeoferta(resultado.getInt(6));
                producto.setDetalles(resultado.getString(7));
                producto.setPrecio(resultado.getDouble(8));
                producto.setActivo(resultado.getBoolean(9));
                producto.setPrincipal(resultado.getBoolean(10));
                ImagenDAOPostgreSql imagenDAOPostgreSql = new ImagenDAOPostgreSql(gestorODBC);
                List<Imagen> imagenes = imagenDAOPostgreSql.buscarPorCodigoProducto(producto.getCodigo());
                for (Imagen imagen : imagenes) {
                    producto.agregarImagen(imagen);
                }
                productos.add(producto);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return productos;
    }

    @Override
    public Producto buscarPorCodigo(int codigo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Producto> buscarPorNombre(String nombre) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Producto> buscarPorCodigoLineSubCategoria(int codigo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
