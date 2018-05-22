#objectoriented-programming #school
# Gjennomgang av læringsmål 
## Kunnskaper - kandidaten skal 
* vite hva arv og polymorfi er 
	* arv
		* arv er å bygge opp et hierarki hvor man kan ha klasser som defineres delvis gjennom å “arve” fra andre klasser. 
		* Man for eksempel ha en klasse for klesplagg. Her definerer man ting som er felles for alle klesplagg. Deretter kan man lage klasser for både jakker og sokker, som begge er klesplagg. Dersom jakker og sokker “arver” fra klesplagg-klassen, vil de få tilgang til egenskapene til klesplagg, uten å skrive dem på nytt. 
	* Polymorfi 
		* Man kan behandle subclasser som sin superklasse. Altså “endrer” man utseendet. Dvs., man kan behandle en bukse som et klesplagg. 
* vite om likheter/forskjeller mellom abstrakte klasser og interfaces
	* Et interface kan ikke ha konkrete metoder og angis med “Implements” i stedet for “extends”, slik som abstrakte klasser gjør.  
* vite hva unntakshåndtering innebærer 
	* Unntakshåndtering er å gjøre noe dersom kjøringen av programmet ikke går slik som planlagt. Det kan være at en fil ikke eksisterer, at noe av andre grunner skal forårsake et unntak. Man skiller mellom checked- og unchecked exceptions. Eller compile- og runtime time exceptions. Compile time exceptions _må_ håndteres for at programmet skal kompilere. 
* vite hva et design pattern er, og kjenne til noen eksempler på slike
	* Design patterns er kjente kodestrategier for å løse problemer. Kjente design patterns er Singleton, Factory Patterns, Decorator, Observer. 
	* Decorator 
		* Adds functionality to an existing object by wrapping it in another. BufferedReader is wrapping Reader, and is an example of the Decorator design pattern 
	* Factory Method 
		* Having a class that is dedicated to returning objects of other classes. For example, one could have a FruitFactory-class that returns Apple-objects, Orange-objects and so on 
	* Singleton 
		* Restricting the amount of instances to one (1) by having a private constructor. Instead of interacting with the constructor, someone using the class would interact with a static .getInstance method, that returns the same instance every time. 
	* Observer 
		* The observer method is based on a class watching (observing) for changes in other classes and acting based on the changes it is observing. 
## Ferdigheter - kandidaten skal 
* definere spesialiseringer av klasser gjennom arv 
* beherske bruk av abstrakte klasser og interfaces 
* anvende arv og interfaces gjennom kode med polymorfisk oppbygning 
* programmere enkle, grafiske brukergrensesnitt 
## Generell kompetanse - kandidaten skal 
* forklare begrepet “teknisk gjeld” sett i lys av design og implementasjon av kode 
* kunne forklare behovet for analyse og design i forbindelse med utvikling av kode 