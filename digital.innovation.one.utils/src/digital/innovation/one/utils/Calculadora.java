package digital.innovation.one.utils;

import digital.innovation.one.utils.interno.DivHelper;
import digital.innovation.one.utils.interno.MultHelper;
import digital.innovation.one.utils.interno.SubHelper;
import digital.innovation.one.utils.interno.SumHelper;

public class Calculadora {

    private SumHelper sumHelper;
    private MultHelper multHelper;
    private DivHelper divHelper;
    private SubHelper subHelper;

    public Calculadora() {

        sumHelper = new SumHelper();
        multHelper = new MultHelper();
        divHelper = new DivHelper();
        subHelper = new SubHelper();

    }
    public int sum(int a, int b) {
        return sumHelper.executeOperacao(a, b);
    }

    public int sub(int a, int b) {
        return subHelper.executeOperacao(a, b);
    }

    public int mult(int a, int b) {
        return multHelper.executeOperacao(a, b);
    }

    public int div(int a, int b) {
        return divHelper.executeOperacao(a, b);
    }
}
