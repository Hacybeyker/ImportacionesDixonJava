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
public class Producto {
    private int codigo;
    private LineaSubCategoria lineaSubCategoria;
    private String nombre;
    private String descripcion;    
    private boolean nuevo;    
    private boolean oferta;
    private int porcentajeoferta;
    private String detalles;
    private double precio;
    private boolean activo;
    private boolean principal;
    private List<Imagen> imagenes;

    public Producto() {
        this.codigo = 0;
        this.imagenes = new ArrayList<Imagen>();
    }

    public Producto(int codigo, LineaSubCategoria lineaSubCategoria, String nombre, String descripcion, boolean nuevo, boolean oferta, int porcentajeoferta, String detalles, double precio, boolean activo, boolean principal) {
        this.codigo = codigo;
        this.lineaSubCategoria = lineaSubCategoria;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.nuevo = nuevo;
        this.oferta = oferta;
        this.porcentajeoferta = porcentajeoferta;
        this.detalles = detalles;
        this.precio = precio;
        this.activo = activo;
        this.principal = principal;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public LineaSubCategoria getLineaSubCategoria() {
        return lineaSubCategoria;
    }

    public void setLineaSubCategoria(LineaSubCategoria lineaSubCategoria) {
        this.lineaSubCategoria = lineaSubCategoria;
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

    public boolean isNuevo() {
        return nuevo;
    }

    public void setNuevo(boolean nuevo) {
        this.nuevo = nuevo;
    }

    public boolean isOferta() {
        return oferta;
    }

    public void setOferta(boolean oferta) {
        this.oferta = oferta;
    }

    public int getPorcentajeoferta() {
        return porcentajeoferta;
    }

    public void setPorcentajeoferta(int porcentajeoferta) {
        this.porcentajeoferta = porcentajeoferta;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
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

    public List<Imagen> getImagenes() {
        return imagenes;
    }
    
    public void verificarImagen(Imagen imagen){
        for (Imagen imagenVerificar : imagenes) {
            if(imagenVerificar.getCodigo() == imagen.getCodigo())
                //throw;
                break;
        }
    }
    
    public void agregarImagen(Imagen imagen){
        verificarImagen(imagen);
        imagenes.add(imagen);
    }
    
    public void eliminarImagen(int codigo){
        for (Imagen imagen : imagenes) {
            if(imagen.getCodigo() == codigo){
                imagenes.remove(imagen);
                break;
            }
        }
    }
    
    public double calcularDescuento(){
        return (precio * porcentajeoferta)/100;
    }
    
    public double calcularNuevoPrecio(){
        return precio - calcularDescuento();
    }
    
}
