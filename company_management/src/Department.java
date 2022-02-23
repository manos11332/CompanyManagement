
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Department {

    private String title;
    private String description;
    private String newDepartmentLeader;//date που ο department manager ανελαβε
    private String departmentManager;
    private ArrayList<String> employeesOfDepartment;
    private ArrayList<Employee> employeesOfDepartmentO;
    private ArrayList<String> dpsInFile = new ArrayList<>();

    public Department(String title, String description) {
        this.description = description;
        this.title = title;
        employeesOfDepartment = new ArrayList();

    }

    public Department() {

    }

    public String getTitle() {
        return this.title;
    }

    public void setDepartment(String a, String b) {
        Department dp = new Department(a,b);
        String path = "dps.txt";
       // File file = new File(path);
        BufferedWriter out;
        try {
            //file.createNewFile();
            out = new BufferedWriter(new FileWriter(path,true));
            dpsInFile.add(dp.toString());
            out.write(dp.toString());
            out.newLine();
            System.out.println("obj to be written in file: c: " + dp.toString());
            out.flush();
            out.close();
            System.out.println("stream closed");

        } catch (FileNotFoundException ex) {
            //  Logger.getLogger(Card.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            //Logger.getLogger(Card.class.getName()).log(Level.SEVERE, null, ex);
        }
        //  Logger.getLogger(CardFrame.class.getName()).log(Level.SEVERE, null, ex);
    }

    public void setDepartmentManager(Employee em, String currentDate) {
        this.departmentManager = em.getName();
        this.newDepartmentLeader = currentDate;
        em.isDepartmentManager = true;
        System.out.println("department manager: " + em.toString());
        System.out.println("Ανέλαβε απο: " + currentDate);
    }

    public void setEmployeeToDepartment(String em) {
        this.employeesOfDepartment.add(em);
        // System.out.println(this.toString() + " list with department employees: " + employeesOfDepartment);    
    }

    public void setEmployeeToDepartmentO(Employee em) {
        this.employeesOfDepartmentO.add(em);
    }

    public ArrayList getEmployeesOfDepartment() {
        //System.out.println(employeesOfDepartment);
        return employeesOfDepartment;
    }

    /*
    προκιεμένου να αλλάξω τμήμα σε ενα εργαζόμενο τρεκάρω αν υπάρχει στο τμήμα απο το οποίο 
    καλέστηκε η συνάρτηση(κάνω αναζήτηση δηλαδη στην αντίστοιχη λίστα). Αν βρεθεί απλά
    τον διαγράψω απο αυτην την λίσατ (remove) και τον κάνω add στην αντίστοιχη λίστα
    του άλλου τμήματος που το έχω περάσει ως παράμετρο στην συνάρτηση.
     */
    public void changleEmployeeDepartment(Department newDepartment, String em) {
        if (this.employeesOfDepartment.contains(em)) {
            this.employeesOfDepartment.remove(em);
            System.out.println("employees Of Department from that i want to remove the employee " + employeesOfDepartment);
            newDepartment.setEmployeeToDepartment(em);
            System.out.println("newDepartment after move emplotee: " + newDepartment.employeesOfDepartment);
        } else {
            System.out.println("Employee does not found on department: " + this.title);
        }
    }

    public void changeDepartmentManager(Employee em, String dateOfChange) {
        this.newDepartmentLeader = dateOfChange;
        this.departmentManager = em.toString();
        System.out.println("new " + this.toString() + " manager " + em.toString() + " from: " + newDepartmentLeader);
    }

    public int departmentSalayCost() {
        //Πρεπει να δω τι παίζει με το έτος
        int totalSalary = 0;
        for (int i = 0; i < this.employeesOfDepartment.size(); i++) {
            totalSalary = totalSalary + employeesOfDepartmentO.get(i).CountSalay();
        }
        //System.out.println("total "+this.title+" salary: " + totalSalary);
        return totalSalary;
    }

    @Override
    public String toString() {
        return  title + " decription: " + description + " emplyees: " + employeesOfDepartment.toString() +" dp manager: "+departmentManager;
    }

}
