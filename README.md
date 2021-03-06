# Design Patterns - CTS CSIE

## Tipuri de DP:
### Creationale - creare obiecte
* Singleton - Un obiect are intotdeauna aceeasi instanta. Ex: baza de date, logger, s.a.
#
![](images/Singleton.png)
#
* Simple Factory - Rezolva problema aducerii unei clase specifice, din n clase. Fara el, ar trebui sa tii minte constructorii fiecarei clase. (des intalnit)
#
![](images/SimpleFactory.png)
#
* Factory Method - La fel ca la Simple, diferenta fiind decuplarea factory-ului, posibilitatea de a defini comportamente specifice unui factory de obiecte.
#
![](images/FactoryMethod.png)
#
* Abstract Factory - La fel ca la Method, diferenta fiind abstractizarea tipurilor de clase (foarte rar intalnit)
#
![](images/AbstractFactory.png)
#
* Builder - Rezolva problema constructorilor foarte mari
#
![](images/Builder.png)
#
* Prototype - <PERFORMANTA> Deep copy intre prototipuri de obiecte. Ex: Minecraft, zid de caramida vs zid de piatra: 100 atribute GENERATE identice, sub 10 diferite. Faci un clone unde clonezi rezultatele deja obtinute!
#
![](images/Prototype.png)
#
### Structurale - relatie obiecte / 'Cum se leaga?' / Modifici clasele, fara sa le modifici :D
* Adapter - rezolva problema adaptarii unui obiect la framework, sau framework la obiect existent
    * NOTE: ai doua posibilitati, fie adaptezi un obiect deja existent, la un framework, fie adaptezi clasa sa creeze obiecte adaptate la framework
#
![](images/Adapter.png)
#
* Decorator - NOT Adapter - decorare a starii sau functionalitatii unor obiecte. Adaptorul ADAPTEAZA, Decoratorul MODIFICA starea (atributele), fara sa modifici clasa.
#
![](images/Decorator.png)
#
* Facade - Simplifica un framework, printr-un layer intermediar
#
![](images/Facade.png)
#
* Composite - Rezolva problema ierarhiilor/arborescente 
#
![](images/Composite.png)
#
* Flyweight - Rezolva problema a prea multe clone. Ex: editor text, literele ca obiecte.
#
![](images/Flyweight.png)
#
* Proxy - Interconectare API-uri, unei interfata intre doua framework-uri, validari acces, adaugare functionalitate la accesare obiect -> "Cand delegi executia unei metode? Proxy valideaza. Fara el, executa direct"
#
![](images/Proxy.png)
#
### Comportamentale - gestiune actiuni
* Strategy - Rezolva problema lipsei pointerilor la functii in Java. Ii dai obiectului, un alt obiect care sa rezolve problema. (ex: calculator, si operatie)
#
![](images/Strategy.png)
#
* State - Un fel de Strategy, dar autonoma: Nu mai alegem noi operatia, ci obiectul alege singur. Masina de stari.
#
![](images/State.png)
#
* Observer - Metoda de comunicare intre un OBSERVABIL (buton) si un OBSERVER (om, eveniment la click, etc).
#
![](images/Observer.png)
#
* Chain of Responsability -Un fel de observer DAR Observatorii comunica intre ei, ca intr-un lant.
#
![](images/Chain.png)
#
* Command - Rezolva actiunile care pot fi executate mai tarziu (ex: cainele care aduce mingea inapoi: nu stii exact cand)
#
![](images/Command.png)
#
* Memento - Sa poti salva starea obiectului in timp, si uneori chiar sa te intorci. Originatorul isi salveaza state-ul intr-un Memento. Tot el este responsabil de creearea lui sau de icnarcarea lui. Memento-ul este si el bagat intr-o lista, pt versionare
#
![](images/Memento.png)
#
* Template - (Insert meme: [Template] I am a Design Pattern! [All other design patterns] Am I a joke to you?) Interfata template de lucru. Rezolva problema cand niste clase trebuie sa indeplineasca exact acelasi lucru, dupa un anumit template
#
![](images/Template.png)
#

#
## Cuvinte cheie:
* Lazy instantiation - obiect creat atunci cand este necesar
* Enumerare cu un singur simbol - that's a Singleton
* Observer vs Chain:
    * Observer - Fiecare observator trateaza evenimentul si lucreaza de capul lui, independent (ex: Subscribe youtube: notificare mail, notificare push, motificare desktop etc etc)
    * Chain - Observatorii lucreaza in lant (ex: tratarea unui pacient in functie de boala-> farmacist<asistent<medic<doctor<chirurg<Dumnezeu)
* Observer:
    * PUSH - Observabilul trimite detaliul observatorilor (Psst! I was cliked!)
    * PULL - Observatorul cere datele cand are nevoie de ele (u clicked? u clicked? u clicked? u clicked?...s.a.)
* State vs Strategy:
    * Strategy - Cineva decide si nu are control (Calculator personal)
    * State - Obiectul este independent, el alege (Semafor, independent si afiseaza in functie de state); PS: se porneste cu o stare initiala, cerinta care nu e obligatorie la strategy!
* Decorator vs Proxy:
    * Decorator -> modifici starea/modul in care un obiect se comporta
    * Proxy -> controlezi accesul la obiect, intrebi proxy-> proxy.metoda ==ok? obiect.metoda.
* Adapter vs Decorator vs Facade:
    * Adaper -> adaptez o instanta sau o clasa, la un anumit framework
    * Decorator -> adaug o metoda/atribut NOU la un anumit obiect (JavaScript wise)
    * Facade -> simplific un framework, prin definirea unor metode facade
* Flyweight vs Decorator vs Prototype: Exemplu joc cu masini de curse:
    * Prototype -> incarc pe baza clonelor, mai rapid, modelele 3D ale masinilor (memorie = dimensiune * nr_masini)
    * Decorator -> folosint clonele de mai sus, modific la runtime, culoarea masinilor (memorie = dimensiune * nr_masini)
    * Flyweight -> incarc un singur model, pe care il clonez shallow si adaug clonelor shallow modificari (memorie = dminesiune + modificari*nr_masini)