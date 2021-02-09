package convinaciones;

import org.junit.Test;
import org.junit.Assert;

public class PruebaCombinaciones {
	Convinaciones convi;
	
	@Test
	public void pruebaCon1Escalones(){
		convi = new Convinaciones();
		int posiblesCaminos = convi.convinacionesPosibles(1);
		String[] convinaciones = convi.tiposDeConvinaciones(1);
		
		Assert.assertEquals(1,posiblesCaminos);
		Assert.assertEquals("Subir 1 escalón",convinaciones[0]);
		
	}
	@Test
	public void pruebaCon2Escalones(){
		convi = new Convinaciones();
		int posiblesCaminos = convi.convinacionesPosibles(2);
		String[] convinaciones = convi.tiposDeConvinaciones(2);
		
		Assert.assertEquals(2,posiblesCaminos);
		Assert.assertEquals("Subir 1 escalón + Subir 1 escalón",convinaciones[0]);
		Assert.assertEquals("Subir 2 escalones",convinaciones[1]);
		
	}
	@Test
	public void pruebaCon3Escalones(){
		convi = new Convinaciones();
		int posiblesCaminos = convi.convinacionesPosibles(3);
		String[] convinaciones = convi.tiposDeConvinaciones(3);
		
		Assert.assertEquals(3,posiblesCaminos);
		Assert.assertEquals("Subir 1 escalón + Subir 1 escalón + Subir 1 escalón",convinaciones[0]);
		Assert.assertEquals("Subir 2 escalones + Subir 1 escalón",convinaciones[1]);
		Assert.assertEquals("Subir 1 escalón + Subir 2 escalones",convinaciones[2]);
		
	}
	@Test
	public void pruebaCon4Escalones(){
		convi = new Convinaciones();
		int posiblesCaminos = convi.convinacionesPosibles(4);
		String[] convinaciones = convi.tiposDeConvinaciones(4);
		
		Assert.assertEquals(5,posiblesCaminos);
		Assert.assertEquals("Subir 1 escalón + Subir 1 escalón + Subir 1 escalón + Subir 1 escalón",convinaciones[0]);
		Assert.assertEquals("Subir 2 escalones + Subir 1 escalón + Subir 1 escalón",convinaciones[1]);
		Assert.assertEquals("Subir 1 escalón + Subir 2 escalones + Subir 1 escalón",convinaciones[2]);
		Assert.assertEquals("Subir 1 escalón + Subir 1 escalón + Subir 2 escalones",convinaciones[3]);
		Assert.assertEquals("Subir 2 escalones + Subir 2 escalones",convinaciones[4]);
		
	}
	@Test
	public void pruebaCon5Escalones(){
		convi = new Convinaciones();
		int posiblesCaminos = convi.convinacionesPosibles(5);
		String[] convinaciones = convi.tiposDeConvinaciones(5);
		
		Assert.assertEquals(8,posiblesCaminos);
		Assert.assertEquals("Subir 1 escalón + Subir 1 escalón + Subir 1 escalón + Subir 1 escalón + Subir 1 escalón",convinaciones[0]);
		Assert.assertEquals("Subir 2 escalones + Subir 1 escalón + Subir 1 escalón + Subir 1 escalón",convinaciones[1]);
		Assert.assertEquals("Subir 1 escalón + Subir 2 escalones + Subir 1 escalón + Subir 1 escalón",convinaciones[2]);
		Assert.assertEquals("Subir 1 escalón + Subir 1 escalón + Subir 2 escalones + Subir 1 escalón",convinaciones[3]);
		Assert.assertEquals("Subir 1 escalón + Subir 1 escalón + Subir 1 escalón + Subir 2 escalones",convinaciones[4]);
		Assert.assertEquals("Subir 2 escalones + Subir 2 escalones + Subir 1 escalón",convinaciones[5]);
		Assert.assertEquals("Subir 2 escalones + Subir 1 escalón + Subir 2 escalones",convinaciones[6]);
		Assert.assertEquals("Subir 1 escalón + Subir 2 escalones + Subir 2 escalones",convinaciones[7]);
		
	}
	@Test
	public void pruebaCon6Escalones(){
		convi = new Convinaciones();
		int posiblesCaminos = convi.convinacionesPosibles(6);
		String[] convinaciones = convi.tiposDeConvinaciones(6);
		
		Assert.assertEquals(13,posiblesCaminos);
		Assert.assertEquals("Subir 1 escalón + Subir 1 escalón + Subir 1 escalón + Subir 1 escalón + Subir 1 escalón + Subir 1 escalón",convinaciones[0]);
		Assert.assertEquals("Subir 2 escalones + Subir 1 escalón + Subir 1 escalón + Subir 1 escalón + Subir 1 escalón",convinaciones[1]);
		Assert.assertEquals("Subir 1 escalón + Subir 2 escalones + Subir 1 escalón + Subir 1 escalón + Subir 1 escalón",convinaciones[2]);
		Assert.assertEquals("Subir 1 escalón + Subir 1 escalón + Subir 2 escalones + Subir 1 escalón + Subir 1 escalón",convinaciones[3]);
		Assert.assertEquals("Subir 1 escalón + Subir 1 escalón + Subir 1 escalón + Subir 2 escalones + Subir 1 escalón",convinaciones[4]);
		Assert.assertEquals("Subir 1 escalón + Subir 1 escalón + Subir 1 escalón + Subir 1 escalón + Subir 2 escalones",convinaciones[5]);
		Assert.assertEquals("Subir 2 escalones + Subir 2 escalones + Subir 1 escalón + Subir 1 escalón",convinaciones[6]);
		Assert.assertEquals("Subir 2 escalones + Subir 1 escalón + Subir 2 escalones + Subir 1 escalón",convinaciones[7]);
		Assert.assertEquals("Subir 2 escalones + Subir 1 escalón + Subir 1 escalón + Subir 2 escalones",convinaciones[8]);
		Assert.assertEquals("Subir 1 escalón + Subir 2 escalones + Subir 2 escalones + Subir 1 escalón",convinaciones[9]);
		Assert.assertEquals("Subir 1 escalón + Subir 2 escalones + Subir 1 escalón + Subir 2 escalones",convinaciones[10]);
		Assert.assertEquals("Subir 1 escalón + Subir 1 escalón + Subir 2 escalones + Subir 2 escalones",convinaciones[11]);
		Assert.assertEquals("Subir 2 escalones + Subir 2 escalones + Subir 2 escalones",convinaciones[12]);
		
	}
	@Test
	public void pruebaCon7Escalones(){
		convi = new Convinaciones();
		int posiblesCaminos = convi.convinacionesPosibles(7);
		String[] convinaciones = convi.tiposDeConvinaciones(7);
		
		Assert.assertEquals(21,posiblesCaminos);
		Assert.assertEquals("Subir 1 escalón + Subir 1 escalón + Subir 1 escalón + Subir 1 escalón + Subir 1 escalón + Subir 1 escalón + Subir 1 escalón",convinaciones[0]);
		Assert.assertEquals("Subir 2 escalones + Subir 1 escalón + Subir 1 escalón + Subir 1 escalón + Subir 1 escalón + Subir 1 escalón",convinaciones[1]);
		Assert.assertEquals("Subir 1 escalón + Subir 2 escalones + Subir 1 escalón + Subir 1 escalón + Subir 1 escalón + Subir 1 escalón",convinaciones[2]);
		Assert.assertEquals("Subir 1 escalón + Subir 1 escalón + Subir 2 escalones + Subir 1 escalón + Subir 1 escalón + Subir 1 escalón",convinaciones[3]);
		Assert.assertEquals("Subir 1 escalón + Subir 1 escalón + Subir 1 escalón + Subir 2 escalones + Subir 1 escalón + Subir 1 escalón",convinaciones[4]);
		Assert.assertEquals("Subir 1 escalón + Subir 1 escalón + Subir 1 escalón + Subir 1 escalón + Subir 2 escalones + Subir 1 escalón",convinaciones[5]);
		Assert.assertEquals("Subir 1 escalón + Subir 1 escalón + Subir 1 escalón + Subir 1 escalón + Subir 1 escalón + Subir 2 escalones",convinaciones[6]);
		Assert.assertEquals("Subir 2 escalones + Subir 2 escalones + Subir 1 escalón + Subir 1 escalón + Subir 1 escalón",convinaciones[7]);
		Assert.assertEquals("Subir 2 escalones + Subir 1 escalón + Subir 2 escalones + Subir 1 escalón + Subir 1 escalón",convinaciones[8]);
		Assert.assertEquals("Subir 2 escalones + Subir 1 escalón + Subir 1 escalón + Subir 2 escalones + Subir 1 escalón",convinaciones[9]);
		Assert.assertEquals("Subir 2 escalones + Subir 1 escalón + Subir 1 escalón + Subir 1 escalón + Subir 2 escalones",convinaciones[10]);
		Assert.assertEquals("Subir 1 escalón + Subir 2 escalones + Subir 2 escalones + Subir 1 escalón + Subir 1 escalón",convinaciones[11]);
		Assert.assertEquals("Subir 1 escalón + Subir 2 escalones + Subir 1 escalón + Subir 2 escalones + Subir 1 escalón",convinaciones[12]);
		Assert.assertEquals("Subir 1 escalón + Subir 2 escalones + Subir 1 escalón + Subir 1 escalón + Subir 2 escalones",convinaciones[13]);
		Assert.assertEquals("Subir 1 escalón + Subir 1 escalón + Subir 2 escalones + Subir 2 escalones + Subir 1 escalón",convinaciones[14]);
		Assert.assertEquals("Subir 1 escalón + Subir 1 escalón + Subir 2 escalones + Subir 1 escalón + Subir 2 escalones",convinaciones[15]);
		Assert.assertEquals("Subir 1 escalón + Subir 1 escalón + Subir 1 escalón + Subir 2 escalones + Subir 2 escalones",convinaciones[16]);
		Assert.assertEquals("Subir 2 escalones + Subir 2 escalones + Subir 2 escalones + Subir 1 escalón",convinaciones[17]);
		Assert.assertEquals("Subir 2 escalones + Subir 2 escalones + Subir 1 escalón + Subir 2 escalones",convinaciones[18]);
		Assert.assertEquals("Subir 2 escalones + Subir 1 escalón + Subir 2 escalones + Subir 2 escalones",convinaciones[19]);
		Assert.assertEquals("Subir 1 escalón + Subir 2 escalones + Subir 2 escalones + Subir 2 escalones",convinaciones[20]);
	}
	@Test
	public void pruebaCon8Escalones(){
		convi = new Convinaciones();
		int posiblesCaminos = convi.convinacionesPosibles(8);
		String[] convinaciones = convi.tiposDeConvinaciones(8);

		Assert.assertEquals(34,posiblesCaminos);
		Assert.assertEquals("Subir 1 escalón + Subir 1 escalón + Subir 1 escalón + Subir 1 escalón + Subir 1 escalón + Subir 1 escalón + Subir 1 escalón + Subir 1 escalón",convinaciones[0]);
		Assert.assertEquals("Subir 2 escalones + Subir 1 escalón + Subir 1 escalón + Subir 1 escalón + Subir 1 escalón + Subir 1 escalón + Subir 1 escalón",convinaciones[1]);
		Assert.assertEquals("Subir 1 escalón + Subir 2 escalones + Subir 1 escalón + Subir 1 escalón + Subir 1 escalón + Subir 1 escalón + Subir 1 escalón",convinaciones[2]);
		Assert.assertEquals("Subir 1 escalón + Subir 1 escalón + Subir 2 escalones + Subir 1 escalón + Subir 1 escalón + Subir 1 escalón + Subir 1 escalón",convinaciones[3]);
		Assert.assertEquals("Subir 1 escalón + Subir 1 escalón + Subir 1 escalón + Subir 2 escalones + Subir 1 escalón + Subir 1 escalón + Subir 1 escalón",convinaciones[4]);
		Assert.assertEquals("Subir 1 escalón + Subir 1 escalón + Subir 1 escalón + Subir 1 escalón + Subir 2 escalones + Subir 1 escalón + Subir 1 escalón",convinaciones[5]);
		Assert.assertEquals("Subir 1 escalón + Subir 1 escalón + Subir 1 escalón + Subir 1 escalón + Subir 1 escalón + Subir 2 escalones + Subir 1 escalón",convinaciones[6]);
		Assert.assertEquals("Subir 1 escalón + Subir 1 escalón + Subir 1 escalón + Subir 1 escalón + Subir 1 escalón + Subir 1 escalón + Subir 2 escalones",convinaciones[7]);
		Assert.assertEquals("Subir 2 escalones + Subir 2 escalones + Subir 1 escalón + Subir 1 escalón + Subir 1 escalón + Subir 1 escalón",convinaciones[8]);
		Assert.assertEquals("Subir 2 escalones + Subir 1 escalón + Subir 2 escalones + Subir 1 escalón + Subir 1 escalón + Subir 1 escalón",convinaciones[9]);
		Assert.assertEquals("Subir 2 escalones + Subir 1 escalón + Subir 1 escalón + Subir 2 escalones + Subir 1 escalón + Subir 1 escalón",convinaciones[10]);
		Assert.assertEquals("Subir 2 escalones + Subir 1 escalón + Subir 1 escalón + Subir 1 escalón + Subir 2 escalones + Subir 1 escalón",convinaciones[11]);
		Assert.assertEquals("Subir 2 escalones + Subir 1 escalón + Subir 1 escalón + Subir 1 escalón + Subir 1 escalón + Subir 2 escalones",convinaciones[12]);
		Assert.assertEquals("Subir 1 escalón + Subir 2 escalones + Subir 2 escalones + Subir 1 escalón + Subir 1 escalón + Subir 1 escalón",convinaciones[13]);
		Assert.assertEquals("Subir 1 escalón + Subir 2 escalones + Subir 1 escalón + Subir 2 escalones + Subir 1 escalón + Subir 1 escalón",convinaciones[14]);
		Assert.assertEquals("Subir 1 escalón + Subir 2 escalones + Subir 1 escalón + Subir 1 escalón + Subir 2 escalones + Subir 1 escalón",convinaciones[15]);
		Assert.assertEquals("Subir 1 escalón + Subir 2 escalones + Subir 1 escalón + Subir 1 escalón + Subir 1 escalón + Subir 2 escalones",convinaciones[16]);
		Assert.assertEquals("Subir 1 escalón + Subir 1 escalón + Subir 2 escalones + Subir 2 escalones + Subir 1 escalón + Subir 1 escalón",convinaciones[17]);
		Assert.assertEquals("Subir 1 escalón + Subir 1 escalón + Subir 2 escalones + Subir 1 escalón + Subir 2 escalones + Subir 1 escalón",convinaciones[18]);
		Assert.assertEquals("Subir 1 escalón + Subir 1 escalón + Subir 2 escalones + Subir 1 escalón + Subir 1 escalón + Subir 2 escalones",convinaciones[19]);
		Assert.assertEquals("Subir 1 escalón + Subir 1 escalón + Subir 1 escalón + Subir 2 escalones + Subir 2 escalones + Subir 1 escalón",convinaciones[20]);
		Assert.assertEquals("Subir 1 escalón + Subir 1 escalón + Subir 1 escalón + Subir 2 escalones + Subir 1 escalón + Subir 2 escalones",convinaciones[21]);
		Assert.assertEquals("Subir 1 escalón + Subir 1 escalón + Subir 1 escalón + Subir 1 escalón + Subir 2 escalones + Subir 2 escalones",convinaciones[22]);
		Assert.assertEquals("Subir 2 escalones + Subir 2 escalones + Subir 2 escalones + Subir 1 escalón + Subir 1 escalón",convinaciones[23]);
		Assert.assertEquals("Subir 2 escalones + Subir 2 escalones + Subir 1 escalón + Subir 2 escalones + Subir 1 escalón",convinaciones[24]);
		Assert.assertEquals("Subir 2 escalones + Subir 2 escalones + Subir 1 escalón + Subir 1 escalón + Subir 2 escalones",convinaciones[25]);
		Assert.assertEquals("Subir 2 escalones + Subir 1 escalón + Subir 2 escalones + Subir 2 escalones + Subir 1 escalón",convinaciones[26]);
		Assert.assertEquals("Subir 2 escalones + Subir 1 escalón + Subir 2 escalones + Subir 1 escalón + Subir 2 escalones",convinaciones[27]);
		Assert.assertEquals("Subir 2 escalones + Subir 1 escalón + Subir 1 escalón + Subir 2 escalones + Subir 2 escalones",convinaciones[28]);
		Assert.assertEquals("Subir 1 escalón + Subir 2 escalones + Subir 2 escalones + Subir 2 escalones + Subir 1 escalón",convinaciones[29]);
		Assert.assertEquals("Subir 1 escalón + Subir 2 escalones + Subir 2 escalones + Subir 1 escalón + Subir 2 escalones",convinaciones[30]);
		Assert.assertEquals("Subir 1 escalón + Subir 2 escalones + Subir 1 escalón + Subir 2 escalones + Subir 2 escalones",convinaciones[31]);
		Assert.assertEquals("Subir 1 escalón + Subir 1 escalón + Subir 2 escalones + Subir 2 escalones + Subir 2 escalones",convinaciones[32]);
		Assert.assertEquals("Subir 2 escalones + Subir 2 escalones + Subir 2 escalones + Subir 2 escalones",convinaciones[33]);

	}
}

