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
public class LineaSubCategoria {
    private int codigo;
    private SubCategoria subCategoria;
    private String nombre;
    private String descripcion;
    private boolean activo;
    private boolean principal;
    private List<Producto> productos;

    public LineaSubCategoria() {
        this.codigo = 0;
        this.productos = new ArrayList<>();
    }

    public LineaSubCategoria(int codigo, SubCategoria subCategoria, String nombre, String descripcion, boolean activo, boolean principal) {
        this.codigo = codigo;
        this.subCategoria = subCategoria;
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

    public SubCategoria getSubCategoria() {
        return subCategoria;
    }

    public void setSubCategoria(SubCategoria subCategoria) {
        this.subCategoria = subCategoria;
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

    public List<Producto> getProductos() {
        return productos;
    }
    
    public void verificarProducto(Producto producto){
        for (Producto productoVerificar : productos) {
            if(productoVerificar.getCodigo() == producto.getCodigo())
                break;
        }
    }
    
    public void agregarProducto(Producto producto){
        verificarProducto(producto);
        productos.add(producto);
    }
    
    public void eliminarProducto(int codigo){
        for (Producto producto : productos) {
            if(producto.getCodigo() == codigo)
                productos.remove(producto);
        }
    }
    
}
