package quiz.sub;

public class brigde implements videoDesc, videoDescLan, videoTradLan{

	@Override
	public void TraducirLenguajeVideo() {
		System.out.println("Traduccion de lenguaje de video");
		
	}

	@Override
	public void videoDescripLang() {
		System.out.println("Descripción de lenguaje de video");
		
	}

	@Override
	public void videoDescription() {
		System.out.println("Descripcion de video");
		
	}
	
}
