package efd.ecd.blocoI.n1.n2.n3.n4;

import java.math.BigDecimal;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegI355 {

	@Getter @Inclui
	private final String reg = "I355";
	
	@Getter @Setter @Inclui
	private String codCta;
	
	@Getter @Setter @Inclui
	private String codCcus;
	
	@Getter @Setter @Inclui
	private BigDecimal vlCta;
	
	@Getter @Setter @Inclui
	private String indDc;
	
	@Getter @Setter @Inclui
	private BigDecimal vlCtaMf;
	
	@Getter @Setter @Inclui
	private String indDcMf;
	
	public RegI355(String codCta, String codCcus, BigDecimal vlCta, String indDc, BigDecimal vlCtaMf, String indDcMf) {
		super();
		this.codCta = codCta;
		this.codCcus = codCcus;
		this.vlCta = vlCta;
		this.indDc = indDc;
		this.vlCtaMf = vlCtaMf;
		this.indDcMf = indDcMf;
	}
	
	public RegI355() {/* */}

}
