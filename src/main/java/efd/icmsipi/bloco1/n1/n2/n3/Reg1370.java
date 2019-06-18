package efd.icmsipi.bloco1.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;


public class Reg1370 {

    @Getter @Inclui
    private final String reg = "1370";

    @Getter @Setter @Inclui
    private Integer numBico;

    @Getter @Setter @Inclui
    private String codItem;

    @Getter @Setter @Inclui
    private String numTanque;

    public Reg1370(Integer numBico, String codItem, String numTanque) {
        this.numBico = numBico;
        this.codItem = codItem;
        this.numTanque = numTanque;
    }

    public Reg1370(){}
}