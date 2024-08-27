package lessons_7.Clinic;

class MyMain {
    public static void main(String[] args) {

        Patient alex = new Patient();
        Patient dasha = new Patient(1);
        Patient alina = new Patient(2);
        Patient olga = new Patient(3);

        Therapist.appointDoctor(alex);
        Therapist.appointDoctor(dasha);
        Therapist.appointDoctor(alina);
        Therapist.appointDoctor(olga);
    }
}
