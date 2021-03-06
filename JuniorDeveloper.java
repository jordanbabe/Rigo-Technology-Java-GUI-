
/*
 * Author: Saugat Adhikari
 */

//Creating a JuniorDeveloper class that extends into Developer class/

public class JuniorDeveloper extends Developer
{
  //Declaring attributes
   private double salary;
   private String appointedDate;
   private String evaluationPeriod;
   private String terminationDate;
   private String specialization;
   private String appointedBy;
   private boolean joined;
   
   /* Creating a parameteried constructor that assigns salary,appointedby
    * and terminationDate with their paramater values and calls the
    * constructor of Developer class for platform, interviewerName and
    * working hours. The rest are intialized accordingly.
    * 
    */
   
   public JuniorDeveloper(String platform,String interviewerName, int workingHours, double salary, String appointedBy)
   {
       super(platform, interviewerName, workingHours);
       this.salary = salary;
       this.appointedBy = appointedBy;
       this.terminationDate = "";
       this.appointedDate = "";
       this.evaluationPeriod = "";
       this.specialization = "";
       this.joined = false;
       
    }
   
    /*This is an accessor method to access the value of attribute (Platform),
    * which return a String value by calling the getPlatform method of Developer class. 
    * 
    */
   public String getPlatform()
   {
       return super.getPlatform();
    }
   
     /*This is an accessor method to access the value of attribute (interviewerName), 
     * which returns a String value by calling the getInterviewer method of Developer class. 
     * 
     */
   public String getInterviewerName()
   {
       return super.getInterviewer();
    }
   
    /*This is an accessor method to access the value of attribute (interviewerName), 
    * which returns an Integer value by calling the getHours method of Developer class. 
    * 
    */
   public int getWorkingHours()
   {
       return super.getHours();
    }
   
    /*This is an accessor method to access the value of attribute (salary),
    * which returns double value. 
    * 
    */
   public double getSalary()
   {
       return this.salary;
    }
   
    /*This is an accessor method to access the value of attribute (appointedDate), 
    * which returns String value. 
    * 
    */
   public String getAppointedDate()
   {
       return this.appointedDate;
    }
   
    /*This is an accessor method to access the value of attribute (evaluationPeriod),
    * which returns String value. 
    * 
    */
   public String getEvaluationPeriod()
   {
       return this.evaluationPeriod;
    }
    
     /*This is an accessor method to access the value of attribute (terminationDate),
    * which returns String value. 
    * 
    */ 
   public String getTerminationDate()
   {
       return this.terminationDate;
    }
    
   /*This is an accessor method to access the value of attribute (specialization),
    * which returns String value. 
    * 
    */  
    
   public String getSpecialization()
   {
       return this.specialization;
    }
   
    /*This is an accessor method to access the value of attribute (appointedBy),
    * which returns String value. 
    * 
    */
    
   public String getAppointedBy()
   {
       return this.appointedBy; 
    }
   
    /*This is an accessor method to access the value of attribute (joined),
    * which returns Boolean value. 
    * 
    */ 
   public boolean getJoined()
   {
       return this.joined;
    }
   
    
   /*This setter method sets the attribute (salary) to a new variable 
    * salary that is passed into the parameter, only if the developerName is an empty String. Else, it prints a suitable message. 
    * 
    */
   public void setSalary(double Salary)
   {
       if (developerName != "")
       {
           System.out.println("It is not possible to change the salary, as the developer is already appointed.");
       }
       else if (developerName == "")
       {
           this.salary = salary;
        }
       
    }
    
    /*This is a void method that prints the appointedDate, if the developerName is not an empty String.
    * Else, it calls the setDeveloper method with new developerName as parameter from the Developer Class and changes joined status to true.
    * This method also assigns the attributes (appointedDate, termnationDate, evaluationPeriod, spcialization) with new variables that are passed into the method’s parameter simultaneously. 
    * 
    */ 
   public void appointDeveloper(String developerName, String appointedDate, String terminationDate,String evaluationPeriod, String specialization)
   {
       if (developerName != "")
       {
           super.setDeveloper(developerName);
           this.joined = true;
        }
       else if (developerName == "")
       {
           
           System.out.println("The developer is already appointed :" + appointedDate);
        }
       this.appointedDate = appointedDate;
       this.terminationDate = terminationDate;
       this.evaluationPeriod = evaluationPeriod;
       this.specialization = specialization;
    }
   
     /*This is a void method that calls the display method of same patent 
    * from Developer Class and prints developerName, evaluationPeriod, terminationDate, salary, specialization and joined status. 
    * 
    */
    
   public void display()
   {
       super.display();
    
       if (developerName != "")
       {
          System.out.println("The developerName is:" + developerName);
          System.out.println("The evaluation period is:" + evaluationPeriod);
          System.out.println("The termination date is:" + terminationDate);
          System.out.println("The salary for a developer is:" + salary);
          System.out.println("The specialization of the developer is:" + specialization);
          System.out.println("Is the developer appointed?" + joined);
        }
    }


}