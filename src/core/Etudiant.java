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
public class Etudiant extends Contact{

    public Etudiant(String cycle, int niveau) {
        this.cycle = cycle;
        this.niveau = niveau;
    }

    public String getCycle() {
        return cycle;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }
    
    
    String cycle;
    int niveau;
}
