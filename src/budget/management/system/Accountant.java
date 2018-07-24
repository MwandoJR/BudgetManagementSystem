package budget.management.system;

import javax.swing.JOptionPane;


public class Accountant extends Person{
    
     String department;
     int workId;
    
    Accountant(String aDepartment, String accountantName, String aPassword, int nationalId,int aacId){
       super(accountantName, nationalId, aPassword);
       this.workId = aacId;
        this.department = aDepartment;
    }
    
     public void viewDetails(){
    
        super.viewDetails();
         details = "Department:" + " " + department + " " + "Accountant Id:" + " " + workId;
        JOptionPane.showMessageDialog(null, details);
    
    }
    
}
