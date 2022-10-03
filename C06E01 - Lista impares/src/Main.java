import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<Integer>();
		for (int i = 1; i <= 100; i++)
			lista.add(i);


//		Iterator<Integer> it = lista.iterator();
//		while (it.hasNext()) {
//			Integer num = it.next();
//			if (num % 2 != 0)
//				System.out.println(num);;
//		}
//		
//		for (int i = 0; i < lista.size(); i++)
//			if (lista.get(i) % 2 == 0) {
//				lista.remove(lista.get(i));
//				i--;
//			}

		for (Integer num : lista)
			if (num % 2 == 0)
				lista.remove(num);


		lista.clear();
	}
}
