package exercises.notes;

public class PatientTest {
    public static void main(String[] args) {
        Patient patient = new Patient();
        patient.name = "Andrea";
        patient.age = 20;
        patient.weight = 80;

        Patient patient2 = new Patient();
        patient2.name = "Giorgio";
        patient2.age = 45;
        patient2.weight = 100;

        System.out.println(patient.name);
        System.out.println(patient2.age);
        patient.sayHello();
        System.out.println(patient2.getName());

        Math.abs(2);
        double pi = Math.PI;
    }
}
