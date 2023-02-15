package coreConcepts.functnlInterface;

public interface FunctionalInterface1 {
    default String demoDefaultMethod(){
        return "FunctionalInterface1";
    }
    abstract String demoAbstractM1P();
}
