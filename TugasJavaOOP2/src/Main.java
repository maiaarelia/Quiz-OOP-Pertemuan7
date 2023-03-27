public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Atta","Karangannyar");
        Student student1 = new Student("Arel","Exchange","Karanganyar",2021, 55000000);
        Staff staff1 = new Staff("Vira","Gentan","UGM", 35000000);

        System.out.println("-----------------------------------------------------");
        System.out.println("Class Person");
        System.out.println("-----------------------------------------------------");
        System.out.println("Nama : " + person1.getName());
        System.out.println("Alamat : " + person1.getAddress());
        person1.setAddress("Jogja");
        System.out.println("Alamat setelah set: " + person1.getAddress());
        System.out.println(person1.toString());
        System.out.println("-----------------------------------------------------");
        System.out.println();

        System.out.println("-----------------------------------------------------");
        System.out.println("Class Student");
        System.out.println("-----------------------------------------------------");
        System.out.println("Nama : " + student1.getName());
        System.out.println("Alamat : " + student1.getAddress());
        student1.setAddress("Jakarta");
        System.out.println("Alamat setelah set: " + student1.getAddress());
        System.out.println("Program : " + student1.getProgram());
        student1.setProgram("TRIK");
        System.out.println("Program setelah set : " + student1.getProgram());
        System.out.println("Year : " + student1.getYear());
        student1.setYear(2022);
        System.out.println("Year setelah set : " + student1.getYear());
        System.out.println("Fee: " + student1.getFee());
        student1.setFee(5000000);
        System.out.println("Fee setelah set: " + student1.getFee());
        System.out.println(student1.toString());
        System.out.println("-----------------------------------------------------");
        System.out.println();

        System.out.println("-----------------------------------------------------");
        System.out.println("Class Staff");
        System.out.println("-----------------------------------------------------");
        System.out.println("Nama : " + staff1.getName());
        System.out.println("Alamat : " + staff1.getAddress());
        staff1.setAddress("Jakarta");
        System.out.println("Alamat setelah set: " + staff1.getAddress());
        System.out.println("School : " + staff1.getSchool());
        staff1.setSchool("TRIK");
        System.out.println("Program setelah set : " + staff1.getSchool());
        System.out.println("Pay: " + staff1.getPay());
        staff1.setPay(44000000);
        System.out.println("Fee setelah set: " + staff1.getPay());
        System.out.println(staff1.toString());
        System.out.println("-----------------------------------------------------");
        System.out.println();



    }
}