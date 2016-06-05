/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c3_dominio.entidad;

/**
 *
 * @author Carlos Alfredo Osorio Perez <hacybeyker@hotmail.com>
 */
public class Imagen {
    private int codigo;
    private Producto producto;
    private String nombre;
    private String descripcion;
    private String imagen;
    private boolean activo;
    private boolean principal;

    public Imagen() {
        this.codigo = 0;
    }

    public Imagen(int codigo, Producto producto, String nombre, String descripcion, String imagen, boolean activo, boolean principal) {
        this.codigo = codigo;
        this.producto = producto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.activo = activo;
        this.principal = principal;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
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

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
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
    
    
}