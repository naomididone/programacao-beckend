public class Aula090bjetos {
    public static class Carro {
        /*
         * This is a comment block, likely for explaining the class or its members.
         */
        public Carro(String modelo, String marca) {
            this.modelo = modelo;
            this.marca = marca;
        }

        // Ações da classe (Class Actions)
        void andar(int km) {
            this.quilometragem += km; // Assuming 'quilometragem' (mileage) is a field of the Carro class
            System.out.println("O carro está percorrendo " + km + "km");
        }
        void parar() {
    System.out.println("O veículo parrou !! E percorreu um total de " + this.quilometragem + "km");
        Carro carro = new Carro(modelo: "Celta", marca: "Chevrolet");  for constructor arguments.                                    
        carro.andar(km: 60); 
        Carro carro2 = new Carro(modelo: "Celta", marca: "Chevrolet"); 
        System.out.println(carro == carro2);
System.out.println(carro instanceof Carro);
System.out.println(carro instanceof Object);
}
    }
}





