package convinaciones;

public class Convinaciones {
	/*calcula cuantas son las convinaciones posibles de subir una escalera
	pre: se pasan las cantidad de escalones que se quieren subir
	post: devuelve la cantidad de posibles formas de subir	
	*/
	public int convinacionesPosibles(int escalonesASubir){
		int convinaciones = 0;
		int anterior = 0;
		int actual = 1;
		for(int i =0;i<escalonesASubir; i++){
			convinaciones = anterior + actual;
			anterior = actual;
			actual = convinaciones;
		}
		return convinaciones;
    }
	
	/*calcula cuales son las conbinaciones posibles formas de subir una escalera
	pre: se pasan las cantidad de escalones que se quieren subir
	post: devuelve un array con las posibles convinaciones de subir una escalera	
	*/
	public String[] tiposDeConvinaciones(int escalonesASubir){
		//se crean variables que almacenan las convinaciones posibles
		int convinaciones =  convinacionesPosibles(escalonesASubir);
		
		//se crean variables que almacena las convinaciones encontradas
		int convinacion = 0;
		
		//se crean un array de Sting, que posee la misma extencion que las convinaciones, que guardara las respuestas encontradas
		String[] respuestas = new String[convinaciones];
		
		//se inicializa el array de respuestas  
		respuestas = limpiarArray(respuestas);
		
		//se crean un array de enteros que posee los ecalones
		int[] escalones = new int[escalonesASubir];
		
		//se inicializa los escalones
		escalones = inicializarEscalones1(escalones);

		//se almacena la primaera convinacion de todos 1 y se suma una convinacion
		respuestas = escribirRespuesta(respuestas,convinacion,escalones,escalonesASubir);
		convinacion++;
		
		//se busca la cantidad maxima de 2 que puede poseer el array
		int CantMax2 = (escalonesASubir/2);
		
		for(int cant2 = 0; cant2< CantMax2; cant2++){
			
			//crea una varible que almacene la vuelta con la cantidad de 2
			int vuelta =0;
			
			//calcula la cantidad de escalones que faltan
			int escalonesRestantes = escalonesASubir-cant2-1;
			
			//se crea una array de enteros para la ubicacion de los 2
			int[] ubicacionDe2= new int[cant2+1];
			
			int s = 0; 
			
			int acomodar2 = escalonesRestantes - (cant2 +2);
			
			do{
				boolean cancelarVuelta = false;

				escalonesRestantes = escalonesASubir-(cant2+1);
				
				//inicializa los escalones con el valor 1
				escalones = inicializarEscalones1(escalones);

				//agrega tantos 0 como cantidad de 2
				escalones = sacar0(escalones, escalonesRestantes);
				
				boolean cancelarBusqueda = false;
				
				boolean ultimaPosicion = false;
				
				//se obtiene la posicion del ultimo 2
				if(escalones[ubicacionDe2[0]+1]==0) {
					for(int y = 0; y < cant2 && !cancelarBusqueda; y++) {
						if(ubicacionDe2[0]-y==ubicacionDe2[y]) {
							ultimaPosicion = true;
						}else {
							cancelarBusqueda = true;
							ultimaPosicion = false;
						}
					}
				}
				
				if(ultimaPosicion && !(ubicacionDe2[cant2] == ubicacionDe2[cant2-1]-2)){
					for(int w = 0; w<cant2;w++) {
						ubicacionDe2[w]=ubicacionDe2[w]-acomodar2;
					}
					acomodar2--;
					vuelta--;
				}else {
					ubicacionDe2[0] = cant2+vuelta+s;
				}
				
				escalones[ubicacionDe2[0]] = 2;
				
				//cargar los 2 restantes
				boolean desactivar = false;
											
				for(int cargar2 = 1;cargar2<cant2+1;cargar2++){
					if(vuelta==0) {
						ubicacionDe2[cargar2] = cant2-cargar2;
						escalones[ubicacionDe2[cargar2]]= 2;
					}
					if(escalones[(ubicacionDe2[cargar2])+1]==1 && vuelta>0 && !desactivar) {
						ubicacionDe2[cargar2]++;
						escalones[ubicacionDe2[cargar2]]=2;
						desactivar = true;
					}else {
						escalones[ubicacionDe2[cargar2]]=2;
					}
					
				}
				int movimientoDeUltimo2 = 0;
				if(ubicacionDe2[0]>=escalonesRestantes && cant2>1
						&& escalones[0]==1 && ubicacionDe2[1]==escalonesRestantes-1-1) {
					ubicacionDe2[0]=escalonesRestantes-1;
					s--;
					s--;
					escalones[ubicacionDe2[0]]=2;
				}
				
				//imprime las respuestas posibles en base a la posicion de los 2 y 
				//moviendo el ultimo 2 hasta la ultima posicion distinta de 0 
				
				for(int ultimo2 = ubicacionDe2[0]; ultimo2<escalonesRestantes ;ultimo2++){

					escalones[ultimo2] = 2;
					respuestas = escribirRespuesta(respuestas,convinacion,escalones,escalonesRestantes);
					convinacion++;
					if(!(escalonesRestantes-1 == ultimo2)) {
						escalones[ultimo2]=1;
					}
					movimientoDeUltimo2++;
				}
				movimientoDeUltimo2--;
				
				//cantDe2alFinal = cuenta la cantidad de 2 seguidos que hay al final de los escalones restantes
				// por lo que la cantDe2alFinal obtiene el 2 que esta mas serca de la posicion final
				int cantDe2alFinal = 0;
				while(escalones[ubicacionDe2[0]+1]==0 && 
						ubicacionDe2[0]-cantDe2alFinal == ubicacionDe2[cantDe2alFinal] &&
						escalonesASubir>cantDe2alFinal && cant2>1 &&
						convinacion != convinaciones && 
						cantDe2alFinal<cant2) {
					cantDe2alFinal++;
				}
				
				//calcelarVuelta bloquea que las vueltas no se paseen de lo que pueden ser
				if(cantDe2alFinal>0 && ubicacionDe2[cantDe2alFinal]+2 == ubicacionDe2[cantDe2alFinal-1]) {
					cancelarVuelta = true;
				}else if(cantDe2alFinal==0 && cant2>1 && escalonesRestantes > 3 && 
						ubicacionDe2[0]+movimientoDeUltimo2-2 == ubicacionDe2[1]){
					cancelarVuelta = true;
					vuelta++;
				}
				
				if(!cancelarVuelta) {
					vuelta++;
				}
				
			}while(MaximasConvinacionesPorCant2(cant2, escalones, escalonesRestantes, ubicacionDe2 ) &&
					convinacion<convinaciones);
		}
		return respuestas;
	}
	
	//mira si hay mas convinaciones en base a la cantidad de 2 que hay y si es la primera vuelta
	private boolean MaximasConvinacionesPorCant2(int cant2, int[] escalones, int escalonesRestantes, int[] ubicacionDe2) {
		boolean hayMasConvinaciones = true;
		boolean[] resultadoDeVuelta = obtenerSiEsPrimeraVuelta(escalones,hayMasConvinaciones);
		boolean esPrimeraVuelta = resultadoDeVuelta[0];
		hayMasConvinaciones = resultadoDeVuelta[1];
		boolean detener = false;
		if(escalones[escalonesRestantes-1]==2 && !esPrimeraVuelta ) {
			for(int i = 1; i<(cant2+2) && !detener;i++) {
				if (escalones[escalonesRestantes-i]==2) {
					hayMasConvinaciones = false;
				}else {
					hayMasConvinaciones = true;
					detener = true;
				}
			}
		}
		return hayMasConvinaciones;
	}
	
	//obtine si es la primera vuelta y si existen mas convinaciones
	private boolean[] obtenerSiEsPrimeraVuelta(int[] escalones, boolean hayMasConvinaciones) {
		boolean esPrimeraVuelta = false;
		for(int escalon = 0; (escalon<escalones.length); escalon++ ) {
			if(escalones[escalon]==1) {
				esPrimeraVuelta = true;
				hayMasConvinaciones=false;
			}else {
				esPrimeraVuelta = false;
				hayMasConvinaciones=true;
			}
		}
		boolean[] valoresFinales = new boolean[2];
		valoresFinales[0]=esPrimeraVuelta;
		valoresFinales[1]=hayMasConvinaciones;
		
		return valoresFinales;
	}
	
	//inicializa los escalones en 0 en vase a la cantidad de 2 en la convinacion
	private int[] sacar0(int[] escalones, int escalonesResatantes) {
		for(int i = 0; i < (escalones.length-escalonesResatantes); i++){
			escalones[escalones.length-i-1]=0;
		}
		return escalones;
	}

	//almacena en el array de String la respuesta en base a la combinacion
	private String[] escribirRespuesta(String[] respuestas, int convinacion,
			int[] escalones, int escalonesRestantes) {
		
		/*formas de subir*/
		String subir1 = "Subir 1 escalón";
		String suma = " + ";
		String subir2 = "Subir 2 escalones";
		
		for(int escalon = 0; escalon<escalonesRestantes;escalon++){
			
			if(escalones[escalon] == 1){
				respuestas[convinacion] += subir1;
			} else if(escalones[escalon] == 2){
				respuestas[convinacion] += subir2;
			}
			if(!(escalon==escalonesRestantes-1)){
				respuestas[convinacion] += suma;
			}
		}
		return respuestas;
	}
	
	//inicializa el array de escalones en 1
	private int[] inicializarEscalones1(int[] inicializar){
		for(int i =0; i<inicializar.length; i++){
			inicializar[i] = 1;
		}
		return inicializar;
	}
	
	//inicializa el array de respuestas de tipo String
	private String[] limpiarArray(String[] limpiar){
		for(int i =0; i<limpiar.length; i++){
			limpiar[i] = "";
		}
		return limpiar;
	}
	
	
}
