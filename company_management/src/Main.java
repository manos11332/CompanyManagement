
import java.util.Calendar;
import java.util.Date;
//Μανουήλ Ιωάννης Γαλάνης 321-2017021
//Μέγας Γεώργιος 321-2017115
public class Main {

    public static void main(String[] args) {
        /*
        Date d = new Date();
        //Generate a date for Jan. 9, 2022, 10:11:12 AM
        Calendar cal = Calendar.getInstance();
        cal.set(2022, Calendar.JANUARY, 9); //Year, month and day of month
        Date date = cal.getTime();

        //Generate a date for Jan. 9, 2019, 10:11:12 AM
        Calendar cal2 = Calendar.getInstance();
        cal2.set(2019, Calendar.JANUARY, 9); //Year, month and day of month
        Date date2 = cal2.getTime();

        // System.out.println("δευτεροβάθμια εκπαίδευση, πανεπιστημιακή εκπαίδευση, μεταπτυχιακό δίπλωμα, διδακτορικό δίπλωμα");
        // 7 εργαζόμενοι για να μπορούν να εκτελεστούν όλες οι λειτουργίες της εφαρμογής
        Employee em = new Employee("manos", "koytsodhmos", "20-5-1986", "married", 0, 2017, "mechanic", "πανεπιστημιακή εκπαίδευση");
        Employee em2 = new Employee("kostas", "antonidhs", "20-5-1984", "married", 0, 2017, "mechanic", "δευτεροβάθμια εκπαίδευση");
        Employee em3 = new Employee("nikos", "karadimos", "20-5-1987", "married", 0, 2017, "mechanic", "πανεπιστημιακή εκπαίδευση");
        Employee em4 = new Employee("andreas", "toloiopoulos", "20-5-1987", "married", 0, 2017, "mechanic", "πανεπιστημιακή εκπαίδευση");
        Employee emManager = new Employee("giwrgos", "kalamanos", "20-5-1988", "Not married", 0, 2017, "mechanic", "πανεπιστημιακή εκπαίδευση");
        Employee emManager2 = new Employee("alexis", "gianakos", "20-5-1988", "married", 0, 2017, "mechanic", "μεταπτυχιακό δίπλωμα");
        Employee emManager3 = new Employee("dimitris", "nikolopoulos", "20-5-1990", "married", 0, 2017, "mechanic", "διδακτορικό δίπλωμα");
        //τρία τμήματα
        Department d1 = new Department("d1", "d1 description");
        Department d2 = new Department("d2", "d2 description");
        Department d3 = new Department("d3", "d3 description");
        //εισαγωγή των εργαζόμενων em και em2 στο τμήμα d1 καθώς και του manager του τμήματος emManager απο τώρα
        d1.setEmployeeToDepartment(em);
        d1.setEmployeeToDepartment(em2);
        d1.setDepartmentManager(emManager, new Date().toString());
        System.out.println(d1.toString());
        //όμοια για το τμήμα d2
        d2.setEmployeeToDepartment(em3); //προσθέτω τον εργαζόμενο em3
        d2.setDepartmentManager(emManager2, new Date().toString()); //προσθέτω τον manager emManager2
        System.out.println(d2.toString());
        //ομοια για το d3
        d3.setEmployeeToDepartment(em4);//προσθέτω τον εργαζόμενο em4

        //μετακίνηση εργαζομένου απο το d1 -> d2
        d1.changleEmployeeDepartment(d2, em);
        System.out.println("d1 after employee moved to d2: " + d1.toString());
        System.out.println("d2 after employee moved in from d1: " + d2.toString());

        //αλλαγή demartment manager του d1
        d1.changeDepartmentManager(emManager3, new Date().toString());
        System.out.println("d1 after manager changed: " + d1.toString());

        //Δημιοτργία έργου και ένταξη σε αυτό ενός εργαζομένου
        Project p1 = new Project("p1", "p1 description", 1500, 50, 50);
        p1.setEmployeeToProject(em, date2, date);
        Project p2 = new Project("p2", "p2 description", 15000, 50, 50);
        p2.setEmployeeToProject(em3, date2, date);

        //υπολογισμός μισθού απλού εργαζομένου
        int emSalary = em.CountSalay();
        System.out.println("employee em salary: " + emSalary);

        //υπολογισμός μισθού διευθυντή τμήματος
        emManager2.CountSalay();

        //υπολογισμος συνολικου κόσθους μισθοδοσίας τμηματος d1
        int depSalCost = d1.departmentSalayCost();
        System.out.println("department d1 Salay Cost: " + depSalCost);

        //υπολογισμος συνολικου κόσθους μισθοδοσίας έργου
        int p1SalaryCost = p1.projectSalaryCost();
        System.out.println("project p1 Salary Cost: " + p1SalaryCost);
        // int p1SalaryCost2 = p2.projectSalaryCost();

        //υπολογισμος καθαρών εσόδων έργου
        int clearIncomes = p1.clearProjectIncomes();
        System.out.println("p1 clear Project Incomes: " + clearIncomes);
        int clearIncomes2 = p2.clearProjectIncomes();
        System.out.println("p2 clear Project Incomes: " + clearIncomes2);

        //υπολογισμός του έργου με τα περισσότερα καθαρά έσοδα
        Project.findTheMostGainfullProject();
        */
        ///////////////////////////////////////////////////////////////////////
        //phase 2
        new Gui();
    }

}
