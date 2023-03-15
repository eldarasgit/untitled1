public class Main {
    public static void main(String[] args) {


//          Pirma uzduotis

        String name = "Eldaras";
        String surname = "Suleimanovas";
        int birthDate = 1980;
            int year = 2023;

        System.out.println("As esu " + name +" "+ surname + ". Man yra " + (year - birthDate) + " metai");


//        Antra uzduotis

        int min2 = 0;
        int max2 = 4;

        double rnd21 = Math.random()*(max2-min2);
        double rnd22 = Math.random()*(max2-min2);

        System.out.println("rnd21 skaiciaus reiksme yra: " + rnd21);
        System.out.println("rnd22 skaiciaus reiksme yra: " + rnd22);

        if (Math.min(rnd21,rnd22)==0) {
            System.out.println("Is 0 dalinti negalima");
        } else {

            System.out.println("Dalybos rezultatas: " + (double) Math.round((Math.max(rnd21,rnd22) / Math.min(rnd21,rnd22)) * 100) / 100);
        }

//            Trecia uzduotis

        int min3 = 0;
        int max3 = 25;

        double rnd31 = min3 + (int)(Math.round(Math.random()*(max3-min3)));
        double rnd32 = min3 + (int)(Math.round(Math.random()*(max3-min3)));
        double rnd33 = min3 + (int)(Math.round(Math.random()*(max3-min3)));

        System.out.println(rnd31);
        System.out.println(rnd32);
        System.out.println(rnd33);

        if (rnd31==rnd32 || rnd31==rnd33 || rnd32==rnd33) {
            System.out.println("Skaiciaus su vidurine reiksme nera");
        }

        if (rnd31>rnd32 && rnd31<rnd33) {
            System.out.println("Sitas skaicius turi vidutine reiksme: " + rnd31);
        } else if (rnd31>rnd33 && rnd31<rnd32) {
            System.out.println("Sitas skaicius turi vidutine reiksme: " + rnd31);
        }

        else if (rnd32>rnd31 && rnd32<rnd33) {
            System.out.println("Sitas skaicius turi vidutine reiksme: " + rnd32);
        }
        else if (rnd32<rnd31 && rnd32>rnd33) {
            System.out.println("Sitas skaicius turi vidutine reiksme: " + rnd32);
        }

        else if (rnd33>rnd31 && rnd33<rnd32) {
            System.out.println("Sitas skaicius turi vidutine reiksme: " + rnd33);
        }
        else if (rnd33<rnd31 && rnd33>rnd32) {
            System.out.println("Sitas skaicius turi vidutine reiksme: " + rnd33);
        }


//            Ketvirta uzduotis

        int min4;
        int max4;

        min4 = 1;
        max4 = 10;

        double rnd41 = min4 + (int)(Math.round(Math.random()*(max4-min4)));
        double rnd42 = min4 + (int)(Math.round(Math.random()*(max4-min4)));
        double rnd43 = min4 + (int)(Math.round(Math.random()*(max4-min4)));

        System.out.println(rnd41);
        System.out.println(rnd42);
        System.out.println(rnd43);

        if (rnd41+rnd42 > rnd43 && rnd42+rnd43 > rnd41 && rnd43+rnd41 > rnd42) {
            System.out.println("Trikampis gaunasi");
        }
        else {
            System.out.println("trikampis nesigauna");
        }


//            Penkta uzduotis

        int min5 = 0;
        int max5 = 2;

        int zeros = 0;
        int ones = 0;
        int twos = 0;


        double rnd51 = min5 + (int) (Math.round(Math.random() * (max5 - min5)));
        double rnd52 = min5 + (int) (Math.round(Math.random() * (max5 - min5)));
        double rnd53 = min5 + (int) (Math.round(Math.random() * (max5 - min5)));
        double rnd54 = min5 + (int) (Math.round(Math.random() * (max5 - min5)));


        System.out.println(rnd51);
        System.out.println(rnd52);
        System.out.println(rnd53);
        System.out.println(rnd54);

        System.out.println("---------");

        if (rnd51 == 0) {
            zeros++;
        }
        if (rnd52 == 0) {
            zeros++;
        }
        if (rnd53 == 0) {
            zeros++;
        }
        if (rnd54 == 0) {
            zeros++;
        }

        if (rnd51 == 1) {
            ones++;
        }
        if (rnd52 == 1) {
            ones++;
        }
        if (rnd53 == 1) {
            ones++;
        }
        if (rnd54 == 1) {
            ones++;
        }

        if (rnd51 == 2) {
            twos++;
        }
        if (rnd52 == 2) {
            twos++;
        }
        if (rnd53 == 2) {
            twos++;
        }
        if (rnd54 == 2) {
            twos++;
        }
        System.out.println("Nuliu yra: " + zeros);
        System.out.println("Vienietu yra: " + ones);
        System.out.println("Dvejetu yra: " + twos);



//            Sesta uzduotis

        int min6 = -10;
        int max6 = 10;

        double rnd61 = min6 + (int)(Math.round(Math.random()*(max6-min6)));
        double rnd62 = min6 + (int)(Math.round(Math.random()*(max6-min6)));
        double rnd63 = min6 + (int)(Math.round(Math.random()*(max6-min6)));

        System.out.println(rnd61);
        System.out.println(rnd62);
        System.out.println(rnd63);

        System.out.println("--------------");

        if (rnd61 < 0) {
            System.out.println("[" + rnd61 + "]");
        }
        if (rnd61==0) {
            System.out.println("(" + rnd61 + ")");
        }
        if (rnd61 > 0) {
            System.out.println("{" + rnd61 + "}");
        }


        if (rnd62 < 0) {
            System.out.println("[" + rnd62 + "]");
        }
        if (rnd62==0) {
            System.out.println("(" + rnd62 + ")");
        }
        if (rnd62 > 0) {
            System.out.println("{" + rnd62 + "}");
        }


        if (rnd63 < 0) {
            System.out.println("[" + rnd63 + "]");
        }
        if (rnd63==0) {
            System.out.println("(" + rnd63 + ")");
        }
        if (rnd63 > 0) {
            System.out.println("{" + rnd63 + "}");
        }


//            Septinta uzduotis

        int min7;
        int max7;

        min7 = 5;
        max7 = 3000;

        int rnd7 = min7 + (int)(Math.round(Math.random()*(max7-min7)));

        System.out.println("Zvakiu kiekis: " + rnd7);

        System.out.println("------------------");

        if (rnd7 <= 1000) {
            System.out.println("Zvakiu kaina be nuol. : " + rnd7);
        }
        if ((rnd7 > 1000) && (rnd7 <= 2000)){
            System.out.println("Zvakiu kaina su 3% nuol. : " + (rnd7 * 0.97) * 100 / 100);
        }
        if (rnd7 > 2000) {
            System.out.println("Zvakiu kaina su 4% nuol. : " + (rnd7 * 0.96) * 100 / 100);
        }


//            Astunta uzduotis

        int min8 = 0;
        int max8 = 100;

        int count = 0;
        int sum = 0;

        double rnd81 = min8 + (double) (Math.round(Math.random() * (max8 - min8)));
        double rnd82 = min8 + (double) (Math.round(Math.random() * (max8 - min8)));
        double rnd83 = min8 + (double) (Math.round(Math.random() * (max8 - min8)));

//       int rnd81 = 0;
//       int rnd82 = 5;
//       int rnd83 = 3;

        System.out.println(rnd81);
        System.out.println(rnd82);
        System.out.println(rnd83);

        System.out.println("---------");

        System.out.println("Pirmas vidurkis: " + (int)(rnd81 + rnd82 + rnd83) / 3);

        if ((rnd81 >= 10) && (rnd81 <= 90)) {
            sum += rnd81;
            count++;
        }
        if ((rnd82 >= 10) && (rnd82 <= 90)) {
            sum+=rnd82;
            count++;
        }
        if ((rnd83 >= 10) && (rnd83 <= 90)) {
            sum += rnd83;
            count++;
        }

        if (count == 0) {
            System.out.println(" Antro vidurkio nera");
        } else {
            System.out.println("Antras vidurkis: " + sum / count);
        }









        git config --global user.name "eldarasgit"
        git config --global user.email "eldarone7@gmail.com"




    }
}
