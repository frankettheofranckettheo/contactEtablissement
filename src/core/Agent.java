/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;
import java.time.LocalDate;
/**
 *
 * @author Noundjeu
 */
public class Agent extends Contact{
    
    public Agent(int salaire, String statut, String categorie, int indice_de_salaire, String occupation) {
        
    this.salaire = salaire;
    this.statut = statut;
    this.categorie = categorie;
    this.indice_de_salaire = indice_de_salaire;
    this.occupation = occupation;
    }

    public int getSalaire() {
        return salaire;
    }

    public String getStatut() {
        return statut;
    }

    public String getCategorie() {
        return categorie;
    }

    public int getIndice_de_salaire() {
        return indice_de_salaire;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public void setIndice_de_salaire(int indice_de_salaire) {
        this.indice_de_salaire = indice_de_salaire;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    
    
    
    int salaire;
    String statut;
    String categorie;
    int indice_de_salaire;
    String occupation;
}
