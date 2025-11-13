import java.util.ArrayList;
import java.util.Date;      

public class Main { // Гол Main класс
    public static void main(String[] args) {
        // Division объектууд үүсгэж байна (1: Employee заавал нэг Division-т харьяалагдана)
        Division hr = new Division("Human Resources"); // Хүний нөөцийн хэлтэс
        Division ceo = new Division("Zahiral");         // Захирлын хэлтэс
        Division finance = new Division("Sanhuu");      // Санхүүгийн хэлтэс
        // JobDescription объектууд (1..n: Division олон ажлын тодорхойлолттой байж болно)
        JobDescription hrJob = new JobDescription("Managing staff");               // HR ажлын тодорхойлолт
        JobDescription ceoJob = new JobDescription("Overseeing company operations");// CEO ажлын тодорхойлолт
        JobDescription financeJob = new JobDescription("Managing financial records"); // Санхүүгийн ажлын тодорхойлолт
        // Spouse объектууд үүсгэж байна (0..1: нэг ажилтан 0 эсвэл 1 эхнэр/нөхөртэй)
        Spouse spouse1 = new Spouse("Sun", "SSN1", 25, new Date()); // object
        Spouse spouse2 = new Spouse("Moon", "SSN2", 30, new Date());  
        Spouse spouse3 = new Spouse("Ann", "SSN3", 32, new Date());  
        // Child объектууд үүсгэж байна (0..n: олон хүүхэдтэй байж болно)
        Child c1 = new Child("Lego"); //object 
        Child c2 = new Child("Car");  
        Child c3 = new Child("Ball"); 
        // Хүүхдүүдийг ArrayList-д хадгалж байна
        ArrayList<Child> children1 = new ArrayList<>(); // e1 ажилтны хүүхдүүд
        children1.add(c1); 
        ArrayList<Child> children2 = new ArrayList<>(); // e2 ажилтны хүүхдүүд
        children2.add(c2); 
        children2.add(c3);
        ArrayList<Child> children3 = new ArrayList<>(); // e3 ажилтны хүүхэд байхгүй
        //  Employee объектууд (Person-оос удамшсан)
        // бүрдэл объектууд: Division, JobDescription, Spouse, Children
        Employee e1 = new Employee("B1", "HR Manager", new Date(), hr, hrJob, spouse1, children1); // 1 ажилтан
        Employee e2 = new Employee("B2", "CEO", new Date(), ceo, ceoJob, spouse2, children2);      // 2 ажилтан
        Employee e3 = new Employee("B3", "Accountant", new Date(), finance, financeJob, null, children3); // эхнэргүй ажилтан
        //  Бүх ажилтныг ArrayList-д хадгална
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(e1); // ажилтан 1
        employees.add(e2); // ажилтан 2
        employees.add(e3); // ажилтан 3
        //  Ажилтны мэдээллийг хэвлэх
        for (Employee e : employees) { // ажилтан бүрийг давтаж
            printEmployeeInfo(e);      // мэдээлэл хэвлэнэ
        }
    }
    static class Person { // Base класс: Person
        private String name;   // нэр
        private String ssNum;  // дугаар
        private int age;       // нас

        public Person(String name, String ssNum, int age) { // байгуулагч функц
            this.name = name;
            this.ssNum = ssNum;
            this.age = age;
        }

        public String getName() { return name; }   // нэр буцаах
        public String getSSNum() { return ssNum; } // SS дугаар буцаах
        public int getAge() { return age; }        // нас буцаах
    }

    static class Spouse extends Person { // Spouse нь Person-оос удамшина
        private Date anniversary; // гэрлэсэн огноо

        public Spouse(String name, String ssNum, int age, Date anniversary) { // байгуулагч
            super(name, ssNum, age); // Person-ын байгуулагчийг дуудаж байна
            this.anniversary = anniversary;
        }

        public Date getAnniversary() { return anniversary; } // гэрлэсэн огноо буцаах
    }

    static class Child { // Хүүхдийн класс
        private String favoriteToy; // дуртай тоглоом

        public Child(String favoriteToy) { // байгуулагч
            this.favoriteToy = favoriteToy;
        }

        public String getFavoriteToy() { return favoriteToy; } // дуртай тоглоом буцаах
    }

    static class Division { // Хэлтэсийн класс
        private String divisionName;           // хэлтсийн нэр
        private ArrayList<JobDescription> jobs = new ArrayList<>(); // тухайн хэлтсийн ажлын тодорхойлолтууд

        public Division(String divisionName) { // байгуулагч
            this.divisionName = divisionName;
        }

        public String getDivisionName() { return divisionName; } // хэлтсийн нэр буцаах

        public void addJob(JobDescription j) { jobs.add(j); } // шинэ ажил нэмэх
        public ArrayList<JobDescription> getJobs() { return jobs; } // ажлын жагсаалт буцаах
    }

    static class JobDescription { // Ажлын тодорхойлолтын класс
        private String description; // ажлын тайлбар

        public JobDescription(String description) { // байгуулагч
            this.description = description;
        }

        public String getDescription() { return description; } // ажлын тайлбар буцаах
    }

    static class Employee extends Person { // Employee нь Person-оос удамшина
        private String companyID;               // компанийн ID
        private String title;                   // албан тушаал
        private Date startDate;                 // ажилд орсон огноо
        private Division division;              // Division объект (1:1)
        private JobDescription jobDescription;  // JobDescription (1:1)
        private Spouse spouse;                  // Spouse (0..1)
        private ArrayList<Child> children;      // Child жагсаалт (0..n)

        // байгуулагч функц
        public Employee(String companyID, String title, Date startDate, Division division,
                        JobDescription jobDescription, Spouse spouse, ArrayList<Child> children) {
            super(title, companyID, 0); // Person-ийн байгуулагчийг дуудсан (жишээ үүднээс)
            this.companyID = companyID;
            this.title = title;
            this.startDate = startDate;
            this.division = division;
            this.jobDescription = jobDescription;
            this.spouse = spouse;
            this.children = children;
        }

        // getter функцууд
        public String getCompanyID() { return companyID; }
        public String getTitle() { return title; }
        public Date getStartDate() { return startDate; }
        public Division getDivision() { return division; }
        public JobDescription getJobDescription() { return jobDescription; }
        public Spouse getSpouse() { return spouse; }
        public ArrayList<Child> getChildren() { return children; }
    }
    // Ажилтны бүх мэдээллийг хэвлэх функц
    public static void printEmployeeInfo(Employee e) {
        System.out.println("Employee Information");
        System.out.println("Company ID: " + e.getCompanyID()); // компанийн ID хэвлэх
        System.out.println("Title: " + e.getTitle());           // албан тушаал
        System.out.println("Start Date: " + e.getStartDate());  // ажилд орсон огноо
        System.out.println("Division: " + e.getDivision().getDivisionName()); // хэлтэсийн нэр
        System.out.println("Job: " + e.getJobDescription().getDescription());  // ажлын тодорхойлолт
        // Эхнэр/нөхөр байгаа эсэхийг шалгах
        if (e.getSpouse() != null) {
            System.out.println("Spouse Name: " + e.getSpouse().getName());         // нэр
            System.out.println("Anniversary: " + e.getSpouse().getAnniversary());  // гэрлэсэн өдөр
        } else {
            System.out.println("Spouse: None"); // байхгүй бол
        }
        // Хүүхдийн жагсаалтыг хэвлэх
        if (e.getChildren() != null && !e.getChildren().isEmpty()) {
            System.out.println("Children:");
            for (Child c : e.getChildren()) { // хүүхэд бүрийн мэдээлэл
                System.out.println(" - Favorite Toy: " + c.getFavoriteToy()); // дуртай тоглоом
            }
        } else {
            System.out.println("No children"); // хүүхэд байхгүй бол
        }
        System.out.println(" \n"); // хуваагч мөр
    }
}
