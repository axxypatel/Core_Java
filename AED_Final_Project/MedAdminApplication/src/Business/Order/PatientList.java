/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import java.util.ArrayList;

/**
 *
 * @author Akshay
 */
public class PatientList {

    private ArrayList<Patient> patientList;

    public PatientList() {
        patientList = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }

    public Patient addPatient() {
        Patient patientObject = new Patient();
        patientList.add(patientObject);
        return patientObject;
    }

    public void deletePatient(Patient patient) {
        patientList.remove(patient);
    }

    public Patient searchPatientByPatientNumber(String getPatientNumber) {
        for (Patient patient : this.getPatientList()) {
            if (patient.getPatientNumber().equalsIgnoreCase(getPatientNumber)) {
                return patient;
            }
        }
        return null;
    }

    public Patient searchPatientByMRN(Long MRN) {
        for (Patient patient : this.getPatientList()) {
            if (patient.getMRN() == MRN) {
                return patient;
            }
        }
        return null;
    }
}
