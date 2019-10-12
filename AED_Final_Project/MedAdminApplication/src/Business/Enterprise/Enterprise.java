/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Order.DrugList;
import Business.Order.HighRiskCriteriaList;
import Business.Order.LabList;
import Business.Order.PatientList;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author MyPC1
 */
public abstract class Enterprise extends Organization {

    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;

    //private PatientList patientListObject;
    private HighRiskCriteriaList highRiskCriteriaDirectory;

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public HighRiskCriteriaList getHighRiskCriteriaDirectory() {
        return highRiskCriteriaDirectory;
    }

    public void setHighRiskCriteriaDirectory(HighRiskCriteriaList highRiskCriteriaDirectory) {
        this.highRiskCriteriaDirectory = highRiskCriteriaDirectory;
    }

//    public PatientList getPatientListObject() {
//        return patientListObject;
//    }
//
//    public void setPatientListObject(PatientList patientListObject) {
//        this.patientListObject = patientListObject;
//    }

    public enum EnterpriseType {
        Hospital("Hospital"),
        Pharmacy("Pharmacy");
        
        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();

        //patientListObject = new PatientList();
        highRiskCriteriaDirectory = new HighRiskCriteriaList();
    }
}
