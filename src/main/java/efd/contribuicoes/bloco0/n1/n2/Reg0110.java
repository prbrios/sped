package efd.contribuicoes.bloco0.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.bloco0.n1.n2.n3.Reg0111;
import lombok.Getter;
import lombok.Setter;

public class Reg0110 {

    @Getter @Inclui
    private final String reg = "0110";

    @Getter @Inclui
    private Integer codincTrib;

    @Getter @Inclui
    private Integer indAproCred;

    @Getter @Inclui
    private Integer codTipoCont;

    @Getter @Inclui
    private Integer indRegCum;

    @Getter @Setter @Filho
    private Reg0111 reg0111;

    public Reg0110(Integer codincTrib, Integer indAproCred, Integer codTipoCont, Integer indRegCum) {
        this.codincTrib = codincTrib;
        this.indAproCred = indAproCred;
        this.codTipoCont = codTipoCont;
        this.indRegCum = indRegCum;
    }

    public Reg0110(){}
}
