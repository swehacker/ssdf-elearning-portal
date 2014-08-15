Svenska Sportdykarförbundet eLearning Portal
===============

## Varför?
Svenska Sportdykarförbundet saknade ett verktyg för att hantera kurser och certifikat, så detta projektet uppstod från 
ett behov.
Systemet ska kunna hanteras av administratörer (kanslister), skolor (ideella och kommersiella aktörer), instruktörer och
elever.

### Huvudkraven för portalen
1. Instruktörer och skolor ska kunna lägga upp kurser.
2. Elever ska kunna anmäla sig till upplagda kurser.
3. Instruktörer kan uppdatera elevernas elevkort och skicka certifikatbeställningar när elever är klara.
4. Elever och instruktörer ska kunna uppdatera information om eleven (t ex certifikatsbild, adresser, tfn nummer, osv.)
5. Administratörer ska kunna hämta ut certifikatsbeställningarna och skicka beställning till tillverkning.
6. Administratörer ska kunna plocka ut statistik som sedan behövs för att rapportera in till idrottOnline och till kommitteér.

## Sätta upp utvecklingsmiljö
### BOM
* Java JDK v8
* Maven 3.1.1 eller senare
* Git SCM

### Konfiguration
Kopiera context.xml.org filen till context.xml för att sätta upp konfiguration av tomcat. Du behöver redigera konfigurationen
så att servern kan kontakta en riktig mail server och databas. När det gäller databasen så funkar den i Mac och Linux direkt
men du kan behöva kontrollera rättigheter för katalogen.

```cp conf/tomcat7/dev/context.xml.org conf/tomcat7/dev/context.xml```

## Starta systemet (quick start)

Starta tomcat från Maven

`mvn clean install tomcat7:run`

*Tomcat manager URL är http://localhost:8080/manager
*Authentication details of username admin and no password
*Context path är / för ssdf-ep-web