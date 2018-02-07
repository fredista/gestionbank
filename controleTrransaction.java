/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifi.genielogiciel.controlleur;
import java.sql.*;
import ifi.genielogiciel.model.*;

/**
 *
 * @author fred
 */
public class controleTrransaction {
    
   
    Statement stat;
    bdd tranbdd;
    ResultSet resultat;
    float mont;
    
    
    
    /*fonction permattant de retourner le montant actuel dans un compte */
    
    public float montantactuel (int numrocp){
    
        try{
            
               bdd transbdd = new bdd();
               stat = transbdd.conn().createStatement();
               
               resultat = stat.executeQuery("select soldecpt from compte where numerocpt = "+numrocp+"");
                if(resultat.next())
                    mont = resultat.getFloat("soldecpt");  // recuperation du montant actuel du compte
        
        }
            catch(SQLException ex){
            
                System.out.println("erreur montantactu "+ex.getMessage());
            }
               return mont;
    }
    
                   /* fonction permettant de faire une transaction de depot dans un compte */
      public void deposer(ModelTransaction trans){
      
           try{
                   float montan = montantactuel(trans.getternumercompt()) + trans.gettermontanttrans();
                   //cette operation  permet de recuperer le montant du solde du compte implique dans la transaction et d'y ajouter un nouveau montant
                   tranbdd = new bdd();
                   stat = tranbdd.conn().createStatement();
                   stat.executeUpdate("UPDATE compte SET soldecpt = "+montan+" where numerocpt= "+trans.getternumercompt());
                   
                   System.out.println("numero de compte***** " +trans.getternumercompt());
                   
                   System.out.println(" un depot de  "+montan+" vient d etre  depose avec succes sur le"+trans.getternumercompt());
                 
           
           }
              catch(SQLException ex){
              
                  System.out.println("erreur sur opera depot "+ex.getMessage());
              }
      }
    
               /*fonction permettant de retire un montant ou faire une operation de retrait sur un compte */
     
       public void retrait(ModelTransaction trans){
       
           if(montantactuel(trans.getternumercompt()) < trans.gettermontanttrans())  // on verifie si le montant dans le compte est inferieur au montant actuel
               System.out.println("cette operation ne peut pas aboutir car le solde du compte est inferieur au montant sollicte");
           else{
                   try{
                          
                          mont = montantactuel(trans.getternumercompt()) - trans.gettermontanttrans();
                          // on soustrait du solde  du commpte le montant a retire
                          tranbdd = new bdd();
                            stat = tranbdd.conn().createStatement();
                            stat.executeUpdate("UPDATE compte SET soldecpt = "+mont+" where numerocpt = "+trans.getternumercompt()+"");
                            System.out.println("un montant de "+trans.gettermontanttrans()+" vient d etre retire sur le compte "+trans.getternumercompt());
                   }  
                    catch(SQLException ex){
                        System.out.println("erreur sur operation de retrait "+ex.getMessage());
                    }
           
           }
       }
       
       
             /*fonction permettant d enregistrer une operation de transaction */
       
       public void enrgistre(ModelTransaction trans){
            try{
                    tranbdd = new bdd();
                    stat = tranbdd.conn().createStatement();
                    stat.executeUpdate("INSERT INTO transaction (datte,montant,numercompt,naturetrans,idperso) VALUES ('"+trans.getterdattetrans()+"',"+trans.gettermontanttrans()+","+trans.getternumercompt()+",'"+trans.getternaturetrans()+"',"+trans.getteridpers()+")");
            
            } 
                catch(SQLException ex){
                    System.out.println("erreur enrgist transit "+ex.getMessage());
                }
       }
}
