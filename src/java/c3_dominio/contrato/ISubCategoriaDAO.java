/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c3_dominio.contrato;

import c3_dominio.entidad.SubCategoria;
import java.util.List;

/**
 *
 * @author Carlos Alfredo Osorio Perez <hacybeyker@hotmail.com>
 */
public interface ISubCategoriaDAO {
    public void crear(SubCategoria subCategoria) throws Exception;
    public void modificar(SubCategoria subCategoria) throws Exception;
    public void eliminar(SubCategoria subCategoria) throws Exception;
    public List<SubCategoria> buscar() throws Exception;
    public SubCategoria buscarPorCodigo(int codigo) throws Exception;
    public List<SubCategoria> buscarPorNombre(String nombre) throws Exception;
    public List<SubCategoria> buscarPorCodigoCategoria(int codigo) throws Exception;
}
