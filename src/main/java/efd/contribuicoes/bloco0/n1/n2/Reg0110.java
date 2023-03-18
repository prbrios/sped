package efd.contribuicoes.bloco0.n1.n2;

import java.io.Serializable;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.bloco0.n1.n2.n3.Reg0111;
import lombok.Getter;
import lombok.Setter;

public class Reg0110 implements Serializable {
	private static final long serialVersionUID = 4306246559931046763L;

	@Getter @Inclui
	private final String reg = "0110";

    @Getter @Setter @Inclui
    private Integer codincTrib;

    @Getter @Setter @Inclui
    private Integer indAproCred;

    @Getter @Setter @Inclui
    private Integer codTipoCont;

    @Getter @Setter @Inclui
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
