package efd.contribuicoes.bloco0.n1.n2;

import java.io.Serializable;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.bloco0.n1.n2.n3.Reg0111;

public class Reg0110 implements Serializable {
	private static final long serialVersionUID = 4306246559931046763L;

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

    @Filho
    private Reg0111 reg0111;

    public Reg0110(Integer codincTrib, Integer indAproCred, Integer codTipoCont, Integer indRegCum) {
        this.codincTrib = codincTrib;
        this.indAproCred = indAproCred;
        this.codTipoCont = codTipoCont;
        this.indRegCum = indRegCum;
    }

    public Reg0110(){}

    public String getReg() {
        return reg;
    }

    public Integer getCodincTrib() {
        return codincTrib;
    }

    public void setCodincTrib(Integer codincTrib) {
        this.codincTrib = codincTrib;
    }

    public Integer getIndAproCred() {
        return indAproCred;
    }

    public void setIndAproCred(Integer indAproCred) {
        this.indAproCred = indAproCred;
    }

    public Integer getCodTipoCont() {
        return codTipoCont;
    }

    public void setCodTipoCont(Integer codTipoCont) {
        this.codTipoCont = codTipoCont;
    }

    public Integer getIndRegCum() {
        return indRegCum;
    }

    public void setIndRegCum(Integer indRegCum) {
        this.indRegCum = indRegCum;
    }

    public Reg0111 getReg0111() {
        return reg0111;
    }

    public void setReg0111(Reg0111 reg0111) {
        this.reg0111 = reg0111;
    }
    
}
