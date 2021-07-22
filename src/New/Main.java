package New;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Conta>contas = new LinkedList<>();

        Conta c1 = new Conta(12, 250, "bb", "Ze");

        c1.autenticaNome("Ze");
    }
}
