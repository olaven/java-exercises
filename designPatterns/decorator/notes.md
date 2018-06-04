Egenskap som skal endres i runtime -> legge til felt og metoder 
Decorator gjør dette. 

Legger til noe i runtime som ikke gjelder andre av samme type. 

```java 
    private ClockWithWIngsDecorator clock = new ClockWithWingsDecorator(new Clock()); 
```

"clock" er en Clock, men har også egenskaper som ClockWithWingsDecorator gir. 