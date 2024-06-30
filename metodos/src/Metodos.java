public class Metodos {
    //criterio de nomeação de métodos:
    // deve ser nomeado como verbo;
    // seguir o padrão camelCase;

    //<visibilidade> <retorno> <nomeMetodo> (<parametro>){<bloco de comando>}
    public void somar(int n1, int n2){}

    // throws Exception: indica que o método ao ser utilizado pode gerar uma exceção
    public double dividir(int dividendo, int divisor) throws Exception {
        if (divisor == 0) {
            throw new Exception("Divisão por zero não é permitida.");
        }
        return (double) dividendo / divisor;
    }
}