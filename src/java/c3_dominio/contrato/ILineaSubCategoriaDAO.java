/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c3_dominio.contrato;

import c3_dominio.entidad.LineaSubCategoria;
import java.util.List;

/**
 *
 * @author Carlos Alfredo Osorio Perez <hacybeyker@hotmail.com>
 */
public interface ILineaSubCategoriaDAO {
    public void crear(LineaSubCategoria lineaSubCategoria) throws Exception;
    public void modificar(LineaSubCategoria lineaSubCategoria) throws Exception;
    public void eliminar(LineaSubCategoria lineaSubCategoria) throws Exception;
    public List<LineaSubCategoria> buscar() throws Exception;
    public LineaSubCategoria buscarPorCodigo(int codigo) throws Exception;
    public List<LineaSubCategoria> buscarPorNombre(String nombre) throws Exception;
    public List<LineaSubCategoria> buscarPorCodigoSubCategoria(int codigo) throws Exception;
}
