package com.example.demo.entity;
import lombok.*;
import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.ManyToOne;

@Entity
@Data  // lombox จะสร้าง method getter setter ให้เอง
@Table(name="Product") //ชื่อตาราง

public class Product{
        @Id  
        @NotNull
        @SequenceGenerator(name="productId_seq",sequenceName="productId_seq")               
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="productId_seq")     
        private @NonNull Long productId;

 
    private @NonNull String name;
    private @NonNull Double  price;
    private @NonNull int  Qty;
  
      


public Product(String name , Double price , int Qty){
        this.name = name;
        this.price = price;
        this.Qty = Qty;
	}


}

