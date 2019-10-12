/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<Organization>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Type type) {
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())) {
            organization = new DoctorOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Lab.getValue())) {
            organization = new LabOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Nurse.getValue())) {
            organization = new NurseOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Pharmacist.getValue())) {
            organization = new PharmacistOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Reception.getValue())) {
            organization = new ReceptionOrganization();
            organizationList.add(organization);
        }
        return organization;
    }

    public boolean checkIfOrganizationIsUnique(Type type) {
        String org= "";
        for (Organization organization : organizationList) {
            if (type.getValue().equals(Type.Doctor.getValue())) {
                org = "Doctor Organization";
            } else if (type.getValue().equals(Type.Lab.getValue())) {
                org = "Lab Organization";
            } else if (type.getValue().equals(Type.Nurse.getValue())) {
                org = "Nurse Organization";
            } else if (type.getValue().equals(Type.Pharmacist.getValue())) {
                org = "Pharmacist Organization";
            } else if (type.getValue().equals(Type.Reception.getValue())) {
                org = "Reception Organization";
            }
            if (organization.getName().equalsIgnoreCase(org)) {
                return false;
            }
        }
        return true;
    }
}
