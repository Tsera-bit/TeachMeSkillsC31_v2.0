package lessons_7.Clinic;

class Patient {

    private int treatmentPlan;
    private String doctor;

    // случайное назначение плана лечения
    Patient() {
        treatmentPlan = (int) (Math.random() * 4);
        doctor = "none";
    }

    // при создание объекта указывается номер плана лечения
    Patient(int treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
        doctor = "none";
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }
    public String getDoctor() {
        return doctor;
    }

    public void setTreatmentPlan(int treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }
    public int getTreatmentPlan() {
        return treatmentPlan;
    }
}
