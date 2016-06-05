/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c3_dominio.contrato;

import c3_dominio.entidad.Categoria;
import java.util.List;

/**
 *
 * @author Carlos Alfredo Osorio Perez <hacybeyker@hotmail.com>
 */
public interface ICategoriaDAO {
    public void crear(Categoria categoria) throws Exception;
    public void modificar(Categoria categoria) throws Exception;
    public void eliminar(Categoria categoria) throws Exception;
    public List<Categoria> buscar() throws Exception;
    public Categoria buscarPorCodigo(int codigo) throws Exception;
    public List<Categoria> buscarPorNombre(String nombre) throws Exception;
    public List<Categoria> buscarPorCodigoCategoria(int codigo) throws Exception;
}
