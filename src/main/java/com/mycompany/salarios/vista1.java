/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.salarios;

import java.io.IOException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import pojo.Idioma;

/**
 *
 * @author juan
 */

@ManagedBean(name = "view1")
@SessionScoped
public class vista1 implements Serializable {
    
   
    private String nombre;
    private int salario;
    private int dias;
    private int[] favNumber4;
    
   
    /**
     * Creates a new instance of vista1
     */
    public vista1() {
       
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private Idioma [] listaIdiomas;

    /**
     *
     * @param favNumber4
     */
    public void setFavNumber4(int[] favNumber4) {
        this.favNumber4 = favNumber4;
    }

    /**
     *
     * @return
     */
    public int[] getFavNumber4() {
        return favNumber4;
    }
    
    /**
     *
     * @return
     */
    public int getSalario() {
        return salario;
    }

    /**
     *
     * @param salario
     */
    public void setSalario(int salario) {
        this.salario = salario;
    }

    /**
     *
     * @return
     */
    public int getDias() {
        return dias;
    }

    /**
     *
     * @param dias
     */
    public void setDias(int dias) {
        this.dias = dias;
    }

    /**
     *
     * @return
     */
    public Idioma[] getListaIdiomas() {
                listaIdiomas = new Idioma[4];
		listaIdiomas[0] = new Idioma("Ingles", 10000);
		listaIdiomas[1] = new Idioma("Aleman", 20000);
		listaIdiomas[2] = new Idioma("Mandarin", 30000);
		listaIdiomas[3] = new Idioma("Frances", 40000);
        return listaIdiomas;
    }
    
    /**
     *
     * @return
     */
    public String getFavNumber4InString() {
		return Arrays.toString(favNumber4);
    }
    
    /**
     *
     * @return
     */
    public int obtenerTotal(){
       int total = 0;
       for(int cont = 0; cont < favNumber4.length; cont ++){
           total += favNumber4[cont];
       }
       return total;
    }
    
    /**
     *
     * @return
     */
    public int obtenerSalarioPorDias(){
        
        int total = salario * dias;
        
        return total;
    }
        
    /**
     *
     * @return
     */
    public String dirigir (){
     return "vista2";   
    }
}
