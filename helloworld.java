class nestedforloop{
public static void main(String[] args){
	int n=5;
	for(inti=0;i<n;i++){
		for(intj=0;j<n;j++){
			if(i==0 || j==0 || i==n-1 || j==n-1){
         System.out.print("*"+" ");
			}
			else{
				System.out.print(" "+" ");
			}
			System.out.println();
		}
	}
}
}