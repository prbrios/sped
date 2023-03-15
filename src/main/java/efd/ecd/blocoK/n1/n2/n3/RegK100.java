package efd.ecd.blocoK.n1.n2.n3;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.blocoK.n1.n2.n3.n4.RegK110;
import lombok.Getter;
import lombok.Setter;

public class RegK100 implements Serializable {
	private static final long serialVersionUID = -783723575203530442L;

	@Getter @Inclui
    private final String reg = "K100";

    @Getter @Setter @Inclui
    private Integer codPais;

    @Getter @Setter @Inclui
    private Integer empCod;

    @Getter @Setter @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Getter @Setter @Inclui
    private String nome;

    @Getter @Setter @Inclui(casasDecimais = 4)
    private BigDecimal perPart;

    @Getter @Setter @Inclui
    private String evento;

    @Getter @Setter @Inclui(casasDecimais = 4)
    private BigDecimal perCons;

    @Getter @Setter @Inclui
    private LocalDate dataIniEmp;

    @Getter @Setter @Filho
    private List<RegK110> regK110;

    public RegK100() {}

    public RegK100(Integer codPais, Integer empCod, Long cnpj, String nome, BigDecimal perPart, String evento,
            BigDecimal perCons, LocalDate dataIniEmp) {
        this.codPais = codPais;
        this.empCod = empCod;
        this.cnpj = cnpj;
        this.nome = nome;
        this.perPart = perPart;
        this.evento = evento;
        this.perCons = perCons;
        this.dataIniEmp = dataIniEmp;
    }

}
