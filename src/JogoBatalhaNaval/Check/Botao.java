package JogoBatalhaNaval.Check;

public class Botao {
	private static boolean botaoTiroSimplesPress = false;
	private static boolean botaoTiroLinhaPress = false;
	private static boolean botaoRadar2x2 = false;
	private static boolean botaoTiro2x2 = false;
	
	//Radar 2x2
	public static boolean getBotaoRadar2x2Press() {
		return botaoRadar2x2;
	}
	public static void setBotaoRadar2x2Press(boolean D) {
		botaoRadar2x2 = D;
	}
	//tiro 2x2
	public static boolean getBotaoTiro2x2Press() {
		return botaoTiro2x2;
	}
	public static void setBotaoTiro2x2Press(boolean D) {
		botaoTiro2x2 = D;
	}
	
	//Tiro Simples
	public static void setBotaoTiroSimplesPress(boolean D) {
		botaoTiroSimplesPress = D;
	}
	public static boolean getBotaotiroSimplesPress() {
		return botaoTiroSimplesPress;
	}
	
	//Explodir uma liha
	public static void setBotaoTiroLinhaPress(boolean D) {
		botaoTiroLinhaPress = D;
	}
	public static boolean getBotaotiroLinhaPress() {
		return botaoTiroLinhaPress;
	}
}
