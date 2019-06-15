package efd.contribuicoes.bloco0.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Reg0110 {

    @Inclui
    private final String reg = "0110";

    @Inclui
    private Integer codincTrib;

    @Inclui
    private Integer indAproCred;

    @Inclui
    private Integer codTipoCont;

    @Inclui
    private Integer indRegCum;

    public Reg0110(Integer codincTrib, Integer indAproCred, Integer codTipoCont, Integer indRegCum) {
        this.codincTrib = codincTrib;
        this.indAproCred = indAproCred;
        this.codTipoCont = codTipoCont;
        this.indRegCum = indRegCum;
    }

    public Reg0110(){}
}