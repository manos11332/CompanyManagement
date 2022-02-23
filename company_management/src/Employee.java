
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Year;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Employee {

    private String name;
    private String surName;
    private String birthDate;
    private String family;
    private int numOfChilds;
    private int yearOfplacement;
    private String major;
    private String education;
    private String startDate;
    private String enddate;
    private int salary = 750;
    public boolean isInProject;
    public boolean isDepartmentManager;
    private ArrayList<String> empslInFile = new ArrayList<>();

    public Employee(String name, String surName, String birthDate, String family, int numOfChilds, int yearOfplacement, String major, String education) {
        this.family = family;
        this.birthDate = birthDate;
        this.education = education;
        this.major = major;
        this.name = name;
        this.numOfChilds = numOfChilds;
        this.surName = surName;
        this.yearOfplacement = yearOfplacement;
    }

    public void setEmployee(String name, String surName, String birthDate, String family, int numOfChilds, int yearOfplacement, String major, String education) {
        Employee em = new Employee(name,  surName,  birthDate,  family,  numOfChilds,  yearOfplacement,  major,  education);
        String path = "ems.txt";
        //File file = new File(path);
        BufferedWriter out;
        try {
            out = new BufferedWriter(new FileWriter(path,true));
            empslInFile.add(em.toString());//na ftiakso to slipt
            out.write(empslInFile.toString());
            out.newLine();
            System.out.println("obj to be written in file: c: " + em.toString());
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

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "employeee--> name: " + name + " surname: " + surName + " birthDate " + birthDate
                + " family condition: " + family + " childs: " + numOfChilds + " placement year: "
                + yearOfplacement + " major: " + major + " education: " + education;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.enddate = endDate;
    }

    public void setsalay(int salary) {
        this.salary = salary;
    }

    public void changeFamily() {
        if ("Not Married".equals(this.family)) {
            this.family = "married";
        } else {
            this.family = "Not Married";
        }
    }

    public void changeNumOfChilds(int newNumOfChilds) {
        this.numOfChilds = newNumOfChilds;
    }

    public void changeMajor(String newMajor) {
        this.major = newMajor;
    }

    public void changeEducation(String newEducation) {
        this.education = newEducation;
    }

    public int CountSalay() {
        salary = 750;
        int benefit;
        if (this.isInProject == true) {
            if (this.enddate.compareTo(new Date().toString()) > 0) {
                salary = salary + 100;
                //System.out.println("mpika stin proti if gia na do an einai mesa sto project");
            } else {
                //System.out.println("this project has been expired");
            }
        }
        if (this.numOfChilds > 0 && this.numOfChilds < 3) {
            benefit = this.numOfChilds * 60;
            salary = salary + benefit; //αν έχει παιδιά προσθέτω στο μισθό του 60 για κάθε παιδί
        }
        if ("πανεπιστημιακή εκπαίδευση".equals(this.education)) {
            salary = salary + 80;

        } else if ("μεταπτυχιακό δίπλωμα".equals(this.education)) {
            salary = salary + 160;
        } else if ("διδακτορικό δίπλωμα".equals(this.education)) {
            salary = salary + 240;
        }
        int yearsInTheCompany = Year.now().getValue() - this.yearOfplacement; // αφαιρώ την χρονιά που έγινε η πρόσληψη απο την τωρινή για να βρώ πόσα χρόνια είναι στην εταιρία 
        System.out.println("years in company: "+yearsInTheCompany);
        if (yearsInTheCompany >= 3) {
            int i = 0;
            while (i < yearsInTheCompany) {
                salary = salary + 40;
                System.out.println("i: "+i);
                i = i + 3;                
            }
        }
        if (this.isDepartmentManager == true) {
            salary = salary + 400;
        }
        //System.out.println("total "+this.name+" salary: " + salary);
        return salary;
    }

}
