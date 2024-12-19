// Design and develop inheritance for a given case study, identify objects and relationships and implement inheritance wherever applicable. Employee class hasEmp_name, Emp_id, Address,
// Mail_id, and Mobile_noas members. Inherit the classes: Programmer, Team Lead, Assistant Project Manager and Project Manager from employee class. Add Basic Pay (BP) as the member of all the inherited classes with 97% of BP as DA, 10% of BP as HRA, 12% of BP as PF, 0.1% of BP for staff club fund. Generate pay slips for the employees with their gross and net salary.


class Employee{
    String name;
    int id;
    double basic_pay;

    Employee(String name,int id,double basic_pay){
        this.name=name;
        this.id = id;
        this.basic_pay=basic_pay;
    }

    double myProfit(){
        double DA = 0.97 *basic_pay;
        double HRA = 0.1*basic_pay;

        return basic_pay+DA+HRA;
    }

    double myLoss(){
        double PF = 0.12 *basic_pay;
        double SCF = 0.1*basic_pay;
        return PF + SCF;
    }

    double totalMoney(){
        return myProfit()-myLoss();
    }

    void display(){
        System.out.println("--------------------"+name+"--------------------------");
        System.out.println("id :"+id);
        System.out.println("basic pay :"+basic_pay);
        System.out.println("net profit :"+myProfit());
        System.out.println("net loss :"+myLoss());
        System.out.println("total money :"+totalMoney());
    }
}

class Programmer extends Employee{
    Programmer(String name,int id,double basic_pay){
        super(name, id, basic_pay);
    }
}

class TeamLead extends Employee{
    TeamLead(String name,int id,double basic_pay){
        super(name, id, basic_pay);
    }
}

class AssistantManager extends Employee{
    AssistantManager(String name,int id,double basic_pay){
        super(name, id, basic_pay);
    }
}


class ProjectManager extends Employee{
    ProjectManager(String name,int id,double basic_pay){
        super(name, id, basic_pay);
    }
}


public class third {
    public static void main(String[] args) {
        
 // Creating objects for each type of employee
 Programmer programmer = new Programmer("Alice", 101, 40000);
 TeamLead teamLead = new TeamLead("Bob", 102, 60000);
 AssistantManager assistantManager = new AssistantManager("Charlie", 103, 80000);
 ProjectManager projectManager = new ProjectManager("David", 104, 100000);

 // Displaying details for each employee
 System.out.println("PAY SLIP FOR EMPLOYEES\n");

 programmer.display();
 teamLead.display();
 assistantManager.display();
 projectManager.display();
    
    }
}
