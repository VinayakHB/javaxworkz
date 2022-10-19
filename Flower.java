class Flower{

String name;
String colour;
int noofpetals;
 
 void sheddingFragrance(){
  System.out.println(colour+" "+name+" is Shedding fragrance..");
  }
 void blooming(){
   System.out.println(colour+" "+name+" is blooming...");
 }
 public static void main(String []args){
 Flower rose = new Flower();
 rose.name = "Rose";
 rose.colour = "Red";
 rose.noofpetals = 9;
 
 rose.blooming();
 rose.sheddingFragrance();
 
 Flower jasmine = new Flower();

jasmine.name = "jasmine";
jasmine.colour = "white";
jasmine.noofpetals = 6;
  
jasmine.blooming();
jasmine.sheddingFragrance();
 
 }
}
 