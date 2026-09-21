public class PatientTester {
    public static void main(String[] args) {
        // Instantiate a PatientManager object
        PatientManager manager = new PatientManager();

        // Print the PatientManager object you created
        System.out.println(manager);

        /* 
        Add four patient objects to the PatientManager object you created with the following parameters:
        ID: 1; Caffeine: 200
        ID: 2; Caffeine: 400
        ID: 3; Caffeine: 600
        ID: 4; Caffeine: 800
        */
        manager.addPatient(new Patient(1, 200));
        manager.addPatient(new Patient(2, 400));
        manager.addPatient(new Patient(3, 600));
        manager.addPatient(new Patient(4, 800));

        // Print the PatientManager object you created
        System.out.println(manager);

        // Call the caffeineAbsorption method twice within PatientManager
        manager.caffeineAbsorption();
        manager.caffeineAbsorption();

        // Print the PatientManager object you created
        System.out.println(manager);

        // Remove the patient object from Patient Manager that has the highest caffeine level
        Patient mostCaffeinatedPatient = null;
        for (Patient patient : manager.getPatients()) {
            if (mostCaffeinatedPatient == null || patient.getCaffeineLevel() >= mostCaffeinatedPatient.getCaffeineLevel()) {
                mostCaffeinatedPatient = patient;
            }
        }

        manager.removePatient(manager.getPatients().indexOf(mostCaffeinatedPatient));

        // Print the PatientManager object you created
        System.out.println(manager);
    }
}
