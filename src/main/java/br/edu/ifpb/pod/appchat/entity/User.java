/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.appchat.entity;

import java.io.Serializable;


/**
 *
 * @author João Marcos F <joaomarccos.ads@gmail.com>
 */

public class User implements Serializable{    
    private String name;

    public User(String nome) {
        this.name = nome;
    }

    public String getName() {
        return name;
    }

    public void setName(String nome) {
        this.name = nome;
    }
    
    @Override
    public boolean equals(Object obj) {
        return this.name.equals(((User) obj).getName());
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    @Override
    public String toString() {
        return this.name;
    }
}

