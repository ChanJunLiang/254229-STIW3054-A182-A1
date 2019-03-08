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