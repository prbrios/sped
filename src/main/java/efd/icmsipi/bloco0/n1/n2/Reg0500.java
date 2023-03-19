package efd.icmsipi.bloco0.n1.n2;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.time.LocalDate;

public class Reg0500 implements Serializable {
	private static final long serialVersionUID = 7433376565549324925L;

	@Inclui
    private final String reg = "0500";

    @Inclui
    private LocalDate dtAlt;

    @Inclui
    private String codNatCc;

    @Inclui
    private String indCta;

    @Inclui
    private Integer nivel;

    @Inclui
    private String codCta;

    @Inclui
    private String nomeCta;

    public Reg0500(LocalDate dtAlt, String codNatCc, String indCta, Integer nivel, String codCta, String nomeCta) {

        this.dtAlt = dtAlt;
        this.codNatCc = codNatCc;
        this.indCta = indCta;
        this.nivel = nivel;
        this.codCta = codCta;
        this.nomeCta = nomeCta;
    }

    public Reg0500(){}

    public String getReg() {
        return reg;
    }

    public LocalDate getDtAlt() {
        return dtAlt;
    }

    public void setDtAlt(LocalDate dtAlt) {
        this.dtAlt = dtAlt;
    }

    public String getCodNatCc() {
        return codNatCc;
    }

    public void setCodNatCc(String codNatCc) {
        this.codNatCc = codNatCc;
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

    public String getNomeCta() {
        return nomeCta;
    }

    public void setNomeCta(String nomeCta) {
        this.nomeCta = nomeCta;
    }
    

}
