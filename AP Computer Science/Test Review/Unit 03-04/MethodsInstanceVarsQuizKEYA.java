//© A+ Computer Science  -  www.apluscompsci.com

//methods instance vars quiz key  

import static java.lang.System.*;

class Quiz1{
   private int one=5, two=6, total;
   public void add(){  total = one + two;  }
   public void print(){
      out.println(total);
   }
}

class Quiz2 {
   private int one=5, two=6, total;
   public void add(){  int total = one + two;  }
   public void print(){
      out.println(total);
   }
}

class Quiz3
{
   private int one=15, two=22, total;
   public void add(){
      one=4;
      total = one + two;
      two=8;
   }
   public void print(){
      out.println(total);
   }
}

class Quiz4 {
   private int one,two,total;

   public void setNums(int n1, int n2){
      one=n1;
      two=n2;
   }
   public void add(){
      total = one + two;
   }
   public void print(){
      out.println(total);
   }
}

public class MethodsInstanceVarsQuizKEYA
{
   public static void main(String args[])
   {
      Quiz1 test = new Quiz1();
      test.add();
      test.print();

      Quiz2 demo = new Quiz2();
      demo.add();
      demo.print();

      Quiz3 fun = new Quiz3();
      fun.add();
      fun.print();

      Quiz4 run = new Quiz4();
      run.setNums(19,25);
      run.add();
      run.print();
   }
}