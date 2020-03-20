package com.company;

import java.io.*;
import java.util.ArrayList;

public class Catalog {
    ArrayList<Document> documents = new ArrayList<>(); //catalogul are ca atribut un arrayList de documente
    int nrOfDocuments;

    public Catalog() {
        nrOfDocuments = 0;
    }

    public void addDocument(Document doc) { //adaugam un document la arrayList
        documents.add(doc);
        this.nrOfDocuments++;
    }

    public void print() { //printam catalogul (documentele pe care le contine)
        System.out.println("The catalog contains the following documents: ");
        for (Document d : documents) {
            d.print();
        }
    }

    public void saveCatalog() throws IOException { //serializing documents as objects and writing them in a binary format, in a new file
        //also, taking care of exceptions
        FileOutputStream fos = new FileOutputStream("catalogs.ser"); // preparing the new file
        ObjectOutputStream out = new ObjectOutputStream(fos);
        for (Document d : documents) {
            out.writeObject(d); //writing each object from the catalog in the file
        }
        out.flush();
        fos.close(); //we close it

    }

    //trying to load the catalog from an existing file by reading the serialized objects
    public void loadCatalog() throws IOException, ClassNotFoundException { //being aware of the exceptions
        FileInputStream fis = new FileInputStream("catalogs.ser");
        ObjectInputStream in = new ObjectInputStream(fis); // preparing to read the data
        for (int i = 0; i <= 2; i++) { //we keep doing this while we still have objects to read
            Document doc = (Document) in.readObject(); //"reading" an object
            documents.add(doc); // adding the red document to the array
        }
        fis.close(); //closing the file
    }


}
