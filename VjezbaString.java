/*
 * ZADATAK: Napisati program koji prikazuje brojeve 1-100, u nizu, razdvojene zarezom.
 * 			Brojeve povezati kao stringove i to na tri nacina:
 * 			- sabiranjem,
 * 			- konkatenacijom i
 * 			- pomocu klase StringBuilder.
 */

public class VjezbaString {

	public static void main(String[] args) {
		
		String sabiranje = "1";		
		String sabiranjeCon = "1";
		
		StringBuilder sb = new StringBuilder();
		sb.append("1");
		
		for (int i = 2; i < 101; i++) {
			
			sabiranje = sabiranje + ", " + Integer.toString(i) ;
			sabiranjeCon = sabiranjeCon.concat(", ").concat(Integer.toString(i));
			sb.append(',').append(' ').append(i);
			
		}

		System.out.println(sabiranje);
		System.out.println(sabiranjeCon);
		
		sb.toString();
		System.out.println(sb);
		
	}

}
