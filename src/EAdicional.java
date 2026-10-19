/** 
 * MIT License
 *
 * Copyright(c) 2026 João Caram <caram@pucminas.br>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 * 
 * @author João Caram @joaocaram (caram@pucminas.br)
 * Utilização do @Copilot para geração da documentação JavaDoc (revisada para a atividade)
 * 
*/

/**
 * Enumeração dos adicionais disponíveis para venda junto ao ingresso.
 *
 * <p>Cada constante representa um item adicional e seu respectivo valor base.</p>
 */
public enum EAdicional {
	PIPOCA(13),
	REFRIGERANTE(10),
	BALDE_ESPECIAL(20);

	private  double valor;

	EAdicional(double preco){
		valor = preco;
	}

	/**
	 * Retorna o valor do adicional.
	 *
	 * @return preço do adicional
	 */
	public double valor(){
		return valor;
	}

	/**
	 * Retorna o nome do adicional em formato amigável para exibição.
	 *
	 * <p>Converte o nome da constante para minúsculas e substitui
	 * sublinhados por espaços.</p>
	 *
	 * @return descrição textual do adicional
	 */
	@Override 
	public String toString(){
		return this.name().toLowerCase().replace("_", " ");
	}
}