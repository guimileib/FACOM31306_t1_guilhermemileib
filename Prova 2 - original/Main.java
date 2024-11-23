public class Main{
    public static void main(String[] args) {
        Bike[] bikes = {
            new Bike(1, 12, 1,"Tuger", 1 ),
            new SpeedBike(2, 10, 25, 2, "Kalloy", 2  ),
            new MountainBike(3, 6, "Óleo", 3 ,"Jix", 3 )
        };
        
        for(Bike bike : bikes){
            bike.imprimirDados();
        }

        for(Bike bike : bikes){
            if(bike instanceof SpeedBike){
                int i = 1;
                System.out.println(" ");
                System.out.println("Espessura dos pneus SpeedBike: ");
                SpeedBike speedBike = (SpeedBike) bike; // casting, transformar o tipo bike em speedbike para poder ter acesso ao metodo de SpeedBike
                System.out.println("Espessura "+ i + ": " + speedBike.getEspessuraPneu());
            }
        }

        for(Bike bike : bikes){
            if(bike instanceof MountainBike){
                int i = 1;
                System.out.println(" ");
                System.out.println("Tipos de Suspensão Mountains Bike: ");
                MountainBike mountainBike = (MountainBike) bike;
                System.out.println("Tipo " + i + ": " + mountainBike.getTipoSuspensao());
            }
        }
        // Setando marcha 
        SpeedBike sb1 = new SpeedBike(10, 6 , 28, 2, "Kalloy", 10 );
        try{
            sb1.setMarcha(-1);
        }catch(IndexOutOfBoundsException e){
            System.out.println("Saída:");
            System.out.println("Erro: " + e.getMessage()); // a saída é a mesma do throws
        }finally{
            sb1.imprimirDados();
        }   
        
        SpeedBike[] sb2 = new SpeedBike[3];
            sb2[0] = new SpeedBike(10, 6 , 22, 2, "Kalloy", 12 );
            sb2[1] = new SpeedBike(12, 6 , 23, 2, "Kalloy", 12 );
            sb2[2] = new SpeedBike(10, 6 , 29, 2, "Kalloy", 12 );
            
            // OrdCamp ord = null -> Criei um objeto
            //ord.ordena(sb2) -> Ordenando o vetor, a classe não existe
            
            for(SpeedBike sb2s: sb2){
                if(sb2s.credencia() == true){
                    System.out.println("Sua SpeedBike foi selecionada para o Campeonato");
                }else{
                    System.out.println("Você não foi convocado para o Campeonato!");
                }
            }
            
    }
}