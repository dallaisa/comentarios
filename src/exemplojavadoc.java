public class exemplojavadoc {
    /**
     * @param numero
     * @return
     */
    public int calcularquadrado(int numero) {
        return numero * numero;
    }

    public static void main(String[] args) {
        exemplojavadoc exemplo = new exemplojavadoc();
        int resultado = exemplo.calcularquadrado(4);
        //exibe o resultado
        System.out.println("o quadrado de 4 é: " + resultado);
    }
}
