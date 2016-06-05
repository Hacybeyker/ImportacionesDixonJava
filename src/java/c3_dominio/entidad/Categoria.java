/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c3_dominio.entidad;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carlos Alfredo Osorio Perez <hacybeyker@hotmail.com>
 */
public class Categoria {
    private int codigo;
    private String nombre;
    private String descripcion;
    private boolean activo;
    private boolean principal;
    private List<SubCategoria> subCategorias;

    public Categoria() {
        this.codigo = 0;
        this.subCategorias = new ArrayList<>();
    }

    public Categoria(int codigo, String nombre, String descripcion, boolean activo, boolean principal) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.activo = activo;
        this.principal = principal;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public boolean isPrincipal() {
        return principal;
    }

    public void setPrincipal(boolean principal) {
        this.principal = principal;
    }

    public List<SubCategoria> getSubCategorias() {
        return subCategorias;
    }

    public void setSubCategorias(List<SubCategoria> subCategorias) {
        this.subCategorias = subCategorias;
    }
    
    public void verificarSubCategoria(SubCategoria subCategoria){
        for (SubCategoria subCategoriaVeriicar : subCategorias) {
            if(subCategoriaVeriicar.getCodigo() == subCategoria.getCodigo())
                break;
        }
    }
    
    public void agregarSubCategoria(SubCategoria subCategoria){
        verificarSubCategoria(subCategoria);
        subCategorias.add(subCategoria);
    }
    
    public void eliminarSubCategoria(int codigo){
        for (SubCategoria subCategoria : subCategorias) {
            if(subCategoria.getCodigo() == codigo)
                break;
        }
    }
    
    
    
    
}
