package com.tiagorsnp.ifrsdev1appv1r1;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity // This tells Hibernate to make a table out of this class
public class Pessoa {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    Integer id;
    String name;
    String email;

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

    public String getEmail()
    {
        return this.email;
    }

    public void setEmail(String valor)
    {
        this.email=valor;
    }

}