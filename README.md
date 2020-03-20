# JavaLab5

Laboratorul 5- partea compulsory

Am creat clasa Document, cu diferite atribute precum Id, nume, autor, anul publicatiei, si clasa Catalog, caracterizata printr-un ArrayList de Documente.

Clasa Catalog are metode ce se ocupa cu "actiunile externe" precum salvarea unui catalog sau incarcarea acestuia intr-un/dintr-un fisier extern.

Metoda saveCatalog serializeaza pe rand fiecare Document aflat in catalog, scriindu-l in forma binara in fisierul catalogs.ser

Metoda loadCatalog citeste din fisier obiectele deja serializate si le adauga (in forma normala) la arrayListul catalogului.

Am luat in considerare si exceptiile (posibil ca ceva sa nu functioneze perfect 100% pentru ca mi se 'prinde' o exceptie) 

Totusi, outputul programului(pe consola) este urmatorul:

The catalog contains the following documents: 

ID: 1, name: D1, author: Mircea Constantin, year: 2017;

ID: 2, name: D2, author: Andrei Ionescu, year: 2019;

ID: 3, name: D3, author: Popescu Ramona, year: 2020;
