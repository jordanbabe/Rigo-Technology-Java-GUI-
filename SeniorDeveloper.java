
/*
 * Author: Saugat Adhikari
 */

// Making a class named SeniorDeveloper that extends into Developer class//


public class SeniorDeveloper extends Developer
{
    //Declaring attributes
   private double salary;
   private String joiningDate;
   private String staffRoomNumber;
   private int contractPeriod;
   private double advanceSalary;
   private boolean appointed;
   private boolean terminated;
   

    /* Creating a parameterized constructor that assigns salary,contractPeriod,
 * with their parameter values and call is made to the constructor od
 * Developer class for platform, interviewerName and wokringHours.
 * 
 */
    public SeniorDeveloper(String platform, String interviewerName, int workingHours, double salary, int contractPeriod)
    {
        super(platform, interviewerName, workingHours);
        this.salary = salary;
        this.contractPeriod = contractPeriod;
        this.joiningDate = "";
        this.staffRoomNumber = "";
        this.advanceSalary = 0.0;
        this.appointed = false;
        this.terminated = false;
        
    }
       
    /*This is an accessor method to access the value of attribute (Platform), which return a 
 * String value by calling the getPlatform method of Developer class. 
 */
    public String getPlatform()
    {
        return super.getPlatform();
      
    }
    
    /*This is an accessor method to access the value of attribute (interviewerName), which returns a String
 * value by calling the getInterviewer method of Developer class 
 * 
 */
    public String getInterviewerName()
    {
        return super.getInterviewer();
    }
    
    /*This is an accessor method to access the value of attribute (interviewerName), which returns an 
 * Integer value by calling the getHours method of Developer class. 
 * 
 */
    public int getWorkingHours()
    {
        return super.getHours();
    }
    
    /*: This is an accessor method to access the 
 * value of attribute(salary), which returns a double value. 
 * 
 */
    public double getSalary()
    {
        return this.salary;
    }
    
    /*This is an accessor method to access the value of 
 * attribute(contractPeriod), which returns an integer value. 
 * 
 */
    public int getContractperiod()
    {
        return this.contractPeriod;
    }
    
    /*This is an accessor method to access the value of 
 * attribute (staffRoomNumber), which returns String value. 
 * 
 */
    public String getStaffRoomNumber()
    {
        return this.staffRoomNumber;
    }
    
    /*This is an accessor method to access the value of
 * attribute (advanceSalary), which returns double value. 
 * 
 */
    public double getAdvanceSalary()
    {
        return this.advanceSalary;
    }
    
    /*This is an accessor method to access the value of
 * attribute (appointed), which returns boolean value. 
 * 
 */
    public boolean getAppointed()
    {
        return this.appointed;
    }
    
    /*This is an accessor method to access the value of
 * attribute (terminated), which returns boolean value. 
 * 
 */
    public boolean getTerminated()
    {
        return this.terminated;
    }
    
    /*This is a setter method to set the attribute (salary)
 * to new variable salary, which is passed into the parameter. 
 * 
 */
    
    public void setSalary(double salary)
    {
        this.salary = salary;
    }
    
    /*This is a setter method to set the attribute (contractPeriod) to 
 * a new variable contractPeriod, which is passed into the parameter. 
 * 
 */
    public void setContract(int contractPeriod)
    {
        this.contractPeriod = contractPeriod;
    }
    
    /*This is a void method that prints the developerName and staffRoomNumber if the developerName is not an empty String, else calls the setDeveloper method from Developer Class. It also assigns the attributes (joiningDate, advanceSalary, staffRoomNumber) to their respective variables passed into the parameter. The appointed status is 
 * assigned as true and terminated is assigned as false in the method. 
 * 
 */
    public void hireDeveloper(String developerName, String joiningDate, double advanceSalary, String staffRoomNumber)
    {
        if (developerName != "")
        {
            super.setDeveloper(developerName);
            this.joiningDate = joiningDate;
            this.advanceSalary = advanceSalary;
            this.staffRoomNumber = staffRoomNumber;
            this.appointed = true;
            this.terminated = false;
            
            
        }
        
        else if (developerName == "")
        {
            System.out.println("The name of the new developer is:" + developerName);
            System.out.println("The room number for that developer is:" + staffRoomNumber);
            
              
        }
        
    }
    
    /*: This is a void method that prints a message depicting the contract of developer
 * already terminated if the terminated status is true. Else, it calls the setDeveloper method from Developer class and initializes the
 * value of joiningDate as an empty string, advanceSalary to 0.0, joiningDate to an empty String, appointed as false and terminated as true. 
 * 
 */
    public void contractTermination()
    {
        if (terminated == false)
        {
            super.setDeveloper("");
            this.joiningDate = "";
            this.advanceSalary = 0.0;
            this.appointed = false;
            this.terminated = true;
        }
        else if (terminated == true)
        
        {
            System.out.println("The developerś contract is already terminated.");
        }
    }
    
    /*This is a void method that prints the salary of the developer 
 * and calls getIntervewer and getPlatform method from Developer class. 
 * 
 */
    public void printDeveloper()
    {
        System.out.println("The salary of the developer is " + salary);
        super.getInterviewer();
        super.getPlatform();
    }
    
    /*This is a void method that calls the display method of same patent from 
 * Developer class and if the developerName is not an empty string,
 * prints terminated status, joiningDate, advanceSalary and developerName. 
 * 
 */
    public void display()
    {
       super.display();
       
       if (developerName != "")
       {
           System.out.println("The termination status of the developer is:" + terminated);
           System.out.println("The developer joined in the given date:" + joiningDate);
           System.out.println("The advance salary for the developer is:" + advanceSalary);
           System.out.println("The name of the developer is "+ developerName);
           
           
        }
       
    }
}