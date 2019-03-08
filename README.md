# 254229-STIW3054-A182-A1

Main
```java
import java.util.*;

public class Assignment1{
 

    public static void main (String []args){
         
        rt1();
           
    }

    public static void rt1(){   
        try{
            Scanner scan = new Scanner(System.in);
 
            System.out.println("==================================================================================================================================");
            System.out.println("                                              Input quantity for each Actors          ");
            System.out.println("==================================================================================================================================");
            System.out.println("Actor Type                            :  Description                                        : Weight Factor   : Quantity       ");
            System.out.println("==================================================================================================================================");
            System.out.print("Simple                                :  Defined API                                        : 1               : ");
                int simpleAct = scan.nextInt();
            System.out.print("Average                               :  Interactive or Protocol driven interface           : 2               : ");
                int averageAct = scan.nextInt();
            System.out.print("Complex                               :  Graphical User Interface                           : 3               : ");
                int complexAct = scan.nextInt();
            //calculate weight actor
                Calc act = new Calc();
                int weightAct = act.calcWAct(simpleAct, averageAct, complexAct);
            System.out.println("");
            System.out.println("Total Weighted Actor                :" + weightAct);
            System.out.println("==================================================================================================================================");


            System.out.println("==================================================================================================================================");
            System.out.println("                                              Input Quantity for each Use Cases");
            System.out.println("==================================================================================================================================");
            System.out.println("Use Case Type                         :  Description                                         : Weight Factor   : Quantity       ");
            System.out.println("==================================================================================================================================");
            System.out.print("Simple                                :  3 or fewer transactions                             : 5               : ");
                int simpleUC = scan.nextInt();
            System.out.print("Average                               :  4 to 7 transactions                                 : 10              : ");
                int averageUC = scan.nextInt();
            System.out.print("Complex                               :  Greater than 7 transactions                         : 15              : ");
                int complexUC = scan.nextInt();
            //calculate weight use case
            Calc uc = new Calc();
                int weightUC = uc.calcWUC(simpleUC, averageUC, complexUC);
            System.out.println("");
            System.out.println("Total Weighted Use Case              : " + weightUC);
            System.out.println("==================================================================================================================================");
                int uucp = weightAct + weightUC;
            System.out.println("Unadjusted Use Case Points           : "+uucp);
            System.out.println("==================================================================================================================================");

            

            System.out.println("==================================================================================================================================");
            System.out.println("                               Input Project Rating for Weighting Technical Use Case ( rate from 0 - 5)");
            System.out.println("==================================================================================================================================");
            System.out.println("Technical Factor                       :  Description                                         : Weight Factor   : Quantity       ");
            System.out.println("==================================================================================================================================");
            System.out.print("T1                                     :  Must have a distributed solution                    : 2               : ");
                int t1 = scan.nextInt();
            System.out.print("T2                                     :  Must responds to specific performance objectives    : 1               : ");
                int t2 = scan.nextInt();
            System.out.print("T3                                     :  Must meet end-users specific efficiency desire      : 1               : ");
                int t3 = scan.nextInt();
            System.out.print("T4                                     :  Complex internal processing                         : 1               : ");
                int t4 = scan.nextInt();
            System.out.print("T5                                     :  Code must be reusable                               : 1               : ");
                int t5 = scan.nextInt();
            System.out.print("T6                                     :  Must be easy to install                             : 0.5             : ");
                int t6 = scan.nextInt();
            System.out.print("T7                                     :  Must be easy to use                                 : 0.5             : ");
                int t7 = scan.nextInt();
            System.out.print("T8                                     :  Must be portable                                    : 2               : ");
                int t8 = scan.nextInt();
            System.out.print("T9                                     :  Must be easy to change                              : 1               : ");
                int t9 = scan.nextInt();
            System.out.print("T10                                    :  Must allow concurrent users                         : 1               : ");
                int t10 = scan.nextInt();
            System.out.print("T11                                    :  Includes special security features                  : 1               : ");
                int t11 = scan.nextInt();
            System.out.print("T12                                    :  Provide direct access for third parties users       : 1               : ");
                int t12 = scan.nextInt();
            System.out.print("T13                                    :  Requires special user training facilities           : 1               : ");
                int t13 = scan.nextInt();

            //calculate weight use case
                Calc tcf = new Calc();
                double weightTCF = tcf.calcWTCF(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13);
            System.out.println("");
            System.out.printf("Total Weighted Technical Factors     : %.2f %n" , weightTCF);
            System.out.println("==================================================================================================================================");
                double suc = uucp * weightTCF;
            System.out.printf("Size of the Software                 : %.2f %n", suc);
            System.out.println("==================================================================================================================================");

            System.out.println("==================================================================================================================================");
            System.out.println("                                 Input Project Rating for Weighting Experience Factors ( rate from 0 - 5)");
            System.out.println("==================================================================================================================================");
            System.out.println("Experience Factor                      :  Description                                         : Weight Factor   : Quantity       ");
            System.out.println("==================================================================================================================================");
            System.out.print("E1                                     :  Familiar with FTP software process                  : 1               : ");
                int e1 = scan.nextInt();
            System.out.print("E2                                     :  Application Experience                              : 0.5             : ");
                int e2 = scan.nextInt();
            System.out.print("E3                                     :  Paradigm Experience (OO)                            : 1               : ");
                int e3 = scan.nextInt();
            System.out.print("E4                                     :  Lead analyst capabulity                             : 0.5             : ");
                int e4 = scan.nextInt();
            System.out.print("E5                                     :  Motivation                                          : 0               : ");
                int e5 = scan.nextInt();
            System.out.print("E6                                     :  Stable requirements                                 : 2               : ");
                int e6 = scan.nextInt();
            System.out.print("E7                                     :  Part-time workers                                   : -1              : ");
                int e7 = scan.nextInt();
            System.out.print("E8                                     :  Dificulty of programming language                   : -1              : ");
                int e8 = scan.nextInt();
            
            //calculate weight experience factor
                Calc ef = new Calc();
                double weightEF = ef.calcWEF(e1, e2, e3, e4, e5, e6, e7, e8);
            System.out.println("");
            System.out.printf("Total Weighted Experience Factors    : %.2f %n" , weightEF);
            System.out.println("==================================================================================================================================");
                double ucp = suc * weightEF;
            System.out.printf("Use Case Points                      : %.2f %n" , ucp);
            System.out.println("==================================================================================================================================");

            System.out.println("==================================================================================================================================");
            System.out.println("                                                 Calculate Man Hours");
            System.out.println("==================================================================================================================================");
            System.out.print("Input effort rate to calculate total man hours                                                                  : ");
                int er = scan.nextInt();
                double tmh = er * ucp ;
            System.out.println("");
            System.out.printf("Total Man Hours                     : %.2f %n" , tmh);
            System.out.println("==================================================================================================================================");
            System.out.println("                                             Calculate Adjusted Man Hours");
            System.out.println("==================================================================================================================================");
            System.out.print("Input coefficient percentage to calculate total man hours  (%)                                                  : ");
                double cp = scan.nextDouble();
                double amh = (1.0 + cp) * tmh ;
            System.out.println("");
            System.out.printf("Adjusted Man Hours                  : %.2f %n" , amh);

            //weighting report
            System.out.println("==================================================================================================================================");
            System.out.println("                             Input Quantity and Average Man-Hours for Weighting Report for Complexity");
            System.out.println("==================================================================================================================================");
            System.out.println("Simple                               :");
            System.out.print("Average Man-Hours (Hours)            :");
                double simMH = scan.nextDouble();
            System.out.print("Quantity                             :");
                double simQty = scan.nextDouble();
            System.out.println("Average                              :");
            System.out.print("Average Man-Hours (Hours             :");
                double aveMH = scan.nextDouble();
            System.out.print("Quantity                             :");
                double aveQty = scan.nextDouble();
            System.out.println("Complex                              :");
            System.out.print("Average Man-Hours (Hours)            :");
                double comMH = scan.nextDouble();
            System.out.print("Quantity                             :");
                double comQty = scan.nextDouble();
                Calc rmh = new Calc();
                double calcRMH = rmh.calcRMH(simMH, simQty, aveMH, aveQty, comMH, comQty);
            System.out.println("");
            System.out.printf("Total Report Man-Hour Estimate     : %.2f %n", calcRMH);
            System.out.println("==================================================================================================================================");
                double ftmh = calcRMH + amh;
            System.out.printf("Total Man-Hours for Risk           : %.2f %n", ftmh);
            System.out.println("==================================================================================================================================");
        }catch(InputMismatchException e){
            System.out.println("Input numbers only for calculation!");
            rt1();
        }
    }
}

```


Calculate

```java
public class Calc{
    public static int calcWAct(int act1, int act2, int act3){
        return((act1 *1) + (act2 *2) + (act3*3));
    }

    public static int calcWUC(int uc1, int uc2, int uc3){
        return((uc1 *5) + (uc2 *10) + (uc3*15));
    }

    public static double calcWTCF(int a1, int a2, int a3, int a4, int a5, int a6, int a7, int a8, int a9, int a10, int a11, int a12, int a13){
        return ((0.01  * ((a1*2) + a2 + a3 + a4 + a5 + (a6*0.5) + (a7*0.5) + (a8*2) + a9 + a10 + a11 + a12 + a13)) + 0.6);

    }

    public static double calcWEF(int e1, int e2, int e3, int e4, int e5, int e6, int e7, int e8){
        return ((-0.03 * (e1 + (e2 * 0.5) + e3 + (e4 * 0.5) + (e6 * 2) + (-e7) + (-e8))) + 1.4);
    }

    public static double calcRMH(double r1, double r2, double r3, double r4, double r5, double r6){
        return((r1*r2)+(r3*r4)+(r5*r6));
    }
}

```

Metric xml
```java
<?xml version="1.0" encoding="UTF-8"?>
<Metrics scope="(default package)" type="Package" date="2019-03-08" xmlns="http://metrics.sourceforge.net/2003/Metrics-First-Flat">
   <Metric id = "VG" description ="McCabe Cyclomatic Complexity" max ="10" hint ="use Extract-method to split the method up">
      <Values per = "method" avg = "1.143" stddev = "0.35" max = "2">
         <Value name="rt1" source ="Assignment1.java" package ="(default package)" value ="2"/>
         <Value name="main" source ="Assignment1.java" package ="(default package)" value ="1"/>
         <Value name="calcRMH" source ="Calc.java" package ="(default package)" value ="1"/>
         <Value name="calcWAct" source ="Calc.java" package ="(default package)" value ="1"/>
         <Value name="calcWEF" source ="Calc.java" package ="(default package)" value ="1"/>
         <Value name="calcWTCF" source ="Calc.java" package ="(default package)" value ="1"/>
         <Value name="calcWUC" source ="Calc.java" package ="(default package)" value ="1"/>
      </Values>
   </Metric>
   <Metric id = "PAR" description ="Number of Parameters" max ="5" hint ="Move invoked method or pass an object">
      <Values per = "method" avg = "4.857" stddev = "4.189" max = "13" maxinrange="false">
         <Value name="calcWTCF" source ="Calc.java" package ="(default package)" value ="13" inrange="false"/>
         <Value name="calcWEF" source ="Calc.java" package ="(default package)" value ="8" inrange="false"/>
         <Value name="calcRMH" source ="Calc.java" package ="(default package)" value ="6" inrange="false"/>
         <Value name="calcWAct" source ="Calc.java" package ="(default package)" value ="3"/>
         <Value name="calcWUC" source ="Calc.java" package ="(default package)" value ="3"/>
         <Value name="main" source ="Assignment1.java" package ="(default package)" value ="1"/>
         <Value name="rt1" source ="Assignment1.java" package ="(default package)" value ="0"/>
      </Values>
   </Metric>
   <Metric id = "NBD" description ="Nested Block Depth" max ="5" hint ="use Extract-method to split the method up">
      <Values per = "method" avg = "1.143" stddev = "0.35" max = "2">
         <Value name="rt1" source ="Assignment1.java" package ="(default package)" value ="2"/>
         <Value name="main" source ="Assignment1.java" package ="(default package)" value ="1"/>
         <Value name="calcRMH" source ="Calc.java" package ="(default package)" value ="1"/>
         <Value name="calcWAct" source ="Calc.java" package ="(default package)" value ="1"/>
         <Value name="calcWEF" source ="Calc.java" package ="(default package)" value ="1"/>
         <Value name="calcWTCF" source ="Calc.java" package ="(default package)" value ="1"/>
         <Value name="calcWUC" source ="Calc.java" package ="(default package)" value ="1"/>
      </Values>
   </Metric>
   <Metric id = "CA" description ="Afferent Coupling">
      <Value value="0"/>
   </Metric>
   <Metric id = "CE" description ="Efferent Coupling">
      <Value value="0"/>
   </Metric>
   <Metric id = "RMI" description ="Instability">
      <Value value="1"/>
   </Metric>
   <Metric id = "RMA" description ="Abstractness">
      <Value value="0"/>
   </Metric>
   <Metric id = "RMD" description ="Normalized Distance">
      <Value value="0"/>
   </Metric>
   <Metric id = "DIT" description ="Depth of Inheritance Tree">
      <Values per = "type" avg = "1" stddev = "0" max = "1">
         <Value name="Assignment1" source ="Assignment1.java" package ="(default package)" value ="1"/>
         <Value name="Calc" source ="Calc.java" package ="(default package)" value ="1"/>
      </Values>
   </Metric>
   <Metric id = "WMC" description ="Weighted methods per Class">
      <Values per = "type" total = "8" avg = "4" stddev = "1" max = "5">
         <Value name="Calc" source ="Calc.java" package ="(default package)" value ="5"/>
         <Value name="Assignment1" source ="Assignment1.java" package ="(default package)" value ="3"/>
      </Values>
   </Metric>
   <Metric id = "NSC" description ="Number of Children">
      <Values per = "type" total = "0" avg = "0" stddev = "0" max = "0">
         <Value name="Assignment1" source ="Assignment1.java" package ="(default package)" value ="0"/>
         <Value name="Calc" source ="Calc.java" package ="(default package)" value ="0"/>
      </Values>
   </Metric>
   <Metric id = "NORM" description ="Number of Overridden Methods">
      <Values per = "type" total = "0" avg = "0" stddev = "0" max = "0">
         <Value name="Assignment1" source ="Assignment1.java" package ="(default package)" value ="0"/>
         <Value name="Calc" source ="Calc.java" package ="(default package)" value ="0"/>
      </Values>
   </Metric>
   <Metric id = "LCOM" description ="Lack of Cohesion of Methods">
      <Values per = "type" avg = "0" stddev = "0" max = "0">
         <Value name="Assignment1" source ="Assignment1.java" package ="(default package)" value ="0"/>
         <Value name="Calc" source ="Calc.java" package ="(default package)" value ="0"/>
      </Values>
   </Metric>
   <Metric id = "NOF" description ="Number of Attributes">
      <Values per = "type" total = "0" avg = "0" stddev = "0" max = "0">
         <Value name="Assignment1" source ="Assignment1.java" package ="(default package)" value ="0"/>
         <Value name="Calc" source ="Calc.java" package ="(default package)" value ="0"/>
      </Values>
   </Metric>
   <Metric id = "NSF" description ="Number of Static Attributes">
      <Values per = "type" total = "0" avg = "0" stddev = "0" max = "0">
         <Value name="Assignment1" source ="Assignment1.java" package ="(default package)" value ="0"/>
         <Value name="Calc" source ="Calc.java" package ="(default package)" value ="0"/>
      </Values>
   </Metric>
   <Metric id = "NOM" description ="Number of Methods">
      <Values per = "type" total = "0" avg = "0" stddev = "0" max = "0">
         <Value name="Assignment1" source ="Assignment1.java" package ="(default package)" value ="0"/>
         <Value name="Calc" source ="Calc.java" package ="(default package)" value ="0"/>
      </Values>
   </Metric>
   <Metric id = "NSM" description ="Number of Static Methods">
      <Values per = "type" total = "7" avg = "3.5" stddev = "1.5" max = "5">
         <Value name="Calc" source ="Calc.java" package ="(default package)" value ="5"/>
         <Value name="Assignment1" source ="Assignment1.java" package ="(default package)" value ="2"/>
      </Values>
   </Metric>
   <Metric id = "SIX" description ="Specialization Index">
      <Values per = "type" avg = "0" stddev = "0" max = "0">
         <Value name="Assignment1" source ="Assignment1.java" package ="(default package)" value ="0"/>
         <Value name="Calc" source ="Calc.java" package ="(default package)" value ="0"/>
      </Values>
   </Metric>
   <Metric id = "NOC" description ="Number of Classes">
      <Value value="2"/>
   </Metric>
   <Metric id = "NOI" description ="Number of Interfaces">
      <Value value="0"/>
   </Metric>
   <Metric id = "NOP" description ="Number of Packages">
   </Metric>
   <Metric id = "TLOC" description ="Total Lines of Code">
      <Value value="176"/>
   </Metric>
   <Metric id = "MLOC" description ="Method Lines of Code">
      <Values per = "method" total = "157" avg = "22.429" stddev = "52.489" max = "151">
         <Value name="rt1" source ="Assignment1.java" package ="(default package)" value ="151"/>
         <Value name="main" source ="Assignment1.java" package ="(default package)" value ="1"/>
         <Value name="calcRMH" source ="Calc.java" package ="(default package)" value ="1"/>
         <Value name="calcWAct" source ="Calc.java" package ="(default package)" value ="1"/>
         <Value name="calcWEF" source ="Calc.java" package ="(default package)" value ="1"/>
         <Value name="calcWTCF" source ="Calc.java" package ="(default package)" value ="1"/>
         <Value name="calcWUC" source ="Calc.java" package ="(default package)" value ="1"/>
      </Values>
   </Metric>
   </Metrics>
   
   ```
