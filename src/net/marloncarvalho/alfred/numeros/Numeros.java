package net.marloncarvalho.alfred.numeros;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Utilit�rios para N�meros.
 * 
 * @author Marlon Silva Carvalho
 * @since 02/06/2009
 * @deprecated
 */
@Deprecated
final public class Numeros {

	/**
	 * Verificar se o n�mero da String � um N�mero.
	 * 
	 * @param numero N�mero.
	 * @return Verdadeiro caso seja N�mero. Falso, caso contr�rio.
	 */
	public static boolean isNumber(String numero) {
		try {
			return isBigDecimal(numero);
		} catch (RuntimeException exception) {
			return false;
		}
	}

	/**
	 * Verificar se o n�mero da String � um Short.
	 * 
	 * @param numero N�mero.
	 * @return Verdadeiro caso seja Short. Falso, caso contr�rio.
	 */
	public static boolean isShort(String numero) {
		try {
			Short.valueOf(numero);
			return true;
		} catch (RuntimeException exception) {
			return false;
		}
	}

	/**
	 * Verificar se o n�mero da String � um inteiro.
	 * 
	 * @param numero N�mero.
	 * @return Verdadeiro caso seja inteiro. Falso, caso contr�rio.
	 */
	public static boolean isInteger(String numero) {
		try {
			Long.valueOf(numero);
			return true;
		} catch (RuntimeException exception) {
			return false;
		}
	}

	/**
	 * Verificar se o n�mero da String � um Double.
	 * 
	 * @param numero N�mero.
	 * @return Verdadeiro caso seja Double. Falso, caso contr�rio.
	 */
	public static boolean isDouble(String numero) {
		try {
			Double.valueOf(numero);
			return true;
		} catch (RuntimeException exception) {
			return false;
		}
	}

	/**
	 * Verificar se o n�mero da String � um Float.
	 * 
	 * @param numero N�mero.
	 * @return Verdadeiro caso seja Float. Falso, caso contr�rio.
	 */
	public static boolean isFloat(String numero) {
		try {
			Float.valueOf(numero);
			return true;
		} catch (RuntimeException exception) {
			return false;
		}
	}

	/**
	 * Verificar se o n�mero da String � um BigDecimal.
	 * 
	 * @param numero N�mero.
	 * @return Verdadeiro caso seja BigDecimal. Falso, caso contr�rio.
	 */
	public static boolean isBigDecimal(String numero) {
		try {
			new BigDecimal(numero);
			return true;
		} catch (RuntimeException exception) {
			return false;
		}
	}

	/**
	 * Verificar se o n�mero da String � um Long.
	 * 
	 * @param numero N�mero.
	 * @return Verdadeiro caso seja Long. Falso, caso contr�rio.
	 */
	public static boolean isLong(String numero) {
		try {
			Long.valueOf(numero);
			return true;
		} catch (RuntimeException exception) {
			return false;
		}
	}

	/**
	 * Obter uma String contendo os n�meros primos at� 'numero' seperados por espa�o.
	 * 
	 * @param numero 
	 * @return N�meros primos separados por espa�o.
	 */
	public static String obterNumerosPrimosAte(int numero) {
		StringBuilder sb = new StringBuilder();
		for(int i=2;i<=numero;i++) {
			BigInteger bigInteger = BigInteger.valueOf(i);
			if ( bigInteger.isProbablePrime(100) ) {
				sb.append(bigInteger);
				sb.append(" ");
			}
		}
		return sb.toString().trim();
	}

}