
package budget.management.system;

import javax.swing.JOptionPane;

public class Budget {
    
   String budgetName;
    String amount;
    
    
    
//public Budget( String aBudgetName, int anAmount){

    //budgetName = aBudgetName;
  //  amount = anAmount;
   
//}

public void viewDetails(){

    
       String details = "Budget Name:"+"" + budgetName + ""+"Amont:" + ""+ amount; 
 JOptionPane.showMessageDialog(null,details);
}
    
}
