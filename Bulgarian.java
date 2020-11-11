package D_JavaAdvancedOOP.Lecture4_InterfaceAndAbstraction.LabProblem4;
public class Bulgarian extends BasePerson implements Person {

    public Bulgarian(String name) {
        super(name);
    }


    @Override
    public String sayHello() {
        return "???????";
    }
}
