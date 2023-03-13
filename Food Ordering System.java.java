import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

// Break fast class is used for setting , getting and cost of particular item
class breakfast_food {
    int idly ,  costofidle=30;
    int puri ,  costofpuri=30;
    int plain_dosa ,  costof_pln_dosa=40;
    int masala_dosa ,  costof_msl_dosa=60;
    int ghee_dosa ,  costof_ghee_dosa=50;

// Calculating Amount and Checking wheather breakfast food is available or not

    public int order(int item_no, int order) {
        switch (item_no) {
            case 1:
                if (idly-order < 0) {
                    System.out.println("Idly is over");
                    return 0;
                }
                else{
                    idly -= order;
                    return costofidle*order;
                }
            case 2:
                if (puri-order < 0) {
                    System.out.println("Puri is over");
                    return 0;
                }
                else{
                    puri -= order;
                    return costofpuri*order;
                }
            case 3:
                if (plain_dosa -order< 0) {
                    System.out.println("Plain Dosa is over");
                    return 0;
                }
                else{
                    plain_dosa -= order;
                    return costof_pln_dosa*order;
                }
            case 4:
                
                if (masala_dosa-order < 0) {
                    System.out.println("Masala Dosa is over");
                    return 0;
                }
                else{
                    masala_dosa -= order;
                    return costof_msl_dosa*order;
                }
            case 5:
                
                if (ghee_dosa-order < 0) {
                    System.out.println("Ghee Dosa is over");
                    return 0;
                    
                }
                else{
                    ghee_dosa -= order;
                    return costof_ghee_dosa*order;
                }
            default:
                return 0;
        }
    }

}

// Lunch class is used for setting , getting and cost of particular item
class lunch_food {
    int meals = 0 ,  meal_cost=50;
    int curd_rice = 0 ,  curd_rice_cost=30;
    int gee_rice = 0 ,  gee_rice_cost=50;
    int chicken_biryani = 0 ,  chikn_biry_cost=100;
    int mutton_biryani = 0 ,  mtn_biry_cost=150;
    int veg_biryani = 0 ,  veg_biry_cost=50;
    int chicken_friedrice = 0 ,  chikn_frdrice_cost=80;
    int veg_friedrice = 0 ,  veg_frdrice_cost=50;

// Calculating Amount and Checking wheather lunch food is available or not
    public int order(int item_no, int order) {
        switch (item_no) {
            case 1:
                if (meals-order < 0) {
                    System.out.println("Meals is over");
                    return 0;
                }
                else{
                    meals -= order;
                    return meal_cost*order;
                }
            case 2:
                if (curd_rice-order < 0) {
                    System.out.println("Curd Rice is over");
                    return 0;
                }
                else{
                    curd_rice -= order;
                    return curd_rice_cost*order;
                }
            case 3:
                if (gee_rice -order< 0) {
                    System.out.println("Ghee Rice is over");
                    return 0;
                }
                else{
                    gee_rice -= order;
                    return gee_rice_cost*order;
                }
            case 4:
                
                if (chicken_biryani-order < 0) {
                    System.out.println("Chicken Biryani is over");
                    return 0;
                }
                else{
                    chicken_biryani -= order;
                    return chikn_biry_cost*order;
                }
            case 5:
                
                if (mutton_biryani-order < 0) {
                    System.out.println("Mutton Biryani is over");
                    return 0;
                    
                }
                else{
                    mutton_biryani -= order;
                    return mtn_biry_cost*order;
                }
            case 6:
                
                if (veg_biryani-order < 0) {
                    System.out.println("Veg Biryani is over");
                    return 0;
                }
                else{
                    veg_biryani -= order;
                    return veg_biry_cost*order;
                }
            case 7:
                if (chicken_friedrice-order < 0) {
                    System.out.println("Chicken FriedRice is over");
                    return 0;
                }
                else{
                    chicken_friedrice -= order;
                    return chikn_frdrice_cost*order;
                }
            case 8:
                if (veg_friedrice - order < 0) {
                    System.out.println("Mutton Biryani is over");
                    return 0;
                }
                else{
                    veg_friedrice -= order;
                    return veg_biry_cost*order;
                }
            default:
                return 0;
        }
    }
}
public class food_booking_machine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        lunch_food lf = new lunch_food();
        breakfast_food bf = new breakfast_food();
        int pin = 0;
        int amount=0,tot_amount=0;
        boolean k;
        int item_no, no_order = 0;
        while (true) {
            System.out.println("\n\n\t ************ SRM FOOD COUT **********   ");
            System.out.println("\n");
            System.out.print("  ARE YOU STUDENT PRESS (1) OR FACULTY PRESS(2) : ");
            int mem = sc.nextInt();
            if (mem == 2) {

            // while is used for wheather given pin correct or not if pin incorrect then loop is looping until the correct pin will enter
            
                while (pin != 543) {
                    System.out.print("Enter a staff password : ");
                    pin = sc.nextInt();
                    System.out.println();
                    if (pin != 543) {
                        System.out.println("Invalid password please Enter correct password ");
                    }
                }
                do {
                    System.out.println("Enter a morning or afternoon session \n 1 morning \n 2 afternoon ");
                    int session = sc.nextInt();
                    if (session == 1) {
                        System.out.print("How many set of idly is available today : ");
                        bf.idly = sc.nextInt();
                        System.out.print("How many set of Puri is available today : ");
                        bf.puri = sc.nextInt();
                        System.out.print("How many Plain Dosa is available today : ");
                        bf.plain_dosa = sc.nextInt();
                        System.out.print("How many Masala Dosa is available today : ");
                        bf.masala_dosa = sc.nextInt();
                        System.out.print("How many ghee Dosa is available today : ");
                        bf.ghee_dosa = sc.nextInt();
                    } 
                    else if (session == 2) {
                        System.out.print("How many set of meals is available today : ");
                        lf.meals = sc.nextInt();
                        System.out.print("How many set of Curd Rice is available today : ");
                        lf.curd_rice = sc.nextInt();
                        System.out.print("How many set of Ghee Rice is available today : ");
                        lf.gee_rice = sc.nextInt();
                        System.out.print("How many set of Chicken Biryani is available today : ");
                        lf.chicken_biryani = sc.nextInt();
                        System.out.print("How many set of Mutton Biryani is available today : ");
                        lf.mutton_biryani = sc.nextInt();
                        System.out.print("How many set of Veg Biryani is available today : ");
                        lf.veg_biryani = sc.nextInt();
                        System.out.print("How many set of Chicken FriedRice is available today : ");
                        lf.chicken_friedrice = sc.nextInt();
                        System.out.print("How many set of Mutton FriedRice is available today : ");
                        lf.veg_friedrice = sc.nextInt();
                    }
                    else{
                        System.out.println("Please Enter valid Number ");
                    }
                    System.out.println(" Do You Confirm means press 1\n Do You want once again you can press any number");
                    int x = sc.nextInt();
                    if (x == 1) {
                        k = false;
                    } else {
                        k = true;
                    }
                } while (k);
            } 
            else if(mem == 1){
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH");
                LocalDateTime now = LocalDateTime.now();
                if (Integer.parseInt(dtf.format(now)) <= 12) {
                    System.out.printf("\t\tBREAK FAST MENU \n\t1. idly\t\t\t %d \n\t2. puri\t\t\t %d \n\t3. plain_dosa\t\t %d \n\t4. masala_dosa\t\t %d \n\t5. ghee_dosa\t\t %d \n",bf.costofidle,bf.costofpuri,bf.costof_pln_dosa,bf.costof_msl_dosa,bf.costof_ghee_dosa);
                    while (true) {
                        System.out.print("Enter Item Number : ");
                        item_no = sc.nextInt();
                        switch (item_no) {
                            case 1:
                                System.out.print("How many set idle : ");
                                no_order = sc.nextInt();
                                break;
                            case 2:
                                System.out.print("How many set puri : ");
                                no_order = sc.nextInt();
                                break;
                            case 3:
                                System.out.print("How many Plain Dosa : ");
                                no_order = sc.nextInt();
                                break;
                            case 4:
                                System.out.print("How many Masala Dosa : ");
                                no_order = sc.nextInt();
                                break;
                            case 5:
                                System.out.print("How many Ghee Dosa : ");
                                no_order = sc.nextInt();
                                break;
                            default:
                                System.out.println("invalid item Number ");
                                break;
                        }
                        amount= bf.order(item_no, no_order) ;
                        tot_amount+=amount;
                        System.out.println("If you no more order you can press 0");
                        if(0== sc.nextInt()){
                            System.out.println("Your total Amount is : " + tot_amount);
                            amount=0;
                            tot_amount=0;
                            break;
                        }
                    }
                } 
                else if (Integer.parseInt(dtf.format(now)) > 12 && Integer.parseInt(dtf.format(now)) <= 19) {
                    System.out.printf(
                            "\t\tLUNCH MENU  \n1 Meals\t\t\t %d \n2 Curd Rice\t\t %d \n3 Ghee Rice\t\t %d \n4 Chicken Biryani\t %d \n5 Mutton Biryani\t %d \n6 Veg Biryani\t\t %d \n7 Chicken FriedRice\t %d \n8 Veg FriedRice\t\t %d \n",lf.meal_cost,lf.curd_rice_cost,lf.gee_rice_cost,lf.chikn_biry_cost,lf.mtn_biry_cost,lf.veg_biry_cost,lf.chikn_frdrice_cost,lf.veg_frdrice_cost);

                    while (true) {
                        System.out.print("Enter item number : ");
                        item_no = sc.nextInt();
                        switch (item_no) {
                            case 1:
                                System.out.print("How many meals : ");
                                no_order = sc.nextInt();
                                break;
                            case 2:
                                System.out.print("How many Curd Rice : ");
                                no_order = sc.nextInt();
                                break;
                            case 3:
                                System.out.print("How many Ghee Rice : ");
                                no_order = sc.nextInt();
                                break;
                            case 4:
                                System.out.print("How many Chicken Biryani : ");
                                no_order = sc.nextInt();
                                break;
                            case 5:
                                System.out.print("How many Mutton Biryani : ");
                                no_order = sc.nextInt();
                                break;
                            case 6:
                                System.out.print("How many Veg Biryani : ");
                                no_order = sc.nextInt();
                                break;
                            case 7:
                                System.out.print("How many Chicken FiredRice : ");
                                no_order = sc.nextInt();
                                break;
                            case 8:
                                System.out.print("How many Mutton FriedRrice : ");
                                no_order = sc.nextInt();
                                break;
                            default:
                                System.out.println("invalid item Number ");
                                break;
                        }
                        amount= lf.order(item_no, no_order) ;
                        tot_amount+=amount;
                        System.out.println("If you no longer order, you can press 0");
                        if(0== sc.nextInt()){
                            System.out.println("Your total Amount is : " + tot_amount);
                            amount=0;
                            tot_amount=0;
                            break;
                        }
                    }
                } 
                else if (Integer.parseInt(dtf.format(now)) >= 19 && Integer.parseInt(dtf.format(now)) <= 22) {
                    System.out.println("Dinner is not available in food cout ");
                }
                else{
                    System.out.println("In this time there is  no food is available");
                }
            }
            else{
                System.out.println("Please Enter valid Number ");
            }
            System.out.println("If you want to contiue press (any number) other wise press (0)");
            if(0== sc.nextInt()){
                break;
            }
        }

    }
}
