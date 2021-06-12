public class ComplexNumber {
 // for real and imaginary parts of complex numbers
 int real, img;

 // constructor to initialize the complex number
 ComplexNumber(int r, int i) {
   this.real = r;
   this.img = i;
 }

 public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2) {
   // creating a temporary complex number to hold the sum of two numbers [(a+bi)-(c+di)=(a+c)+(b+d)i]
   ComplexNumber temp = new ComplexNumber(0, 0);
   temp.real = c1.real + c2.real;
   temp.img = c1.img + c2.img;
   // returning the output complex number
   return temp;
 }
 public static ComplexNumber sub(ComplexNumber c1, ComplexNumber c2) {
   // creating a temporary complex number to hold the sum of two numbers [(a+bi)-(c+di)=(a-c)+(b-d)i]
   ComplexNumber temp = new ComplexNumber(0, 0);
   temp.real = c1.real - c2.real;
   temp.img = c1.img - c2.img;
   // returning the output complex number
   return temp;
 }
 public static ComplexNumber mul(ComplexNumber c1, ComplexNumber c2) {
   // creating a temporary complex number to hold the sum of two numbers  [(a+bi)*(c+di)=(ac-bd)+(ad+bc)i]
   ComplexNumber temp = new ComplexNumber(0, 0);
   temp.real = (c1.real * c2.real)-(c1.img * c2.img);
   temp.img = (c1.real * c2.img)+(c2.real*c1.img);
   // returning the output complex number
   return temp;
 }
 public static void main(String args[]) {
   ComplexNumber c1 = new ComplexNumber(9, 5);
   ComplexNumber c2 = new ComplexNumber(6, 4);
   ComplexNumber temp = sum(c1, c2);
   System.out.printf("\nSum is: " + temp.real + " + " + temp.img + "i\n");
   ComplexNumber temp1 = mul(c1, c2);
   System.out.printf("\nProduct is: " + temp1.real + " + " + temp1.img + "i\n");
   ComplexNumber temp2 = sub(c1, c2);
   System.out.printf("\nDiff is: " + temp2.real + " + " + temp2.img + "i");
 }
}
