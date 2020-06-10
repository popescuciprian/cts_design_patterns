# Design Patterns - CTS CSIE

## Tipuri de DP:
### Creationale - creare obiecte
* Singleton - Un obiect are intotdeauna aceeasi instanta. Ex: baza de date, logger, s.a.
* Simple Factory - Rezolva problema aducerii unei clase specifice, din n clase. Fara el, ar trebui sa tii minte constructorii fiecarei clase. (des intalnit)
* Factory Method - La fel ca la Simple, diferenta fiind decuplarea factory-ului, posibilitatea de a defini comportamente specifice unui factory de obiecte.
* Abstract Factory - La fel ca la Method, diferenta fiind abstractizarea tipurilor de clase (foarte rar intalnit)
* Builder - Rezolva problema constructorilor foarte mari
* Prototype - <PERFORMANTA> Deep copy intre prototipuri de obiecte. Ex: Minecraft, zid de caramida vs zid de piatra: 100 atribute identice, sub 10 diferite. Doar nu creezi de la 0 un obiect nou, nu?
### Structurale - relatie obiecte
### Comportamentale - gestiune actiuni
### Cuvinte cheie:
* Lazy instantiation - obiect creat atunci cand este necesar
* Enumerare cu un singur simbol - that's a Singleton