import java.util.Scanner;
public class provaScan{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String lletra = scanner.next();
		if(lletra.equals("Hola")){ // si només és una línia no cal {...}
			System.out.println("Adeu");
		}else{
			System.out.println("No has dit Hola.Maleducao");
		}
	}
}
