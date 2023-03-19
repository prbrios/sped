package efd.ecd.blocoI.n1.n2.n3.n4;

import java.io.Serializable;
import java.math.BigDecimal;

import efd.anotacoes.Inclui;

public class RegI250 implements Serializable {
	private static final long serialVersionUID = 3186588166419967224L;

	@Inclui
	private final String reg = "I250";
	
	@Inclui
	private String codCta;
	
	@Inclui
	private String codCcus;
	
	@Inclui
	private BigDecimal vlDc;
	
	@Inclui
	private String indDc;
	
	@Inclui
	private String numArq;
	
	@Inclui
	private String codHistPad;
	
	@Inclui
	private String hist;
	
	@Inclui
	private String codPart;
	
	@Inclui
	private BigDecimal vlDcMf;
	
	@Inclui
	private String indDcMf;
	
	public RegI250(String codCta, String codCcus, BigDecimal vlDc, String indDc, String numArq, String codHistPad,
			String hist, String codPart, BigDecimal vlDcMf, String indDcMf) {
		super();
		this.codCta = codCta;
		this.codCcus = codCcus;
		this.vlDc = vlDc;
		this.indDc = indDc;
		this.numArq = numArq;
		this.codHistPad = codHistPad;
		this.hist = hist;
		this.codPart = codPart;
		this.vlDcMf = vlDcMf;
		this.indDcMf = indDcMf;
	}
	
	public RegI250() {/* */}

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

	public BigDecimal getVlDc() {
		return vlDc;
	}

	public void setVlDc(BigDecimal vlDc) {
		this.vlDc = vlDc;
	}

	public String getIndDc() {
		return indDc;
	}

	public void setIndDc(String indDc) {
		this.indDc = indDc;
	}

	public String getNumArq() {
		return numArq;
	}

	public void setNumArq(String numArq) {
		this.numArq = numArq;
	}

	public String getCodHistPad() {
		return codHistPad;
	}

	public void setCodHistPad(String codHistPad) {
		this.codHistPad = codHistPad;
	}

	public String getHist() {
		return hist;
	}

	public void setHist(String hist) {
		this.hist = hist;
	}

	public String getCodPart() {
		return codPart;
	}

	public void setCodPart(String codPart) {
		this.codPart = codPart;
	}

	public BigDecimal getVlDcMf() {
		return vlDcMf;
	}

	public void setVlDcMf(BigDecimal vlDcMf) {
		this.vlDcMf = vlDcMf;
	}

	public String getIndDcMf() {
		return indDcMf;
	}

	public void setIndDcMf(String indDcMf) {
		this.indDcMf = indDcMf;
	}
	
	
}
