import java.util.ArrayList;

public class PatientManager {
    // Contains a single instance variable representing an ArrayList of ten patients.
    ArrayList<Patient> patients;

    public PatientManager() {
        patients = new ArrayList<>(10);
    }

    /**
     * Add a patient to the ArrayList of patients. If the list is full, return -1. Otherwise, return the index where the patient was added.
     * 
     * @param patient The patient to be added to the list.
     * @return The index where the patient was added, or -1 if the list is full.
     */
    public int addPatient(Patient patient) {
        patients.add(patient);
        return patients.size() - 1;
    }

    /**
     * Remove a patient from the ArrayList of patients.
     * 
     * @param index The index of the patient to be removed.
     * @return The patient that was removed.
     */
    public Patient removePatient(int index) {
        return patients.remove(index);
    }

    /**
     * Remove a patient from the ArrayList of patients.
     * 
     * @param patient The patient to be removed from the list.
     */
    public void removePatient(Patient patient) {
        patients.remove(patient);
    }

    public void caffeineAbsorption() {
        for (int i = 0; i < patients.size(); i++) {
            patients.get(i).setCaffeineLevel(patients.get(i).getCaffeineLevel() - 170.0); 

            if (patients.get(i).getCaffeineLevel() < 0) {
                patients.remove(i);
                i--; // Adjust index after removal
            }
        }
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    @Override
    public String toString() {
        if (patients.isEmpty()) {
            return "Empty";
        }

        String output = "";

        for (Patient patient : patients) {
            output += patient.toString() + "\n";
        }

        return output;
    }
}
