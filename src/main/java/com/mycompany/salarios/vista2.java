/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.salarios;


import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import pojo.Idioma;

/**
 *
 * @author juan
 */
@ManagedBean(name = "view2") 
@RequestScoped
public class vista2 {
    
     @ManagedProperty("#{view1}")
     private vista1 vistaA;
     private String saludo;
    /**
     * Creates a new instance of vista2
     */
    public vista2() {
    }

    /**
     *
     * @return
     */
    public vista1 getVistaA() {
        return vistaA;
    }

    /**
     *
     * @param vistaA
     */
    public void setVistaA(vista1 vistaA) {
        this.vistaA = vistaA;
    }
    
    /**
     *
     * @return
     */
    public String getSaludo() {
       
        int total = vistaA.obtenerTotal() + vistaA.obtenerSalarioPorDias();
        
        String hola= "Hola Sr/a. " + vistaA.getNombre();
        String incentivos = "*Incentivos por idiomas que seleccionó: " + vistaA.getFavNumber4InString();
        String diasTrabajados = " *Precio del dia trabajado es de "+vistaA.getSalario()+" usted trabajó: "+vistaA.getDias() +" dias";
        String totalIncentivos = " *Total en incentivos es: "+ vistaA.obtenerTotal();
        String totalSalarioDias = " *Total días trabajados: "+vistaA.obtenerSalarioPorDias();
        String salarioFinal = " *Por ende señor " + vistaA.getNombre() + " su salario total es $ " + total;
       
        saludo = hola + "\n" + incentivos + "\n" + diasTrabajados+ "\n" + totalIncentivos+"\n" + totalSalarioDias + "\n" + salarioFinal;
        
        
        return saludo;
    }

    /**
     *
     * @param saludo
     */
    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }
   
}
