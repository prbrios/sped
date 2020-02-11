package efd.icmsipi.blocoD.n1.n2.n3;

import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoD.n1.n2.n3.n4.RegD197;
import lombok.Getter;
import lombok.Setter;


public class RegD195 {

    @Getter @Inclui
    private final String reg = "D195";

    @Getter @Setter @Inclui
    private String codObs;

    @Getter @Setter @Inclui
    private String txtCompl;

    @Getter @Setter @Filho
    private List<RegD197> regD197;

    public RegD195(String codObs, String txtCompl) {
        this.codObs = codObs;
        this.txtCompl = txtCompl;
    }

    public RegD195(){}
}