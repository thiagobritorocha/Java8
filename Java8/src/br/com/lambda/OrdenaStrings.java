package br.com.lambda;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Thiago","Willian","Elton","Douglas","Miguel");
		
		Comparator<String> comparador = new ComparadorDeStringPorTamanho();
		//Collections.sort(list,comparador);
		list.sort(comparador);
		Consumer<String> consumidor = new ConsumidorDeString();
		list.forEach(consumidor);
		System.out.println(list);
	}
}

class ComparadorDeStringPorTamanho implements Comparator<String> {
	public int compare(String s1, String s2) {
        if(s1.length() < s2.length()) 
            return -1;
        if(s1.length() > s2.length()) 
            return 1;
        return 0;
    }
}

class ConsumidorDeString implements Consumer<String> {
    public void accept(String s) {
        System.out.println(s);
    }
}