package efd.icmsipi.blocoD.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;


public class RegD411 {

    @Getter @Inclui
    private final String reg = "D411";

    @Getter @Setter @Inclui
    private Integer numDocCanc;

    public RegD411(Integer numDocCanc) {
        this.numDocCanc = numDocCanc;
    }

    public RegD411(){}
}