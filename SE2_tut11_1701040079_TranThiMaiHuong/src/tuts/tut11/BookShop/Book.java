/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuts.tut11.BookShop;

/**
 *Book - represents a book that holds title, author and price. A book should
offer information about itself in the format shown in the output below. 
 *
 */
public class Book {

 // 1. Add the Fields
protected String title;
protected String author;
protected int price;
    // 2. Add the Constructor
public Book(String author, String title, int price) {
 this.setAuthor(author);
 this.setTitle(title);
 this.setPrice(price);
} 
 // 3. Add the Properties
 // 4. Add the Methods

    public String getTitle() {
        return title;
    }

    public void setTitle(String title)throws IllegalArgumentException {
         if (title.length() <3) throw new IllegalArgumentException("Title not\n" +
"valid!");
        this.title = title;
    }
   public void setPrice(int price)throws IllegalArgumentException {
         if (price <0||price==0) throw new IllegalArgumentException("Price not valid");
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }


    @Override
public String toString() {
 final StringBuilder sb = new StringBuilder();
 sb.append("Type: ").append(this.getClass().getSimpleName())
 .append(System.lineSeparator())
 .append("Title: ").append(this.getTitle())
 .append(System.lineSeparator())
 .append("Author: ").append(this.getAuthor())
 .append(System.lineSeparator())
 .append("Price: ").append(this.getPrice()) 
         .append(System.lineSeparator());
 return sb.toString(); 


}
}