public class Simulacao {
    public static void main(String[] args) {
        Hospede h1 = new Hospede("Cauê Henrique Mateus Barros","026.295.938-00","07/01/1981");
        Hospede h2 = new Hospede("Luana Gabrielly Campos","297.190.230-74","06/12/1983");
        Hospede h3 = new Hospede("Geraldo Theo Ramos","022.663.649-60","16/06/1975");
        Hospede h4 = new Hospede("Enzo Ferreira da Silva","793.198.473-04","28/11/2001");
        Hospede h5 = new Hospede("Caio Yago da Conceição","258.593.283-46","12/01/1999");
        Hospede h6 = new Hospede("Bianca Luzia Rezende","189.137.731-04","11/06/1992");
        Hospede h7 = new Hospede("César Francisco Martins","914.092.262-63","25/12/1990");
        Hospede h8 = new Hospede("Adriana Silvana Sandra Rezende","423.720.933-47","18/02/1977");
        Hospede h9 = new Hospede("Cláudia Louise Clarice Nogueira","865.054.426-69","27/09/2000");
        Hospede h10 = new Hospede("Lúcia Rita Antônia","972.464.635-18","22/05/1992");
        Quarto q1 = new Quarto(1);
        Quarto q2 = new Quarto(2);
        Quarto q3 = new Quarto(3);
        Quarto q4 = new Quarto(3);
        Quarto q5 = new Quarto(2);
        Quarto q6 = new Quarto(1);
        Quarto q7 = new Quarto(1);
        Quarto q8 = new Quarto(2);
        Quarto q9 = new Quarto(3);
        Quarto q10 = new Quarto(2);
        Reserva r1 = new Reserva(q1,h1,"19/01/2022","22/01/2022");
        Reserva r2 = new Reserva(q2,h2,"21/01/2022","23/01/2022");
        Reserva r3 = new Reserva(q3,h3,"05/02/2022","07/02/2022");
        Reserva r4 = new Reserva(q4,h4,"08/02/2022","16/02/2022");
        Reserva r5 = new Reserva(q5,h5,"21/01/2022","23/01/2022");
        Reserva r6 = new Reserva(q6,h5,"21/01/2022","23/01/2022");
        Reserva r7 = new Reserva(q8,h5,"21/01/2022","23/01/2022");
        Reserva r8 = new Reserva(q7,h7,"20/01/2022","26/01/2022");
        Reserva r9 = new Reserva(q9,h10,"01/03/2022","07/03/2022");
        Reserva r10 = new Reserva(q10,h8,"26/02/2022","28/02/2022");
        r1.cancelaDiaria(r1);
        r1.getTotal();
        r2.getTotal();
        r3.getTotal();
        r4.getTotal();
        r5.getTotal();
        r6.getTotal();
        r7.getTotal();
        r8.getTotal();
        r9.getTotal();
        r10.getTotal();
        r6.addLista(h6);
        r6.addLista(h9);
        r6.listaHospedados();
    }
}
