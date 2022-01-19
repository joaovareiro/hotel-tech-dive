import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;


public class Reserva {
    private Quarto quarto;
    private Hospede responsavel;
    private LocalDate dataCheckIn;
    private LocalDate dataCheckOut;
    private int dias;
    private int diaria;
    private int valorEstadia;
    private ArrayList<Hospede> listaHospedesQuarto = new ArrayList<>();

    public Reserva(Quarto quarto, Hospede responsavel, String dataCheckIn, String dataCheckOut) {
        this.quarto = quarto;
        if(checkDisponibilidade(quarto.getTipo())){
            this.responsavel =  responsavel;
            if((int) ChronoUnit.DAYS.between(LocalDate.now(), DataFixed.arrumaData(dataCheckIn))>60){
                throw new SessentaDiasException("O limite máximo de antecedência é 60 dias");
            }else{
            this.dataCheckIn = DataFixed.arrumaData(dataCheckIn);
            this.dataCheckOut = DataFixed.arrumaData(dataCheckOut);
            this.dias = getDias(DataFixed.arrumaData(dataCheckIn),DataFixed.arrumaData(dataCheckOut));
            listaHospedesQuarto.add(responsavel);
            if(checkBaixa()){
                this.diaria = quarto.getDiariaBaixa();
            }else{
                this.diaria = quarto.getDiariaAlta();
                }
            quarto.getTipo().diminuiDisponivel();
            }
        }else{
            System.err.println("Tipo de quarto indisponivel");
        }

    }

    private boolean checkBaixa(){
        boolean baixa = false;
        Calendar hoje = Calendar.getInstance();
        int mes = hoje.get(Calendar.MONTH);
        if( (3 <= mes) && (mes <= 10 )){
            baixa = true;
        }
        return baixa;
    }

    private boolean checkDisponibilidade(QuartoEnum tipo){
        boolean disponivel = false;
        if(tipo.getNumDisponiveis() > 0){
            disponivel = true;
        }
        return disponivel;
    }

    public void addLista(Hospede h){
        listaHospedesQuarto.add(h);
    }

    public void listaHospedados(){
        for(Hospede h: listaHospedesQuarto){
            System.out.println(h);
        }
    }

    public void getTotal() {
        int dias = (int) ChronoUnit.DAYS.between(this.dataCheckIn, this.dataCheckOut);
        System.out.println("O valor total da estadia do cliente " + this.responsavel.getNome() + " é " + dias*diaria);
    }

    public int getDias(LocalDate in, LocalDate out) {
        return (int) ChronoUnit.DAYS.between(in, out);
    }
}
