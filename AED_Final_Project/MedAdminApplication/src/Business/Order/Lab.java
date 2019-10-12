/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

/**
 *
 * @author keshav
 */
public class Lab {

    private String labTestName;
    private String Instrument;
    private String TimeTaken;

    public String getLabTestName() {
        return labTestName;
    }

    public void setLabTestName(String labTestName) {
        this.labTestName = labTestName;
    }

    public String getInstrument() {
        return Instrument;
    }

    public void setInstrument(String Instrument) {
        this.Instrument = Instrument;
    }

    public String getTimeTaken() {
        return TimeTaken;
    }

    public void setTimeTaken(String TimeTaken) {
        this.TimeTaken = TimeTaken;
    }

    @Override
    public String toString() {
        return this.labTestName;
    }
}
