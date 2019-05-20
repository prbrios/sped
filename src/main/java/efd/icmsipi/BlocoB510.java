package efd.icmsipi;

import efd.Parsers;

import java.util.ArrayList;

public class BlocoB510 {

    private final String reg = "B510";
    private IndProf indProf;
    private IndEsc indEsc;
    private IndSoc indSoc;
    private String cpf;
    private String nome;

    public String getReg() {
        return reg;
    }

    public IndProf getIndProf() {
        return indProf;
    }

    public void setIndProf(IndProf indProf) {
        this.indProf = indProf;
    }

    public IndEsc getIndEsc() {
        return indEsc;
    }

    public void setIndEsc(IndEsc indEsc) {
        this.indEsc = indEsc;
    }

    public IndSoc getIndSoc() {
        return indSoc;
    }

    public void setIndSoc(IndSoc indSoc) {
        this.indSoc = indSoc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString(){

        java.util.List arr = new ArrayList<>();

        arr.add(this.reg);
        arr.add(this.indProf != null ? this.indProf.getCodigo() : null);
        arr.add(this.indEsc != null ? this.indEsc.getCodigo() : null);
        arr.add(this.indSoc != null ? this.indSoc.getCodigo() : null);
        arr.add(this.cpf);
        arr.add(this.nome);

        return Parsers.converteBlocoEmString(arr);

    }

    public enum IndProf {

        PROFISSIONAL_HABILITADO("0"),
        PROFISSIONAL_NAO_HABILITADO("1");

        private String codigo;

        IndProf(String codigo){
            this.codigo = codigo;
        }

        public String getCodigo() {
            return this.codigo;
        }
    }

    public enum IndEsc {

        NIVEL_SUPERIOR("0"),
        NIVEL_MEDIO("1");

        private String codigo;

        IndEsc(String codigo){
            this.codigo = codigo;
        }

        public String getCodigo() {
            return this.codigo;
        }
    }

    public enum IndSoc {

        SOCIO("0"),
        NAO_SOCIO("1");

        private String codigo;

        IndSoc(String codigo){
            this.codigo = codigo;
        }

        public String getCodigo() {
            return this.codigo;
        }
    }

}
