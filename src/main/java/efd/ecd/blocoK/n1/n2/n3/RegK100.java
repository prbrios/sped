package efd.ecd.blocoK.n1.n2.n3;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.blocoK.n1.n2.n3.n4.RegK110;

public class RegK100 implements Serializable {
	private static final long serialVersionUID = -783723575203530442L;

	@Inclui
    private final String reg = "K100";

    @Inclui
    private Integer codPais;

    @Inclui
    private Integer empCod;

    @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Inclui
    private String nome;

    @Inclui(casasDecimais = 4)
    private BigDecimal perPart;

    @Inclui
    private String evento;

    @Inclui(casasDecimais = 4)
    private BigDecimal perCons;

    @Inclui
    private LocalDate dataIniEmp;

    @Filho
    private List<RegK110> regK110;

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

    public RegK100() {}

    public String getReg() {
        return reg;
    }

    public Integer getCodPais() {
        return codPais;
    }

    public void setCodPais(Integer codPais) {
        this.codPais = codPais;
    }

    public Integer getEmpCod() {
        return empCod;
    }

    public void setEmpCod(Integer empCod) {
        this.empCod = empCod;
    }

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPerPart() {
        return perPart;
    }

    public void setPerPart(BigDecimal perPart) {
        this.perPart = perPart;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public BigDecimal getPerCons() {
        return perCons;
    }

    public void setPerCons(BigDecimal perCons) {
        this.perCons = perCons;
    }

    public LocalDate getDataIniEmp() {
        return dataIniEmp;
    }

    public void setDataIniEmp(LocalDate dataIniEmp) {
        this.dataIniEmp = dataIniEmp;
    }

    public List<RegK110> getRegK110() {
        return regK110;
    }

    public void setRegK110(List<RegK110> regK110) {
        this.regK110 = regK110;
    }
    

}
