
//entidad cuenta
class Cuenta{
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	//Metodo que no retorna valor (con la palabra void)
	public void deposita(double valor){
		//this.saldo = this.saldo + valor;  //Otra forma de incrementar una variable
		this.saldo += valor;

	}
	//Retorna valor (sin la palabra void)
	public boolean retirar(double valor) {
		if (this.saldo >= valor){
			//this.saldo = this.saldo-valor; //Otra forma de incrementar una variable
			this.saldo -= valor;
			return true;	
 		}else {
			return false;
			
		}
	}
	
	public boolean transferir(double valor, Cuenta cuenta){
		if (this.saldo >= valor){
			this.saldo = this.saldo-valor;
			cuenta.deposita(valor);
			return true;	
 		}else {
			return false;
			
		}
	}
}
