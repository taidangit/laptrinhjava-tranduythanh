package kyna.vn;

public class TestMang {

	public static void main(String[] args) {
		int M[]={4,2,5,7,6};
		int M2[]=new int[M.length-1];
		M2[0]=M[0];
		M2[1]=M[1];
		M2[2]=M[3];
		M2[3]=M[4];
		for(int i=0;i<M2.length;i++) {
			System.out.print(M2[i]+"\t");
		}
		/*int M2[]=new int[M.length+1];
		M2[0]=M[0];
		M2[1]=M[1];
		M2[2]=M[2];
		M2[3]=3;
		M2[4]=M[3];
		M2[5]=M[4];
		for(int i=0;i<M2.length;i++) {
			System.out.print(M2[i]+"\t");
		}*/
		/*System.out.println(M[4]);
		int M2[]=new int[M.length+1];
		for(int i=0;i<M.length;i++) {
			M2[i]=M[i];
		}
		M2[M2.length-1]=1;
		for(int i=0;i<M2.length;i++) {
			System.out.print(M2[i]+"\t");
		}*/
	}

}
