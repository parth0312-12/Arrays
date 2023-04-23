package Array_example;

public class Array_single {
	public static void main(String[] args) {
//		int[] anArray;
//		anArray = new int[20];
//		
		int[] anArray = new int[12];
		
		anArray[1]=100;
		anArray[2]=200;
		anArray[3]=300;
		anArray[4]=400;
		anArray[5]=500;
		anArray[6]=600;
		anArray[7]=700;
		anArray[8]=800;
		anArray[9]=900;
		anArray[10]=1000;
		anArray[11]=1100;
		
		for(int i=0;i<anArray.length;i++) {
			System.out.println("Elements of Index"+i+":"+anArray[i]);
		}
		
		String[] arrays = new String[5];
		arrays[0]="PARTH";
		arrays[1]="ARUN";
		arrays[2]="SHOBHANA";
		arrays[3]="HIRAK";
		arrays[4]="BHOOMI";
		
		System.out.println("Elements of index[0] :-"+arrays[0]);
		System.out.println("Elements of index[1] :-"+arrays[1]);
		System.out.println("Elements of index[2] :-"+arrays[2]);
		System.out.println("Elements of index[3] :-"+arrays[3]);
		System.out.println("Elements of index[4] :-"+arrays[4]);
		
		int[] array1 = {1,2,3,4,5,6,7,8,9};
		System.out.println("Elements of index are as follow:-"+array1[0]);
		System.out.println("Elements of index are as follow:-"+array1[1]);
		System.out.println("Elements of index are as follow:-"+array1[2]);
		System.out.println("Elements of index are as follow:-"+array1[3]);
		System.out.println("Elements of index are as follow:-"+array1[4]);
		System.out.println("Elements of index are as follow:-"+array1[5]);
		System.out.println("Elements of index are as follow:-"+array1[6]);
		System.out.println("Elements of index are as follow:-"+array1[7]);
		System.out.println("Elements of index are as follow:-"+array1[8]);
		
		Employee[] arrayindexemployee=new Employee[2];
		arrayindexemployee[0] =new Employee(10,"Parth");
		arrayindexemployee[1] =new Employee(12,"Mehta");
		System.out.println("Elements 1 at index 0:-"+arrayindexemployee[0].getName());
		System.out.println("Elements 1 at index 0:-"+arrayindexemployee[1].getName());
		
	}

}
class Employee{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee(int id,String name) {
		super();
		this.id=id;
		this.name=name;
	}
	
}
