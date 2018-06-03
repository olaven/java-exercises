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
```java 
	public class Person
	{
		protected String name; 
		public Person(String name)
		{
			this.name = name; 
		}
		public void walk()
		{
			System.out.println("The person is walking"); 
		}
	}
	public class Student extends Person
	{
		private double gradeAverage; 
		public Student(String name, double gradeAverage)
		{
			super(name); 
			this.gradeAverage = gradeAverage; 
		}
	}
```
* Beherske bruk av abstrakte klasser og interfaces 
``` java 
	public interface CanFly
	{
		public void takeoff(); 
		public void land(); 
	}
	public abstract class AirCraft implements CanFly
	{
		private double weight; 
		public AirCraft(double weight)
		{
			this.weight = weight; 
		}
		public void takeoff()
		{
			System.out.println(weight + " kilograms is taking of"); 
		}
		public void land()
		{
			System.out.println(weight + " kilograms is landing"); 
		}
	}
	// has all inherited from AirCraft, including CanFLy, which aircraft implements 
	public class Helicopter extends AirCraft
	{
		private double radius; 
		public Helicopter(double weight, double radius)
		{
			super(weight); 
			this.radius = radius; 
		}
	}
	// has all inherited from AirCraft, including CanFLy, which aircraft implements 
	public class Seaplane extends AirCraft
	{
		private double wingspan; 
		public Seaplane(double wingspan)
		{
			this.wingspan = wingspan; 
		}
	}
```
* Anvende arv og interfaces i kode med polymorfisk oppbygging 
``` java 
	public interface HasCaffeine
	{
		public double getCaffeineLevel(); 
	}
	public abstract class Drink
	{
		protected String name; 
		protected double viscousity; 
		public Drink(String name, double viscousity)
		{
			this.name = name; 
			this.viscousity = viscousity;

			@Override 
			public String toString()
			{
				return "" 
					+"\nName: " + name
					+"\nViscousity: " + viscousity;
			}
		}
	}
	public class Coffee extends Drink implements HasCaffeine
	{
		private double caffeineLevel; 
		public Coffee(double caffeineLevel, String name, double viscousity)
		{
			super(name, double viscousity); 
			this.caffeineLevel = caffeineLevel; 
		}
		// Forced by interface HasCaffeine
		public double getCaffeineLevel()
		{
			return this.caffeineLevel; 
		}
		@Override 
		public String toString()
		{
			return super.toString()
				+ "\nCaffeine level: " + caffeineLevel; 
		}
	}
	public class Water extends Drink 
	{
		public Water(String name, double viscousity)
	}
	public class Cola extends Drink implements HasCaffeine
	{
		private double caffeineLevel; 
		public Cola(double caffeineLevel, String name, double viscousity)
		{
			super(name, viscousity); 
			this.caffeineLevel = caffeineLevel; 
		}
		// Forced by interface HasCaffeine
		public double getCaffeineLevel()
		{
			return this.caffeineLevel; 
		}
		@Override 
		public String toString()
		{
			return super.toString()
				+ "\nCaffeine level: " + caffeineLevel; 
		}
	}
	public class Client
	{
		public static void main(String[] args)
		{
			Drink[] drinks = 
				{
					new Coffee(2.0, "Olavs coffee", 0.2), 
					new Water("Olavs water", 0.15),
					new Cola(1.4, "Olavs cola", 0.175)
				}
			
			for(int i = 0; i < drinks.length; i++)
			{
				System.out.println(drinks[i].toString()); 
			}
		}
	}
```
* Programmere enkle grafiske brukergrensesnitt 
``` java 
	import javafx.application.Application; 
	import javafx.stage.Stage; 
	import javafx.scene.Scene; 
	import javafx.scene.layout.GridPane;
	import javafx.scene.control.Button; 
	import javafx.scene.control.Label;
	
	public class Client
	{
		public void start(Stage stage)
		{
			Label header = new Label("Click button to change"); 
			Button button = new Button("That's me");
			button.setOnAction(event -> 
			{
				header.setText("Hello, world!"); 
			}); 

			GridPane layout = new GridPane(); 
			layout.add(header, 0, 0); 
			layout.add(button, 0, 1); 
			
			Scene = new Scene(layout, 200, 200); 

			stage.setScene(scene); 
			stage.setTitle("Hello, world!"); 
			stage.show(); 
		}
	}
```
## Generelt 
* Forklare begrepet "teknisk gjeld" sett i lys av design og implementasjon av kode 
	* Kode skal ofte vedlikeholdes over mange år, av mange mennesker. Kjappe og lite gjennomtenkte løsninger kan virke "gode nok" i øyeblikket, men komme tilbake og skape trøbbel senere, etter hvert som kodebasen utvikler seg. Denne effekten hvor ting kommer tilbake og gjør ting vanskelig å vedlikeholde kalles tekniske gjeld. 
* Kunne forkalre behovet for analyse og design i utvikling av kode 
	* Det er et behov for analyse og design under utvikling av kode fordi man ønsker å unngå en situasjon der man har mange små kjappe løsninger som ikke skalerer. Det vil si at løsningene som anvendes blir knotete og vanskelige å jobbe på etter hvert som systemet vokser. Ved å ha en godt designet kodebase kan man unngå mange av de problemene, ved å ha løsninger som fungerer godt selv når kodebasen blir mer kompleks. Det kan ta litt lenger tid i øyeblikket, men det vil lønne seg over tid. 