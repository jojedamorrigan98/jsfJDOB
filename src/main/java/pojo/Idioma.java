/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author juan
 */
public class Idioma {
    private String idioma;
    private Integer precio;

    /**
     *
     * @param idioma
     * @param precio
     */
    public Idioma(String idioma, Integer precio) {
        this.idioma = idioma;
        this.precio = precio;
    }

    /**
     *
     * @return
     */
    public String getIdioma() {
        return idioma;
    }

    /**
     *
     * @param idioma
     */
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    /**
     *
     * @return
     */
    public Integer getPrecio() {
        return precio;
    }

    /**
     *
     * @param precio
     */
    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
    
    
}
