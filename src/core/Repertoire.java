/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;
import java.util.ArrayList;
/**
 *
 * @author Noundjeu
 */
public class Repertoire {

    public Repertoire(String Liste_de_Contacts) {
        this.Liste_de_Contacts = Liste_de_Contacts;
    }

    public String getListe_de_Contacts() {
        return Liste_de_Contacts;
    }

    public void setListe_de_Contacts(String Liste_de_Contacts) {
        this.Liste_de_Contacts = Liste_de_Contacts;
    }
    
    ArrayList liste = new ArrayList();
    
    /*private String ajouterUnContact(){
        return liste.add();
    }
    private String modifierUnContact(){
        
    }
    private String supprimerUnContact(){
        
    }*/
    
    String Liste_de_Contacts;
}
