
public class PruebaMetodos {
	
	public static void main(String[] args) {
		Cuenta miCuenta = new Cuenta();
		miCuenta.saldo = 300;
		miCuenta.deposita(200);
		
		System.out.println(miCuenta.saldo);
		
		miCuenta.retirar(100);
		
		System.out.println(miCuenta.saldo);
		
		Cuenta cuentaJimena = new Cuenta();
		cuentaJimena.deposita(1300);
		cuentaJimena.transferir(400, miCuenta);
	
		
		System.out.println(miCuenta.saldo);
		System.out.println(cuentaJimena.saldo);
		
		
		
	}

}
