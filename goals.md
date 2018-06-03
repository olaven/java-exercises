# Kandidaten skal 
## Kunnskaper 
* Vite hva arv og polymorfi er 
	* En klasse arver fra en annen dersom den variabler og metoder fra klassen den arver fra. 
	* Polymorfi handler om at man kan behandle subklasser som sine superklasser. Sup sub = new Sub()
* Kjenne likheter og forskjeller mellom interfaces og abstrakte klasser 
	* Interfaces og abstrakte klasser kan begge ha abstrakte metoder. 
	* Interfaces har ikke konstruktører. 
	* Abstrakte klasser lever i klassehierarkiet. Det gjør ikke interfaces. 
	* Interfaces har alle metoder som public, frem til java 9. 
	* Interfaces har felter som både static og final. 
* Vite hva unntakshåndtering innebærer 
	* Unntakshåndtering handler om å kommunisere en feil 
	* Alle unntak (Exceptions) arver enten fra Exception eller RuntimeException.
	* Checked exceptions (Exception) eller Unchecked Exceptions (RuntimeException)
	* Checked exceptions sjekkes av kompilatoren. 
	* RuntimeExceptions sjekkes ikke, men kan stoppe kjøring om en av feilene kastes
	* Checked Exceptions må håndteres av programmerer i en "try-catch"-statement.
	* Om en Exception kastes, avbrytes execution flow i den "try-catch"-statementen. Ikke utenfor.  
* Vite hva et design pattern er og kjenne eksempler på slike 
	* Et design pattern er en kjent teknikk/mønster for å løse problemer. 
	* Gjente pattern inkluderer 
		* Singleton
			* Sørge for at det kun finnes en instans av en klasse. 
			* Dette kan gjøres ved å ha en privat konstruktør, men tilby en statisk metode som returnerer 
			den samme instansen hver gang. 
		* Decorator 
			* Et pattern hvor man utvider funksjonalitet til en klasse ved sende det gjennom en annen klasse (revisit)
		* Factory
			* Å lage en klasse (factory) som lager andre klasser. For eksempel en FruitFactory som lager Apple, Orange og Lemon
		* Observer 
			* En klasse som har metoder for å håndtere ting som skjer i andre klasser. Dersom tilstanden i en klasse 
			endrer seg på et punkt, kalles metoden i observer-klassen. For eksempel en Controller som lytter på endringer i en applikasjons tilstand. 
## Ferdigheter 
* Definere spesialiseringer av klasser gjennom arv 
* Beherske bruk av abstrakte klasser og interfaces 
* Anvende arv og interfaces i kode med polymorfisk oppbygging 
* Programmere enkle grafiske brukergrensesnitt 
## Generelt 
* Forklare begrepet "teknisk gjeld" sett i lys av design og implementasjon av kode 
* Kunne forkalre behovet for analyse og design i utvikling av kode 