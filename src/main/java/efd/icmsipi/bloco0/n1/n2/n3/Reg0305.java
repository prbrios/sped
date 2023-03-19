package efd.icmsipi.bloco0.n1.n2.n3;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class Reg0305 implements Serializable {
	private static final long serialVersionUID = 8053247972513653061L;

	@Inclui
    private final String reg = "0305";

    @Inclui
    private String codCcus;

    @Inclui
    private String func;

    @Inclui
    private Integer vidaUtil;

    public Reg0305(String codCcus, String func, Integer vidaUtil) {
        this.codCcus = codCcus;
        this.func = func;
        this.vidaUtil = vidaUtil;
    }

    public Reg0305(){}

    public String getReg() {
        return reg;
    }

    public String getCodCcus() {
        return codCcus;
    }

    public void setCodCcus(String codCcus) {
        this.codCcus = codCcus;
    }

    public String getFunc() {
        return func;
    }

    public void setFunc(String func) {
        this.func = func;
    }

    public Integer getVidaUtil() {
        return vidaUtil;
    }

    public void setVidaUtil(Integer vidaUtil) {
        this.vidaUtil = vidaUtil;
    }
    

}
