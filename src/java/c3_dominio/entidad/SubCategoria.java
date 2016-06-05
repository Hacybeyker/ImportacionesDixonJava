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
public class SubCategoria {
    private int codigo;
    private Categoria categoria;
    private String nombre;
    private String descripcion;
    private boolean activo;
    private boolean principal;
    private List<LineaSubCategoria> lineaSubCategorias;

    public SubCategoria() {
        this.codigo = 0;
        this.lineaSubCategorias = new ArrayList<LineaSubCategoria>();
    }

    public SubCategoria(int codigo, Categoria categoria, String nombre, String descripcion, boolean activo, boolean principal){
        this.codigo = codigo;
        this.categoria = categoria;
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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
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

    public List<LineaSubCategoria> getLineaSubCategorias() {
        return lineaSubCategorias;
    }
    
    public void verificarLineaSubCategoria(LineaSubCategoria lineaSubCategoria){
        for (LineaSubCategoria lineaSubCategoriaVerificar : lineaSubCategorias) {
            if(lineaSubCategoriaVerificar.getCodigo() == lineaSubCategoria.getCodigo())
                break;
        }
    }
    
    public void agregarLineaSubCategoria(LineaSubCategoria lineaSubCategoria){
        verificarLineaSubCategoria(lineaSubCategoria);
        lineaSubCategorias.add(lineaSubCategoria);
    }
    
    public void eliminarLineaSubCategoria(int codigo){
        for (LineaSubCategoria lineaSubCategoria : lineaSubCategorias) {
            if(lineaSubCategoria.getCodigo() == codigo){
                lineaSubCategorias.remove(lineaSubCategoria);
                break;
            }
        }
    }
    
}
