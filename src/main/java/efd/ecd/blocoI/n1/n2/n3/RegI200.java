package efd.ecd.blocoI.n1.n2.n3;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.blocoI.n1.n2.n3.n4.RegI250;

public class RegI200 implements Serializable {
	private static final long serialVersionUID = -8075561456447653131L;

	@Inclui
	private final String reg = "I200";
	
	@Inclui
	private String numLcto;
	
	@Inclui
	private LocalDate dtLcto;
	
	@Inclui
	private BigDecimal vlLcto;
	
	@Inclui
	private String indLcto;
	
	@Inclui
	private LocalDate dtLctoExt;
	
	@Inclui
	private BigDecimal vlLctoMf;

	@Filho
	private List<RegI250> regI250;
	
	public RegI200(String numLcto, LocalDate dtLcto, BigDecimal vlLcto, String indLcto, LocalDate dtLctoExt,
			BigDecimal vlLctoMf) {
		super();
		this.numLcto = numLcto;
		this.dtLcto = dtLcto;
		this.vlLcto = vlLcto;
		this.indLcto = indLcto;
		this.dtLctoExt = dtLctoExt;
		this.vlLctoMf = vlLctoMf;
	}
	
	public RegI200() {/* */}

	public String getReg() {
		return reg;
	}

	public String getNumLcto() {
		return numLcto;
	}

	public void setNumLcto(String numLcto) {
		this.numLcto = numLcto;
	}

	public LocalDate getDtLcto() {
		return dtLcto;
	}

	public void setDtLcto(LocalDate dtLcto) {
		this.dtLcto = dtLcto;
	}

	public BigDecimal getVlLcto() {
		return vlLcto;
	}

	public void setVlLcto(BigDecimal vlLcto) {
		this.vlLcto = vlLcto;
	}

	public String getIndLcto() {
		return indLcto;
	}

	public void setIndLcto(String indLcto) {
		this.indLcto = indLcto;
	}

	public LocalDate getDtLctoExt() {
		return dtLctoExt;
	}

	public void setDtLctoExt(LocalDate dtLctoExt) {
		this.dtLctoExt = dtLctoExt;
	}

	public BigDecimal getVlLctoMf() {
		return vlLctoMf;
	}

	public void setVlLctoMf(BigDecimal vlLctoMf) {
		this.vlLctoMf = vlLctoMf;
	}

	public List<RegI250> getRegI250() {
		return regI250;
	}

	public void setRegI250(List<RegI250> regI250) {
		this.regI250 = regI250;
	}
	
	
}
