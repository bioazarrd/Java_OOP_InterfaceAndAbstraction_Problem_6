package D_JavaAdvancedOOP.Lecture4_InterfaceAndAbstraction.LabProblem4;
public abstract class BasePerson implements Person {

    private String name;

    protected BasePerson(String name) {
        this.setName(name);
    }

    protected void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }



}
