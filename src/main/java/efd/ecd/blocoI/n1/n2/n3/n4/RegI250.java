package efd.ecd.blocoI.n1.n2.n3.n4;

import java.math.BigDecimal;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegI250 {

	@Getter @Inclui
	private final String reg = "I250";
	
	@Getter @Setter @Inclui
	private String codCta;
	
	@Getter @Setter @Inclui
	private String codCcus;
	
	@Getter @Setter @Inclui
	private BigDecimal vlDc;
	
	@Getter @Setter @Inclui
	private String indDc;
	
	@Getter @Setter @Inclui
	private String numArq;
	
	@Getter @Setter @Inclui
	private String codHistPad;
	
	@Getter @Setter @Inclui
	private String hist;
	
	@Getter @Setter @Inclui
	private String codPart;
	
	@Getter @Setter @Inclui
	private BigDecimal vlDcMf;
	
	@Getter @Setter @Inclui
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
	
}
