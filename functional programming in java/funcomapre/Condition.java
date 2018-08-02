package funcomapre;

@FunctionalInterface
public interface Condition {
    public boolean test(Employee emp);
}