class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return String.format("%d/%d/%d", dia, mes, ano);
    }
}

class DataTeste {
    public static void main(String[] args) {
        
        Data data1 = new Data(06, 10, 2023);  
        Data data2 = new Data(07, 10, 2023);  

        
        System.out.println("Data 1: " + data1);
        System.out.println("Data 2: " + data2);
    }
}