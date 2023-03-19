package efd.ecd.blocoI.n1.n2.n3.n4;

import java.io.Serializable;
import java.math.BigDecimal;

import efd.anotacoes.Inclui;

public class RegI310 implements Serializable {
	private static final long serialVersionUID = -6370313751868526522L;

	@Inclui
	private final String reg = "I310";
	
	@Inclui
	private String codCta;
	
	@Inclui
	private String codCcus;
	
	@Inclui
	private BigDecimal valDebd;
	
	@Inclui
	private BigDecimal valCredd;
	
	@Inclui
	private BigDecimal valDebMf;
	
	@Inclui
	private BigDecimal valCredMf;
	
	public RegI310(String codCta, String codCcus, BigDecimal valDebd, BigDecimal valCredd, BigDecimal valDebMf,
			BigDecimal valCredMf) {
		super();
		this.codCta = codCta;
		this.codCcus = codCcus;
		this.valDebd = valDebd;
		this.valCredd = valCredd;
		this.valDebMf = valDebMf;
		this.valCredMf = valCredMf;
	}
	
	public RegI310() {/* */}

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

	public BigDecimal getValDebd() {
		return valDebd;
	}

	public void setValDebd(BigDecimal valDebd) {
		this.valDebd = valDebd;
	}

	public BigDecimal getValCredd() {
		return valCredd;
	}

	public void setValCredd(BigDecimal valCredd) {
		this.valCredd = valCredd;
	}

	public BigDecimal getValDebMf() {
		return valDebMf;
	}

	public void setValDebMf(BigDecimal valDebMf) {
		this.valDebMf = valDebMf;
	}

	public BigDecimal getValCredMf() {
		return valCredMf;
	}

	public void setValCredMf(BigDecimal valCredMf) {
		this.valCredMf = valCredMf;
	}
	
	
}
