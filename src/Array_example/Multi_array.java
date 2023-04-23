package Array_example;

public class Multi_array {
	public static void main(String[] args) {
		String[][] names= {
							{"Mr.","Mrs.","Ms."},
							{"Parth","Arun"}
						};
		System.out.println(names[0][0]+
							names[1][1]);
		System.out.println(names[0][1]+names[1][1]);
		
		String[][] arrstr=new String[3][4];
		for(int i=0;i<arrstr.length;i++) {
			for(int j=0;j<arrstr[i].length;j++) {
				arrstr[i][j]="str"+j;
				System.out.print(arrstr[i][j]+"  ");
			}
			System.out.println(" ");
		}
	}

}
