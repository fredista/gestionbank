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
public class ModelTransaction {
    
    String datte;
    float montant;
    int numercompte;
    String naturetrans;
    int idtrans;
    int idpersonnlbanq;
    
    
    /*creation du constructeur de la classe ModelTransaction */
    
    public ModelTransaction(String datte,float montant,int numercompt,String naturetrans,int idperbq){
    
        this.datte = datte;
        this.montant = montant;
        this.numercompte = numercompt;
        this.naturetrans = naturetrans;
        this.idpersonnlbanq = idperbq;
    }
    
    /*creation du getter de l attribut datte*/
    public  String getterdattetrans(){
        return this.datte;
    }
    
    /*creation du getter montant de l attribut montant */
    public float gettermontanttrans(){
    
        return montant;
    }
    /*creation du getter de l attribuut numero de compte*/
    
    public int getternumercompt(){
    
        return this.numercompte;
    }
    
    /* creation du getter de l attribut nature de compte */
    public String getternaturetrans(){
     return naturetrans;
    }
    /* creation du getter de l attribut nature de compte */
    public int getteridpers(){
        return this.idpersonnlbanq;
    }
    /* creation de l id de la transaction */
    public int getteridtrans(){
        return idtrans;
    }
    /* creation du setter de l attribut datte*/
    public void setterdatte(String dat){
        this.datte = dat;
    }
    
    /* creation du setter de l attribut montant*/
    public void settermontant(float mont){
        this.montant = mont;
    }
    /* creation du setter de l attribut numerocompte*/
    public void setterNaturetrans(String naturetrns){
        this.naturetrans = naturetrns;
    }
    
}
