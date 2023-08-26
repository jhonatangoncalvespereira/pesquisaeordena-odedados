public class FuncoesProcedimentos{
    //Função para calcular o valor do procedimento.
    public static void main(String[] args) {
        System.out.println(new FuncoesProcedimentos().funcao());
        new FuncoesProcedimentos().precedimento();
    }
    public String funcao(){
        return "Olá, sou uma função";
    }

    public void precedimento(){
        System.out.println("Olá, sou um procedimento");
    }
}