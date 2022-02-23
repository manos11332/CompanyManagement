
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Gui implements Serializable {

    private ArrayList<String> dpsInFile = new ArrayList<>();
    private ArrayList<String> empslInFile = new ArrayList<>();
    private ArrayList<String> projlInFile = new ArrayList<>();
    private ArrayList<Department> allDps = new ArrayList<>();
    private ArrayList<Employee> allEmps = new ArrayList<>();
    private ArrayList<Project> allProj = new ArrayList<>();
    public String readString = "";

    public Gui() {
        // main frame
        JFrame f = new JFrame("Main Menu");
        //f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setBounds(700, 150, 1017, 800);
        f.setVisible(true);

        JLabel help3 = new JLabel("Tip:Για να είναι πλήρως λειτουργική η εφαρμογή όλες οι λειτουργίες θα πρέπει να επιτελεστούν χωρίς να επανεκινηθεί η εφαρμογή");
        help3.setBounds(0, 720, 750, 30);
        f.add(help3);

        //exit button
        JButton exit = new JButton("Exit");

        //Add Department 
        //add Department frame
        JFrame f1 = new JFrame(" add Department");
        //Dp title
        JLabel tl1 = new JLabel("    title: ");
        JTextField tf1 = new JTextField();
        //Dp desc
        JLabel tl2 = new JLabel("Description: ");
        JTextField tf2 = new JTextField();
        //Add Department buttons
        JButton but1 = new JButton(" add Department");
        JButton but1_1 = new JButton("add this Department");

        //Add employee
        //Add employee frame
        JFrame f2 = new JFrame("Add employee");
        //Name
        JLabel tl8 = new JLabel("Name: ");
        JTextField tf8 = new JTextField();
        //surName
        JLabel tl9 = new JLabel("surName: ");
        JTextField tf9 = new JTextField();
        //birth date
        JLabel tl10 = new JLabel("birth date: ");
        JTextField tf10 = new JTextField();
        //family
        JLabel tl11 = new JLabel("family: ");
        JTextField tf11 = new JTextField();
        //Number of Childs
        JLabel tl12 = new JLabel("Number of Childs: ");
        JTextField tf12 = new JTextField();
        //year Of placement
        JLabel tl15 = new JLabel("year Of placement: ");
        JTextField tf15 = new JTextField();
        //major
        JLabel tl6 = new JLabel("major: ");
        JTextField tf6 = new JTextField();
        //education
        JLabel tl7 = new JLabel("education: ");
        JTextField tf7 = new JTextField();
        //employee buttons
        JButton but2 = new JButton(" Add employee");
        JButton but2_1 = new JButton(" Add this employee");

        //Add Project
        //Add Project frame
        JFrame f3 = new JFrame("Add Project");
        //Add Project butons
        JButton but3 = new JButton(" Add Project");
        JButton but3_1 = new JButton(" Add this Project");
        //title
        JLabel tl16 = new JLabel("title: ");
        JTextField tf16 = new JTextField();
        //desc
        JLabel tl17 = new JLabel("description: ");
        JTextField tf17 = new JTextField();
        //meikta esoda
        JLabel tl18 = new JLabel("meikta esoda: ");
        JTextField tf18 = new JTextField();
        //dapanes gia ylika
        JLabel tl19 = new JLabel("dapanes gia ilika: ");
        JTextField tf19 = new JTextField();
        //alla eksoda
        JLabel tl20 = new JLabel("dapanes gia alla eksoda: ");
        JTextField tf20 = new JTextField();

        //print 
        //print  buttons
        JButton but4 = new JButton("print");
        JButton but4_1 = new JButton("print Departments");
        JButton but4_2 = new JButton("print Employees");
        JButton but4_3 = new JButton("print Projects");
        JFrame f4 = new JFrame("Print");

        //Add empolyee to department
        JButton but5 = new JButton("Add empolyee to department");
        f.add(but5);
        but5.setBounds(0, 100, 250, 50);
        JFrame f5 = new JFrame("Add employee to department");
        JLabel addEmToDpL = new JLabel("Employee surname: ");
        JTextField addEmToDp = new JTextField();
        JLabel DpL = new JLabel("Department name: ");
        JTextField Dp = new JTextField();
        JButton but5_1 = new JButton("Add");

        //Add emplyee to project
        JButton but6 = new JButton("Add empolyee to project");
        f.add(but6);
        but6.setBounds(0, 50, 250, 50);
        JFrame f6 = new JFrame("Add employee to project");
        JLabel emNl = new JLabel("Employee name: ");
        JTextField emN = new JTextField();
        JLabel prNl = new JLabel("project name: ");
        JTextField prN = new JTextField();
        JButton but6_1 = new JButton("Add");

        //change employees department 
        JButton but7 = new JButton("change employee's department");
        JButton but7_1 = new JButton("change");
        f.add(but7);
        but7.setBounds(0, 150, 250, 50);
        JFrame f7 = new JFrame("change employee's department");
        JLabel chEmDpL = new JLabel("Employee surname: ");
        JTextField chEmDp = new JTextField();
        JLabel newDpL = new JLabel("new Department name: ");
        JTextField newDp = new JTextField();
        JLabel oldDpL = new JLabel("old Department name: ");
        JTextField oldDp = new JTextField();

        //change department manager
        JButton but8 = new JButton("change department manager");
        f.add(but8);
        but8.setBounds(0, 200, 250, 50);
        JFrame f8 = new JFrame("change department manager");
        JLabel manNamel = new JLabel("Employee surname: ");
        JTextField manName = new JTextField();
        JLabel dpNamel = new JLabel("Department Name: ");
        JTextField dpName = new JTextField();
        JButton but8_1 = new JButton("change");

        //change employee info
        JButton but9 = new JButton("change employee info");
        JButton but9_1 = new JButton("change family");
        JButton but9_2 = new JButton("change NumOfChilds");
        JButton but9_3 = new JButton("change education");
        JButton but9_4 = new JButton("change major");

        JLabel chl1 = new JLabel("change family: ");
        JTextField ch1 = new JTextField();
        JLabel chl2 = new JLabel("change num of childs: ");
        JTextField ch2 = new JTextField();
        JTextField ch2_1 = new JTextField();
        JLabel chl3 = new JLabel("change major: ");
        JTextField ch3 = new JTextField();
        JTextField ch3_1 = new JTextField();
        JLabel chl4 = new JLabel("change education: ");
        JTextField ch4 = new JTextField();
        JTextField ch4_1 = new JTextField();
        JLabel help5 = new JLabel("Tip1: Στο πρώτο πεδίο συμπληρώστε το όνομα του εργαζομένου");
        help5.setBounds(0, 250, 550, 30);
        JLabel help4 = new JLabel("Tip2: Στα τρία τελευταία πεδία στο δεξί κουτάκι γράφουμε το όνομα  του εργαζομένου και στο αριστερό την νέα τιμή");
        help4.setBounds(0, 300, 700, 30);

        f.add(but9);
        but9.setBounds(0, 250, 250, 50);
        JFrame f9 = new JFrame("change employee info");

        //set department manager
        JButton but10 = new JButton("Set Department manager");
        JButton but10_1 = new JButton("set");
        JFrame f10 = new JFrame("Set Department manager");
        f10.add(but10_1);
        f.add(but10);
        but10.setBounds(0, 300, 250, 50);
        JLabel setManToDpL = new JLabel("Employee name: ");
        JTextField setManToDp = new JTextField();
        JLabel DpNl = new JLabel("Department name: ");
        JTextField DpN = new JTextField();

        //count salary
        JButton but11 = new JButton("Count employee Salary");
        JButton but11_1 = new JButton("count");
        JFrame f11 = new JFrame("Count employee Salary");
        f11.add(but11_1);
        f.add(but11);
        but11.setBounds(0, 350, 250, 50);
        JLabel emNameToCountl = new JLabel("Employee name: ");
        JTextField emNameToCount = new JTextField();

        //Department
        but1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //frame

                // f1.setDefaultCloseOperation(EXIT_ON_CLOSE);
                f1.setLayout(null);
                f1.setBounds(700, 150, 400, 400);
                f1.setVisible(true);

                //title 
                tl1.setBounds(0, 0, 100, 30);
                tf1.setBounds(100, 0, 150, 30);
                f1.add(tl1);
                f1.add(tf1);

                //desc
                tl2.setBounds(0, 50, 100, 30);
                tf2.setBounds(100, 50, 150, 30);
                f1.add(tl2);
                f1.add(tf2);

                but1_1.setVisible(true);
                but1_1.setBounds(100, 300, 150, 30);
                f1.add(but1_1);

            }
        }
        );
        f.add(but1);
        but1.setVisible(true);
        but1.setBounds(0, 0, 250, 50);

        //save department
        but1_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Department dp = new Department(tf1.getText(), tf2.getText());
                dp.setDepartment(tf1.getText(), tf2.getText());
                allDps.add(dp);

                tf1.setText(null);
                tf2.setText(null);
                f1.setVisible(false);
            }
        }
        );

        //employee
        but2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //frame
                //f2.setDefaultCloseOperation(EXIT_ON_CLOSE);
                f2.setLayout(null);
                f2.setBounds(700, 150, 400, 600);
                f2.setVisible(true);

                //Name
                tl8.setBounds(0, 0, 100, 30);
                tf8.setBounds(100, 0, 150, 30);
                f2.add(tl8);
                f2.add(tf8);
                //surName
                tl9.setBounds(0, 50, 100, 30);
                tf9.setBounds(100, 50, 150, 30);
                f2.add(tl9);
                f2.add(tf9);
                //birth date
                tl10.setBounds(0, 100, 100, 30);
                tf10.setBounds(100, 100, 150, 30);
                f2.add(tl10);
                f2.add(tf10);
                //family
                tl11.setBounds(0, 150, 100, 30);
                tf11.setBounds(100, 150, 150, 30);
                f2.add(tl11);
                f2.add(tf11);
                //num of childs
                tl12.setBounds(0, 200, 100, 30);
                tf12.setBounds(100, 200, 150, 30);
                f2.add(tl12);
                f2.add(tf12);
                //year of placement
                tl15.setBounds(0, 250, 100, 30);
                tf15.setBounds(100, 250, 150, 30);
                f2.add(tl15);
                f2.add(tf15);
                //major
                tl6.setBounds(0, 300, 100, 30);
                tf6.setBounds(100, 300, 150, 30);
                f2.add(tl6);
                f2.add(tf6);
                //education
                tl7.setBounds(0, 350, 100, 30);
                tf7.setBounds(100, 350, 150, 30);
                f2.add(tl7);
                f2.add(tf7);

                but2_1.setVisible(true);
                but2_1.setBounds(100, 400, 150, 30);
                f2.add(but2_1);
            }
        }
        );
        //Save Employee
        but2_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Employee em = new Employee(tf8.getText(), tf9.getText(), tf10.getText(), tf11.getText(), Integer.parseInt(tf12.getText()), Integer.parseInt(tf15.getText()), tf6.getText(), tf7.getText());
                em.setEmployee(tf8.getText(), tf9.getText(), tf10.getText(), tf11.getText(), Integer.parseInt(tf12.getText()), Integer.parseInt(tf15.getText()), tf6.getText(), tf7.getText());
                allEmps.add(em);
                tf6.setText(null);
                tf7.setText(null);
                tf8.setText(null);
                tf9.setText(null);
                tf10.setText(null);
                tf11.setText(null);
                tf12.setText(null);
                tf15.setText(null);
                f2.setVisible(false);

            }
        }
        );

        f.add(but2);
        but2.setVisible(true);
        but2.setBounds(250, 0, 250, 50);

        //add project
        but3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //frame
                //f3.setDefaultCloseOperation(EXIT_ON_CLOSE);
                f3.setLayout(null);
                f3.setBounds(700, 150, 400, 400);
                f3.setVisible(true);

                //title
                tl16.setBounds(0, 0, 150, 30);
                tf16.setBounds(100, 0, 150, 30);
                f3.add(tl16);
                f3.add(tf16);

                //
                tl17.setBounds(0, 50, 100, 30);
                tf17.setBounds(100, 50, 150, 30);
                f3.add(tl17);
                f3.add(tf17);
                //
                tl18.setBounds(0, 100, 100, 30);
                tf18.setBounds(100, 100, 150, 30);
                f3.add(tl18);
                f3.add(tf18);
                //
                tl19.setBounds(0, 150, 100, 30);
                tf19.setBounds(100, 150, 150, 30);
                f3.add(tl19);
                f3.add(tf19);
                //
                tl20.setBounds(0, 200, 100, 30);
                tf20.setBounds(100, 200, 150, 30);
                f3.add(tl20);
                f3.add(tf20);

                but3_1.setVisible(true);
                but3_1.setBounds(100, 250, 150, 30);
                f3.add(but3_1);

            }
        }
        );

        //save project
        but3_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Project p = new Project(tf16.getText(), tf17.getText(), Integer.parseInt(tf18.getText()), Integer.parseInt(tf19.getText()), Integer.parseInt(tf20.getText()));
                String path = "proj.txt";
                File file = new File(path);

                BufferedWriter out;
                try {
                    out = new BufferedWriter(new FileWriter(path, true));
                    projlInFile.add(p.toString());
                    allProj.add(p);
                    out.write(projlInFile.toString());
                    System.out.println("obj to be written in file: c: " + p.toString());
                    out.flush();
                    out.newLine();
                    out.close();
                    System.out.println("stream closed");

                } catch (FileNotFoundException ex) {
                    //  Logger.getLogger(Card.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    //Logger.getLogger(Card.class.getName()).log(Level.SEVERE, null, ex);
                }
                //  Logger.getLogger(CardFrame.class.getName()).log(Level.SEVERE, null, ex);
                tf16.setText(null);
                tf17.setText(null);
                tf18.setText(null);
                tf19.setText(null);
                tf20.setText(null);
                f3.setVisible(false);
            }

        }
        );
        f.add(but3);
        but3.setVisible(true);
        but3.setBounds(500, 0, 250, 50);

        //Print
        but4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                f4.setLayout(null);
                f4.setBounds(700, 150, 600, 400);
                f4.setVisible(true);
                f4.add(but4_1);
                f4.add(but4_2);
                f4.add(but4_3);

                but4_1.setBounds(0, 0, 200, 30);
                but4_2.setBounds(200, 0, 200, 30);
                but4_3.setBounds(400, 0, 200, 30);

            }
        }
        );
        f.add(but4);
        but4.setVisible(true);
        but4.setBounds(750, 0, 250, 50);

        //Print Department
        but4_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ArrayList<String> dps = new ArrayList<>();
                String ob = null;
                try ( BufferedReader in = new BufferedReader(new FileReader("dps.txt"))) {
                    System.out.println("mpika sto try");
                    while ((ob = in.readLine()) != null) {
                        System.out.println("arxi tis do-while");
                        JOptionPane.showMessageDialog(f4, ob, "dps", JOptionPane.WARNING_MESSAGE);
                        dps.add(ob);
                        System.out.println("department read from file: " + ob);
                        System.out.println("eftasa sto telos tis do-while");
                    }
                    in.close();
                } catch (FileNotFoundException ex) {
                    System.out.println("rerror1");
                } catch (IOException ex) {
                    // Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
                }
                //JOptionPane.showMessageDialog(f4, dps, "dps", JOptionPane.WARNING_MESSAGE);
                f4.setVisible(false);
            }
        }
        );

        //Print Employees
        but4_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ArrayList<String> emps = new ArrayList<>();
                String ob = null;
                try ( BufferedReader in = new BufferedReader(new FileReader("ems.txt"))) {
                    System.out.println("mpika sto try");
                    while ((ob = in.readLine()) != null) {
                        System.out.println("arxi tis do-while");
                        JOptionPane.showMessageDialog(f4, ob, "ems", JOptionPane.WARNING_MESSAGE);
                        emps.add(ob);
                        System.out.println("department read from file: " + ob);
                        System.out.println("eftasa sto telos tis do-while");
                    }
                    in.close();
                } catch (FileNotFoundException ex) {
                    System.out.println("rerror1");
                } catch (IOException ex) {
                    // Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
                }
                //JOptionPane.showMessageDialog(f4, emps, "emps", JOptionPane.WARNING_MESSAGE);
                f4.setVisible(false);
            }
        }
        );
        //Print projects
        but4_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ArrayList<String> projs = new ArrayList<>();
                String ob = null;
                try ( BufferedReader in = new BufferedReader(new FileReader("proj.txt"))) {
                    System.out.println("mpika sto try");
                    while ((ob = in.readLine()) != null) {
                        System.out.println("arxi tis do-while");
                        JOptionPane.showMessageDialog(f4, ob, "projs", JOptionPane.WARNING_MESSAGE);
                        //ob = in.readLine();
                        projs.add(ob);
                        System.out.println("department read from file: " + ob);
                        System.out.println("eftasa sto telos tis do-while");
                    }
                    in.close();
                } catch (FileNotFoundException ex) {
                    System.out.println("rerror1");
                } catch (IOException ex) {
                    //  Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
                }
                //JOptionPane.showMessageDialog(f4, projs, "projs", JOptionPane.WARNING_MESSAGE);
                f4.setVisible(false);
            }
        }
        );

        //Add empolyee to department
        but5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                f5.setLayout(null);
                f5.setBounds(700, 150, 400, 400);
                f5.setVisible(true);
                f5.add(addEmToDp);
                f5.add(addEmToDpL);
                f5.add(Dp);
                f5.add(DpL);
                f5.add(but5_1);
                addEmToDpL.setBounds(0, 0, 130, 30);
                addEmToDp.setBounds(130, 0, 100, 30);
                DpL.setBounds(0, 50, 130, 30);
                Dp.setBounds(130, 50, 100, 30);
                but5_1.setBounds(0, 100, 250, 50);

            }
        }
        );

        but5_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("dp: " + Dp.getText());
                //diabazo ola ta departments
                ArrayList<String> dps = new ArrayList<>();
                String ob = null;

                try ( BufferedReader in = new BufferedReader(new FileReader("dps.txt"))) {

                    System.out.println("mpika sto try");
                    while ((ob = in.readLine()) != null) {
                        System.out.println("arxi tis do-while");
                        System.out.println("department read from file: " + ob);
                        if (ob.startsWith(Dp.getText())) { //αν το department που διαβασε απο το αρχείο με τα τμήματα έψει την ίδια αρχή (τίτλο) με το department που έδωσε ο χρήστης 
                            System.out.println("mpika stin if - brika to dp pou me endiaferei");
                            for (int i = 0; i < allDps.size(); i++) {
                                System.out.println("allDps.get(i).getTitle()");
                                if (allDps.get(i).getTitle().equals(Dp.getText()))//an brei stin lista me ολα ta departments to dp poy edose o xristis oti thelei na prostethei o ergazomwnoa
                                {
                                    allDps.get(i).setEmployeeToDepartment(addEmToDp.getText());// προσθέτει τον υπάλληλο στο dp
                                    System.out.println(allDps.get(i).toString());
                                    System.out.println("mpika stin if tis for");
                                    break;
                                }
                            }
                        } else {
                            System.out.println("mpika stin else (den brika to dp pou zitaei o xristsis)");
                            dps.add(ob);
                        }
                        System.out.println("eftasa sto telos tis do-while");
                    }
                    in.close();
                } catch (FileNotFoundException ex) {
                    System.out.println("rerror1");
                } catch (IOException ex) {
                    //Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
                }
                //apothikeysh ton dps sto arxeio meta tis allages
                BufferedWriter out2;
                try {
                    File file = new File("dps.txt");
                    file.delete();
                    file.createNewFile();
                    out2 = new BufferedWriter(new FileWriter(file, true));
                    for (int i = 0; i < allDps.size(); i++) {
                        out2.write(allDps.get(i).toString());
                        out2.newLine();
                        out2.flush();
                        //System.out.println("obj to be written in file: " + readString);
                    }
                    out2.close();
                    System.out.println("stream closed");
                } catch (FileNotFoundException ex2) {
                    System.out.println("eroor");
                    //Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex2);
                } catch (IOException ex2) {
                    System.out.println("eroor2");
                    //Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex2);
                }
                f5.setVisible(false);
            }
        }
        );

        //add employee to project
        but6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //frame

                // f1.setDefaultCloseOperation(EXIT_ON_CLOSE);
                f6.setLayout(null);
                f6.setBounds(700, 150, 400, 400);
                f6.setVisible(true);

                //em name 
                emNl.setBounds(0, 0, 100, 30);
                emN.setBounds(100, 0, 150, 30);
                f6.add(emNl);
                f6.add(emN);

                //project name
                prNl.setBounds(0, 50, 100, 30);
                prN.setBounds(100, 50, 150, 30);
                f6.add(prNl);
                f6.add(prN);

                but6_1.setVisible(true);
                but6_1.setBounds(100, 300, 150, 30);
                f6.add(but6_1);

            }
        }
        );

        but6_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("em: " + emN.getText());

                ArrayList<String> ems = new ArrayList<>();
                String ob = null;
                Employee emToProject = null;
                //diabasma ergazomenvn apo arxeio
                try ( BufferedReader in = new BufferedReader(new FileReader("ems.txt"))) {
                    System.out.println("mpika sto try");
                    while ((ob = in.readLine()) != null) {
                        System.out.println("arxi tis do-while");
                        System.out.println("employee read from file: " + ob);
                        if (ob.contains(emN.getText())) { //αν ο εργαζόμενος που διαβασε απο το αρχείο με τους εργαζομενους έψει το ίδιο ονομα  με το ονομα που έδωσε ο χρήστης 
                            System.out.println("mpika stin if - brika ton em pou me endiaferei");
                            for (int i = 0; i < allEmps.size(); i++) {
                                if (allEmps.get(i).getName().equals(emN.getText()))//an brei stin lista me olous tous ergazomenous to eponimo poy edose o xristis oti thelei na prostethei o ergazomwnoa
                                {
                                    System.out.println("mpika stin if tis for");
                                    emToProject = allEmps.get(i);// αλλαξει την οικογενειακη κατασταση
                                    System.out.println(allEmps.get(i).toString());
                                    break;
                                }
                            }
                        } else {
                            System.out.println("mpika stin else (den brika ton em pou zitaei o xristsis)");
                            ems.add(ob);
                        }
                        System.out.println("eftasa sto telos tis do-while");
                    }
                    in.close();

                } catch (FileNotFoundException ex) {
                    System.out.println("rerror1");
                } catch (IOException ex) {
                    // Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
                }
                //diabasma toy project apo to arxeio
                ArrayList<String> projs = new ArrayList<>();
                String ob2 = null;
                //diabazo ola ta project
                try ( BufferedReader in2 = new BufferedReader(new FileReader("proj.txt"))) {
                    System.out.println("mpika sto try");
                    while ((ob2 = in2.readLine()) != null) {
                        System.out.println("arxi tis do-while");
                        System.out.println("project read from file: " + ob);
                        if (ob2.contains(prN.getText())) { //αν το προτζεκτ που διαβασε απο το αρχείο με τα προτζεκτ έχει το ίδιο ονομα  με το όνομα που έδωσε ο χρήστης 
                            System.out.println("mpika stin if - brika to project pou me endiaferei");
                            for (int i = 0; i < allProj.size(); i++) {
                                if (allProj.get(i).getName().equals(prN.getText()))//an brei stin lista me ola ta project to onoma poy edose o xristis oti thelei na prostethei ton ergazomwnoa
                                {
                                    //Generate a date for Jan. 9, 2019, 10:11:12 AM
                                    Calendar cal2 = Calendar.getInstance();
                                    cal2.set(2019, Calendar.JANUARY, 9); //Year, month and day of month
                                    Date startDate = cal2.getTime();

                                    //Generate a date for Jan. 9, 2022, 10:11:12 AM
                                    Calendar cal = Calendar.getInstance();
                                    cal.set(2022, Calendar.JANUARY, 9); //Year, month and day of month
                                    Date endDate = cal.getTime();

                                    System.out.println("mpika stin if tis for");
                                    allProj.get(i).setEmployeeToProject(emToProject, startDate, endDate);// prosthetei ton ypallilo sto priject
                                    System.out.println(allProj.get(i).toString());

                                    break;
                                }
                            }
                        } else {
                            System.out.println("mpika stin else (den brika ton em pou zitaei o xristsis)");
                            ems.add(ob);
                        }
                        System.out.println("eftasa sto telos tis do-while");
                    }
                    in2.close();

                } catch (FileNotFoundException ex) {
                    System.out.println("rerror1");
                } catch (IOException ex) {
                    //Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
                }

                BufferedWriter out2;
                try {
                    File file = new File("proj.txt");
                    file.delete();
                    file.createNewFile();
                    out2 = new BufferedWriter(new FileWriter(file, true));
                    for (int i = 0; i < allProj.size(); i++) {
                        out2.write(allProj.get(i).toString());
                        out2.newLine();
                        out2.flush();
                        System.out.println("obj to be written in file: " + allProj.get(i).toString());
                    }
                    out2.close();
                    System.out.println("stream closed");

                } catch (FileNotFoundException ex2) {
                    System.out.println("eroor");
                    //Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex2);
                } catch (IOException ex2) {
                    System.out.println("eroor2");
                    //Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex2);
                }
                f6.setVisible(false);

            }
        }
        );

        //change empolyee's  department
        but7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                f7.setLayout(null);
                f7.setBounds(700, 150, 400, 400);
                f7.setVisible(true);
                f7.add(chEmDp);
                f7.add(chEmDpL);
                f7.add(newDp);
                f7.add(newDpL);
                f7.add(oldDpL);
                f7.add(oldDp);
                f7.add(but7_1);
                chEmDpL.setBounds(0, 0, 130, 30);
                chEmDp.setBounds(130, 0, 100, 30);
                newDpL.setBounds(0, 50, 130, 30);
                newDp.setBounds(130, 50, 100, 30);
                oldDpL.setBounds(0, 100, 130, 30);
                oldDp.setBounds(130, 100, 100, 30);
                but7_1.setBounds(0, 150, 250, 50);

            }
        }
        );

        but7_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("new dp: " + newDp.getText());
                System.out.println("old dp: " + oldDp.getText());
                System.out.println("chEmDp: " + chEmDp.getText());
                ArrayList<String> dps = new ArrayList<>();
                String ob = null;
                String ob3 = null;//old dp
                Department oldDpToCh = null;
                //read old dp from file
                try ( BufferedReader in3 = new BufferedReader(new FileReader("dps.txt"))) {

                    System.out.println("mpika sto try");
                    while ((ob3 = in3.readLine()) != null) {
                        System.out.println("arxi tis do-while");
                        System.out.println("department read from file: " + ob3);
                        if (ob3.contains(oldDp.getText())) { //αν το department που διαβασε απο το αρχείο με τα τμήματα έψει την ίδια αρχή (τίτλο) με το department που έδωσε ο χρήστης 
                            System.out.println("mpika stin if - brika to old dp pou me endiaferei");
                            for (int i = 0; i < allDps.size(); i++) {
                                if (allDps.get(i).getTitle().equals(oldDp.getText()))//an brei stin lista me ola ta departments to old dp poy edose o xristis 
                                {
                                    oldDpToCh = allDps.get(i);
                                    System.out.println(oldDpToCh.toString());
                                    System.out.println("mpika stin if tis for");
                                    break;
                                }
                            }
                        } else {
                            System.out.println("mpika stin else (den brika to old dp pou zitaei o xristsis)");
                            dps.add(ob);
                        }
                        System.out.println("eftasa sto telos tis do-while");
                    }
                    in3.close();
                } catch (FileNotFoundException ex) {
                    System.out.println("rerror1");
                } catch (IOException ex) {
                    //Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
                }
                //read new dp from file
                try ( BufferedReader in = new BufferedReader(new FileReader("dps.txt"))) {

                    System.out.println("mpika sto try");
                    while ((ob = in.readLine()) != null) {
                        System.out.println("arxi tis do-while");
                        System.out.println("department read from file: " + ob);
                        if (ob.contains(newDp.getText())) { //αν το department που διαβασε απο το αρχείο με τα τμήματα έψει την ίδια αρχή (τίτλο) με το department που έδωσε ο χρήστης 
                            System.out.println("mpika stin if - brika to new dp pou me endiaferei");
                            for (int i = 0; i < allDps.size(); i++) {
                                if (allDps.get(i).getTitle().equals(newDp.getText()))//an brei stin lista me oal ta departments to dp poy edose o xristis oti thelei na prostethei o ergazomwnoa
                                {
                                    oldDpToCh.changleEmployeeDepartment(allDps.get(i), chEmDp.getText());// προσθέτει τον υπάλληλο στο dp
                                    System.out.println(allDps.get(i).toString());
                                    System.out.println("mpika stin if tis for");
                                    break;
                                }
                            }
                        } else {
                            System.out.println("mpika stin else (den brika to new dp pou zitaei o xristsis)");
                            dps.add(ob);
                        }
                        System.out.println("eftasa sto telos tis do-while");
                    }
                    in.close();
                } catch (FileNotFoundException ex) {
                    System.out.println("rerror1");
                } catch (IOException ex) {
                    //Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
                }
                //rewrute dps file
                BufferedWriter out2;
                try {
                    File file = new File("dps.txt");
                    file.delete();
                    file.createNewFile();
                    out2 = new BufferedWriter(new FileWriter(file, true));
                    for (int i = 0; i < allDps.size(); i++) {
                        out2.write(allDps.get(i).toString());
                        out2.newLine();
                        out2.flush();
                        //System.out.println("obj to be written in file: " + readString);
                    }
                    out2.close();
                    System.out.println("stream closed");
                } catch (FileNotFoundException ex2) {
                    System.out.println("eroor");
                    //Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex2);
                } catch (IOException ex2) {
                    System.out.println("eroor2");
                    //Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex2);
                }
                f7.setVisible(false);
            }
        }
        );

        //change department's manager
        but8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                f8.setLayout(null);
                f8.setBounds(700, 150, 400, 400);
                f8.setVisible(true);
                f8.add(manName);
                f8.add(manNamel);
                f8.add(dpName);
                f8.add(dpNamel);
                f8.add(but8_1);
                manNamel.setBounds(0, 0, 130, 30);
                manName.setBounds(130, 0, 100, 30);
                dpNamel.setBounds(0, 50, 130, 30);
                dpName.setBounds(130, 50, 100, 30);
                but8_1.setBounds(0, 100, 250, 50);

            }
        }
        );

        but8_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("em: " + manName.getText());
                ArrayList<String> dps = new ArrayList<>();
                String ob = null;
                String ob3 = null;
                Department dpForCh = null;
                //drisko an yparxei o employee pou edose o xristis
                String ob2 = null;
                Employee newmanager = null;
                try ( BufferedReader in = new BufferedReader(new FileReader("ems.txt"))) {
                    System.out.println("mpika sto try");
                    while ((ob2 = in.readLine()) != null) {
                        System.out.println("arxi tis do-while");
                        System.out.println("employee read from file: " + ob2);
                        if (ob2.contains(manName.getText())) { //αν ο εργαζόμενος που διαβασε απο το αρχείο με τους εργαζομενους έψει το ίδιο ονομα  με το ονομα που έδωσε ο χρήστης 
                            System.out.println("mpika stin if - brika ton em pou me endiaferei");
                            for (int i = 0; i < allEmps.size(); i++) {
                                if (allEmps.get(i).getName().equals(manName.getText()))//an brei stin lista me olous tous ergazomenous to eponimo poy edose o xristis oti thelei na prostethei o ergazomwnoa
                                {
                                    System.out.println("mpika stin if tis for");
                                    newmanager = allEmps.get(i);
                                    System.out.println(allEmps.get(i).toString());
                                    break;
                                }
                            }
                        } else {
                            System.out.println("mpika stin else (den brika ton em pou zitaei o xristsis)");
                            //ems.add(ob);
                        }
                        System.out.println("eftasa sto telos tis do-while");
                    }
                    in.close();
                } catch (FileNotFoundException ex) {
                    System.out.println("rerror1");
                } catch (IOException ex) {
                    //Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
                }
                //read  dp from file
                try ( BufferedReader in = new BufferedReader(new FileReader("dps.txt"))) {

                    System.out.println("mpika sto try");
                    while ((ob = in.readLine()) != null) {
                        System.out.println("arxi tis do-while");
                        System.out.println("department read from file: " + ob);
                        if (ob.contains(dpName.getText())) { //αν το department που διαβασε απο το αρχείο με τα τμήματα έψει την ίδια αρχή (τίτλο) με το department που έδωσε ο χρήστης 
                            System.out.println("mpika stin if - brika to new dp pou me endiaferei");
                            for (int i = 0; i < allDps.size(); i++) {
                                if (allDps.get(i).getTitle().equals(dpName.getText()))//an brei stin lista me oal ta departments to dp poy edose o xristis oti thelei na prostethei o ergazomwnoa
                                {
                                    Date cdate = new Date();
                                    allDps.get(i).changeDepartmentManager(newmanager, cdate.toString());
                                    System.out.println(allDps.get(i).toString());
                                    System.out.println("mpika stin if tis for");
                                    break;
                                }
                            }
                        } else {
                            System.out.println("mpika stin else (den brika to new dp pou zitaei o xristsis)");
                            dps.add(ob);
                        }
                        System.out.println("eftasa sto telos tis do-while");
                    }
                    in.close();

                } catch (FileNotFoundException ex) {
                    System.out.println("rerror1");
                } catch (IOException ex) {
                    Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
                }
                //rewrite dps file
                BufferedWriter out2;
                try {
                    File file = new File("dps.txt");
                    file.delete();
                    file.createNewFile();
                    out2 = new BufferedWriter(new FileWriter(file, true));
                    for (int i = 0; i < allDps.size(); i++) {
                        out2.write(allDps.get(i).toString());
                        out2.newLine();
                        out2.flush();
                        //System.out.println("obj to be written in file: " + readString);
                    }
                    out2.close();
                    System.out.println("stream closed");

                } catch (FileNotFoundException ex2) {
                    System.out.println("eroor");
                    //Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex2);
                } catch (IOException ex2) {
                    System.out.println("eroor2");
                    //Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex2);
                }
                f8.setVisible(false);
            }
        }
        );

        //Change employee's info
        but9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                f9.setLayout(null);
                f9.setBounds(800, 150, 830, 400);
                f9.setVisible(true);

                //family
                chl1.setBounds(0, 0, 150, 30);
                ch1.setBounds(200, 0, 200, 30);
                f9.add(chl1);
                f9.add(ch1);

                //num of childs
                chl2.setBounds(0, 50, 150, 30);
                ch2.setBounds(200, 50, 200, 30);
                ch2_1.setBounds(400, 50, 200, 30);
                f9.add(chl2);
                f9.add(ch2);
                f9.add(ch2_1);
                //major
                chl3.setBounds(0, 100, 150, 30);
                ch3.setBounds(200, 100, 200, 30);
                ch3_1.setBounds(400, 100, 200, 30);
                f9.add(chl3);
                f9.add(ch3);
                f9.add(ch3_1);
                //education
                chl4.setBounds(0, 150, 150, 30);
                ch4.setBounds(200, 150, 200, 30);
                ch4_1.setBounds(400, 150, 200, 30);
                f9.add(chl4);
                f9.add(ch4);
                f9.add(ch4_1);

                f9.add(but9_1);
                f9.add(but9_2);
                f9.add(but9_3);
                f9.add(but9_4);
                f9.add(help5);
                f9.add(help4);
                but9_1.setBounds(600, 0, 200, 30);
                but9_2.setBounds(600, 50, 200, 30);
                but9_3.setBounds(600, 100, 200, 30);
                but9_4.setBounds(600, 150, 200, 30);
            }
        }
        );
        but9_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("em: " + ch1.getText());
                ArrayList<String> ems = new ArrayList<>();
                String ob = null;
                try ( BufferedReader in = new BufferedReader(new FileReader("ems.txt"))) {
                    System.out.println("mpika sto try");
                    while ((ob = in.readLine()) != null) {
                        System.out.println("arxi tis do-while");
                        System.out.println("employee read from file: " + ob);
                        if (ob.contains(ch1.getText())) { //αν ο εργαζόμενος που διαβασε απο το αρχείο με τους εργαζομενους έψειτο ίδιο επώνυμο  με το επονυμο που έδωσε ο χρήστης 
                            System.out.println("mpika stin if - brika ton em pou me endiaferei");
                            for (int i = 0; i < allEmps.size(); i++) {
                                if (allEmps.get(i).getName().equals(ch1.getText()))//an brei stin lista me olous tous ergazomenous to eponimo poy edose o xristis oti thelei na prostethei o ergazomwnoa
                                {
                                    System.out.println("mpika stin if tis for");
                                    allEmps.get(i).changeFamily();// αλλαξει την οικογενειακη κατασταση
                                    System.out.println(allEmps.get(i).toString());
                                    // readString = allDps.get(i).toString();
                                    break;
                                }
                            }
                        } else {
                            System.out.println("mpika stin else (den brika ton em pou zitaei o xristsis)");
                            ems.add(ob);
                        }
                        System.out.println("eftasa sto telos tis do-while");
                    }
                    in.close();
                } catch (FileNotFoundException ex) {
                    System.out.println("rerror1");
                } catch (IOException ex) {
                    Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
                }
                BufferedWriter out2;
                try {
                    File file = new File("ems.txt");
                    file.delete();
                    file.createNewFile();
                    out2 = new BufferedWriter(new FileWriter(file, true));
                    for (int i = 0; i < allEmps.size(); i++) {
                        out2.write(allEmps.get(i).toString());
                        out2.newLine();
                        out2.flush();
                        System.out.println("obj to be written in file: " + allEmps.get(i).toString());
                    }
                    out2.close();
                    System.out.println("stream closed");
                } catch (FileNotFoundException ex2) {
                    System.out.println("eroor");
                    //Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex2);
                } catch (IOException ex2) {
                    System.out.println("eroor2");
                    //Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex2);
                }
                f9.setVisible(false);
            }
        }
        );

        but9_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("em: " + ch2_1.getText());
                ArrayList<String> ems = new ArrayList<>();
                String ob = null;
                try ( BufferedReader in = new BufferedReader(new FileReader("ems.txt"))) {
                    System.out.println("mpika sto try");
                    while ((ob = in.readLine()) != null) {
                        System.out.println("arxi tis do-while");
                        System.out.println("employee read from file: " + ob);
                        if (ob.contains(ch2_1.getText())) { //αν ο εργαζόμενος που διαβασε απο το αρχείο με τους εργαζομενους έψειτο ίδιο επώνυμο  με το επονυμο που έδωσε ο χρήστης 
                            System.out.println("mpika stin if - brika ton em pou me endiaferei");
                            for (int i = 0; i < allEmps.size(); i++) {
                                if (allEmps.get(i).getName().equals(ch2_1.getText()))//an brei stin lista me olous tous ergazomenous to eponimo poy edose o xristis oti thelei na prostethei o ergazomwnoa
                                {
                                    System.out.println("mpika stin if tis for");
                                    allEmps.get(i).changeNumOfChilds(Integer.parseInt(ch2.getText()));// αλλαξει την οικογενειακη κατασταση
                                    System.out.println(allEmps.get(i).toString());
                                    break;
                                }
                            }
                        } else {
                            System.out.println("mpika stin else (den brika ton em pou zitaei o xristsis)");
                            ems.add(ob);
                        }
                        System.out.println("eftasa sto telos tis do-while");
                    }
                    in.close();

                } catch (FileNotFoundException ex) {
                    System.out.println("rerror1");
                } catch (IOException ex) {
                    Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
                }
                BufferedWriter out2;
                try {
                    File file = new File("ems.txt");
                    file.delete();
                    file.createNewFile();
                    out2 = new BufferedWriter(new FileWriter(file, true));
                    for (int i = 0; i < allEmps.size(); i++) {
                        out2.write(allEmps.get(i).toString());
                        out2.newLine();
                        out2.flush();
                        System.out.println("obj to be written in file: " + allEmps.get(i).toString());
                    }
                    out2.close();
                    System.out.println("stream closed");

                } catch (FileNotFoundException ex2) {
                    System.out.println("eroor");
                    //Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex2);
                } catch (IOException ex2) {
                    System.out.println("eroor2");
                    //Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex2);
                }
                //f9.setVisible(false);
            }
        }
        );

        but9_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("em: " + ch3_1.getText());
                //diabazo ola ta departments

                ArrayList<String> ems = new ArrayList<>();
                String ob = null;

                try ( BufferedReader in = new BufferedReader(new FileReader("ems.txt"))) {
                    System.out.println("mpika sto try");
                    while ((ob = in.readLine()) != null) {
                        System.out.println("arxi tis do-while");
                        System.out.println("employee read from file: " + ob);
                        if (ob.contains(ch3_1.getText())) { //αν ο εργαζόμενος που διαβασε απο το αρχείο με τους εργαζομενους έψειτο ίδιο επώνυμο  με το επονυμο που έδωσε ο χρήστης 
                            System.out.println("mpika stin if - brika ton em pou me endiaferei");
                            for (int i = 0; i < allEmps.size(); i++) {
                                if (allEmps.get(i).getName().equals(ch3_1.getText()))//an brei stin lista me olous tous ergazomenous to eponimo poy edose o xristis oti thelei na prostethei o ergazomwnoa
                                {
                                    System.out.println("mpika stin if tis for");
                                    allEmps.get(i).changeMajor(ch3.getText());// αλλαξει την οικογενειακη κατασταση
                                    System.out.println(allEmps.get(i).toString());
                                    break;
                                }
                            }
                        } else {
                            System.out.println("mpika stin else (den brika ton em pou zitaei o xristsis)");
                            ems.add(ob);
                        }
                        System.out.println("eftasa sto telos tis do-while");
                    }
                    in.close();

                } catch (FileNotFoundException ex) {
                    System.out.println("rerror1");
                } catch (IOException ex) {
                    //Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
                }
                BufferedWriter out2;
                try {
                    File file = new File("ems.txt");
                    file.delete();
                    file.createNewFile();
                    out2 = new BufferedWriter(new FileWriter(file, true));
                    for (int i = 0; i < allEmps.size(); i++) {
                        out2.write(allEmps.get(i).toString());
                        out2.newLine();
                        out2.flush();
                        System.out.println("obj to be written in file: " + allEmps.get(i).toString());
                    }
                    out2.close();
                    System.out.println("stream closed");

                } catch (FileNotFoundException ex2) {
                    System.out.println("eroor");
                    //Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex2);
                } catch (IOException ex2) {
                    System.out.println("eroor2");
                    //Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex2);
                }
                //f9.setVisible(false);
            }
        }
        );

        but9_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("em: " + ch4_1.getText());
                //diabazo ola ta departments

                ArrayList<String> ems = new ArrayList<>();
                String ob = null;

                try ( BufferedReader in = new BufferedReader(new FileReader("ems.txt"))) {
                    System.out.println("mpika sto try");
                    while ((ob = in.readLine()) != null) {
                        System.out.println("arxi tis do-while");
                        System.out.println("employee read from file: " + ob);
                        if (ob.contains(ch4_1.getText())) { //αν ο εργαζόμενος που διαβασε απο το αρχείο με τους εργαζομενους έψειτο ίδιο επώνυμο  με το επονυμο που έδωσε ο χρήστης 
                            System.out.println("mpika stin if - brika ton em pou me endiaferei");
                            for (int i = 0; i < allEmps.size(); i++) {
                                if (allEmps.get(i).getName().equals(ch4_1.getText()))//an brei stin lista me olous tous ergazomenous to eponimo poy edose o xristis oti thelei na prostethei o ergazomwnoa
                                {
                                    System.out.println("mpika stin if tis for");
                                    allEmps.get(i).changeEducation(ch4.getText());// αλλαξει την οικογενειακη κατασταση
                                    System.out.println(allEmps.get(i).toString());
                                    break;
                                }
                            }
                        } else {
                            System.out.println("mpika stin else (den brika ton em pou zitaei o xristsis)");
                            ems.add(ob);
                        }
                        System.out.println("eftasa sto telos tis do-while");
                    }
                    in.close();

                } catch (FileNotFoundException ex) {
                    System.out.println("rerror1");
                } catch (IOException ex) {
                    Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
                }
                BufferedWriter out2;
                try {
                    File file = new File("ems.txt");
                    file.delete();
                    file.createNewFile();
                    out2 = new BufferedWriter(new FileWriter(file, true));
                    for (int i = 0; i < allEmps.size(); i++) {
                        out2.write(allEmps.get(i).toString());
                        out2.newLine();
                        out2.flush();
                        System.out.println("obj to be written in file: " + allEmps.get(i).toString());
                    }
                    out2.close();
                    System.out.println("stream closed");

                } catch (FileNotFoundException ex2) {
                    System.out.println("eroor");
                    //Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex2);
                } catch (IOException ex2) {
                    System.out.println("eroor2");
                    //Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex2);
                }
                //f9.setVisible(false);
            }
        }
        );

        //set department manager
        but10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                f10.setLayout(null);
                f10.setBounds(700, 150, 400, 400);
                f10.setVisible(true);
                f10.add(setManToDp);
                f10.add(setManToDpL);
                f10.add(DpN);
                f10.add(DpNl);
                f10.add(but10_1);
                setManToDpL.setBounds(0, 0, 130, 30);
                setManToDp.setBounds(130, 0, 100, 30);
                DpNl.setBounds(0, 50, 130, 30);
                DpN.setBounds(130, 50, 100, 30);
                but10_1.setBounds(0, 100, 250, 50);
            }
        }
        );

        but10_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("dp: " + DpN.getText());
                System.out.println("em: " + setManToDp.getText());
                //diabazo ola ta departments
                Department dpToSet;
                Employee emToSet = null;
                ArrayList<String> dps = new ArrayList<>();
                String ob = null;
                //find manager
                String ob2 = null;
                try ( BufferedReader in2 = new BufferedReader(new FileReader("ems.txt"))) {

                    System.out.println("mpika sto try");
                    while ((ob2 = in2.readLine()) != null) {
                        System.out.println("arxi tis do-while");
                        System.out.println("employee read from file: " + ob2);
                        if (ob2.contains(setManToDp.getText())) { //αν ο employee που διαβασε απο το αρχείο με τους εργαζομενους έψει το ίδιο ονομα  με τον εργαζομενο που έδωσε ο χρήστης 
                            System.out.println("mpika stin if - brika ton em pou me endiaferei");
                            for (int i = 0; i < allEmps.size(); i++) {

                                if (allEmps.get(i).getName().equals(setManToDp.getText()))//an brei stin lista me oal ta departments to dp poy edose o xristis oti thelei na prostethei o ergazomwnoa
                                {
                                    // allDps.get(i).setDepartmentManager(setManToDpL.getText(),);// προσθέτει τον manager στο dp
                                    System.out.println(allEmps.get(i).toString());
                                    emToSet = allEmps.get(i);
                                    System.out.println("emtoset: " + emToSet);
                                    System.out.println("mpika stin if tis for");
                                    break;
                                }
                            }
                        } else {
                            System.out.println("mpika stin else (den brika to em pou zitaei o xristsis)");
                        }
                        System.out.println("eftasa sto telos tis do-while");
                    }
                    in2.close();

                } catch (FileNotFoundException ex) {
                    System.out.println("rerror1");
                } catch (IOException ex) {
                    //Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
                }
                //find dp
                try ( BufferedReader in = new BufferedReader(new FileReader("dps.txt"))) {
                    System.out.println("mpika sto try");
                    while ((ob = in.readLine()) != null) {
                        System.out.println("arxi tis do-while");
                        System.out.println("department read from file: " + ob);
                        if (ob.startsWith(DpN.getText())) { //αν το department που διαβασε απο το αρχείο με τα τμήματα έψει την ίδια αρχή (τίτλο) με το department που έδωσε ο χρήστης 
                            System.out.println("mpika stin if - brika to dp pou me endiaferei");
                            for (int i = 0; i < allDps.size(); i++) {
                                if (allDps.get(i).getTitle().equals(DpN.getText()))//an brei stin lista me oal ta departments to dp poy edose o xristis oti thelei na prostethei o ergazomwnoa
                                {
                                    System.out.println("mpika stin if tis for");
                                    //current date
                                    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
                                    Date date = new Date(System.currentTimeMillis());
                                    //System.out.println(formatter.format(date));
                                    System.out.println("emtoset: " + emToSet);
                                    allDps.get(i).setDepartmentManager(emToSet, date.toString());// προσθέτει τον manager στο dp
                                    System.out.println(allDps.get(i).toString());
                                    System.out.println("mpika stin if tis for");
                                    break;
                                }
                            }
                        } else {
                            System.out.println("mpika stin else (den brika to dp pou zitaei o xristsis)");
                            dps.add(ob);
                        }
                        System.out.println("eftasa sto telos tis do-while");
                    }
                    in.close();
                } catch (FileNotFoundException ex) {
                    System.out.println("rerror1");
                } catch (IOException ex) {
                    //Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
                }
                BufferedWriter out2;
                try {
                    File file = new File("dps.txt");
                    file.delete();
                    file.createNewFile();
                    out2 = new BufferedWriter(new FileWriter(file, true));
                    for (int i = 0; i < allDps.size(); i++) {
                        out2.write(allDps.get(i).toString());
                        out2.newLine();
                        out2.flush();
                        //System.out.println("obj to be written in file: " + readString);
                    }
                    out2.close();
                    System.out.println("stream closed");

                } catch (FileNotFoundException ex2) {
                    System.out.println("eroor");
                    //Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex2);
                } catch (IOException ex2) {
                    System.out.println("eroor2");
                    //Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex2);
                }
                f10.setVisible(false);
            }
        }
        );
        //Count salary
        but11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                f11.setLayout(null);
                f11.setBounds(700, 150, 400, 400);
                f11.setVisible(true);

                emNameToCountl.setBounds(0, 50, 100, 30);
                emNameToCount.setBounds(100, 50, 150, 30);
                f11.add(emNameToCountl);
                f11.add(emNameToCount);

                but11_1.setVisible(true);
                but11_1.setBounds(100, 300, 150, 30);
                f11.add(but11_1);

            }
        }
        );

        but11_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //find employee
                String ob2 = null;
                try ( BufferedReader in2 = new BufferedReader(new FileReader("ems.txt"))) {

                    System.out.println("mpika sto try");
                    while ((ob2 = in2.readLine()) != null) {
                        System.out.println("arxi tis do-while");
                        System.out.println("employee read from file: " + ob2);
                        if (ob2.contains(emNameToCount.getText())) { //αν ο employee που διαβασε απο το αρχείο με τους εργαζομενους έψει το ίδιο ονομα  με τον εργαζομενο που έδωσε ο χρήστης 
                            System.out.println("mpika stin if - brika ton em pou me endiaferei");
                            for (int i = 0; i < allEmps.size(); i++) {

                                if (allEmps.get(i).getName().equals(emNameToCount.getText()))//an brei stin lista me oal ta departments to dp poy edose o xristis oti thelei na prostethei o ergazomwnoa
                                {
                                    // allDps.get(i).setDepartmentManager(setManToDpL.getText(),);// προσθέτει τον manager στο dp
                                    System.out.println(allEmps.get(i).toString());
                                    int res = allEmps.get(i).CountSalay();
                                    JOptionPane.showMessageDialog(f11, res, "salary", JOptionPane.WARNING_MESSAGE);
                                    System.out.println(allEmps.get(i).getName() + " salary is: " + res);
                                    System.out.println("mpika stin if tis for");
                                    break;
                                }
                            }
                        } else {
                            System.out.println("mpika stin else (den brika to em pou zitaei o xristsis)");
                        }
                        System.out.println("eftasa sto telos tis do-while");
                    }
                    in2.close();
                } catch (FileNotFoundException ex) {
                    System.out.println("rerror1");
                } catch (IOException ex) {
                    //Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
                }
                emNameToCount.setText(null);
                f11.setVisible(false);
            }
        }
        );
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ArrayList<Project> allProjForCount = new ArrayList<>();
                String ob2;
                try ( BufferedReader in2 = new BufferedReader(new FileReader("proj.txt"))) {

                    System.out.println("mpika sto try");
                    while ((ob2 = in2.readLine()) != null) {
                        System.out.println("arxi tis do-while");
                        System.out.println("project read from file: " + ob2);
                        for (int i = 0; i < allProj.size(); i++) {
                            if (allProj.get(i).getName().equals(prN.getText()))//an brei stin lista me ola ta project to onoma poy edose o xristis oti thelei na prostethei ton ergazomwnoa
                            {
                                System.out.println("mpika stin if tis for");
                                allProjForCount.add(allProj.get(i));// prosthetei ton project stin lista
                                break;
                            }
                        }
                        System.out.println("eftasa sto telos tis do-while");
                    }
                    in2.close();

                } catch (FileNotFoundException ex) {
                    System.out.println("rerror1");
                } catch (IOException ex) {
                    //Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
                }
                Project ptoTest = new Project("test", "test", 0, 0, 0);
                String winner = ptoTest.findTheMostGainfullProject();
                JOptionPane.showMessageDialog(f11, winner, "gainfull Project", JOptionPane.WARNING_MESSAGE);
                f.setVisible(false);

            }
        }
        );
        f.add(exit);
        exit.setVisible(true);
        exit.setBounds(750, 710, 250, 50);
    }
}
