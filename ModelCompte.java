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
public class ModelCompte {
    
    int idcompt;
    int numeroCompt;
    float soldecompt;
    int numeroclient;
    int idtypecompt;
    
    /*creation du constructeur de la classe ModelCompte */
    public ModelCompte(int numeroCompt,float soldecompt,int numeroclient,int idtypecompt){
        
        //this.idcompt      = idcompt;
        this.soldecompt   = soldecompt;
        this.numeroclient = numeroclient;
        this.idtypecompt  = idtypecompt;
        this.numeroCompt  = numeroCompt;
    
    }
    
   /*creation du getter de l attribut numeroCompt */
    public int getternumeroCompt(){
    return numeroCompt;
    }
    
  /*creation du getter de l attribut numeroclient */
    public float gettersoldecompt(){
     return soldecompt;
    }
   /*creation du getter de l attribut solde compt*/
    public float getternumeroclient(){
      return numeroclient;
    }
    
    /*creatoin du getter de l attribut idtypecomp*/
    public int getteridtypecompt(){
     return idtypecompt;
    }
    
    /*creation du setter numeroCompt*/
    
    public void setternmerocmpt(int numeroCmpt){
        this.numeroCompt = numeroCmpt;
    }
    
    /* creation du setter soldecompt*/
    
    public void settersoldecompt (float soldecompt){
    
        this.soldecompt = soldecompt;
    }
    
    /*creation du setter numeroclient */
    
    public void setternumeroclient (int numclient){
    
        this.numeroclient = numclient;
    }
    
  /* creation du setter de l attribut idtype compte*/
    public void idtypecompte (int idtypecompt){
    
        this.idtypecompt = idtypecompt;
    }
}
