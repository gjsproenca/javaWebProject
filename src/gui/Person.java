/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.image.BufferedImage;
import java.io.Serializable;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author osao
 */
public class Person implements Serializable {

    //constructor
    //atributos
    public Person(String name, String phone, String email, String address, String notes, Icon image, String iconName) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.notes = notes;
        this.image = image;
        this.iconName = iconName;
    }

    private String name;
    private String phone;
    private String email;
    private String address;
    private String notes;
    private Icon image;
    private String iconName;

    //getters  
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getNotes() {
        return notes;
    }

    public Icon getImage() {
        return image;
    }

    public String getIconName() {
        return iconName;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setImage(Icon image) {
        this.image = image;
    }

    public void setIconName(String iconName) {
        this.iconName = iconName;
    }
}
