package efd.icmsipi.blocoK.n1;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;


public class RegK990 {

    @Getter @Inclui
    private final String reg = "K990";

    @Getter @Setter @Inclui
    private Integer qtdLinK;

    public RegK990(Integer qtdLinK) {
        this.qtdLinK = qtdLinK;
    }

    public RegK990(){}
}