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