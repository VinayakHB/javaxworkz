
class pattern1{
public static void main(String[] args){
 int n=11;
 for (int i=0;i<n;i++){
 for (int j=0;j<n;j++){
   if(i==0 || j==0 || i==n-1 || j==n-1 || i==2 || j==2 || i==4 || j==4 || i==6 || j==6 || i==8 || j==8){
    System.out.print("*"+" ");
	}
	else{
	System.out.print(" "+" ");
	}
	}
	System.out.println();
	}
	}
	}