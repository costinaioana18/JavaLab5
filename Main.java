package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException { //we added the proper exceptions
        //creating 3 documents
        Document D1 = new Document(1, "D1", "Mircea Constantin", 2017);
        Document D2 = new Document(2, "D2", "Andrei Ionescu", 2019);
        Document D3 = new Document(3, "D3", "Popescu Ramona", 2020);
        Catalog C1 = new Catalog();
        //putting the documents in the new catalog
        C1.addDocument(D1);
        C1.addDocument(D2);
        C1.addDocument(D3);

        C1.print(); //printing the catalog's info
        C1.saveCatalog(); //writing the catalog into a file by serializing the objects (check method in Catalog class)

        Catalog C2 = new Catalog(); //creating a new catalog in order to load it from the previos created file
        C2.loadCatalog(); // loading it


    }
}
