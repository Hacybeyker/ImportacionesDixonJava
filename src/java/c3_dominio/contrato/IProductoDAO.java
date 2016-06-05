/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c3_dominio.contrato;

import c3_dominio.entidad.Producto;
import java.util.List;

/**
 *
 * @author Carlos Alfredo Osorio Perez <hacybeyker@hotmail.com>
 */
public interface IProductoDAO {    
    public void crear(Producto producto) throws Exception;
    public void modificar(Producto producto) throws Exception;
    public void eliminar(Producto producto) throws Exception;
    public List<Producto> buscar() throws Exception;
    public Producto buscarPorCodigo(int codigo) throws Exception;
    public List<Producto> buscarPorNombre(String nombre) throws Exception;
    public List<Producto> buscarPorCodigoLineSubCategoria(int codigo) throws Exception;
}
