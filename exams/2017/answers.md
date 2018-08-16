1a. 

``` java 
    public Quiz()
    {
        txtQuestion = new TextField("Spørsmål");
        txtUserAnswer = new TextField("Ditt alternativ"); 
        txtUserCountCorrect = new TextField("Riktige"); 

        btnOk = new Button("Ok");
        btnExit = new Button("Exit"); 
        
        Scanner scanner = new Scanner("quiz.txt"); 

        countCorrect = 0; 
        count = 0; // antar at denen økes for .nextQuestion
        // antar at correctChoice setts i .nextQuestion 

        openFile(); 
        nextQuestion(); 
    }
```

1b. 

``` java 
    btnOk.setOnAction(event -> 
    {
        int input  = txtQuestion.getText(); 

        // begge er strings 
        if(input.equals(correctChoice))
            countCorrect++;
        txtUserAnswer.setText("");                          // avhengig av hvor "count" økes
        txtUserCountCorrect.setText(countCorrect + " av " + (count + 1) +  "riktige"); 

    }); 
```

1c. 

```java 
    btnExit.setOnAction(evet -> 
    {
        scanner.close(); 
        Platform.exit(); 
    });    
```


2a. 

``` java 

    public void openFile()
    {
        ArrayList<String> questions = new ArrayList<String>(); 
        ArrayList<String> answers = new ArrayList<String>(); 

        int counter = 0; 
        while(scanner.hasNext())
        {
            // partall - spørsmål
            if(counter % 2 == 0)
            {
                questions.add(scanner.nextLine()); 
            } 
            // oddetall - riktig svar 
            else 
            {
                answers.add(scanner.nextLine()); 
            }
            
        }
    }
```



3a. 

Alle klasser arver Object. 
Et annet eksempel er unntak, som alle arver fra Exception.

3b. 

Ved å bruke arv kan man spare seg selv for å måtte gjenta mye kode. Dette er bra fordi at man bare behøver å endre ting ett sted dersom noe skal endres. Det åpner også opp for polymorfi; dersom jeg har mange subklasser av Animal, kan jeg legge dem i en liste (som animals) og samle dem basert på en "felles stamfar". Å "tenke med arv" og å bygge opp hierarkiene faller også stort sett ganske logisk for mennesker. 

3c. 
1. Nei
2. 
    linje 7. Her forsøker man å sette den statiske typen til et child av den dynamiske. 
    Line 13. Kompilatoren vil ikke finne getFirstName() på et Object 
3. 

    (456) Ubi Dubius (123) 10 | student kjører som Student 
    (456) Ubi Dubius (123) 10 | person behandles som Student i runtime, det er dynamisk type 
    (456) Ubi Dubius (123) 10 | person behandles som Student i runtime, det er dynamisk type 
    Ubi | student kjører som Student
    Ubi | person kjører som Student, som har arvet fra Person 


