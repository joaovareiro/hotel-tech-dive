import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataFixed {

    private LocalDate data;
    private static final DateTimeFormatter padrao = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public DataFixed(String data) {
        this.data =  arrumaData(data);
    }

    public static LocalDate arrumaData(String data){
        return LocalDate.parse(data, padrao);
    }

}
