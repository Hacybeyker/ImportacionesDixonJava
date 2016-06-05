/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c3_dominio.contrato;

import c3_dominio.entidad.Imagen;
import java.util.List;

/**
 *
 * @author Hacybeyker
 */
public interface IImagenDAO {
    public void crear(Imagen imagen) throws Exception;
    public void modificar(Imagen imagen) throws Exception;
    public void eliminar(Imagen imagen) throws Exception;
    public List<Imagen> buscar() throws Exception;
    public Imagen buscarPorCodigo(int codigo) throws Exception;
    public List<Imagen> buscarPorNombre(String nombre) throws Exception;
    public List<Imagen> buscarPorCodigoProducto(int codigo) throws Exception;
}
