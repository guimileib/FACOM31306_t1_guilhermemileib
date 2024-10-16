class Carro {
    private String marca;
    private Motor motor; // Composição: O carro "tem um" motor

    public Carro(String marca, String tipoMotor) {
        this.marca = marca;
        this.motor = new Motor(tipoMotor); // O motor é criado junto com o carro
    }

    public void ligarCarro() {
        System.out.println("Carro da marca " + marca + " está ligando.");
        motor.ligar();
    }

    public void desligarCarro() {
        System.out.println("Carro da marca " + marca + " está desligando.");
        motor.desligar();
    }
}