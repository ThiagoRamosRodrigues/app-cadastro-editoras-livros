public class AppLivraria {

	public static void main(String[] args) {

		Genero genero1 = new Genero(1, "Didatico");
		Genero genero2 = new Genero(2, "Policial");
		Genero genero3 = new Genero(3, "Romance");
		
		Editora editora1 = new Editora(1, "Saraiva", "Zezinho", "São Paulo", "SP");
		Editora editora2 = new Editora(2, "Daqui", "Dindo", "Olinda", "PE");
		
		Livro livro1 = new Livro(1000, "A Morte Morrida", "abc-123", 80, genero2, editora1);
		Livro livro2 = new Livro(1001, "A princesinha", "sss-333", 40, genero3, editora2);
		Livro livro3 = new Livro(1002, "A Coisa que desapareceu", "ttt-333", 40, genero1, editora1);
		Livro livro4 = new Livro(1003, "Ela e Eu", "sss-444", 120, genero3, editora1);
		Livro livro5 = new Livro(1004, "O valor", "yyy-666", 100, genero1, editora2);
		
		mostrarLivro(livro1);
		mostrarLivro(livro2);
		mostrarLivro(livro3);
		mostrarLivro(livro4);
		mostrarLivro(livro5);
		
		
		

	}

	private static void mostrarLivro(Livro livro) {
		
		System.out.println("\nTitulo do livro:" + livro.getTitulo());
		System.out.println("Nome do gênero :" + livro.getGenero().getNomeGenero());
		System.out.println("Razão Social   :" + livro.getEditora().getRazaoSocial());
		System.out.println("Cidade         :" + livro.getEditora().getCidade());
		
	}
	
}
