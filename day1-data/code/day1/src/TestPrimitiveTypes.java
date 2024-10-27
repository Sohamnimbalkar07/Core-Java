public class TestPrimitiveTypes {
    public static void main(String[] args) {
 	byte b1=10;
             byte b2=20;
         //    byte b3=b1+b2;//RHS : int , LHS : byte --javac err
              int b3=b1+b2;//no javac err
	 byte b4=(byte)(b1+b2);//no javac err
               long l1=12345678;
               float f1=l1;//long ----> float : auto promotion : larger range of value.
          //     f1=12.34;//javac err : double ---> float : smaller range 
	 f1=12.34F;//no javac err
               double d1=12.34f;//float ---> double
               d1=f1;
        
    }
}