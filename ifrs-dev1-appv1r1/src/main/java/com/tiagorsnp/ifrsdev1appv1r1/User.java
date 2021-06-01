package com.tiagorsnp.ifrsdev1appv1r1;
import javax.persistence.*;


@Entity // This tells Hibernate to make a table out of this class
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    Integer id;
    String name;
    String email;
    String phone;
    String password;

    // id

    public Integer getId()
    {
        return this.id;
    }
    public void setId(Integer valor)
    {
        this.id=valor;
    }

    // name

    public String getName()
    {
        return this.name;
    }
    public void setName(String valor)
    {
        this.name=valor;
    }

    // email

    public String getEmail(){
    	return this.email;}
    public void setEmail(String valor)
    {
        this.email=valor;
    }

    // phone

    public String getPhone(){
    	return this.phone;}
    public void setPhone(String valor){
    	this.phone=valor;}

    // password

    public String getPassword(){
    	return this.password;}
    public void setPassword(String valor){
    	this.password=valor;}

}