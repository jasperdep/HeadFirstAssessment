import java.util.Stack;

public class Station {

    private Stack<Nameable> perron = new java.util.Stack<>();

    public void komtAan(Trein trein){
        legeTrein(trein);
        volleTrein(trein);
    }

    public void legeTrein(Trein trein){
        for (String name : trein.getNames()){
            Nameable uitgestapte = trein.uitstappen(name);
            perron.push(uitgestapte);
        }
    }

    public void volleTrein(Trein trein){
        while (!perron.isEmpty()){
            Nameable opgestapelde = perron.pop();
            trein.instappen(opgestapelde);
        }
    }
}
