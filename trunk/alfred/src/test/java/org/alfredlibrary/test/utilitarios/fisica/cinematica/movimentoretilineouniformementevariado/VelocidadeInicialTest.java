/*
 *  This file is part of Alfred Library.
 *
 *  Alfred Library is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  Alfred Library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with Alfred Library.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.alfredlibrary.test.utilitarios.fisica.cinematica.movimentoretilineouniformementevariado;

import junit.framework.Assert;

import org.alfredlibrary.AlfredException;
import org.alfredlibrary.utilitarios.fisica.cinematica.movimentoretilineouniformementevariado.VelocidadeInicial;
import org.junit.Test;

/**
 * Classe de Teste para o Utilitário VelocidadeInicial.
 * 
 * @author Rodrigo Moreira Fagundes
 * @since 27/05/2010
 */
public class VelocidadeInicialTest {
	
	@Test
	public void calcular() {
		Assert.assertEquals(5d, VelocidadeInicial.calcular(9d, 2d, 2d));
		Assert.assertEquals(5d, VelocidadeInicial.calcular(15d, 1d, 2d, 2d));
	}
	
	@Test
	public void calcularDivisaoPorZero() {
		try {
			VelocidadeInicial.calcular(15d, 1d, 0d, 2d);
			Assert.fail();
		} catch (AlfredException ae) {	
		}
	}
	
}