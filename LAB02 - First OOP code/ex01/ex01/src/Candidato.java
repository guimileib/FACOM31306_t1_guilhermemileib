
public class Candidato{
    String nomeCompleto;
    String dataNascimento;
    String genero;
    String totalBens;
    boolean reeleger; 
    int nmrPartido;
    String cargoPretendido;
    

    public Candidato(String nomeCompleto, String dataNascimento, String genero, String totalBens, boolean reeleger, 
    int nmrPartido, String cargoPretendido ){
        this.nomeCompleto =  nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.totalBens = totalBens;
        this.reeleger = reeleger;
        this.nmrPartido = nmrPartido;
        this.cargoPretendido = cargoPretendido;
    }

    public void mostrarInformações(){
        System.out.printf("<< Informações do candidato: >>");
        System.out.println("Nome: "+nomeCompleto);
        System.out.println("Data de Nascimento: "+dataNascimento);
        System.out.println("Gênero: "+genero);
        System.out.println("Total de bens declarados: "+totalBens );

        if(reeleger){
            System.out.println("Candidato a reeleição: Sim");
        }else{
            System.out.println("Candidato a reeleição: Não");
        }

        System.out.println("Número do partido: "+nmrPartido);
        System.out.println("Cargo Pretendido: "+cargoPretendido);
    }
    
}