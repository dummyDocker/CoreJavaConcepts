package coreConcepts.functnlInterface;

public interface FunctionalInterface2 {
    default String demoDefaultMethod(){
        return "FunctionalInterface2";
    }
    abstract String demoAbstractM1P();
}
