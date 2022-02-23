
import java.util.ArrayList;
import java.util.Date;

public class Project {

    private String projectName;
    private String projectDescription;
    private int totalIcomes;
    private int matirialsCost;
    private int otherCost;
    private ArrayList<Employee> employeesOfProject;
    public static ArrayList<Project> allProjects = new ArrayList();

    public Project(String projectName, String projectDescription, int totalIcomes, int matirialsCost, int otherCost) {
        this.matirialsCost = matirialsCost;
        this.otherCost = otherCost;
        this.projectDescription = projectDescription;
        this.projectName = projectName;
        this.totalIcomes = totalIcomes;
        employeesOfProject = new ArrayList();
        allProjects.add(this);
    }

    public String getName() {
        return projectName;
    }

    public void setEmployeeToProject(Employee em, Date startDate, Date endDate) {
        this.employeesOfProject.add(em);
        em.setEndDate(endDate.toString());
        em.setStartDate(startDate.toString());
        em.isInProject = true;//κάνω true αυτη την τιμή ώστε μετα στην κλάση Employee να μπορώ να τσεκάρω αν έχει συμετάσχει σε κάποιο έργο και τσεκάροντας τις ημερομηνίες να υπολογίζω το μισθό 
        //System.out.println("the employee: " + em.toString() + " works on project: " + this.toString()
        // + " from: " + startDate + " To: " + endDate);

    }

    public int projectSalaryCost() {
        int cost = 0;
        for (int i = 0; i < this.employeesOfProject.size(); i++) {
            Employee em = employeesOfProject.get(i);
            cost = cost + em.CountSalay();
        }
        //System.out.println("project "+this.toString()+" costs: " + cost);
        return cost;
    }

    public int clearProjectIncomes() {
        int projectSalaryTotalCost = this.projectSalaryCost();
        //System.out.println("projectSalaryTotalCost inside clear: " + projectSalaryTotalCost);
        int clear = totalIcomes - matirialsCost - otherCost - projectSalaryTotalCost;
        //System.out.println("clear Project " + this.projectName + " Incomes = " + clear);
        return clear;
    }

    public static String findTheMostGainfullProject() {
        int max = allProjects.get(0).clearProjectIncomes();
        for (int i = 1; i < allProjects.size(); i++) {
            max = max(allProjects.get(i).clearProjectIncomes(), allProjects.get(i - 1).clearProjectIncomes());
        }
        for (int i = 0; i < allProjects.size(); i++) {
            if (max == allProjects.get(i).clearProjectIncomes()) {
                System.out.println("The Most Gainfull Project is: " + allProjects.get(i));
                return allProjects.get(i).toString();

            }
        }
        return "";
    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    @Override
    public String toString() {
        return "Project--> name: " + projectName + " ,project Description: " + projectDescription
                + " ,total Icomes: " + totalIcomes + " ,matirials Cost: " + matirialsCost
                + " ,other Cost: " + otherCost + " employeesOfProject: " + employeesOfProject;
    }
}
