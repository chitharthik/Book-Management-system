package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity

public class homemodel 
{
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   
   int id;
   String name;
   String author;
   String price;
   public homemodel(int id,String name,String author,String price)
   {
	   super();
	   this.id=id;
	   this.name=name;
	   this.author=author;
	   this.price=price;
	   
   }
   public homemodel()
   {
	   super();
   }
   public int getId()
   {
	   return id;
   }
   public void setId(int id)
   {
	   this.id=id;
   }
   public String getName()
   {
	   return name;
   }
   public void setName( String name)
   {
	   this.name=name;
   }
   public String getAuthor()
   {
	   return author;
   }
   public void setAuthor( String author)
   {
	   this.author=author;
   }
   public String getPrice()
   {
	   return price;
   }
   public void setPrice( String price)
   {
	   this.price=price;
   }
}
