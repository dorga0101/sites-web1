class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public boolean isValidDate() {
  
        return (mes >= 1 && mes <= 12 && dia >= 1 && dia <= 31);
    }

    @Override
    public String toString() {
        return String.format("%d/%d/%d", dia, mes, ano);
    }
}

class DataTeste {
    public static void main(String[] args) {
        
        Data data1 = new Data(10, 5, 2023);  
        Data data2 = new Data(25, 12, 2023);  

        
        System.out.println("Data 1 válida: " + data1.isValidDate());
        System.out.println("Data 2 válida: " + data2.isValidDate());

        
        System.out.println("Data 1: " + data1);
        System.out.println("Data 2: " + data2);
    }
}
