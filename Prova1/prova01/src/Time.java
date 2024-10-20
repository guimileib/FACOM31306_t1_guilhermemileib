public class Time{
    private Jogador titular1;
    private Jogador titular2;
    private Jogador substituto;
    private String nomeTime;

    public Time(String nomeTime, Jogador titular1, Jogador titular2, Jogador substituto,
                String nomeTitular,int idadeTitular, double alturaTitular, double pesoTitular, 
                String nomeSubstituto, int idadeSubstituto, double alturaSubstituto, double pesoSubstituto){
            this.nomeTime = nomeTime;
            this.titular1 = new Jogador(nomeTitular, idadeTitular,alturaTitular, pesoTitular);
            this.titular2 = new Jogador(nomeTitular, idadeTitular,alturaTitular, pesoTitular);
            this.substituto = new Jogador(nomeSubstituto, idadeSubstituto, alturaSubstituto, pesoSubstituto);
        
    }

    public Time(String nomeTime, Jogador titular1, Jogador titular2, Jogador substituto){
        this.nomeTime = nomeTime;
        this.titular1 = titular1;
        this.titular2 = titular2;
        this.substituto = substituto;
    }


    public Time(Jogador titular1, Jogador titular2, String nomeTitular,int idadeTitular, double alturaTitular, double pesoTitular){
        this.titular1 = new Jogador(nomeTitular, idadeTitular,alturaTitular, pesoTitular);
        this.titular1 = new Jogador(nomeTitular, idadeTitular,alturaTitular, pesoTitular);
    }

    public String toString(){
        return "Nome do Time: " + nomeTime +
               "\nJogadores Titulares: " + titular1 + "\n" + titular2 +
               "\nJogadores Substitutos: " + substituto;
    }

    
    public Jogador getTitular1() {
        return titular1;
    }

    public void setTitular1(Jogador titular1) {
        this.titular1 = titular1;
    }

    public Jogador getTitular2() {
        return titular2;
    }

    public void setTitular2(Jogador titular2) {
        this.titular2 = titular2;
    }

    public Jogador getSubstituto() {
        return substituto;
    }

    public void setSubstituto(Jogador substituto) {
        this.substituto = substituto;
    }

    public String getNomeTime() {
        return nomeTime;
    }

    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public double calcIdadeMediaTime(){
        int somaIdades = 0;
        int totalJogadores = 0;
        
        if(titular1 != null){
            somaIdades += titular1.getIdade();
            totalJogadores++;
        }
        if(titular2 != null){
            somaIdades += titular2.getIdade();
            totalJogadores++;
        }
        if(substituto != null){
            somaIdades += substituto.getIdade();
            totalJogadores++;
        }

        if(totalJogadores > 0){
            return (double) somaIdades / totalJogadores;
        }else{
            return 0;
        }

    }
}