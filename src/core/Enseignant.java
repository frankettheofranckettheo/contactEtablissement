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
public class Enseignant extends Contact {

    public Enseignant(String statut) {
        this.statut = statut;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }
    
    
    String statut;
}
