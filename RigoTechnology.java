/*
 * Author:Saugat Adhikari
 * N7
 */

//Importing all the required AWT,SWING AND JAVA libraries.//
import java.awt.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;
import java.util.*;
import java.io.*;

//Making a class named RigoTechnology that holds the GUI for the courrsework//
public class RigoTechnology implements ActionListener
{
   // Declaring multiple frames from class JFrame//
   private JFrame frame,frame2,frame3;
   
   
   // Global variables for Senoir Developer
   private JTextField txtName,txtDate, txtDevNo,txtRoom, txtSalarySenior, txtPlatformSenior,txtHoursSenior, txtInterviewerSenior, txtAdvSalary,txtContractSenior  ;
 
   private JButton btnSenior,btnAppoint,btnTerminate, btnAdd,btnDisplaySr,btnClearSr;
   
  
   //Global Variables for Junior Developer 
    private JTextField txtNameJr,txtSpecial,txtDevNoJr,txtEvaluation, txtTermination,txtAppointedBy,txtPlatformJunior,txtHoursJunior,txtInterviewerJunior,txtSalaryJunior,txtAppointed ;
    
   
    
    private JButton btnJunior,btnAppointJr,btnAddJr,btnDisplayJr,btnClearJr;
    
    //Creating an Array List
    ArrayList<Developer>list = new ArrayList<Developer>();
   
    
    //Creating a main method that makes a object of RigoTechnology class and class makeFrame() fucntion.//
    
    public static void main(String args [])
    {
        RigoTechnology newObj = new RigoTechnology();
        newObj.makeFrame();
        }
    
    
   //Creating the method named makeFrame() that contains all the components and developments of the GUI program.//
    public void makeFrame()
   {
       
       // Main option frame, where user can choose between Senior and Junior Developer form.//
       frame3 = new JFrame("Rigo Technology");
       frame3.setSize(600,500); 
       frame3.setLocation(50,0);
       frame3.getContentPane().setBackground(new Color(93,173,226));
       frame3.getRootPane().setBorder(BorderFactory.createMatteBorder(4,4,4,4,Color.red));
       
       //Creating labels for frames using JLabel class//
       JLabel lblChoose = new JLabel("Choose a Developer:");
       lblChoose.setBounds(150,100,400,30);
       lblChoose.setFont(new Font("Monaco",Font.BOLD,30));
       lblChoose.setForeground(new Color(142, 68, 173));
       frame3.add(lblChoose);
       
       //Creating button named btnSenior that access the SeniorDeveloper frame when clicked.//
       btnSenior = new JButton("1.Senior Developer");
       btnSenior.setBounds(150,200,200,40);
       btnSenior.setBackground(new Color(215, 189, 226));
       frame3.add(btnSenior);
       
       //Creating button named btnJunior that access the JuniorDeveloper frame when clicked.//
       btnJunior = new JButton("2.Junior Developer");
       btnJunior.setBounds(150,300,200,40);
       btnJunior.setBackground(new Color(163, 228, 215));
       frame3.add(btnJunior);
       
       ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
       
       //Senior Developer Frame
       
       frame = new JFrame("Rigo Technology");
       frame.setSize(1300,650);
       frame.setLocation(0,0);
       frame.getContentPane().setBackground(new Color(250, 215, 160 ));
       frame.getRootPane().setBorder(BorderFactory.createMatteBorder(4,4,4,4,Color.red));
       
       
       // Components of Senior Developer
       
       
       JLabel lblHead = new JLabel("Senior Developer");
       lblHead.setFont(new Font("Monaco",Font.BOLD,40));
       lblHead.setForeground(new Color(142, 68, 173));
       lblHead.setBounds(300,10,400,40);
       frame.add(lblHead);
       
       JLabel lblPlatformSenior = new JLabel("Platform:");
       lblPlatformSenior.setFont(new Font("Monaco",Font.BOLD,15));
       lblPlatformSenior.setForeground(Color.black);
       lblPlatformSenior.setBounds(10,70,150,20);
       frame.add(lblPlatformSenior);
        
       txtPlatformSenior = new JTextField();
       txtPlatformSenior.setBounds(180,70,300,40);
       frame.add(txtPlatformSenior);
        
       JLabel lblInterviewerSenior = new JLabel("Interveiwer:");
       lblInterviewerSenior.setBounds(600,70,150,20);
       lblInterviewerSenior.setFont(new Font("Monaco",Font.BOLD,15));
       lblInterviewerSenior.setForeground(Color.black);
       frame.add(lblInterviewerSenior);
        
      
       txtInterviewerSenior = new JTextField();
       txtInterviewerSenior.setBounds(820,70,300,40);
       frame.add(txtInterviewerSenior);
        
       JLabel lblHoursSenior = new JLabel("Working Hours:");
       lblHoursSenior.setBounds(10,130,150,20);
       lblHoursSenior.setFont(new Font("Monaco",Font.BOLD,15));
       lblHoursSenior.setForeground(Color.black);
       frame.add(lblHoursSenior);
        
       txtHoursSenior = new JTextField();
       txtHoursSenior.setBounds(180,130,300,40);
       frame.add(txtHoursSenior);
        
       JLabel lblSalarySenior = new JLabel("Salary:");
       lblSalarySenior.setFont(new Font("Monaco",Font.BOLD,15));
       lblSalarySenior.setBounds(600,130,150,20);
       lblSalarySenior.setForeground(Color.black);
       frame.add(lblSalarySenior);
       
       txtSalarySenior = new JTextField();
       txtSalarySenior.setBounds(820,130,300,40);
       frame.add(txtSalarySenior);
       
       JLabel lblContractSenior = new JLabel("Contract Period:");
       lblContractSenior.setFont(new Font("Monaco",Font.BOLD,15));
       lblContractSenior.setForeground(Color.black);
       lblContractSenior.setBounds(10,190,150,20);
       frame.add(lblContractSenior);
       
       txtContractSenior = new JTextField();
       txtContractSenior.setBounds(180,190,300,40);
       frame.add(txtContractSenior);
       
       //Creating a button named btnAdd that adds the above values into platform when clicked//
       btnAdd = new JButton("Add to Platform");
       btnAdd.setBounds(300,250,200,40);
       btnAdd.setBackground(new Color(249, 231, 159));
       frame.add(btnAdd);
       
       
       
      
       //Values After adding to platform
       
       
       
       JLabel lblName = new JLabel("Name:");
       lblName.setForeground(Color.black);
       lblName.setFont(new Font("Monaco",Font.BOLD,15));
       lblName.setBounds(10,350,150,20);
       frame.add(lblName);
       
       txtName = new JTextField();
       txtName.setBounds(180,350,300,40);
       frame.add(txtName);
       
       JLabel lblDate = new JLabel("Joining Date:");
       lblDate.setBounds(600,350,150,20);
       lblDate.setFont(new Font("Monaco",Font.BOLD,15));
       lblDate.setForeground(Color.black);
       frame.add(lblDate);
       
       txtDate = new JTextField();
       txtDate.setBounds(820,350,300,40);
       frame.add(txtDate);
       
       JLabel lblDevNo = new JLabel("Developer No:");
       lblDevNo.setFont(new Font("Monaco",Font.BOLD,15));
       lblDevNo.setBounds(10,410,150,20);
       lblDevNo.setForeground(Color.black);
       frame.add(lblDevNo);
       
       txtDevNo = new JTextField();
       txtDevNo.setBounds(180,410,300,40);
       frame.add(txtDevNo);
      
       JLabel lblRoom = new JLabel("Room No:");
       lblRoom.setBounds(600,410,150,20);
       lblRoom.setFont(new Font("Monaco",Font.BOLD,15));
       lblRoom.setForeground(Color.black);
       frame.add(lblRoom);
       
       txtRoom = new JTextField();
       txtRoom.setBounds(820,410,300,40);
       frame.add(txtRoom);
       
       JLabel lblAdvSalary = new JLabel("Advance Salary:");
       lblAdvSalary.setBounds(10,470,150,20);
       lblAdvSalary.setFont(new Font("Monaco",Font.BOLD,15));
       lblAdvSalary.setForeground(Color.black);
       frame.add(lblAdvSalary);
       
       txtAdvSalary = new JTextField();
       txtAdvSalary.setBounds(180,470,300,40);
       frame.add(txtAdvSalary);
       
       //Creating a button named btnAppoint that appoints the SeniorDeveloper and appends it's values into a arraylist.//
       btnAppoint = new JButton("Appoint");
       btnAppoint.setBounds(50,530,200,30);
       btnAppoint.setBackground(new Color(40, 180, 99 ));
       frame.add(btnAppoint);
       
       
       /*Creating a button named btnTerminate that terminates 
        * the SeniorDeveloper ad removes it's vaues from a arraylist.
        */
       btnTerminate = new JButton("Terminate");
       btnTerminate.setBounds(400,530,200,30);
       btnTerminate.setBackground(new Color(231, 76, 60 ));
       frame.add(btnTerminate);
       
       
       /*Creating a button named btnClearSr that clears all the text fields
       *within the GUI when clicked
       */
       btnClearSr = new JButton("Clear");
       btnClearSr.setBounds(750,530,200,30);
       btnClearSr.setBackground(new Color(210, 180, 222));
       frame.add(btnClearSr);
       
       /*Creating a button named btnDisplaySr that displays all the values
        *of Senior Developer by calling display() method of SeniorDeveloper class
        */ 
       btnDisplaySr = new JButton("Display All");
       btnDisplaySr.setBounds(1000,530,200,30);
       btnDisplaySr.setBackground(new Color(210, 180, 222));
       frame.add(btnDisplaySr);
       
       //Setting the layout of the frame to null//
       frame.setLayout(null);
       
       
       
       /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   
       //Creating a frame for Junior Developer/
       
       frame2 = new JFrame("Rigo Technology");
       frame2.setSize(1300,900);
       frame2.setLocation(10,0);
       frame2.getContentPane().setBackground(new Color(250, 215, 160 ));
       frame2.getRootPane().setBorder(BorderFactory.createMatteBorder(4,4,4,4,Color.red));
       
       
       //Components of Junior Developer Form//
       
       
       JLabel lblHead1 = new JLabel("Junior Developer");
       lblHead1.setFont(new Font("Monaco",Font.BOLD,40));
       lblHead1.setForeground(new Color(142, 68, 173));
       lblHead1.setBounds(300,10,400,40);
       frame2.add(lblHead1); 
       
       JLabel lblPlatformJunior = new JLabel("Platform:");
       lblPlatformJunior.setForeground(Color.black);
       lblPlatformJunior.setFont(new Font("Monaco",Font.BOLD,15));
       lblPlatformJunior.setBounds(10,70,150,20);
       frame2.add(lblPlatformJunior);
        
       txtPlatformJunior = new JTextField();
       txtPlatformJunior.setBounds(180,70,300,40);
       frame2.add(txtPlatformJunior);
        
       JLabel lblInterviewerJunior = new JLabel("Interveiwer:");
       lblInterviewerJunior.setBounds(600,70,150,20);
       lblInterviewerJunior.setFont(new Font("Monaco",Font.BOLD,15));
       lblInterviewerJunior.setForeground(Color.black);
       frame2.add(lblInterviewerJunior);
        
      
       txtInterviewerJunior = new JTextField();
       txtInterviewerJunior.setBounds(820,70,300,40);
       frame2.add(txtInterviewerJunior);
        
       JLabel lblHoursJunior = new JLabel("Working Hours:.");
       lblHoursJunior.setBounds(10,130,150,20);
       lblHoursJunior.setFont(new Font("Monaco",Font.BOLD,15));
       lblHoursJunior.setForeground(Color.black);
       frame2.add(lblHoursJunior);
        
       txtHoursJunior = new JTextField();
       txtHoursJunior.setBounds(180,130,300,40);
       frame2.add(txtHoursJunior);
        
       JLabel lblSalaryJunior = new JLabel("Salary:");
       lblSalaryJunior.setBounds(600,130,150,20);
       lblSalaryJunior.setFont(new Font("Monaco",Font.BOLD,15));
       lblSalaryJunior.setForeground(Color.black);
       frame2.add(lblSalaryJunior);
       
       txtSalaryJunior = new JTextField();
       txtSalaryJunior.setBounds(820,130,300,40);
       frame2.add(txtSalaryJunior);
       
       JLabel lblAppointedBy = new JLabel("Appointed By:");
       lblAppointedBy.setBounds(10,190,150,20);
       lblAppointedBy.setFont(new Font("Monaco",Font.BOLD,15));
       lblAppointedBy.setForeground(Color.black);
       frame2.add(lblAppointedBy);
       
       txtAppointedBy = new JTextField();
       txtAppointedBy.setBounds(180,190,300,40);
       frame2.add(txtAppointedBy);
       
       
       
       JLabel lblTermination = new JLabel("Termination Date:");
       lblTermination.setBounds(600,190,150,20);
       lblTermination.setFont(new Font("Monaco",Font.BOLD,15));
       lblTermination.setForeground(Color.black);
       frame2.add(lblTermination);
       
       txtTermination = new JTextField();
       txtTermination.setBounds(820,190,300,40);
       frame2.add(txtTermination);
       
       //Creating a button named btnAddJr that adds the above values into platform when clicked//
       
       btnAddJr = new JButton("Add to Platform");
       btnAddJr.setBounds(300,250,200,40);
       btnAddJr.setBackground(new Color(249, 231, 159));
       frame2.add(btnAddJr);
       
       //ValuesAfter adding to platform//
       
       
       JLabel lblNameJr = new JLabel("Name:");
       lblNameJr.setForeground(Color.black);
       lblNameJr.setBounds(10,350,150,20);
       lblNameJr.setFont(new Font("Monaco",Font.BOLD,15));
       frame2.add(lblNameJr);
       
       txtNameJr = new JTextField();
       txtNameJr.setBounds(180,350,300,40);
       frame2.add(txtNameJr);
       
       JLabel lblDevNo1 = new JLabel("Developer No:");
       lblDevNo1.setBounds(600,350,150,20);
       lblDevNo1.setFont(new Font("Monaco",Font.BOLD,15));
       lblDevNo1.setForeground(Color.black);
       frame2.add(lblDevNo1);
       
       txtDevNoJr = new JTextField();
       txtDevNoJr.setBounds(820,350,300,40);
       frame2.add(txtDevNoJr);
       
       JLabel lblSpecial = new JLabel("Specialization:");
       lblSpecial.setForeground(Color.black);
       lblSpecial.setBounds(10,410,150,20);
       lblSpecial.setFont(new Font("Monaco",Font.BOLD,15));
       frame2.add(lblSpecial);
       
       txtSpecial = new JTextField();
       txtSpecial.setBounds(180,410,300,40);
       frame2.add(txtSpecial);
       
       JLabel lblEvaluation = new JLabel("Evaluation Period:");
       lblEvaluation.setBounds(600,410,150,20);
       lblEvaluation.setFont(new Font("Monaco",Font.BOLD,15));
       lblEvaluation.setForeground(Color.black);
       frame2.add(lblEvaluation);
       
       txtEvaluation = new JTextField();
       txtEvaluation.setBounds(820,410,300,40);
       frame2.add(txtEvaluation);
       
       JLabel lblAppointed = new JLabel("Appointed Date:");
       lblAppointed.setBounds(10,470,150,20);
       lblAppointed.setFont(new Font("Monaco",Font.BOLD,15));
       lblAppointed.setForeground(Color.black);
       frame2.add(lblAppointed);
       
       txtAppointed = new JTextField();
       txtAppointed.setBounds(180,470,300,40);
       frame2.add(txtAppointed);
       
       //Creating a button named btnAppointJr that appoints the JuniorDeveloper and appends it's values into a arraylist.//
       
       btnAppointJr = new JButton("Appoint");
       btnAppointJr.setBounds(100,530,200,40);
       btnAppointJr.setBackground(new Color(40, 180, 99 ));
       frame2.add(btnAppointJr);
       
       /*Creating a button named btnClearJr that clears all the text fields
       *within the GUI when clicked
       */
       btnClearJr = new JButton("Clear");
       btnClearJr.setBounds(750,530,200,30);
       btnClearJr.setBackground(new Color(210, 180, 222));
       frame2.add(btnClearJr);
        
       
       /*Creating a button named btnDisplayJr that displays all the values
        *of Junior Developer by calling display() method of SeniorDeveloper class
        */
       btnDisplayJr = new JButton("Display All");
       btnDisplayJr.setBounds(1000,530,200,30);
       btnDisplayJr.setBackground(new Color(210, 180, 222));
       frame2.add(btnDisplayJr);
       
       
       //Setting the layout of the frame to null//
       frame2.setLayout(null);
       
       
       //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
       frame3.setLayout(null);
       
       //Setting he visibility of Mainframe frame3 to true.//
       frame3.setVisible(true);
       
       /* All the buttons created within the GUI are made radiobuttons by making them
        * ActionListener to do provided tasks.
        */
       btnAppointJr.addActionListener(this);
       btnAddJr.addActionListener(this);
       btnAppoint.addActionListener(this);
       btnTerminate.addActionListener(this);
       btnClearJr.addActionListener(this);
       btnDisplayJr.addActionListener(this);
       btnClearSr.addActionListener(this);
       btnDisplaySr.addActionListener(this);
       btnAdd.addActionListener(this);
       btnSenior.addActionListener(this);
       btnJunior.addActionListener(this);
    }
    
    
    /*Creating a method anmed actionPerformed that takes an actionevent c as a parameter
     * and throws NullPointer,NumberFormat and Arithmetic Excpetion. All the properite of radio
     * buttons are set inside this method along with proper event handling.
     */
    
    public void actionPerformed(ActionEvent c) throws NullPointerException, NumberFormatException, ArithmeticException
    {
        /* getSource() method is called which gets the source of all the buttons pressed and provides them 
         * appropriate tasks by using if and else if statements.
         */
        if(c.getSource() == btnAdd)
        {
            /*Retrieveing the values before adding to platform button in SeniorDeveloper form
            * and storing them into a string varible.
            */
           
           String salarySr = txtSalarySenior.getText();
           String platformSr = txtPlatformSenior.getText();
           String hoursSr = txtHoursSenior.getText();
           String interviewerSr = txtInterviewerSenior.getText();
           String contractSr = txtContractSenior.getText();
          
           // Creating a try and catch block to catch any exceptions or events.//
          try
          {
              //Throwing a nullpointerexception if any of the textfield are left empty.//
           if (salarySr.isEmpty() || platformSr.isEmpty() || hoursSr.isEmpty() || interviewerSr.isEmpty() || contractSr.isEmpty())
           {
              throw new NullPointerException();
              
              
            }
            //Throwing a arithmeticexception if any of the below textfields are left at zero.//
           else if (salarySr.equals("0") || hoursSr.equals("0") || contractSr.equals("0"))
           {
               throw new ArithmeticException();
            }
            else{
                //Parsing the retreived strign values into double and integer.//
               double salary  = Double.parseDouble(salarySr);
               int workingHour = Integer.parseInt(hoursSr);
               int contractPeriod = Integer.parseInt(contractSr);
               
               /* Making a new object of SeniorDeveloper class and passing the parameters of its constructors
               * and adding them into a previously created arraylist.
               */
               SeniorDeveloper addSeniorObj = new SeniorDeveloper(platformSr,interviewerSr,workingHour,salary,contractPeriod);
               list.add(addSeniorObj);
               
               //Using JOptionPane to popup a appropriate message box.//
               JOptionPane.showMessageDialog(frame,"Information Message" + "\n\n" +"Platform for Senior Developer has been added. ");
            }
        }
        // Catching a numberformat exception if int/double are input in form as string.//
        catch(NumberFormatException p)
        {
           JOptionPane.showMessageDialog(frame,"Salary, Hours and Contract period cant be String"); 
        }
        
        catch(NullPointerException n)
        {
           JOptionPane.showMessageDialog(frame, "Please enter appropriate values in the fields!","ERROR Message",JOptionPane.ERROR_MESSAGE); 
        }
        
        catch(ArithmeticException o)
        {
            JOptionPane.showMessageDialog(frame,"Salary, Hours and Contract period cant be Zero.","ERROR Message",JOptionPane.ERROR_MESSAGE);
            }
            
        }
        
        
        else if(c.getSource() == btnAppoint)
        {
            /*Retrieveing the values before adding to platform button in SeniorDeveloper form
            * and storing them into a string varible.
            */
           String nameSr = txtName.getText();
           String dateSr = txtDate.getText();
           String devNoSr = txtDevNo.getText();
           String roomSr = txtRoom.getText();
           String advSr = txtAdvSalary.getText(); 
           
           // Creating a try and catch block to catch any exceptions or events.//
           try
           {
               //Throwing a nullpointerexception if any of the textfield are left empty.//

               if(nameSr.isEmpty() || dateSr.isEmpty() || devNoSr.isEmpty() || roomSr.isEmpty() || advSr.isEmpty())
               {
                  throw new NullPointerException();
                  
                }
                
                
                else{
                    //Parsing the retreived strign values into double and integer.//

                    int devNo = Integer.parseInt(devNoSr);
                    double advSalary = Double.parseDouble(advSr);
                
                    
                    if (devNo>-1 && devNo<list.size())
                     {
                        
                           
                            SeniorDeveloper temp = (SeniorDeveloper)list.get(devNo);
                            
                                if(temp.getAppointed() == false)
                                {
                                    temp.hireDeveloper(nameSr,dateSr,advSalary,roomSr);
                                    JOptionPane.showMessageDialog(frame, "Senior Developer has been succesfully hired.","Information Message",JOptionPane.INFORMATION_MESSAGE); 
                                }
                                else
                                {
                                    //Using JOptionPane to popup a appropriate message box.//
                                  JOptionPane.showMessageDialog(frame, "Senior Developer has already been hired!!","Error Message",JOptionPane.ERROR_MESSAGE);  
                                }
                                    
                        
                            
                            
                
                      }
                      else
                      { 
                          JOptionPane.showMessageDialog(frame, "This is not a valid Developer Number!!","Error Message",JOptionPane.ERROR_MESSAGE);
                          
                        }
                    }
                }
                // Catching a numberformat exception if int/double are input in form as String.//
                catch(NumberFormatException p)
                {
                   JOptionPane.showMessageDialog(frame,"Advance Salary, DeveloperNo and RoomNo cant be String","ERROR Message",JOptionPane.ERROR_MESSAGE); 
                }
        
                catch(NullPointerException n)
                {
                   JOptionPane.showMessageDialog(frame, "Please enter appropriate values in the fields!","ERROR Message",JOptionPane.ERROR_MESSAGE); 
                }
        }
        else if(c.getSource() == btnTerminate)
        {
           /*Retrieveing the values before adding to platform button in SeniorDeveloper form
            * and storing them into a string varible.
            */ 
           String devNoSr = txtDevNo.getText(); 
           
           //Parsing the retreived strign values into double and integer.//
           int devNo = Integer.parseInt(devNoSr);
           
           // Creating a try and catch block to catch any exceptions or events.//
           try
           {
               //Throwing a nullpointerexception if developernumber is left empty.//
               if(devNoSr.isEmpty())
               {
                  throw new NullPointerException();
                   
                }
                
               else if(devNo>-1 && devNo<list.size())
               {
                    
                    SeniorDeveloper temp = (SeniorDeveloper) list.get(devNo);
                    if(temp.getTerminated()==false)
                    {
                       temp.contractTermination();
                       JOptionPane.showMessageDialog(frame, "Senior Developer has been succesfully terminated.","Information Message",JOptionPane.INFORMATION_MESSAGE);
                        }
                     else
                     {
                         //Using JOptionPane to popup a appropriate message box.//

                        JOptionPane.showMessageDialog(frame, "Senior Developer is already termianted!!","Error Message",JOptionPane.ERROR_MESSAGE); 
                        }
                }
               else
               {
                  JOptionPane.showMessageDialog(frame, "Please enter a valid Developer Number!","Error Message",JOptionPane.ERROR_MESSAGE); 
                   }
                
            
             } 
             // Catching a numberformat exception if int/double are input in form as string.//

             catch(NumberFormatException p)
                {
                   JOptionPane.showMessageDialog(frame,"Developer Number cant be String","ERROR Message",JOptionPane.ERROR_MESSAGE); 
                }
        
             catch(NullPointerException n)
                {
                   JOptionPane.showMessageDialog(frame, "Please enter appropriate values in the fields!","ERROR Message",JOptionPane.ERROR_MESSAGE); 
                }
            
        }
        
        
        else if(c.getSource() == btnAddJr)
        {
             /*Retrieveing the values before adding to platform button in JuniorDeveloper form
            * and storing them into a string varible.
            */
           String appointedJr = txtAppointedBy.getText();
           String platformJr = txtPlatformJunior.getText();
           String hoursJr = txtHoursJunior.getText();
           String interviewerJr = txtInterviewerJunior.getText();
           String salaryJr = txtSalaryJunior.getText();
           
           // Creating a try and catch block to catch any exceptions or events.//

           try
           {
               //Throwing a nullpointerexception if any of the textfield are left empty.//

               if(appointedJr.isEmpty() || platformJr.isEmpty() || hoursJr.isEmpty() || interviewerJr.isEmpty() || salaryJr.isEmpty())
               {
                   throw new NullPointerException();
                    
                }
               else
               {
                   //Parsing the retreived strign values into double and integer.//
                   int hours = Integer.parseInt(hoursJr);
                   double salary = Double.parseDouble(salaryJr);
                   
                   /* Making a new object of JuniorDeveloper class and passing the parameters of its constructors
               * and adding them into a previously created arraylist.
               */
                   JuniorDeveloper addJuniorObj = new JuniorDeveloper(platformJr, interviewerJr,hours, salary, appointedJr);
                   list.add(addJuniorObj);
                   
                   //Using JOptionPane to popup a appropriate message box.//
                   JOptionPane.showMessageDialog(frame2,"Information Message" + "\n\n" +"Platform for Junior Developer has been added. ");
                   
                }
            }
            
            // Catching a numberformat exception if int/double are input in form as string.//
            catch(NumberFormatException p)
                {
                   JOptionPane.showMessageDialog(frame,"Salary and Hours cant be String","ERROR Message",JOptionPane.ERROR_MESSAGE); 
                }
        
            catch(NullPointerException n)
                {
                   JOptionPane.showMessageDialog(frame, "Please enter appropriate values in the fields!","ERROR Message",JOptionPane.ERROR_MESSAGE); 
                }
        }
        
        else if(c.getSource() == btnAppointJr)
        {
             /*Retrieveing the values before adding to platform button in JuniorDeveloper form
            * and storing them into a string varible.
            */
           String appointedJr = txtAppointed.getText();
           String nameJr = txtNameJr.getText();
           String specialJr = txtSpecial.getText();
           String devNoJr = txtDevNoJr.getText();
           String evaluationJr = txtEvaluation.getText();
           String terminationJr = txtTermination.getText();
           
           // Creating a try and catch block to catch any exceptions or events.//
           try
           {
               //Throwing a nullpointerexception if any of the textfield are left empty.//

               if( appointedJr.isEmpty() || nameJr.isEmpty() || specialJr.isEmpty() || devNoJr.isEmpty() || evaluationJr.isEmpty() || terminationJr.isEmpty())
               {
                   throw new NullPointerException();
                    
                }
               else{
                   //Parsing the retreived strign values into double and integer.//
                   int devNo = Integer.parseInt(devNoJr);
                    
                    if (devNo>-1 && devNo<list.size())
                     {
                        
                           
                            JuniorDeveloper temp = (JuniorDeveloper)list.get(devNo);
                            
                                if(temp.getJoined() == false)
                                {
                                    temp.appointDeveloper(nameJr,appointedJr, terminationJr,evaluationJr,specialJr);
                                    
                                    JOptionPane.showMessageDialog(frame2, "Junior Developer has been succesfully hired.","Information Message",JOptionPane.INFORMATION_MESSAGE); 
                                }
                                else
                                {
                                    //Using JOptionPane to popup a appropriate message box.//
                                  JOptionPane.showMessageDialog(frame2, "Junior Developer has already been hired!!","Error Message",JOptionPane.ERROR_MESSAGE);  
                                }
                                    
                        
                            
                            
                
                      }
                      else
                      { 
                          JOptionPane.showMessageDialog(frame2, "This is not a valid Developer Number!!","Error Message",JOptionPane.ERROR_MESSAGE);
                          
                        }
                    }
                } 
                // Catching a numberformat exception if int/double are input in form as string.//
                catch(NumberFormatException p)
                {
                   JOptionPane.showMessageDialog(frame,"Developer Number and Evaluation period cant be String","ERROR Message",JOptionPane.ERROR_MESSAGE); 
                }
        
                catch(NullPointerException n)
                {
                   JOptionPane.showMessageDialog(frame, "Please enter appropriate values in the fields!","ERROR Message",JOptionPane.ERROR_MESSAGE); 
                }
                    
        } 
        
        else if (c.getSource() == btnClearSr)
        {
            //Setting all the texts with textfields of SeniorDeveloper to empty string when btnClearSr is pressed.//
           txtName.setText("");
           txtDate.setText("");
           txtDevNo.setText("");
           txtRoom.setText("");
           txtAdvSalary.setText(""); 
           txtSalarySenior.setText("");
           txtPlatformSenior.setText("");
           txtHoursSenior.setText("");
           txtInterviewerSenior.setText("");
           txtContractSenior.setText("");
        }
        else if (c.getSource()==btnClearJr)
        {
             //Setting all the texts with textfields of JuniorDeveloper to empty string when btnClearJr is pressed.//
           txtNameJr.setText("");
           txtSpecial.setText("");
           txtDevNoJr.setText("");
           txtEvaluation.setText("");
           txtTermination.setText("");
           txtAppointedBy.setText("");
           txtPlatformJunior.setText("");
           txtHoursJunior.setText("");
           txtInterviewerJunior.setText("");
           txtSalaryJunior.setText("");
           txtAppointed.setText("");
        }
           
        
        
        else if (c.getSource() == btnDisplayJr)
            {
            
            for(Developer temp: list)
            {
                    if(temp instanceof JuniorDeveloper)
                    {
                    JuniorDeveloper junior = (JuniorDeveloper) temp;
                    junior.display();
                }
                }
                
                
            }
         else if(c.getSource()==btnDisplaySr)
         {
                for(Developer temp: list)
                {
                    if (temp instanceof SeniorDeveloper)
                    {
                    SeniorDeveloper senior = (SeniorDeveloper) temp;
                    senior.display();
                }
                    }
           
         }
        
        
        
       
    
         else if(c.getSource()==btnSenior)
         {
             //Disposing the Mainframe frame3 when btnSenior is clicked and setting the visiblity of frame to true.//
             frame3.dispose();
             frame.setVisible(true);
        
            }
    
            else if(c.getSource()==btnJunior)
            {
                //Disposing the Mainframe frame3 when btnJunior is clicked and setting the visiblity of frame2 to true.//
                frame3.dispose();
                frame2.setVisible(true);
            }
   
   
}  
}
