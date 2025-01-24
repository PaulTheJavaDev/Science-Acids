import java.util.*;

class Substance {
    private String name; //Name der Säure/Lauge
    private String formula; //Chemische Formel
    private String dissociationEquation; //Dissoziationsgleichung

    public Substance(String name, String formula, String dissociationEquation) {
        this.name = name;
        this.formula = formula;
        this.dissociationEquation = dissociationEquation;
    }

    public String getName() {
        return name;
    }

    public String getFormula() {
        return formula;
    }

    public String getDissociationEquation() {
        return dissociationEquation;
    }
}
