package efd.ecd.blocoJ.n1;

import java.io.Serializable;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.blocoJ.n1.n2.RegJ005;
import efd.ecd.blocoJ.n1.n2.RegJ900;

public class RegJ001 implements Serializable {
	private static final long serialVersionUID = -5507601689397579683L;

	@Inclui
    private final String reg = "J001";

    @Inclui
    private Integer indDad;

    @Filho
    private List<RegJ005> regJ005;

    @Filho
    private RegJ900 regJ900;

    public RegJ001(Integer indDad) {
        this.indDad = indDad;
    }

    public RegJ001() {}

    public String getReg() {
        return reg;
    }

    public Integer getIndDad() {
        return indDad;
    }

    public void setIndDad(Integer indDad) {
        this.indDad = indDad;
    }

    public List<RegJ005> getRegJ005() {
        return regJ005;
    }

    public void setRegJ005(List<RegJ005> regJ005) {
        this.regJ005 = regJ005;
    }

    public RegJ900 getRegJ900() {
        return regJ900;
    }

    public void setRegJ900(RegJ900 regJ900) {
        this.regJ900 = regJ900;
    }
    

}
