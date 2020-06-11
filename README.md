# Design Patterns - CTS CSIE

## Tipuri de DP:
### Creationale - creare obiecte
* Singleton - Un obiect are intotdeauna aceeasi instanta. Ex: baza de date, logger, s.a.
* Simple Factory - Rezolva problema aducerii unei clase specifice, din n clase. Fara el, ar trebui sa tii minte constructorii fiecarei clase. (des intalnit)
* Factory Method - La fel ca la Simple, diferenta fiind decuplarea factory-ului, posibilitatea de a defini comportamente specifice unui factory de obiecte.
* Abstract Factory - La fel ca la Method, diferenta fiind abstractizarea tipurilor de clase (foarte rar intalnit)
* Builder - Rezolva problema constructorilor foarte mari
* Prototype - <PERFORMANTA> Deep copy intre prototipuri de obiecte. Ex: Minecraft, zid de caramida vs zid de piatra: 100 atribute GENERATE identice, sub 10 diferite. Faci un clone unde clonezi rezultatele deja obtinute!
### Structurale - relatie obiecte / 'Cum se leaga?' / Modifici clasele, fara sa le modifici :D
* Adapter - rezolva problema adaptarii unui obiect la framework, sau framework la obiect existent
    * NOTE: ai doua posibilitati, fie adaptezi un obiect deja existent, la un framework, fie adaptezi clasa sa creeze obiecte adaptate la framework
* Decorator - NOT Adapter - decorare a starii sau functionalitatii unor obiecte. Adaptorul ADAPTEAZA, Decoratorul MODIFICA starea (atributele), fara sa modifici clasa.
### Comportamentale - gestiune actiuni
### Cuvinte cheie:
* Lazy instantiation - obiect creat atunci cand este necesar
* Enumerare cu un singur simbol - that's a Singleton