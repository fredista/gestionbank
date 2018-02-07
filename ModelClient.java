/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifi.genielogiciel.model;
 import java.util.Date;
import java.util.*;
/**
 *
 * @author fred
 */
public class ModelClient extends personne {
    
    private String profession;
    private int numeroclient;
    private int idpersonnelbanq;  //le personnel de la banque qui gere chaque client
    
    /* creation du constructeur  de la classe Modelclient*/
  public ModelClient (String nom,String prenom,String datenaissnc,String profession,int numeroclient,int id){
      
      this.nom = nom;
      this.prenom = prenom;
      this.datenaissnce = datenaissnc;
      this.profession = profession;
      this.numeroclient = numeroclient;
      this.idpersonnelbanq = id;
      
      //System.out.println("ok un nouveau element vient d'etre cree");
      
  
  }
  
  /* creation du getter de l attribut profession */
  
     public String getterprofession(){
     
         return profession;
     }
    
      /* creation du getter de l attribut numeroclient */
     
     public int getternumerclient(){
         return this.numeroclient;
     }
     
      /* creation du getter de l attribut idpersonbanque */
      public int getteridpers(){
          return this.idpersonnelbanq;
      }
      
      /*creation des setters de l attribut profession */
      
      public void setter(String prof){
      
          this.profession = prof;
      }
      
       /* creation du getter de l attribut numeroclient */
      public void setter(int numerocli){
          this.numeroclient = numerocli;
      }
}
