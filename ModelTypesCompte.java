/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifi.genielogiciel.model;

/**
 *
 * @author fred
 */
public class ModelTypesCompte {
    
    private String libelle;
    private float taux;
    private int idtypecompt;
    
    public ModelTypesCompte(String libell,float taux){
        
        this.libelle = libell;
        this.taux = taux;
    
    }
    
    /*creation du getter de l attribut libelle */
    
    public String getterliblle(){
    
        return this.libelle;
    }
    
    /*creation du getter de l'attribut taux interet */
    
    public float gettertaux(){
        
        return this.taux;
    
    }
    /*creation du id du type de compte */
    public int gettertypeCompt(){
    return idtypecompt;
    }
    
    /*creation du setter de l attribut  libelle */
    
    public void setterlibell (String libelle){
        this.libelle = libelle;
    
    }
    /*creation du setter de l attribut taux interet*/
    
    public void settertaux (float taux){
    
        this.taux = taux;
    }
    
}
