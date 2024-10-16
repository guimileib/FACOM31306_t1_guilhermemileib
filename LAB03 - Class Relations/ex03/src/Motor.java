class Motor {
    private String tipo;

    public Motor(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void ligar() {
        System.out.println("O motor do tipo " + tipo + " está ligado.");
    }

    public void desligar() {
        System.out.println("O motor do tipo " + tipo + " está desligado.");
    }
}

