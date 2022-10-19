class switchstatementsDemo{
public static void main(String[] args){
   int number = 5;
   switch(number){
   case 1:System.out.println("1st day of the week is sunday");
   break;
   case 2:System.out.println("2nd day of week is monday");
   break;
   case 3:System.out.println("3rd day of the week is tuesday");
   break;
   case 4:System.out.println("4th day of the week is wednesday");
   break;
   case 5:System.out.println("5th day of the week is thursday");
   break;
   case 6:System.out.println("6th day of the week is friday");
   break;
   case 7:System.out.println("7th day of the week is saturday");
   break;

   default :System.out.println("Invalid value,value range must be 1 to 7");
   }
   }
}