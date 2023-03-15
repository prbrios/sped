package efd.contribuicoes.bloco1.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

public class Reg1900 implements Serializable {
	private static final long serialVersionUID = 5245162614486968297L;

	@Getter @Inclui
	private final String reg = "1900";

    @Getter @Setter @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Getter @Setter @Inclui
    private String codMod;

    @Getter @Setter @Inclui
    private String ser;

    @Getter @Setter @Inclui
    private Integer subSer;

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer codSit;

    @Getter @Setter @Inclui
    private BigDecimal vltotRec;

    @Getter @Setter @Inclui
    private Integer quantDoc;

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Getter @Setter @Inclui(zerosEsquerda = 4)
    private Integer cfop;

    @Getter @Setter @Inclui
    private String infCompl;

    @Getter @Setter @Inclui
    private String codCta;

    public Reg1900(Long cnpj, String codMod, String ser, Integer subSer, Integer codSit, BigDecimal vltotRec, Integer quantDoc, Integer cstPis, Integer cstCofins, Integer cfop, String infCompl, String codCta) {
        this.cnpj = cnpj;
        this.codMod = codMod;
        this.ser = ser;
        this.subSer = subSer;
        this.codSit = codSit;
        this.vltotRec = vltotRec;
        this.quantDoc = quantDoc;
        this.cstPis = cstPis;
        this.cstCofins = cstCofins;
        this.cfop = cfop;
        this.infCompl = infCompl;
        this.codCta = codCta;
    }

    public Reg1900(){ }
}
