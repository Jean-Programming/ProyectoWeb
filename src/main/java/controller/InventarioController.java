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
@Named(value = "inventarioController")
@SessionScoped
public class InventarioController implements Serializable {

    /**
     * Creates a new instance of InventarioController
     */
    public InventarioController() {
    }
    
}
