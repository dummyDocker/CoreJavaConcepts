package coreConcepts.functnlInterface;


// DEFAULT METHODS NEED TO BE OVERRIDDEN , ELSE COMPILER ERROR
public class TestDefaultMethodInheritance implements FunctionalInterface1,FunctionalInterface2{

    @Override
    public String demoDefaultMethod() {
        return FunctionalInterface1.super.demoDefaultMethod();
    }

    @Override
    public String demoAbstractM1P() {
        return null;
    }


}
