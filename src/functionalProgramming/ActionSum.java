package functionalProgramming;

public class ActionSum implements Action<Integer>{

    @Override
    public Integer calculate(Integer t1, Integer t2) {
        return t1 + t2;
    }
}
