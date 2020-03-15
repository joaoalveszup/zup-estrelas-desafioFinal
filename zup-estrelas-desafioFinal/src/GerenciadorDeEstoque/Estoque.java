package GerenciadorDeEstoque;

import java.io.IOException;
import java.util.List;

public interface Estoque {
	public void alteraPrecoProdutos(float percentagem, boolean aumenta);

	public boolean cadstroProduto(Produto produto);

	public boolean removeProduto(Integer codigoDeBarras);

	public boolean alteraPrecopoduto(float percentagem, boolean aumentaPreco, int codigoDeBarras);
	
	public Produto consultaProduto(Integer codigoDeBarras) throws Exception;
	
	public List<Produto> listaProdutos();
	
	public boolean gravaListaProdutos() throws IOException;
	
	public int quantidadeProdutos();

	
}
