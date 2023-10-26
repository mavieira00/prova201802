package prova201802;

public class Biscoito {
	String id;
	String cor;
	int preco;
	public Biscoito(String id) {
		this.id = id;
	}
	public boolean equals(Object o) {
		if(o instanceof Biscoito) {
			Biscoito b = (Biscoito) o;
			return id.equals(b.id);
		}
		return false;
	}
	
	public String toString() {
		return id + " " + cor + " " + preco;	
	}
}
