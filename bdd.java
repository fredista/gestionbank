/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifi.genielogiciel.controlleur;
import java.sql.*;
/**
 *
 * @author fred
 */
public class bdd {
    
    Connection connexion;
    
    public bdd(){
        
       try{
          Class.forName("com.mysql.jdbc.Driver");
          // System.out.println("chargement pilote a reussi");
       
       }
        catch(ClassNotFoundException ex){
            System.out.println("erreur de chargement des pilotes"+ex.getMessage());
            
        }
    
    
     try{
            connexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/banque","root","");
            //System.out.println("la connexion a la base de donnee reussie");
   }
     catch(SQLException e){
    
                System.out.println("erreur de connection a la base de donnee"+e.getMessage());
            }
    }
    
    
    public Connection conn(){
      return connexion;
               }
}


