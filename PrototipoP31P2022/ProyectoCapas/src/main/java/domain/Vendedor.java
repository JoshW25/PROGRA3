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
public class Vendedor {
   int codigo_producto;
    String Nombre_producto;
    String Precio_venta;

    public Vendedor() {
    }

    public Vendedor(int id_vendedor) {
        this.codigo_producto = id_vendedor;
    }

    public Vendedor(String nombreVendedor, String direVendedor) {
        this.Nombre_producto = nombreVendedor;
        this.Precio_venta = direVendedor;
    }

    public int getId_vendedor() {
        return codigo_producto;
    }

    public void setId_vendedor(int id_vendedor) {
        this.codigo_producto = id_vendedor;
    }

    public String getNombreVendedor() {
        return Nombre_producto;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.Nombre_producto= nombreVendedor;
    }

    public String getDireVendedor() {
        return Precio_venta;
    }

    public void setDireVendedor(String direVendedor) {
        this.Precio_venta = direVendedor;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "id_vendedor=" + codigo_producto+ ", nombreVendedor=" + Nombre_producto + ", direVendedor=" + Precio_venta + '}';
    }
    
}
