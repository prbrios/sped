package efd.icmsipi;

import efd.Parsers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Bloco0500 {

    private final String reg = "0500";
    private LocalDate dtAlt;
    private CodNatCc codNatCc;
    private IndCta indCta;
    private Integer nivel;
    private String codCta;
    private String nomeCta;

    public String getReg() {
        return reg;
    }

    public LocalDate getDtAlt() {
        return dtAlt;
    }

    public void setDtAlt(LocalDate dtAlt) {
        this.dtAlt = dtAlt;
    }

    public CodNatCc getCodNatCc() {
        return codNatCc;
    }

    public void setCodNatCc(CodNatCc codNatCc) {
        this.codNatCc = codNatCc;
    }

    public IndCta getIndCta() {
        return indCta;
    }

    public void setIndCta(IndCta indCta) {
        this.indCta = indCta;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public String getCodCta() {
        return codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }

    public String getNomeCta() {
        return nomeCta;
    }

    public void setNomeCta(String nomeCta) {
        this.nomeCta = nomeCta;
    }

    @Override
    public String toString(){

        List arr = new ArrayList<>();

        arr.add(this.reg);
        arr.add(this.dtAlt != null ? Parsers.formataData(this.dtAlt, "ddMMyyyy") : null);
        arr.add(this.codNatCc != null ? this.codNatCc.getCodigo() : null);
        arr.add(this.indCta != null ? this.indCta.getCodigo() : null);
        arr.add(this.nivel);
        arr.add(this.codCta);
        arr.add(this.nomeCta);

        return Parsers.converteBlocoEmString(arr);

    }

    public enum CodNatCc {

        CONTAS_DE_ATIVO("01"),
        CONTAS_DE_PASSIVO("02"),
        PATRIMONIO_LIQUIDO("03"),
        CONTAS_DE_RESULTADO("04"),
        CONTAS_DE_COMPENSACAO("05"),
        OUTRAS("09");

        private String codigo;

        CodNatCc(String codigo){
            this.codigo = codigo;
        }

        public String getCodigo() {
            return this.codigo;
        }
    }

    public enum IndCta {

        SINTETICA("S"),
        ANALITICA("A");

        private String codigo;

        IndCta(String codigo){
            this.codigo = codigo;
        }

        public String getCodigo() {
            return this.codigo;
        }
    }
}
