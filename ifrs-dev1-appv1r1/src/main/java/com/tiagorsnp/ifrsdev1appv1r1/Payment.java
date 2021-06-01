package com.tiagorsnp.ifrsdev1appv1r1;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;


@Entity // This tells Hibernate to make a table out of this class
public class Payment {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    Integer id;
    Date moment;

    // id

    public Integer getId()
    {
        return this.id;
    }

    public void setId(Integer valor)
    {
        this.id=valor;
    }

    // moment

    public Date getMoment()
    {
        return this.moment;
    }

    public void setMoment(Date valor)
    {
        this.moment=valor;
    }

}