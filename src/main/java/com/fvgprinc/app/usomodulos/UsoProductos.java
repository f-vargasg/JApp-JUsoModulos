 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.fvgprinc.app.usomodulos;

import com.fvgprinc.app.javamoduletest2.producto.Producto;
import com.fvgprinc.tools.string.MyCommonString;

/**
 *
 * @author garfi
 */
public class UsoProductos {

    public static void main(String[] args) {
        Producto miProducto = new Producto();
        
        miProducto.setPrecio(15000);
        
        String scrap = "Esto es una prueba";
        
       scrap = MyCommonString.EMPTYSTR;
        
        System.out.println( miProducto.getDescuento());
    }
}
