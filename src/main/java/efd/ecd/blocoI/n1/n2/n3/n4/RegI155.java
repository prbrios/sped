package efd.ecd.blocoI.n1.n2.n3.n4;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.blocoI.n1.n2.n3.n4.n5.RegI157;

public class RegI155 implements Serializable {
	private static final long serialVersionUID = -2858481449217280533L;

	@Inclui
	private final String reg = "I155";
	
	@Inclui
	private String codCta;
	
	@Inclui
	private String codCcus;
	
	@Inclui
	private BigDecimal vlSldIni;
	
	@Inclui
	private String indDcIni;
	
	@Inclui
	private BigDecimal vlDeb;
	
	@Inclui
	private BigDecimal vlCred;
	
	@Inclui
	private BigDecimal vlSldFin;
	
	@Inclui
	private String indDcFin;
	
	@Inclui
	private BigDecimal vlSldIniMf;
	
	@Inclui
	private String indDcIniMf;
	
	@Inclui
	private BigDecimal vlDebMf;
	
	@Inclui
	private BigDecimal vlCredMf;
	
	@Inclui
	private BigDecimal vlSldFinMf;
	
	@Inclui
	private String indDcFinMf;
	
	@Filho
	private List<RegI157> regI157;
	
	public RegI155(String codCta, String codCcus, BigDecimal vlSldIni, String indDcIni, BigDecimal vlDeb,
			BigDecimal vlCred, BigDecimal vlSldFin, String indDcFin, BigDecimal vlSldIniMf, String indDcIniMf,
			BigDecimal vlDebMf, BigDecimal vlCredMf, BigDecimal vlSldFinMf, String indDcFinMf) {
		super();
		this.codCta = codCta;
		this.codCcus = codCcus;
		this.vlSldIni = vlSldIni;
		this.indDcIni = indDcIni;
		this.vlDeb = vlDeb;
		this.vlCred = vlCred;
		this.vlSldFin = vlSldFin;
		this.indDcFin = indDcFin;
		this.vlSldIniMf = vlSldIniMf;
		this.indDcIniMf = indDcIniMf;
		this.vlDebMf = vlDebMf;
		this.vlCredMf = vlCredMf;
		this.vlSldFinMf = vlSldFinMf;
		this.indDcFinMf = indDcFinMf;
	}
	
	public RegI155() {/* */}

	public String getReg() {
		return reg;
	}

	public String getCodCta() {
		return codCta;
	}

	public void setCodCta(String codCta) {
		this.codCta = codCta;
	}

	public String getCodCcus() {
		return codCcus;
	}

	public void setCodCcus(String codCcus) {
		this.codCcus = codCcus;
	}

	public BigDecimal getVlSldIni() {
		return vlSldIni;
	}

	public void setVlSldIni(BigDecimal vlSldIni) {
		this.vlSldIni = vlSldIni;
	}

	public String getIndDcIni() {
		return indDcIni;
	}

	public void setIndDcIni(String indDcIni) {
		this.indDcIni = indDcIni;
	}

	public BigDecimal getVlDeb() {
		return vlDeb;
	}

	public void setVlDeb(BigDecimal vlDeb) {
		this.vlDeb = vlDeb;
	}

	public BigDecimal getVlCred() {
		return vlCred;
	}

	public void setVlCred(BigDecimal vlCred) {
		this.vlCred = vlCred;
	}

	public BigDecimal getVlSldFin() {
		return vlSldFin;
	}

	public void setVlSldFin(BigDecimal vlSldFin) {
		this.vlSldFin = vlSldFin;
	}

	public String getIndDcFin() {
		return indDcFin;
	}

	public void setIndDcFin(String indDcFin) {
		this.indDcFin = indDcFin;
	}

	public BigDecimal getVlSldIniMf() {
		return vlSldIniMf;
	}

	public void setVlSldIniMf(BigDecimal vlSldIniMf) {
		this.vlSldIniMf = vlSldIniMf;
	}

	public String getIndDcIniMf() {
		return indDcIniMf;
	}

	public void setIndDcIniMf(String indDcIniMf) {
		this.indDcIniMf = indDcIniMf;
	}

	public BigDecimal getVlDebMf() {
		return vlDebMf;
	}

	public void setVlDebMf(BigDecimal vlDebMf) {
		this.vlDebMf = vlDebMf;
	}

	public BigDecimal getVlCredMf() {
		return vlCredMf;
	}

	public void setVlCredMf(BigDecimal vlCredMf) {
		this.vlCredMf = vlCredMf;
	}

	public BigDecimal getVlSldFinMf() {
		return vlSldFinMf;
	}

	public void setVlSldFinMf(BigDecimal vlSldFinMf) {
		this.vlSldFinMf = vlSldFinMf;
	}

	public String getIndDcFinMf() {
		return indDcFinMf;
	}

	public void setIndDcFinMf(String indDcFinMf) {
		this.indDcFinMf = indDcFinMf;
	}

	public List<RegI157> getRegI157() {
		return regI157;
	}

	public void setRegI157(List<RegI157> regI157) {
		this.regI157 = regI157;
	}
	
	
}
