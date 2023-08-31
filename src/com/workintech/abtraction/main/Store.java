package com.workintech.abtraction.main;

import com.workintech.abtraction.product.Bread;
import com.workintech.abtraction.product.Chocolate;
import com.workintech.abtraction.product.Coke;
import com.workintech.abtraction.product.ProductForSale;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];
        products[0] = new Chocolate("tatlı", 20, "efsane", true);
        products[1]= new Bread("bakery", 6, "taze", "white");
        products[2]= new Coke("market", 25, "asitli",true);

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
      for (ProductForSale product: products){
          if (product != null) {
              product.showDetails();
          }
      }
    }
}