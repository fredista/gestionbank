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
abstract class personne {
    
    protected String nom;
    protected String prenom;
    protected String datenaissnce;
    
    
    public String getternom(){
        return nom;
    }
    
    public String getterprenom(){
    
        return prenom;
    }
    
    public String getterdatenais(){
         
        return datenaissnce;
    }
    
    
    public void setternom (String nom){
        this.nom = nom;
    }
    
    public void setterprenom(String prenom){
    
        this.prenom = prenom;
    }
    
    public void setterdatenaissnce(String datenaissnce){
    
        this.datenaissnce = datenaissnce;
    }
}
