package hello;

/**
 * Created by Merlin on 3/29/17.
 */
public class Citizen {

    int id;
    int iq;
    String name;
    Boolean nraBool = true;
    String state;
    boolean threatBool = true;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getNraBool() {
        return nraBool;
    }

    public void setNraBool(Boolean nraBool) {
        this.nraBool = nraBool;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public boolean isThreatBool() {
        return threatBool;
    }

    public void setThreatBool(boolean threatBool) {
        this.threatBool = threatBool;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                "iq='" + iq + '\'' +
                "name='" + name + '\'' +
                "nraBool='" + nraBool + '\'' +
                "state='" + state + '\'' +
                ", threatBool=" + threatBool +
                '}';
    }

//    public Citizen(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }


    public Citizen(int iq, String name, Boolean nraBool, String state, boolean threatBool) {
        this.iq = iq;
        this.name = name;
        this.nraBool = nraBool;
        this.state = state;
        this.threatBool = threatBool;
    }
}
