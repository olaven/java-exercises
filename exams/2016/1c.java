btnShow.setOnAction(event -> 
{
    txaDisplay.empty() 
    for(Person p : persons)
    {
        txaDisplay.appendText(person.toString()); 
    }
}); 

btnExit.setOnAction(event -> 
{
    Platform.exit(); 
}); 