

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package be.vdab.entiteiten;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Arrays;

/**
 *
 * @author Andy.mertens
 */
public class Pizza implements Serializable {
    
    private static final long serialVersionUID=1L;
    private String naam;
    private BigDecimal prijs;
    private long id;
    private boolean pikant;
    
    public Pizza(long id, String naam, BigDecimal prijs, boolean pikant){
       this(naam,prijs,pikant);
       setID(id);
    }
    
    public Pizza(String naam, BigDecimal prijs, boolean pikant){
       setNaam(naam);
       setPrijs(prijs);
       setPikant(pikant);
    }

    /**
     * @return the naam
     */
    public String getNaam() {
        return naam;
    }

    /**
     * @param naam the naam to set
     */
    public void setNaam(String naam) {
        if(!isNaamValid(naam))throw new IllegalArgumentException();
        this.naam = naam;
    }

    /**
     * @return the prijs
     */
    public BigDecimal getPrijs() {
        return prijs;
    }

    /**
     * @param prijs the prijs to set
     */
    public void setPrijs(BigDecimal prijs) {
        if(!isPrijsValid(prijs)) throw new IllegalArgumentException();
        this.prijs = prijs;
    }

    /**
     * @return the id
     */
    public long getID() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setID(long id) {
        this.id = id;
    }

    /**
     * @return the pikant
     */
    public boolean isPikant() {
        return pikant;
    }
    
    /**
     * @param pikant the pikant to set
     */
    public void setPikant(boolean pikant) {
        this.pikant = pikant;
    }
    
    //validatie voor naam kan gedaan worden zonder een intantie te moeten maken van pizza
    public static boolean isNaamValid(String naam){
        return naam!=null && !naam.isEmpty();
    }
    
    public static boolean isPrijsValid(BigDecimal prijs){
        return prijs!=null && prijs.compareTo(BigDecimal.ZERO) >=0;
    }

    
}
