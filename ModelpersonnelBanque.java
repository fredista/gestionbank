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
public class ModelpersonnelBanque extends personne{
    
    String fonction;
    
    public ModelpersonnelBanque(String nom,String prenom,String datenais,String fonct){
    
        this.nom = nom;
        this.prenom = prenom;
        this.datenaissnce = datenais;
        this.fonction = fonct;
    }
    
    /* creation du getter de l attribut fonction */
    
    public String getterfonction(){
    
        return this.fonction;
    }
    
    /*creation du setter de l attribut fontion */
    
    public void setterfonction(String fonct){
    
        this.fonction = fonct;
    }
}
