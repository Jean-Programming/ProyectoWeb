/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author JeanCarlo Merizalde
 */
@Named(value = "detalleProductoController")
@SessionScoped
public class DetalleProductoController implements Serializable {

    /**
     * Creates a new instance of DetalleProductoController
     */
    public DetalleProductoController() {
    }
    
}
