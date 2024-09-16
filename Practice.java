public class Practice {
    public static void main(String[] args) {
        
        int one=12;
        float we=33;
        double aa=22;

        System.out.printf("one: %d\n", one);
        System.out.printf("we: %f\n", we);
        System.out.printf("aa: %f\n", aa);

        int a=25;
        int b=30;
        int g=40;
        int y=40;
        int c=23;
        int d=13;
        int r=43;
        
        
        double eq=(a + b )*g/y+78;
        System.out.println("(a + b )*g/y+78= "+eq );
        double eq_2=(b + c/5 + d*r)*2;
        System.out.println("b + c/5 + d*r= "+eq_2);
        
        if(eq==132) {
            System.out.println("This is Good");
        }
        else if(eq!=133) {
            System.out.println("This is Good");
        }
        else {
            System.out.println("Now Then");
        }
       //Question1
        int DBM=17;
        int C=15;
        int bible_doctrine=14;
        int Philosophy=7;

        
        if(DBM<C|| DBM<bible_doctrine || DBM<Philosophy) {
            if(DBM<13)
            System.out.println("The Lowest Marks is "+DBM );
        }

        if(C<DBM|| C<bible_doctrine || C<Philosophy) {
            if(C<13)
            System.out.println("The Lowest Marks is "+C );
        }

        if(bible_doctrine<DBM|| bible_doctrine<C || bible_doctrine<Philosophy) {
            if(bible_doctrine<13)
            System.out.println("The Lowest Marks is "+bible_doctrine );
        }

        if( Philosophy<DBM || Philosophy<C|| Philosophy<bible_doctrine  ) {
            if(Philosophy<13)
            System.out.println("2. The Lowest Marks is "+Philosophy );
        }
        
       //Question2

        int cou=82;
        int C_1=60;
        int web_tech=75;

        double avg_1=(cou+C_1+web_tech)/3;
        System.out.println("The average is "+avg_1 );
      
        //course Greater than average
        if(cou>avg_1){
            System.out.println( cou);
        }
        
        if(C_1>avg_1){
            System.out.println(C_1);
        }

        if(web_tech>avg_1){
            System.out.println( web_tech);
        }

        //Question3
        
        
}
}