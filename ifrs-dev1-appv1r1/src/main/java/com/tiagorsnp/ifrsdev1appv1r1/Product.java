package com.tiagorsnp.ifrsdev1appv1r1;
import javax.persistence.*;


@Entity // This tells Hibernate to make a table out of this class
public class Product {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    Integer id;
    String name;
    String description;
    Double price;
    String imgUrl;

    @ManyToOne
    Category category;

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

    // description

    public String getDescription()
    {
        return this.description;
    }

    public void setdescription(String valor)
    {
        this.description=valor;
    }

    // price

    public Double getPrice()
    {
        return this.price;
    }

    public void setPrice(Double valor)
    {
        this.price=valor;
    }

    // imgUrl

    public String getImgUrl()
    {
        return this.imgUrl;
    }

    public void setImgUrl(String valor)
    {
        this.imgUrl=valor;
    }

    // Category

    public Category getCategory()    {
    	return this.category;  }
    public void setCategory(Category valor){
    	this.category=valor;}
}
