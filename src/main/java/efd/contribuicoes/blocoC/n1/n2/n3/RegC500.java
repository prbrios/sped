package efd.contribuicoes.blocoC.n1.n2.n3;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import efd.Grupo;
import efd.anotacoes.Filho;
import efd.anotacoes.G1;
import efd.anotacoes.G2;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC501;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC505;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC509;
import lombok.Getter;
import lombok.Setter;

public class RegC500 {

	@SuppressWarnings("unused")
	private Grupo grupo;
	
    @Getter @Inclui @G1 @G2
    private final String reg = "C500";

    @Getter @Setter @Inclui @G1 @G2
    String codPart;

    @Getter @Setter @Inclui @G1 @G2
    String codMod;

    @Getter @Setter @Inclui(zerosEsquerda = 2) @G1 @G2
    Integer codSit;

    @Getter @Setter @Inclui @G1 @G2
    String ser;

    @Getter @Setter @Inclui @G1 @G2
    Integer sub;

    @Getter @Setter @Inclui @G1 @G2
    Long numDoc;

    @Getter @Setter @Inclui @G1 @G2
    LocalDate dtDoc;

    @Getter @Setter @Inclui @G1 @G2
    LocalDate dtEnt;

    @Getter @Setter @Inclui @G1 @G2
    BigDecimal vlDoc;

    @Getter @Setter @Inclui @G1 @G2
    BigDecimal vlIcms;

    @Getter @Setter @Inclui @G1 @G2
    String codInf;

    @Getter @Setter @Inclui @G1 @G2
    BigDecimal vlPis;

    @Getter @Setter @Inclui @G1 @G2
    BigDecimal vlCofins;
    
    @Getter @Setter @Inclui @G2
    String chvDoce;

    @Getter @Setter @Filho
    private List<RegC501> regC501;

    @Getter @Setter @Filho
    private List<RegC505> regC505;

    @Getter @Setter @Filho
    private List<RegC509> regC509;

    public RegC500(String codPart, String codMod, Integer codSit, String ser, Integer sub, Long numDoc, LocalDate dtDoc, LocalDate dtEnt, BigDecimal vlDoc, BigDecimal vlIcms, String codInf, BigDecimal vlPis, BigDecimal vlCofins) {
    	this.grupo = Grupo.G1;
        this.codPart = codPart;
        this.codMod = codMod;
        this.codSit = codSit;
        this.ser = ser;
        this.sub = sub;
        this.numDoc = numDoc;
        this.dtDoc = dtDoc;
        this.dtEnt = dtEnt;
        this.vlDoc = vlDoc;
        this.vlIcms = vlIcms;
        this.codInf = codInf;
        this.vlPis = vlPis;
        this.vlCofins = vlCofins;
    }
    
    public RegC500(String codPart, String codMod, Integer codSit, String ser, Integer sub, Long numDoc, LocalDate dtDoc, LocalDate dtEnt, BigDecimal vlDoc, BigDecimal vlIcms, String codInf, BigDecimal vlPis, BigDecimal vlCofins, String chvDoce) {
    	this.grupo = Grupo.G2;
        this.codPart = codPart;
        this.codMod = codMod;
        this.codSit = codSit;
        this.ser = ser;
        this.sub = sub;
        this.numDoc = numDoc;
        this.dtDoc = dtDoc;
        this.dtEnt = dtEnt;
        this.vlDoc = vlDoc;
        this.vlIcms = vlIcms;
        this.codInf = codInf;
        this.vlPis = vlPis;
        this.vlCofins = vlCofins;
        this.chvDoce = chvDoce;
    }

    public RegC500(){ }
}
