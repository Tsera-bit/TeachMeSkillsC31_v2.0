package lessons_7.Clinic;

class Therapist {

    static void appointDoctor(Patient human) {
        // Назначение врача соглавно плану лечение пациента (объекта)
        switch(human.getTreatmentPlan()) {
            case 1:
                human.setDoctor("Surgeon");
                Surgeon.treatment();
                break;
            case 2:
                human.setDoctor("Dentist");
                Dentist.treatment();
                break;
            default:
                human.setDoctor("Therapist");
                Therapist.treatment();
        }
    }
    // Метод лечения
    static void treatment() {
        System.out.println("Приступить к диагностики и лечению");
        System.out.println("--------------------------------------------------------------");
    }
}
