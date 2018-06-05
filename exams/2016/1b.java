buttonOk.setOnAction(event -> 
{
    if(txtName.getText() != "" && txtAdress.getText() != "")
    {
        persons.add(new Person(txtName.getText(), txtAdress.getText())); 

        txtName.setText(""); 
        txtAdress.setText(""); 

        Alert alert = new Alert(AlertType.INFORMATION); 
        alert.setHeaderText("Du har lagt til en person"); 
        alert.showAndWait(); 
    }
}); 