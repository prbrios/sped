package efd.icmsipi.blocoC.n1.n2.n3.n4.n5;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;


public class RegC465 {

    @Getter @Inclui
    private final String reg = "C465";

    @Getter @Setter @Inclui
    private String chvCfe;

    @Getter @Setter @Inclui
    private Integer numCcf;

    public RegC465(String chvCfe, Integer numCcf) {
        this.chvCfe = chvCfe;
        this.numCcf = numCcf;
    }

    public RegC465(){}
}