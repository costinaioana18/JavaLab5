package com.company;

public class Document {
    int ID;
    String name;
    String author;
    int year;


    public Document(int id, String nume, String autor, int an){ //constructing the doc
        this.ID=id;
        this.name=nume;
        this.author=autor;
        this.year=an;
    }

    public void print(){//printing the document's infos
        System.out.println("ID: "+ this.ID +", name: "+ this.name +", author: "+this.author+", year: "+this.year+";");
    }

    //getts
     public int getID() {
        return ID;
    }

    public String getName(){
        return name;
    }

    public int getYear(){
    return year;
    }

    public String getAuthor(){
        return author;
    }
}
