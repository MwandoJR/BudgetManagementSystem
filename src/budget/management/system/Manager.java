
package budget.management.system;

import javax.swing.JOptionPane;


public class Manager extends Person{
    
    String department;
    int workId;
    String details;
    Manager(String aDepartment, String managerName,String aPassword, int nationalId,int aWorkId){
    super(managerName, nationalId, aPassword);
      this.workId = aWorkId;
        this.department = aDepartment;
    }
    
    public void viewDetails(){
    
        super.viewDetails();
        details = "Department:" + department + "" + "Manager Id:" + "" + workId;
        JOptionPane.showMessageDialog(null, details);
      //  System.out.println(managerId + department);
    
    }
}
