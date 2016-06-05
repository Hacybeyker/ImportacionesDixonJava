/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c4_persistencia.postgresql;

import c3_dominio.contrato.ICategoriaDAO;
import c3_dominio.entidad.Categoria;
import c3_dominio.entidad.Imagen;
import c3_dominio.entidad.LineaSubCategoria;
import c3_dominio.entidad.Producto;
import c3_dominio.entidad.SubCategoria;
import c4_persistencia.GestorJDBC;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carlos Alfredo Osorio Perez <hacybeyker@hotmail.com>
 */
public class CategoriaDAOPostgreSql implements ICategoriaDAO{

    GestorJDBC gestorODBC;

    public CategoriaDAOPostgreSql(GestorJDBC gestorODBC) {
        this.gestorODBC = gestorODBC;
    }
    
    @Override
    public void crear(Categoria categoria) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar(Categoria categoria) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Categoria categoria) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Categoria> buscar() throws Exception {
        List<Categoria> categorias = new ArrayList<>();
        try {
            String consulta = "select codigocategoria,nombrecategoria,descripcioncategoria,activocategoria,principalcategoria from categoria";
            ResultSet resultado = gestorODBC.ejecutarConsulta(consulta);
            while(resultado.next()){
                Categoria categoria = new Categoria();
                categoria.setCodigo(resultado.getInt(1));
                categoria.setNombre(resultado.getString(2));
                categoria.setDescripcion(resultado.getString(3));
                categoria.setActivo(resultado.getBoolean(4));
                categoria.setPrincipal(resultado.getBoolean(5));
                SubCategoriaDAOPostgreSql subCategoriaDAOPostgreSql = new SubCategoriaDAOPostgreSql(gestorODBC);
                List<SubCategoria> subCategorias = subCategoriaDAOPostgreSql.buscarPorCodigoCategoria(categoria.getCodigo());
                for (SubCategoria subCategoria : subCategorias) {
                    LineaSubCategoriaDAOPostgreSql lineaSubCategoriaDAOPostgreSql = new LineaSubCategoriaDAOPostgreSql(gestorODBC);
                    List<LineaSubCategoria> lineaSubCategorias = lineaSubCategoriaDAOPostgreSql.buscarPorCodigoSubCategoria(subCategoria.getCodigo());
                    for(LineaSubCategoria lineaSubCategoria : lineaSubCategorias){
                        subCategoria.agregarLineaSubCategoria(lineaSubCategoria);
                    }
                    categoria.agregarSubCategoria(subCategoria);
                }
                categorias.add(categoria);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return categorias;
    }

    @Override
    public Categoria buscarPorCodigo(int codigo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Categoria> buscarPorNombre(String nombre) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Categoria> buscarPorCodigoCategoria(int codigo) throws Exception {
        List<Categoria> categorias = new ArrayList<>();
        try {
            String consulta = "select\n" +
            "p.codigoproducto,p.nombreproducto,p.descripcionproducto,p.nuevoproducto,p.ofertaproducto,p.porcentajeofertaproducto,p.detalleproducto,p.precioproducto,p.activoproducto,p.principalproducto,\n" +
            "i.codigoimagen,i.nombreimagen,i.descripcionimagen,i.imagenimagen,i.activoimagen,i.principalimagen,\n" +
            "lsc.codigolineasubcategoria,lsc.nombrelineasubcategoria,lsc.descripcionlineasubcategoria,lsc.activolineasubcategoria,lsc.principallineasubcategoria,\n" +
            "sc.codigosubcategoria,sc.nombresubcategoria,sc.descripcionsubcategoria,sc.activosubcategoria,sc.principalsubcategoria,\n" +
            "c.codigocategoria,c.nombrecategoria,c.descripcioncategoria,c.activocategoria,c.principalcategoria\n" +
            "from producto p\n" +
            "inner join imagen i\n" +
            "on p.codigoproducto = i.codigoproducto\n" +
            "inner join lineasubcategoria lsc\n" +
            "on p.codigolineasubcategoria = lsc.codigolineasubcategoria\n" +
            "inner join subcategoria sc\n" +
            "on lsc.codigosubcategoria = sc.codigosubcategoria\n" +
            "inner join categoria c\n" +
            "on sc.codigocategoria = c.codigocategoria";
            ResultSet resultado = gestorODBC.ejecutarConsulta(consulta);
            while(resultado.next()){
                Categoria categoria = new Categoria();
                categoria.setCodigo(resultado.getInt(1));
                categoria.setNombre(resultado.getString(2));
                categoria.setDescripcion(resultado.getString(3));
                categoria.setActivo(resultado.getBoolean(4));
                categoria.setPrincipal(resultado.getBoolean(5));
                SubCategoriaDAOPostgreSql subCategoriaDAOPostgreSql = new SubCategoriaDAOPostgreSql(gestorODBC);
                List<SubCategoria> subCategorias = subCategoriaDAOPostgreSql.buscarPorCodigoCategoria(categoria.getCodigo());
                for (SubCategoria subCategoria : subCategorias) {
                    LineaSubCategoriaDAOPostgreSql lineaSubCategoriaDAOPostgreSql = new LineaSubCategoriaDAOPostgreSql(gestorODBC);
                    List<LineaSubCategoria> lineaSubCategorias = lineaSubCategoriaDAOPostgreSql.buscarPorCodigoSubCategoria(subCategoria.getCodigo());
                    for(LineaSubCategoria lineaSubCategoria : lineaSubCategorias){
                        ProductoDAOPostgreSql productoDAOPostgreSql = new ProductoDAOPostgreSql(gestorODBC);
                        List<Producto> productos = productoDAOPostgreSql.buscarPorCodigoLineSubCategoria(lineaSubCategoria.getCodigo());
                        for(Producto producto : productos){
                            ImagenDAOPostgreSql imagenDAOPostgreSql = new ImagenDAOPostgreSql(gestorODBC);
                            List<Imagen> imagenes = imagenDAOPostgreSql.buscarPorCodigoProducto(producto.getCodigo());
                            for (Imagen imagen : imagenes) {
                                producto.agregarImagen(imagen);
                            }
                            lineaSubCategoria.agregarProducto(producto);
                        }
                        subCategoria.agregarLineaSubCategoria(lineaSubCategoria);
                    }
                    categoria.agregarSubCategoria(subCategoria);
                }
                categorias.add(categoria);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return categorias;
    }
    
}
