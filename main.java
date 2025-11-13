import java.util.Date;
import java.util.ArrayList;
public class main {
    public static void main(String[] args) {
        //division объект үүсгэж байна
        Division hr = new Division("Human Resources");
        Division ceo = new Division("Zahiral");
        Division finance = new Division("Sanhuu");
       

        //jobdescription объект үүсгэж байна
        JobDescription hrJob = new JobDescription("Managing staff");
        JobDescription ceoJob = new JobDescription("Overseeing company operations");
        JobDescription financeJob = new JobDescription("Managing financial records");


        // Spouse объектууд
        Spouse spouse1 = new Spouse("Enkhush", "SSN1", 19, new Date());
        Spouse spouse2 = new Spouse("Baaska", "SSN2", 19, new Date());
        Spouse spouse3 = new Spouse("Nandia", "SSN3", 19, new Date());

        // Child объектууд
        Child child1 = new Child("Lego");
        Child child2 = new Child("Car");
        Child child3 = new Child("Ball");

        //employee объект үүсгэж байгаа ба division, jobdescription агуулж байна
        //бүрдэл харьцаа ашигласан
        Employee e1 = new Employee("B1", "HR Manager", new Date(), hr, hrJob, spouse1, child1);
        Employee e2 = new Employee("B2", "Zahiral", new Date(), ceo, ceoJob, spouse2, child2);
        Employee e3 = new Employee("B3", "Accountant", new Date(), finance, financeJob, spouse3, child3);

        // ArrayList-д хадгалах
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

       
}

static class Person {
    private String name;
    private String ssNum;
    private int age;

    public Person(String name, String ssNum, int age) {
        this.name = name;
        this.ssNum = ssNum;
        this.age = age;
    }

    public String getName() { return name; }
    public String getSSNum() { return ssNum; }
    public int getAge() { return age; }
}

static class Spouse extends Person {
    private Date anniversary;
    public Spouse(String name, String ssNum, int age, Date anniversary) {
        super(name, ssNum, age);
        this.anniversary = anniversary;
    }
    public Date getAnniversary() { return anniversary; }
}

static class Child {
    private String favoriteToy;
    public Child(String favoriteToy) { this.favoriteToy = favoriteToy; }
    public String getFavoriteToy() { return favoriteToy; }
}

static class Division {
    private String divisionName;
    public Division(String divisionName) { this.divisionName = divisionName; }
    public String getDivisionName() { return divisionName; }
}

static class JobDescription {
    private String description;
    public JobDescription(String description) { this.description = description; }
    public String getDescription() { return description; }
}

static class Employee {
    private String companyID;
    private String title;
    private Date startDate;
    private Division division;
    private JobDescription jobDescription;
    private Spouse spouse;
    private Child child;

    public Employee(String companyID, String title, Date startDate, Division division,
                    JobDescription jobDescription, Spouse spouse, Child child) {
        this.companyID = companyID;
        this.title = title;
        this.startDate = startDate;
        this.division = division;
        this.jobDescription = jobDescription;
        this.spouse = spouse;
        this.child = child;
    }

    public String getCompanyID() { return companyID; }
    public String getTitle() { return title; }
    public Date getStartDate() { return startDate; }
    public Division getDivision() { return division; }
    public JobDescription getJobDescription() { return jobDescription; }
    public Spouse getSpouse() { return spouse; }
    public Child getChild() { return child; }
}
}