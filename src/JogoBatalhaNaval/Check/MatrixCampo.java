package JogoBatalhaNaval.Check;

import JogoBatalhaNaval.LoadMap;

public class MatrixCampo {
	
	public static boolean[][] matrixBoolean = new boolean[15][15];
	public static boolean[][] matrixBooleanPress = new boolean[15][15];
	
	public static boolean[][] matrixBooleanExplode = new boolean[15][15];
	public static boolean[][] matrixBooleanSemiExplode = new boolean[15][15];
	public static boolean[][] matrixBooleanExplodeBarco = new boolean[15][15];
	public static boolean[][] matrixBooleanAgua = new boolean[15][15];
	
	public static int[][] matrixInt = new int[15][15];
	
	
	public static void InitCampoMatrix() {
		converterMatrixtoInt();
		matrixStringToBoolean();
	}
	
	public static boolean getMatrixBoolean(int x,int y) {
		return matrixBoolean[x][y];
	}
	
	public static void setMatrixBooleanPress(int x,int y) {
		matrixBooleanPress[x][y] = true;
	}
	public static boolean getMatrixBooleanPress(int x,int y) {
		return matrixBooleanPress[x][y];
	}
	
	public static int getMatrixInt(int x,int y) {
		return matrixInt[x][y];
	}
	
	public static void matrixStringToBoolean() {
		System.out.println("");
		int x=0,y=0;
		
		while(x<Integer.parseInt(LoadMap.altura)) {
			while(y < Integer.parseInt(LoadMap.largura)) {
				
				if(Integer.parseInt(LoadMap.matrix[x][y])!=0) {
					System.out.print("T");
					matrixBoolean[x][y] = true;
				}else {
					System.out.print("F");
					matrixBoolean[x][y] = false;
				}
				y++;
			}
			x++;
			y=0;
			System.out.println("");
		}
	}
	
	public static void converterMatrixtoInt() {
		System.out.println("");
		int x=0,y=0;
		
		while(x<Integer.parseInt(LoadMap.altura)) {
			while(y < Integer.parseInt(LoadMap.largura)) {
				matrixInt[x][y] = Integer.parseInt(LoadMap.matrix[x][y]);
				y++;
			}
			x++;
			y=0;
		}
	}

	public static void setMatrixBooleanExplode(int j, int i) {
		
		
	}

	public static void setMatrixBooleanAgua(int j, int i) {
		
		
	}

	public static void setMatrixBooleanSemiExplode(int j, int i) {
		
		
	}

	public static void setMatrixBooleanExplodeBarco(int j, int i) {
		
		
	}

}
