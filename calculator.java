/** класс реализует калькулятор */

public class calculator {
	/** результат вычисления */
	private int result;
	
	/** суммируем аргументы param params - аргументы суммирования */
	public void add(int ...params){
		for (Integer param:params){
			this.result += param;
		}
	}
	/** Получить результат return - результат вычислени */
	public int getResult(){
		return this.result;
	}
	 /** Очистить результат вычисления */
	 public void cleanResult(){
		 this.result = 0;
	 }
}