/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.appchat.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Id;

/**
 *
 * @author RODOLFO ROCHA
 */
@Entity
public class Message implements Comparable<Message>, Serializable{
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @Column(name = "Usuario")
    private String userName;
    @Column(name = "Mensagem")
    private String msg;

    public Message(String userName, String msg) {
        this.id = System.currentTimeMillis();
        this.userName = userName;
        this.msg = msg;
    }

    public Message(long id, String userName, String msg) {
        this.id = id;
        this.userName = userName;
        this.msg = msg;
    }        

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return this.id+":"+this.userName+":"+this.msg;
    }

    @Override
    public boolean equals(Object obj) {
        return this.id == ((Message) obj).getId();
    }
    
    @Override
    public int hashCode() {
        return new Long(this.id).hashCode();
    }        

    @Override
    public int compareTo(Message m) {
       return (int) (this.getId()-m.getId());
    }
    
    
}