public class Conta {
    private int numero;
    private String agencia;
    private String titular;
    private float saldo;

    public Conta(int numero, String agencia, String titular) {
        this.numero = numero;
        this.agencia = agencia;
        this.titular = titular;
        this.saldo = 0.0f;
    }

    public void depositar(float valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito realizado com sucesso! Novo saldo: " + this.saldo);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(float valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso! Novo saldo: " + this.saldo);
        } else {
            System.out.println("Valor de saque inválido ou saldo insuficiente.");
        }
    }

    public String getResumo() {
        return "Olá " + this.titular + ", obrigado por criar uma conta em nosso banco, sua agência é " +
               this.agencia + ", conta " + this.numero + " e seu saldo atual é de: " + this.saldo;
    }
}
