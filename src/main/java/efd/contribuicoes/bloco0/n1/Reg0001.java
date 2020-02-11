package efd.contribuicoes.bloco0.n1;

import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.bloco0.n1.n2.Reg0035;
import efd.contribuicoes.bloco0.n1.n2.Reg0100;
import efd.contribuicoes.bloco0.n1.n2.Reg0110;
import efd.contribuicoes.bloco0.n1.n2.Reg0120;
import efd.contribuicoes.bloco0.n1.n2.Reg0140;
import efd.contribuicoes.bloco0.n1.n2.Reg0500;
import efd.contribuicoes.bloco0.n1.n2.Reg0600;
import lombok.Getter;
import lombok.Setter;

public class Reg0001 {

    @Getter @Inclui
    private final String reg = "0001";

    @Getter @Setter @Inclui
    private Integer indMov;

    @Getter @Setter @Filho
    private List<Reg0035> reg0035;

    @Getter @Setter @Filho
    private List<Reg0100> reg0100;

    @Getter @Setter @Filho
    private Reg0110 reg0110;

    @Getter @Setter @Filho
    private List<Reg0120> reg0120;

    @Getter @Setter @Filho
    private List<Reg0140> reg0140;

    @Getter @Setter @Filho
    private List<Reg0500> reg0500;

    @Getter @Setter @Filho
    private List<Reg0600> reg0600;

    public Reg0001(Integer indMov) {
        this.indMov = indMov;
    }

    public Reg0001(){}
}
