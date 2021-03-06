package enumeracoes;

enum Coin {
    PENNY(1), NICKEL(5), DIME(10), QUARTER(25);
	
	private final int value;
	
	Coin(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
}

public class CoinTest {
	public static void main(String[] args) {
		Coin c = Coin.valueOf("NICKEL");
		
		System.out.println(c + " vale " + c.getValue() + " centavos");
	}

}
