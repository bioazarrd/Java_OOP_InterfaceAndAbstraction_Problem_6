package D_JavaAdvancedOOP.Lecture4_InterfaceAndAbstraction.LabProblem4;
public class European extends BasePerson {


    public European(String name) {
        super(name);
    }


    @Override
    public String sayHello() {
        return "Hello";
    }
}
