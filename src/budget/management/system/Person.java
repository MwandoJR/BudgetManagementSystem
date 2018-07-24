
package budget.management.system;


import javax.swing.JOptionPane;

public class Person {
    String name;
    int nId;
    String password;
   String details;
    
public Person(String aName, int anId, String aPassword){

    name = aName;
    nId = anId;
    password = aPassword;
   
}
     
    public void viewDetails(){
        
        details = "National id:" + nId + "" + "Name:" + "" + name;
        JOptionPane.showMessageDialog(null, details);
        
    }
    
}
