import java.util.ArrayList;

public class Quarto {
    private QuartoEnum tipo;
    private int diariaBaixa;
    private int diariaAlta;

    public Quarto(int id) {
        if(id == 1){
            this.tipo = QuartoEnum.SIMPLES;
            this.diariaBaixa = QuartoEnum.SIMPLES.getValorBaixa();
            this.diariaAlta = QuartoEnum.SIMPLES.getValorAlta();
        }else if(id == 2){
            this.tipo = QuartoEnum.LUXO;
            this.diariaBaixa = QuartoEnum.LUXO.getValorBaixa();
            this.diariaAlta = QuartoEnum.LUXO.getValorAlta();
        }else{
            this.tipo = QuartoEnum.SUPREMA;
            this.diariaBaixa = QuartoEnum.SUPREMA.getValorBaixa();
            this.diariaAlta = QuartoEnum.SIMPLES.getValorAlta();
        }
    }

    public QuartoEnum getTipo() {
        return tipo;
    }

    public int getDiariaBaixa() {
        return diariaBaixa;
    }

    public int getDiariaAlta() {
        return diariaAlta;
    }

}
