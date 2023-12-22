package aplicacion;

public class App18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][]mat= {{4,14,15,1},{9,7,6,12},{5,11,10,8},{16,2,3,13}};//matriz normal
		//int[][]mat= {{24,10,15,1},{9,17,26,12},{15,1,10,8},{36,12,1,23}};//matriz magica
		int sumaRow1=0,sumaRow2=0,sumaRow3=0,sumaRow4=0,sumaCol1=0,sumaCol2=0,sumaCol3=0,sumaCol4=0;
		for(int i=0;i<mat.length;i++) {
			int aux=0;
			for(int j=0;j<mat[i].length;j++) {
				aux+=mat[i][j];
			}
			if(i==0) {
				sumaRow1=aux;
			}else if(i==1) {
				sumaRow2=aux;
			}else if(i==2) {
				sumaRow3=aux;
			}else {
				sumaRow4=aux;
			}
		}
		
		
		//int numVueltas=0;
		//while(numVueltas<4) {
			for(int i=0;i<mat.length;i++) {
				for(int j=0;j<mat[i].length;j++) {
					int aux=mat[i][j];
					if(j==0) {
						sumaCol1+=aux;
					}else if(j==1) {
						sumaCol2+=aux;
					}else if(j==2) {
						sumaCol3+=aux;
					}else {
						sumaCol4+=aux;
					}
				//}
				
				
			}
		}
			
			if(sumaRow1==sumaRow2 && sumaRow2==sumaRow3 && sumaRow3==sumaRow4 && sumaRow4==sumaCol1
					&& sumaCol1==sumaCol2 && sumaCol2==sumaCol3 && sumaCol3==sumaCol4) {
				System.out.println("ES UNA MATRIZ MAGICA");
			}else {
				System.out.println("NO ES UNA MATRIZ MAGICA");
			}
	}

}
