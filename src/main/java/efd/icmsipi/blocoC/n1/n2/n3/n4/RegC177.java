package efd.icmsipi.blocoC.n1.n2.n3.n4;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class RegC177 implements Serializable {
	private static final long serialVersionUID = -2595647513192282820L;

	@Inclui
    private final String reg = "C177";

    @Inclui
    private String codSeloIpi;

    @Inclui
    private Long qtSeloIpi;

    @Inclui
    private String codInfItem;

    public RegC177(String codSeloIpi, Long qtSeloIpi, String codInfItem) {
        this.codSeloIpi = codSeloIpi;
        this.qtSeloIpi = qtSeloIpi;
        this.codInfItem = codInfItem;
    }

    public RegC177(){}

    public String getReg() {
        return reg;
    }

    public String getCodSeloIpi() {
        return codSeloIpi;
    }

    public void setCodSeloIpi(String codSeloIpi) {
        this.codSeloIpi = codSeloIpi;
    }

    public Long getQtSeloIpi() {
        return qtSeloIpi;
    }

    public void setQtSeloIpi(Long qtSeloIpi) {
        this.qtSeloIpi = qtSeloIpi;
    }

    public String getCodInfItem() {
        return codInfItem;
    }

    public void setCodInfItem(String codInfItem) {
        this.codInfItem = codInfItem;
    }
    
}
