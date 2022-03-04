/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author visitante
 */
public class catalogo {
    int codigo_producto;
    String Nombre_producto;
    String Precio_venta;

    public catalogo() {
    }

    public catalogo(int codigo_producto) {
        this.codigo_producto= codigo_producto;
    }

    public catalogo(String nombreApp, String estadoApp) {
        this.Nombre_producto = Nombre_producto;
        this.Precio_venta= Precio_venta;
    }

    public int getId_app() {
        return codigo_producto;
    }

    public void setId_app(int id_app) {
        this.codigo_producto = codigo_producto;
    }

    public String getNombreApp() {
        return Nombre_producto;
    }

    public void setNombreApp(String nombreApp) {
        this.Nombre_producto = Nombre_producto;
    }

    public String getEstadoApp() {
        return Precio_venta;
    }

    public void setEstadoApp(String estadoApp) {
        this.Precio_venta = Precio_venta;
    }

    @Override
    public String toString() {
        return "App{" + "id_vendedor=" + codigo_producto + ", nombreVendedor=" + Nombre_producto + ", direVendedor=" + Precio_venta + '}';
    }
    
}
