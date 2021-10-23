package Hamsa.assignments20;

public class SDET {
    String name;
    Long employeeID;
    Double salary;
    String companyName;

    public void setSDETInfo(String name, Long employeeID, Double salary, String companyName) {
        this.name = name;
        this.employeeID = employeeID;
        this.salary = salary;
        this.companyName = companyName;
    }
    public void testing(String testType) {
        System.out.println(name + " " + employeeID + " does " + testType + " testing in " + companyName+" they pay "+salary);
    }
    public void creatingTicket(boolean isBug) {
        if (isBug) {
            System.out.println(name + " " + employeeID + " was able to find a bug ");
        } else System.out.println(name + " " + employeeID + " was not able to find any bugs ");
        System.out.println("____________________________________________________________");

    }
}
//     /*
// create a class called SDET
//Attributes:
//   name, employeeID, Salary , companyName
//Actions:
//   setInfo(), testing(),  creatingTicket(boolean isBug);

