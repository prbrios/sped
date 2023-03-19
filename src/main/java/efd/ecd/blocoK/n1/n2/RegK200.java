package efd.ecd.blocoK.n1.n2;

import java.io.Serializable;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.blocoK.n1.n2.n3.RegK210;
import efd.ecd.blocoK.n1.n2.n3.RegK300;

public class RegK200 implements Serializable {
	private static final long serialVersionUID = -4341625386450678880L;

	@Inclui
    private final String reg = "K200";

    @Inclui
    private String codNat;

    @Inclui
    private String indCta;

    @Inclui
    private Integer nivel;

    @Inclui
    private String codCta;

    @Inclui
    private String codCtaSup;

    @Inclui
    private String cta;

    @Filho
    private List<RegK210> regK210;

    @Filho
    private List<RegK300> regK300;

    public RegK200(String codNat, String indCta, Integer nivel, String codCta, String codCtaSup, String cta) {
        this.codNat = codNat;
        this.indCta = indCta;
        this.nivel = nivel;
        this.codCta = codCta;
        this.codCtaSup = codCtaSup;
        this.cta = cta;
    }

    public RegK200() {}

    public String getReg() {
        return reg;
    }

    public String getCodNat() {
        return codNat;
    }

    public void setCodNat(String codNat) {
        this.codNat = codNat;
    }

    public String getIndCta() {
        return indCta;
    }

    public void setIndCta(String indCta) {
        this.indCta = indCta;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public String getCodCta() {
        return codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }

    public String getCodCtaSup() {
        return codCtaSup;
    }

    public void setCodCtaSup(String codCtaSup) {
        this.codCtaSup = codCtaSup;
    }

    public String getCta() {
        return cta;
    }

    public void setCta(String cta) {
        this.cta = cta;
    }

    public List<RegK210> getRegK210() {
        return regK210;
    }

    public void setRegK210(List<RegK210> regK210) {
        this.regK210 = regK210;
    }

    public List<RegK300> getRegK300() {
        return regK300;
    }

    public void setRegK300(List<RegK300> regK300) {
        this.regK300 = regK300;
    }
    

}
