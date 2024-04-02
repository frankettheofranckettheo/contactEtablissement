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
public class Contact {
    //String code, String nom, LocalDate date_de_naissance,String address, String email,String telNumber
    public Contact() {
    
    /*this.code = code;
    this.nom = nom;
    this.date_de_naissance = date_de_naissance;
    this.address = address;
    this.email = email;
    this.telNumber = telNumber;*/
    }

    public String getCode() {
        return code;
    }

    public String getNom() {
        return nom;
    }

    public LocalDate getDate_de_naissance() {
        return date_de_naissance;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDate_de_naissance(LocalDate date_de_naissance) {
        this.date_de_naissance = date_de_naissance;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }
    
    
    String code;
    String nom;
    LocalDate date_de_naissance = LocalDate.now();
    String address;
    String email;
    String telNumber;
}
