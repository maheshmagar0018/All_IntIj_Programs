// JAVA VEHICLE MANAGEMENT SYSTEM PROJECT.
package ProjectMM;
import java.util.Scanner;

class Motor extends vehicle
{
    String vehicle_type;
    Motor(String vehicle_type)
    {
        this.vehicle_type=vehicle_type;
    }
    public static void vehicleT()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for largeTrucks");
        int a=sc.nextInt();

        switch (a)
        {
            case 1:
                Ten_wheeler T1 = new Ten_wheeler("largeTrucks");
                System.out.println(T1.name);
                System.out.println("Thank you for choosing largeTrucks");
                System.out.println("==============================================");
                Ten_wheeler.largeTrucks();
                break;

            default:
                System.out.println("Invalid input found");
                vehicleT();
                break;
        }
    }
}
class Ten_wheeler
{
    String name;
    Ten_wheeler(String name)
    {
        this.name=name;
    }
    public static void largeTrucks()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Man");
        System.out.println("Enter 2 for Volvo");
        System.out.println("Enter 3 for Scania");
        System.out.println("Enter 4 for Tata");
        System.out.println("Enter 5 for Ashok layland");
        int a=sc.nextInt();

        switch(a)
        {
            case 1:
                Large_Trucks t1 =new Large_Trucks("Man");
                System.out.println(t1.company_name);
                System.out.println("Thank you for choosing Man");
                System.out.println("===========================================");
                Large_Trucks.man();
                break;

            case 2:
                Large_Trucks t2 =new Large_Trucks("Volvo");
                System.out.println(t2.company_name);
                System.out.println("Thank you for choosing Volvo");
                System.out.println("===========================================");
                Large_Trucks.volvo();
                break;

            case 3:
                Large_Trucks t3 =new Large_Trucks("Scania");
                System.out.println(t3.company_name);
                System.out.println("Thank you for choosing Scania");
                System.out.println("===========================================");
                Large_Trucks.scania();
                break;

            case 4:
                Large_Trucks t4 =new Large_Trucks("Tata");
                System.out.println(t4.company_name);
                System.out.println("Thank you for choosing Tata");
                System.out.println("===========================================");
                Large_Trucks.tata();
                break;

            case 5:
                Large_Trucks t5 =new Large_Trucks("Ashok layland");
                System.out.println(t5.company_name);
                System.out.println("Thank you for choosing Ashok layland");
                System.out.println("===========================================");
                Large_Trucks.ashok_layland();
                break;

            default:
                System.out.println("Invalid input found");
                largeTrucks();
                break;
        }
    }
}
class Large_Trucks
{
    String company_name;
    Large_Trucks( String company_name)
    {
        this.company_name=company_name;
    }
    public static void man()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for Man_25.250");
        System.out.println("Enter 2 for Man_25.300");
        System.out.println("Enter 3 for Man_49.250");
        System.out.println("Enter 4 for Man_31.300");
        System.out.println("Enter 5 for Man_49.300");
        int k =sc.nextInt();

        switch (k)
        {
            case 1:
                Man m1 =new Man("Man_25.250");
                System.out.println(m1.name);
                System.out.println("Thank you for choosing Man_25.250");
                System.out.println("==========================================");
                Man.Man_25_250();
                break;

            case 2:
                Man m2 =new Man("Man_25.300");
                System.out.println(m2.name);
                System.out.println("Thank you for choosing Man_25.300");
                System.out.println("==========================================");
                Man.Man_25_300();
                break;

            case 3:
                Man m3 =new Man("Man_49.250");
                System.out.println(m3.name);
                System.out.println("Thank you for choosing Man_49.250");
                System.out.println("==========================================");
                Man.Man_49_250();
                break;

            case 4:
                Man m4 =new Man("Man_31.300");
                System.out.println(m4.name);
                System.out.println("Thank you for choosing Man_31.300");
                System.out.println("==========================================");
                Man.Man_31_300();
                break;

            case 5:
                Man m5 =new Man("Man_49.300");
                System.out.println(m5.name);
                System.out.println("Thank you for choosing Man_49.300");
                System.out.println("==========================================");
                Man.Man_49_300();
                break;

            default:
                System.out.println("Invalid input found");
                man();
                break;
        }
    }
    public static void volvo()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for Volvo_520");
        System.out.println("Enter 2 for Volvo_370");
        System.out.println("Enter 3 for Volvo_420");
        System.out.println("Enter 4 for Volvo_440");
        System.out.println("Enter 5 for Volvo_400");
        int i=sc.nextInt();
        switch (i)
        {
            case 1:
                Volvo v1=new Volvo("Volvo_520");
                System.out.println(v1.name);
                System.out.println("Thank you for choosing Volvo_520");
                System.out.println("=========================================");
                Volvo.Volvo_520();
                break;

            case 2:
                Volvo v2=new Volvo("Volvo_370");
                System.out.println(v2.name);
                System.out.println("Thank you for choosing Volvo_370");
                System.out.println("=========================================");
                Volvo.Volvo_370();
                break;

            case 3:
                Volvo v3=new Volvo("Volvo_420");
                System.out.println(v3.name);
                System.out.println("Thank you for choosing Volvo_420");
                System.out.println("=========================================");
                Volvo.Volvo_420();
                break;

            case 4:
                Volvo v4=new Volvo("Volvo_440");
                System.out.println(v4.name);
                System.out.println("Thank you for choosing Volvo_440");
                System.out.println("=========================================");
                Volvo.Volvo_440();
                break;

            case 5:
                Volvo v5=new Volvo("Volvo_400");
                System.out.println(v5.name);
                System.out.println("Thank you for choosing Volvo_400");
                System.out.println("=========================================");
                Volvo.Volvo_400();
                break;

            default:
                System.out.println("Invalid input found");
                volvo();
                break;
        }
    }
    public static void scania()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for Scania_R500");
        System.out.println("Enter 2 for Scania_G460");
        System.out.println("Enter 3 for Scania_G410");
        System.out.println("Enter 4 for Scania_P410");
        System.out.println("Enter 5 for Scania_V8");
        int m=sc.nextInt();

        switch (m)
        {
            case 1:
                Scania s1=new Scania("Scania_R500");
                System.out.println(s1.name);
                System.out.println("Thank you for choosing Scania_R500");
                System.out.println("===========================================");
                Scania.Scania_R500();
                break;

            case 2:
                Scania s2=new Scania("Scania_G460");
                System.out.println(s2.name);
                System.out.println("Thank you for choosing Scania_G460");
                System.out.println("===========================================");
                Scania.Scania_G460();
                break;

            case 3:
                Scania s3=new Scania("Scania_G410");
                System.out.println(s3.name);
                System.out.println("Thank you for choosing Scania_G410");
                System.out.println("===========================================");
                Scania.Scania_G410();
                break;

            case 4:
                Scania s4=new Scania("Scania_P410");
                System.out.println(s4.name);
                System.out.println("Thank you for choosing Scania_P410");
                System.out.println("===========================================");
                Scania.Scania_P410();
                break;

            case 5:
                Scania s5=new Scania("Scania_V8");
                System.out.println(s5.name);
                System.out.println("Thank you for choosing Scania_V8");
                System.out.println("===========================================");
                Scania.Scania_V8();
                break;

            default:
                System.out.println("Invalid input found");
                scania();
                break;
        }
    }
    public static void tata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for Tata_HD_9S");
        System.out.println("Enter 2 for Tata_STD_6S");
        System.out.println("Enter 3 for Tata_5530");
        System.out.println("Enter 4 for Tata_2818");
        System.out.println("Enter 5 for Tata_3118");
        int o=sc.nextInt();

        switch (o)
        {
            case 1:
                Tata ta1=new Tata("Tata_HD_9S");
                System.out.println(ta1.name);
                System.out.println("Thank you for choosing Tata_HD_9S");
                System.out.println("=========================================");
                Tata.Tata_HD_9S();
                break;

            case 2:
                Tata ta2=new Tata("Tata_STD_6S");
                System.out.println(ta2.name);
                System.out.println("Thank you for choosing Tata_STD_6S");
                System.out.println("=========================================");
                Tata.Tata_STD_6S();
                break;

            case 3:
                Tata ta3=new Tata("Tata_5530");
                System.out.println(ta3.name);
                System.out.println("Thank you for choosing Tata_5530");
                System.out.println("=========================================");
                Tata.Tata_5530();
                break;

            case 4:
                Tata ta4=new Tata("Tata_2818");
                System.out.println(ta4.name);
                System.out.println("Thank you for choosing Tata_2818");
                System.out.println("=========================================");
                Tata.Tata_2818();
                break;

            case 5:
                Tata ta5=new Tata("Tata_3118");
                System.out.println(ta5.name);
                System.out.println("Thank you for choosing Tata_3118");
                System.out.println("=========================================");
                Tata.Tata_3118();
                break;

            default:
                System.out.println("Invalid input found");
                tata();
                break;
        }
    }
    public static void ashok_layland()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for Ashok_layland_2820");
        System.out.println("Enter 2 for Ashok_layland_5525");
        System.out.println("Enter 3 for Ashok_layland_MAV");
        System.out.println("Enter 4 for Ashok_layland_AVTR");
        System.out.println("Enter 5 for Ashok_layland_RMC");
        int l=sc.nextInt();

        switch (l)
        {
            case 1:
                Ashok_layland al1=new Ashok_layland("Ashok_layland_2820");
                System.out.println(al1.name);
                System.out.println("Thank you for choosing Ashok_layland_2820");
                System.out.println("================================================");
                Ashok_layland.Ashok_layland_2820();
                break;

            case 2:
                Ashok_layland al2=new Ashok_layland("Ashok_layland_5525");
                System.out.println(al2.name);
                System.out.println("Thank you for choosing Ashok_layland_5525");
                System.out.println("================================================");
                Ashok_layland.Ashok_layland_5525();
                break;

            case 3:
                Ashok_layland al3=new Ashok_layland("Ashok_layland_MAV");
                System.out.println(al3.name);
                System.out.println("Thank you for choosing Ashok_layland_MAV");
                System.out.println("================================================");
                Ashok_layland.Ashok_layland_MAV();
                break;

            case 4:
                Ashok_layland al4=new Ashok_layland("Ashok_layland_AVTR");
                System.out.println(al4.name);
                System.out.println("Thank you for choosing Ashok_layland_AVTR");
                System.out.println("================================================");
                Ashok_layland.Ashok_layland_AVTR();
                break;

            case 5:
                Ashok_layland al5=new Ashok_layland("Ashok_layland_RMC");
                System.out.println(al5.name);
                System.out.println("Thank you for choosing Ashok_layland_RMC");
                System.out.println("================================================");
                Ashok_layland.Ashok_layland_RMC();
                break;

            default:
                System.out.println("Invalid input found");
                ashok_layland();
                break;
        }
    }
}
class Man
{
    String name;
    Man(String name)
    {
        this.name=name;
    }
    public static void Man_25_250()
    {
        man_25_250 m1=new man_25_250(3600000,55,25000,4525,6900,300,13145,10,"Manual",13);
        System.out.println("Price: "+m1.price);
        System.out.println("Power: "+m1.power);
        System.out.println("GVW: "+m1.gvw);
        System.out.println("Wheelbase: "+m1.wheelbase);
        System.out.println("Engine: "+m1.engine);
        System.out.println("Fuel tank: "+m1.fuel);
        System.out.println("Payload: "+m1.payload);
        System.out.println("Tyre: "+m1.tyre);
        System.out.println("Transmission: "+m1.transmission);
        m1.setCount(23);
        System.out.println("Available Quantity: "+m1.getCount());
    }
    public static void Man_25_300()
    {
        man_25_300 m2=new man_25_300(3200000,300,25000,4525,6900,300,11140,10,"Manual",14);
        System.out.println("Price: "+m2.price);
        System.out.println("Power: "+m2.power);
        System.out.println("GVW: "+m2.gvw);
        System.out.println("Wheelbase: "+m2.wheelbase);
        System.out.println("Engine: "+m2.engine);
        System.out.println("Fuel tank: "+m2.fuel);
        System.out.println("Payload: "+m2.payload);
        System.out.println("Tyre: "+m2.tyre);
        System.out.println("Transmission: "+m2.transmission);
        m2.setCount(25);
        System.out.println("Available Quantity: "+m2.getCount());
    }
    public static void Man_49_250()
    {
        man_49_250 m3=new man_49_250(3282000,255,49000,3890,6900,300,41100,10,"Manual",11);
        System.out.println("Price: "+m3.price);
        System.out.println("Power: "+m3.power);
        System.out.println("GVW: "+m3.gvw);
        System.out.println("Wheelbase: "+m3.wheelbase);
        System.out.println("Engine: "+m3.engine);
        System.out.println("Fuel tank: "+m3.fuel);
        System.out.println("Payload: "+m3.payload);
        System.out.println("Tyre: "+m3.tyre);
        System.out.println("Transmission: "+m3.transmission);
        m3.setCount(26);
        System.out.println("Available Quantity: "+m3.getCount());
    }
    public static void Man_31_300()
    {
        man_31_300 m4=new man_31_300(3900000,300,31000,5740,6900,200,20225,10,"Manual",16);
        System.out.println("Price: "+m4.price);
        System.out.println("Power: "+m4.power);
        System.out.println("GVW: "+m4.gvw);
        System.out.println("Wheelbase: "+m4.wheelbase);
        System.out.println("Engine: "+m4.engine);
        System.out.println("Fuel tank: "+m4.fuel);
        System.out.println("Payload: "+m4.payload);
        System.out.println("Tyre: "+m4.tyre);
        System.out.println("Transmission: "+m4.transmission);
        m4.setCount(21);
        System.out.println("Available Quantity: "+m4.getCount());
    }
    public static void Man_49_300()
    {
        man_49_300 m5=new man_49_300(3284000,300,49000,3890,6900,300,41100,10,"Manual",18);
        System.out.println("Price: "+m5.price);
        System.out.println("Power: "+m5.power);
        System.out.println("GVW: "+m5.gvw);
        System.out.println("Wheelbase: "+m5.wheelbase);
        System.out.println("Engine: "+m5.engine);
        System.out.println("Fuel tank: "+m5.fuel);
        System.out.println("Payload: "+m5.payload);
        System.out.println("Tyre: "+m5.tyre);
        System.out.println("Transmission: "+m5.transmission);
        m5.setCount(24);
        System.out.println("Available Quantity: "+m5.getCount());
    }
}
class man_25_250
{
    int price;
    int power;
    int gvw;
    int wheelbase;
    int engine;
    int fuel;
    int payload;
    int tyre;
    String transmission;
    private int count;
    public man_25_250(int price,int power,int gvw,int wheelbase,int engine,int fuel,int payload,int tyre,String transmission,int count)
    {
        this.price=price;
        this.power=power;
        this.gvw=gvw;
        this.wheelbase=wheelbase;
        this.engine=engine;
        this.fuel=fuel;
        this.payload=payload;
        this.tyre=tyre;
        this.transmission=transmission;
        this.count=count;
    }
    public int getCount()
    {
        return count;
    }
    public void setCount(int count)
    {
        this.count=count;
    }
}
class man_25_300
{
    int price;
    int power;
    int gvw;
    int wheelbase;
    int engine;
    int fuel;
    int payload;
    int tyre;
    String transmission;
    private int count;
    public man_25_300(int price,int power,int gvw,int wheelbase,int engine,int fuel,int payload,int tyre,String transmission,int count)
    {
        this.price=price;
        this.power=power;
        this.gvw=gvw;
        this.wheelbase=wheelbase;
        this.engine=engine;
        this.fuel=fuel;
        this.payload=payload;
        this.tyre=tyre;
        this.transmission=transmission;
        this.count=count;
    }
    public int getCount()
    {
        return count;
    }
    public void setCount(int count)
    {
        this.count=count;
    }
}
class man_49_250
{
    int price;
    int power;
    int gvw;
    int wheelbase;
    int engine;
    int fuel;
    int payload;
    int tyre;
    String transmission;
    private int count;
    public man_49_250(int price,int power,int gvw,int wheelbase,int engine,int fuel,int payload,int tyre,String transmission,int count)
    {
        this.price=price;
        this.power=power;
        this.gvw=gvw;
        this.wheelbase=wheelbase;
        this.engine=engine;
        this.fuel=fuel;
        this.payload=payload;
        this.tyre=tyre;
        this.transmission=transmission;
        this.count=count;
    }
    public int getCount()
    {
        return count;
    }
    public void setCount(int count)
    {
        this.count=count;
    }
}
class man_31_300
{
    int price;
    int power;
    int gvw;
    int wheelbase;
    int engine;
    int fuel;
    int payload;
    int tyre;
    String transmission;
    private int count;
    public man_31_300(int price,int power,int gvw,int wheelbase,int engine,int fuel,int payload,int tyre,String transmission,int count)
    {
        this.price=price;
        this.power=power;
        this.gvw=gvw;
        this.wheelbase=wheelbase;
        this.engine=engine;
        this.fuel=fuel;
        this.payload=payload;
        this.tyre=tyre;
        this.transmission=transmission;
        this.count=count;
    }
    public int getCount()
    {
        return count;
    }
    public void setCount(int count)
    {
        this.count=count;
    }
}
class man_49_300
{
    int price;
    int power;
    int gvw;
    int wheelbase;
    int engine;
    int fuel;
    int payload;
    int tyre;
    String transmission;
    private int count;
    public man_49_300(int price,int power,int gvw,int wheelbase,int engine,int fuel,int payload,int tyre,String transmission,int count)
    {
        this.price=price;
        this.power=power;
        this.gvw=gvw;
        this.wheelbase=wheelbase;
        this.engine=engine;
        this.fuel=fuel;
        this.payload=payload;
        this.tyre=tyre;
        this.transmission=transmission;
        this.count=count;
    }
    public int getCount()
    {
        return count;
    }
    public void setCount(int count)
    {
        this.count=count;
    }
}
class Volvo
{
    String name;
    Volvo(String name)
    {
        this.name=name;
    }
    public static void Volvo_520()
    {
        volvo_520 v1=new volvo_520(9012000,520,200000,3885,12800,445,190935,10,"Manual",19);
        System.out.println("Price: "+v1.price);
        System.out.println("Power: "+v1.power);
        System.out.println("GVW: "+v1.gvw);
        System.out.println("Wheelbase: "+v1.wheelbase);
        System.out.println("Engine: "+v1.engine);
        System.out.println("Fuel tank: "+v1.fuel);
        System.out.println("Payload: "+v1.payload);
        System.out.println("Tyre: "+v1.tyre);
        System.out.println("Transmission: "+v1.transmission);
        v1.setCount(25);
        System.out.println("Available Quantity: "+v1.getCount());
    }
    public static void Volvo_370()
    {
        volvo_370 v2=new volvo_370(5500000,370,40000,4085,10800,270,25840,10,"Manual",18);
        System.out.println("Price: "+v2.price);
        System.out.println("Power: "+v2.power);
        System.out.println("GVW: "+v2.gvw);
        System.out.println("Wheelbase: "+v2.wheelbase);
        System.out.println("Engine: "+v2.engine);
        System.out.println("Fuel tank: "+v2.fuel);
        System.out.println("Payload: "+v2.payload);
        System.out.println("Tyre: "+v2.tyre);
        System.out.println("Transmission: "+v2.transmission);
        v2.setCount(24);
        System.out.println("Available Quantity: "+v2.getCount());
    }
    public static void Volvo_420()
    {
        volvo_420 v3=new volvo_420(9100000,420,25000,5585,12800,415,16580,10,"Automatic",17);
        System.out.println("Price: "+v3.price);
        System.out.println("Power: "+v3.power);
        System.out.println("GVW: "+v3.gvw);
        System.out.println("Wheelbase: "+v3.wheelbase);
        System.out.println("Engine: "+v3.engine);
        System.out.println("Fuel tank: "+v3.fuel);
        System.out.println("Payload: "+v3.payload);
        System.out.println("Tyre: "+v3.tyre);
        System.out.println("Transmission: "+v3.transmission);
        v3.setCount(26);
        System.out.println("Available Quantity: "+v3.getCount());
    }
    public static void Volvo_440()
    {
        volvo_440 v4=new volvo_440(7000000,440,125000,3885,12800,445,116450,10,"Manual",16);
        System.out.println("Price: "+v4.price);
        System.out.println("Power: "+v4.power);
        System.out.println("GVW: "+v4.gvw);
        System.out.println("Wheelbase: "+v4.wheelbase);
        System.out.println("Engine: "+v4.engine);
        System.out.println("Fuel tank: "+v4.fuel);
        System.out.println("Payload: "+v4.payload);
        System.out.println("Tyre: "+v4.tyre);
        System.out.println("Transmission: "+v4.transmission);
        v4.setCount(23);
        System.out.println("Available Quantity: "+v4.getCount());
    }
    public static void Volvo_400()
    {
        volvo_400 v5=new volvo_400(8000000,400,160000,3885,12800,445,150290,10,"Manual",15);
        System.out.println("Price: "+v5.price);
        System.out.println("Power: "+v5.power);
        System.out.println("GVW: "+v5.gvw);
        System.out.println("Wheelbase: "+v5.wheelbase);
        System.out.println("Engine: "+v5.engine);
        System.out.println("Fuel tank: "+v5.fuel);
        System.out.println("Payload: "+v5.payload);
        System.out.println("Tyre: "+v5.tyre);
        System.out.println("Transmission: "+v5.transmission);
        v5.setCount(22);
        System.out.println("Available Quantity: "+v5.getCount());
    }
}
class volvo_520
{
    int price;
    int power;
    int gvw;
    int wheelbase;
    int engine;
    int fuel;
    int payload;
    int tyre;
    String transmission;
    private int count;
    public volvo_520(int price,int power,int gvw,int wheelbase,int engine,int fuel,int payload,int tyre,String transmission,int count)
    {
        this.price=price;
        this.power=power;
        this.gvw=gvw;
        this.wheelbase=wheelbase;
        this.engine=engine;
        this.fuel=fuel;
        this.payload=payload;
        this.tyre=tyre;
        this.transmission=transmission;
        this.count=count;
    }
    public int getCount()
    {
        return count;
    }
    public void setCount(int count)
    {
        this.count=count;
    }
}
class volvo_370
{
    int price;
    int power;
    int gvw;
    int wheelbase;
    int engine;
    int fuel;
    int payload;
    int tyre;
    String transmission;
    private int count;
    public volvo_370(int price,int power,int gvw,int wheelbase,int engine,int fuel,int payload,int tyre,String transmission,int count)
    {
        this.price=price;
        this.power=power;
        this.gvw=gvw;
        this.wheelbase=wheelbase;
        this.engine=engine;
        this.fuel=fuel;
        this.payload=payload;
        this.tyre=tyre;
        this.transmission=transmission;
        this.count=count;
    }
    public int getCount()
    {
        return count;
    }
    public void setCount(int count)
    {
        this.count=count;
    }
}
class volvo_420
{
    int price;
    int power;
    int gvw;
    int wheelbase;
    int engine;
    int fuel;
    int payload;
    int tyre;
    String transmission;
    private int count;
    public volvo_420(int price,int power,int gvw,int wheelbase,int engine,int fuel,int payload,int tyre,String transmission,int count)
    {
        this.price=price;
        this.power=power;
        this.gvw=gvw;
        this.wheelbase=wheelbase;
        this.engine=engine;
        this.fuel=fuel;
        this.payload=payload;
        this.tyre=tyre;
        this.transmission=transmission;
        this.count=count;
    }
    public int getCount()
    {
        return count;
    }
    public void setCount(int count)
    {
        this.count=count;
    }
}
class volvo_440
{
    int price;
    int power;
    int gvw;
    int wheelbase;
    int engine;
    int fuel;
    int payload;
    int tyre;
    String transmission;
    private int count;
    public volvo_440(int price,int power,int gvw,int wheelbase,int engine,int fuel,int payload,int tyre,String transmission,int count)
    {
        this.price=price;
        this.power=power;
        this.gvw=gvw;
        this.wheelbase=wheelbase;
        this.engine=engine;
        this.fuel=fuel;
        this.payload=payload;
        this.tyre=tyre;
        this.transmission=transmission;
        this.count=count;
    }
    public int getCount()
    {
        return count;
    }
    public void setCount(int count)
    {
        this.count=count;
    }
}
class volvo_400
{
    int price;
    int power;
    int gvw;
    int wheelbase;
    int engine;
    int fuel;
    int payload;
    int tyre;
    String transmission;
    private int count;
    public volvo_400(int price,int power,int gvw,int wheelbase,int engine,int fuel,int payload,int tyre,String transmission,int count)
    {
        this.price=price;
        this.power=power;
        this.gvw=gvw;
        this.wheelbase=wheelbase;
        this.engine=engine;
        this.fuel=fuel;
        this.payload=payload;
        this.tyre=tyre;
        this.transmission=transmission;
        this.count=count;
    }
    public int getCount()
    {
        return count;
    }
    public void setCount(int count)
    {
        this.count=count;
    }
}
class Scania
{
    String name;
    Scania(String name)
    {
        this.name=name;
    }
    public static void Scania_R500()
    {
        scania_R500 s1=new scania_R500(6450000,500,49000,3778,16000,500,39270,10,"Semi-automatic",16);
        System.out.println("Price: "+s1.price);
        System.out.println("Power: "+s1.power);
        System.out.println("GVW: "+s1.gvw);
        System.out.println("Wheelbase: "+s1.wheelbase);
        System.out.println("Engine: "+s1.engine);
        System.out.println("Fuel tank: "+s1.fuel);
        System.out.println("Payload: "+s1.payload);
        System.out.println("Tyre: "+s1.tyre);
        System.out.println("Transmission: "+s1.transmission);
        s1.setCount(26);
        System.out.println("Available Quantity: "+s1.getCount());
    }
    public static void Scania_G460()
    {
        scania_G460 s2=new scania_G460(5466000,460,150000,4023,12700,500,139850,10,"Semi-automatic",20);
        System.out.println("Price: "+s2.price);
        System.out.println("Power: "+s2.power);
        System.out.println("GVW: "+s2.gvw);
        System.out.println("Wheelbase: "+s2.wheelbase);
        System.out.println("Engine: "+s2.engine);
        System.out.println("Fuel tank: "+s2.fuel);
        System.out.println("Payload: "+s2.payload);
        System.out.println("Tyre: "+s2.tyre);
        System.out.println("Transmission: "+s2.transmission);
        s2.setCount(27);
        System.out.println("Available Quantity: "+s2.getCount());
    }
    public static void Scania_G410()
    {
        scania_G410 s3 = new scania_G410(5300000,410,49000,3950,12700,1000,39706,10,"Semi-automatic",19);
        System.out.println("Price: " + s3.price);
        System.out.println("Power: " + s3.power);
        System.out.println("GVW: " + s3.gvw);
        System.out.println("Wheelbase: " + s3.wheelbase);
        System.out.println("Engine: " + s3.engine);
        System.out.println("Fuel tank: " + s3.fuel);
        System.out.println("Payload: " + s3.payload);
        System.out.println("Tyre: " + s3.tyre);
        System.out.println("Transmission: " + s3.transmission);
        s3.setCount(28);
        System.out.println("Available Quantity: "+s3.getCount());
    }
    public static void Scania_P410()
    {
        scania_P410 s4 = new scania_P410(5500000,410,44000,3750,13000,600,35590,10,"Semi-automatic",18);
        System.out.println("Price: " + s4.price);
        System.out.println("Power: " + s4.power);
        System.out.println("GVW: " + s4.gvw);
        System.out.println("Wheelbase: " + s4.wheelbase);
        System.out.println("Engine: " + s4.engine);
        System.out.println("Fuel tank: " + s4.fuel);
        System.out.println("Payload: " + s4.payload);
        System.out.println("Tyre: " + s4.tyre);
        System.out.println("Transmission: " + s4.transmission);
        s4.setCount(29);
        System.out.println("Available Quantity: "+s4.getCount());
    }
    public static void Scania_V8()
    {
        scania_V8 s5=new scania_V8(6300000,500,150000,4023,16000,500,139529,10,"Semi-automatic",17);
        System.out.println("Price: " + s5.price);
        System.out.println("Power: " + s5.power);
        System.out.println("GVW: " + s5.gvw);
        System.out.println("Wheelbase: " + s5.wheelbase);
        System.out.println("Engine: " + s5.engine);
        System.out.println("Fuel tank: " + s5.fuel);
        System.out.println("Payload: " + s5.payload);
        System.out.println("Tyre: " + s5.tyre);
        System.out.println("Transmission: " + s5.transmission);
        s5.setCount(28);
        System.out.println("Available Quantity: "+s5.getCount());
    }
}
class scania_R500
{
    int price;
    int power;
    int gvw;
    int wheelbase;
    int engine;
    int fuel;
    int payload;
    int tyre;
    String transmission;
    private int count;
    public scania_R500(int price,int power,int gvw,int wheelbase,int engine,int fuel,int payload,int tyre,String transmission,int count)
    {
        this.price=price;
        this.power=power;
        this.gvw=gvw;
        this.wheelbase=wheelbase;
        this.engine=engine;
        this.fuel=fuel;
        this.payload=payload;
        this.tyre=tyre;
        this.transmission=transmission;
        this.count=count;
    }
    public int getCount()
    {
        return count;
    }
    public void setCount(int count)
    {
        this.count=count;
    }
}
class scania_G460
{
    int price;
    int power;
    int gvw;
    int wheelbase;
    int engine;
    int fuel;
    int payload;
    int tyre;
    String transmission;
    private int count;
    public scania_G460(int price,int power,int gvw,int wheelbase,int engine,int fuel,int payload,int tyre,String transmission,int count)
    {
        this.price=price;
        this.power=power;
        this.gvw=gvw;
        this.wheelbase=wheelbase;
        this.engine=engine;
        this.fuel=fuel;
        this.payload=payload;
        this.tyre=tyre;
        this.transmission=transmission;
        this.count=count;
    }
    public int getCount()
    {
        return count;
    }
    public void setCount(int count)
    {
        this.count=count;
    }
}
class scania_G410
{
    int price;
    int power;
    int gvw;
    int wheelbase;
    int engine;
    int fuel;
    int payload;
    int tyre;
    String transmission;
    private int count;
    public scania_G410(int price,int power,int gvw,int wheelbase,int engine,int fuel,int payload,int tyre,String transmission,int count)
    {
        this.price=price;
        this.power=power;
        this.gvw=gvw;
        this.wheelbase=wheelbase;
        this.engine=engine;
        this.fuel=fuel;
        this.payload=payload;
        this.tyre=tyre;
        this.transmission=transmission;
        this.count=count;
    }
    public int getCount()
    {
        return count;
    }
    public void setCount(int count)
    {
        this.count=count;
    }
}
class scania_P410
{
    int price;
    int power;
    int gvw;
    int wheelbase;
    int engine;
    int fuel;
    int payload;
    int tyre;
    String transmission;
    private int count;
    public scania_P410(int price,int power,int gvw,int wheelbase,int engine,int fuel,int payload,int tyre,String transmission,int count)
    {
        this.price=price;
        this.power=power;
        this.gvw=gvw;
        this.wheelbase=wheelbase;
        this.engine=engine;
        this.fuel=fuel;
        this.payload=payload;
        this.tyre=tyre;
        this.transmission=transmission;
        this.count=count;
    }
    public int getCount()
    {
        return count;
    }
    public void setCount(int count)
    {
        this.count=count;
    }
}
class scania_V8
{
    int price;
    int power;
    int gvw;
    int wheelbase;
    int engine;
    int fuel;
    int payload;
    int tyre;
    String transmission;
    private int count;
    public scania_V8(int price,int power,int gvw,int wheelbase,int engine,int fuel,int payload,int tyre,String transmission,int count)
    {
        this.price=price;
        this.power=power;
        this.gvw=gvw;
        this.wheelbase=wheelbase;
        this.engine=engine;
        this.fuel=fuel;
        this.payload=payload;
        this.tyre=tyre;
        this.transmission=transmission;
        this.count=count;
    }
    public int getCount()
    {
        return count;
    }
    public void setCount(int count)
    {
        this.count=count;
    }
}
class Tata
{
    String name;
    Tata(String name)
    {
        this.name=name;
    }
    public static void Tata_HD_9S()
    {
        tata_HD_9S t1=new tata_HD_9S(4547000,219,28000,3880,5600,300,32000,10,"Manual",22);
        System.out.println("Price: "+t1.price);
        System.out.println("Power: "+t1.power);
        System.out.println("GVW: "+t1.gvw);
        System.out.println("Wheelbase: "+t1.wheelbase);
        System.out.println("Engine: "+t1.engine);
        System.out.println("Fuel tank: "+t1.fuel);
        System.out.println("Payload: "+t1.payload);
        System.out.println("Tyre: "+t1.tyre);
        System.out.println("Transmission: "+t1.transmission);
        t1.setCount(30);
        System.out.println("Available Quantity: "+t1.getCount());
    }
    public static void Tata_STD_6S()
    {
        tata_STD_6S t2=new tata_STD_6S(4363000,219,28000,3880,5600,300,31000,10,"Manual",24);
        System.out.println("Price: "+t2.price);
        System.out.println("Power: "+t2.power);
        System.out.println("GVW: "+t2.gvw);
        System.out.println("Wheelbase: "+t2.wheelbase);
        System.out.println("Engine: "+t2.engine);
        System.out.println("Fuel tank: "+t2.fuel);
        System.out.println("Payload: "+t2.payload);
        System.out.println("Tyre: "+t2.tyre);
        System.out.println("Transmission: "+t2.transmission);
        t2.setCount(29);
        System.out.println("Available Quantity: "+t2.getCount());
    }
    public static void Tata_5530()
    {
        tata_5530 t3=new tata_5530(4273000,300,55000,3890,6700,365,59000,10,"Manual",25);
        System.out.println("Price: "+t3.price);
        System.out.println("Power: "+t3.power);
        System.out.println("GVW: "+t3.gvw);
        System.out.println("Wheelbase: "+t3.wheelbase);
        System.out.println("Engine: "+t3.engine);
        System.out.println("Fuel tank: "+t3.fuel);
        System.out.println("Payload: "+t3.payload);
        System.out.println("Tyre: "+t3.tyre);
        System.out.println("Transmission: "+t3.transmission);
        t3.setCount(31);
        System.out.println("Available Quantity: "+t3.getCount());
    }
    public static void Tata_2818()
    {
        tata_2818 t4=new tata_2818(3205000,187,28000,5505,5600,365,33000,10,"Manual-Synchromesh",23);
        System.out.println("Price: "+t4.price);
        System.out.println("Power: "+t4.power);
        System.out.println("GVW: "+t4.gvw);
        System.out.println("Wheelbase: "+t4.wheelbase);
        System.out.println("Engine: "+t4.engine);
        System.out.println("Fuel tank: "+t4.fuel);
        System.out.println("Payload: "+t4.payload);
        System.out.println("Tyre: "+t4.tyre);
        System.out.println("Transmission: "+t4.transmission);
        t4.setCount(28);
        System.out.println("Available Quantity: "+t4.getCount());
    }
    public static void Tata_3118()
    {
        tata_3118 t5=new tata_3118(3717000,180,31000,5080,5600,365,33000,10,"Manual",21);
        System.out.println("Price: "+t5.price);
        System.out.println("Power: "+t5.power);
        System.out.println("GVW: "+t5.gvw);
        System.out.println("Wheelbase: "+t5.wheelbase);
        System.out.println("Engine: "+t5.engine);
        System.out.println("Fuel tank: "+t5.fuel);
        System.out.println("Payload: "+t5.payload);
        System.out.println("Tyre: "+t5.tyre);
        System.out.println("Transmission: "+t5.transmission);
        t5.setCount(27);
        System.out.println("Available Quantity: "+t5.getCount());
    }
}
class tata_HD_9S
{
    int price;
    int power;
    int gvw;
    int wheelbase;
    int engine;
    int fuel;
    int payload;
    int tyre;
    String transmission;
    private int count;
    public tata_HD_9S(int price,int power,int gvw,int wheelbase,int engine,int fuel,int payload,int tyre,String transmission,int count)
    {
        this.price=price;
        this.power=power;
        this.gvw=gvw;
        this.wheelbase=wheelbase;
        this.engine=engine;
        this.fuel=fuel;
        this.payload=payload;
        this.tyre=tyre;
        this.transmission=transmission;
        this.count=count;
    }
    public int getCount()
    {
        return count;
    }
    public void setCount(int count)
    {
        this.count=count;
    }
}
class tata_STD_6S
{
    int price;
    int power;
    int gvw;
    int wheelbase;
    int engine;
    int fuel;
    int payload;
    int tyre;
    String transmission;
    private int count;
    public tata_STD_6S(int price,int power,int gvw,int wheelbase,int engine,int fuel,int payload,int tyre,String transmission,int count)
    {
        this.price=price;
        this.power=power;
        this.gvw=gvw;
        this.wheelbase=wheelbase;
        this.engine=engine;
        this.fuel=fuel;
        this.payload=payload;
        this.tyre=tyre;
        this.transmission=transmission;
        this.count=count;
    }
    public int getCount()
    {
        return count;
    }
    public void setCount(int count)
    {
        this.count=count;
    }
}
class tata_5530
{
    int price;
    int power;
    int gvw;
    int wheelbase;
    int engine;
    int fuel;
    int payload;
    int tyre;
    String transmission;
    private int count;
    public tata_5530(int price,int power,int gvw,int wheelbase,int engine,int fuel,int payload,int tyre,String transmission,int count)
    {
        this.price=price;
        this.power=power;
        this.gvw=gvw;
        this.wheelbase=wheelbase;
        this.engine=engine;
        this.fuel=fuel;
        this.payload=payload;
        this.tyre=tyre;
        this.transmission=transmission;
        this.count=count;
    }
    public int getCount()
    {
        return count;
    }
    public void setCount(int count)
    {
        this.count=count;
    }
}
class tata_2818
{
    int price;
    int power;
    int gvw;
    int wheelbase;
    int engine;
    int fuel;
    int payload;
    int tyre;
    String transmission;
    private int count;
    public tata_2818(int price,int power,int gvw,int wheelbase,int engine,int fuel,int payload,int tyre,String transmission,int count)
    {
        this.price=price;
        this.power=power;
        this.gvw=gvw;
        this.wheelbase=wheelbase;
        this.engine=engine;
        this.fuel=fuel;
        this.payload=payload;
        this.tyre=tyre;
        this.transmission=transmission;
        this.count=count;
    }
    public int getCount()
    {
        return count;
    }
    public void setCount(int count)
    {
        this.count=count;
    }
}
class tata_3118
{
    int price;
    int power;
    int gvw;
    int wheelbase;
    int engine;
    int fuel;
    int payload;
    int tyre;
    String transmission;
    private int count;
    public tata_3118(int price,int power,int gvw,int wheelbase,int engine,int fuel,int payload,int tyre,String transmission,int count)
    {
        this.price=price;
        this.power=power;
        this.gvw=gvw;
        this.wheelbase=wheelbase;
        this.engine=engine;
        this.fuel=fuel;
        this.payload=payload;
        this.tyre=tyre;
        this.transmission=transmission;
        this.count=count;
    }
    public int getCount()
    {
        return count;
    }
    public void setCount(int count)
    {
        this.count=count;
    }
}
class Ashok_layland
{
    String name;
    Ashok_layland(String name)
    {
        this.name=name;
    }
    public static void Ashok_layland_2820()
    {
        ashok_layland_2820 a1=new ashok_layland_2820(4365000,200,28000,5302,6100,300,29000,10,"Manual",20);
        System.out.println("Price: "+a1.price);
        System.out.println("Power: "+a1.power);
        System.out.println("GVW: "+a1.gvw);
        System.out.println("Wheelbase: "+a1.wheelbase);
        System.out.println("Engine: "+a1.engine);
        System.out.println("Fuel tank: "+a1.fuel);
        System.out.println("Payload: "+a1.payload);
        System.out.println("Tyre: "+a1.tyre);
        System.out.println("Transmission: "+a1.transmission);
        a1.setCount(27);
        System.out.println("Available Quantity: "+a1.getCount());
    }
    public static void Ashok_layland_5525()
    {
        ashok_layland_5525 a2=new ashok_layland_5525(4508000,250,55000,3900,6500,375,57000,10,"Manual",22);
        System.out.println("Price: "+a2.price);
        System.out.println("Power: "+a2.power);
        System.out.println("GVW: "+a2.gvw);
        System.out.println("Wheelbase: "+a2.wheelbase);
        System.out.println("Engine: "+a2.engine);
        System.out.println("Fuel tank: "+a2.fuel);
        System.out.println("Payload: "+a2.payload);
        System.out.println("Tyre: "+a2.tyre);
        System.out.println("Transmission: "+a2.transmission);
        a2.setCount(28);
        System.out.println("Available Quantity: "+a2.getCount());
    }
    public static void Ashok_layland_MAV()
    {
        ashok_layland_MAV a3=new ashok_layland_MAV(3234000,200,28000,5450,6400,375,29000,10,"Manual",21);
        System.out.println("Price: "+a3.price);
        System.out.println("Power: "+a3.power);
        System.out.println("GVW: "+a3.gvw);
        System.out.println("Wheelbase: "+a3.wheelbase);
        System.out.println("Engine: "+a3.engine);
        System.out.println("Fuel tank: "+a3.fuel);
        System.out.println("Payload: "+a3.payload);
        System.out.println("Tyre: "+a3.tyre);
        System.out.println("Transmission: "+a3.transmission);
        a3.setCount(30);
        System.out.println("Available Quantity: "+a3.getCount());
    }
    public static void Ashok_layland_AVTR()
    {
        ashok_layland_AVTR a4=new ashok_layland_AVTR(3205000,210,27000,5600,6540,375,27600,10,"Synchromesh",24);
        System.out.println("Price: "+a4.price);
        System.out.println("Power: "+a4.power);
        System.out.println("GVW: "+a4.gvw);
        System.out.println("Wheelbase: "+a4.wheelbase);
        System.out.println("Engine: "+a4.engine);
        System.out.println("Fuel tank: "+a4.fuel);
        System.out.println("Payload: "+a4.payload);
        System.out.println("Tyre: "+a4.tyre);
        System.out.println("Transmission: "+a4.transmission);
        a4.setCount(29);
        System.out.println("Available Quantity: "+a4.getCount());
    }
    public static void Ashok_layland_RMC()
    {
        ashok_layland_RMC a5=new ashok_layland_RMC(3743000,200,28000,3900,6100,220,66000,10,"Manual",25);
        System.out.println("Price: "+a5.price);
        System.out.println("Power: "+a5.power);
        System.out.println("GVW: "+a5.gvw);
        System.out.println("Wheelbase: "+a5.wheelbase);
        System.out.println("Engine: "+a5.engine);
        System.out.println("Fuel tank: "+a5.fuel);
        System.out.println("Payload: "+a5.payload);
        System.out.println("Tyre: "+a5.tyre);
        System.out.println("Transmission: "+a5.transmission);
        a5.setCount(31);
        System.out.println("Available Quantity: "+a5.getCount());
    }
}
class ashok_layland_2820
{
    int price;
    int power;
    int gvw;
    int wheelbase;
    int engine;
    int fuel;
    int payload;
    int tyre;
    String transmission;
    private int count;
    public ashok_layland_2820(int price,int power,int gvw,int wheelbase,int engine,int fuel,int payload,int tyre,String transmission,int count)
    {
        this.price=price;
        this.power=power;
        this.gvw=gvw;
        this.wheelbase=wheelbase;
        this.engine=engine;
        this.fuel=fuel;
        this.payload=payload;
        this.tyre=tyre;
        this.transmission=transmission;
        this.count=count;
    }
    public int getCount()
    {
        return count;
    }
    public void setCount(int count)
    {
        this.count=count;
    }
}
class ashok_layland_5525
{
    int price;
    int power;
    int gvw;
    int wheelbase;
    int engine;
    int fuel;
    int payload;
    int tyre;
    String transmission;
    private int count;
    public ashok_layland_5525(int price,int power,int gvw,int wheelbase,int engine,int fuel,int payload,int tyre,String transmission,int count)
    {
        this.price=price;
        this.power=power;
        this.gvw=gvw;
        this.wheelbase=wheelbase;
        this.engine=engine;
        this.fuel=fuel;
        this.payload=payload;
        this.tyre=tyre;
        this.transmission=transmission;
        this.count=count;
    }
    public int getCount()
    {
        return count;
    }
    public void setCount(int count)
    {
        this.count=count;
    }
}
class ashok_layland_MAV
{
    int price;
    int power;
    int gvw;
    int wheelbase;
    int engine;
    int fuel;
    int payload;
    int tyre;
    String transmission;
    private int count;
    public ashok_layland_MAV(int price,int power,int gvw,int wheelbase,int engine,int fuel,int payload,int tyre,String transmission,int count)
    {
        this.price=price;
        this.power=power;
        this.gvw=gvw;
        this.wheelbase=wheelbase;
        this.engine=engine;
        this.fuel=fuel;
        this.payload=payload;
        this.tyre=tyre;
        this.transmission=transmission;
        this.count=count;
    }
    public int getCount()
    {
        return count;
    }
    public void setCount(int count)
    {
        this.count=count;
    }
}
class ashok_layland_AVTR
{
    int price;
    int power;
    int gvw;
    int wheelbase;
    int engine;
    int fuel;
    int payload;
    int tyre;
    String transmission;
    private int count;
    public ashok_layland_AVTR(int price,int power,int gvw,int wheelbase,int engine,int fuel,int payload,int tyre,String transmission,int count)
    {
        this.price=price;
        this.power=power;
        this.gvw=gvw;
        this.wheelbase=wheelbase;
        this.engine=engine;
        this.fuel=fuel;
        this.payload=payload;
        this.tyre=tyre;
        this.transmission=transmission;
        this.count=count;
    }
    public int getCount()
    {
        return count;
    }
    public void setCount(int count)
    {
        this.count=count;
    }
}
class ashok_layland_RMC
{
    int price;
    int power;
    int gvw;
    int wheelbase;
    int engine;
    int fuel;
    int payload;
    int tyre;
    String transmission;
    private int count;
    public ashok_layland_RMC(int price,int power,int gvw,int wheelbase,int engine,int fuel,int payload,int tyre,String transmission,int count)
    {
        this.price=price;
        this.power=power;
        this.gvw=gvw;
        this.wheelbase=wheelbase;
        this.engine=engine;
        this.fuel=fuel;
        this.payload=payload;
        this.tyre=tyre;
        this.transmission=transmission;
        this.count=count;
    }
    public int getCount()
    {
        return count;
    }
    public void setCount(int count)
    {
        this.count=count;
    }
}


class twowheeler1
{
    public void twoWheeler()
    {
        System.out.println("--------------------");
        System.out.println("press 1 for honda");
        System.out.println("press 2 for bajaj");
        System.out.println("press 3 for tvs");
        System.out.println("press 4 for RE");
        System.out.println("press 5 for hero");

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value for brand name");
        int n=sc.nextInt();

        switch(n)
        {
            case 1:System.out.println("welcome to honda collection");
                twowheeler1 h=new twowheeler1();
                h.honda();
                break;

            case 2:System.out.println("welcome to bajaj collection");
                twowheeler1 b=new twowheeler1();
                b.bajaj();
                break;

            case 3:System.out.println("welcome to tvs collection");
                twowheeler1 t=new twowheeler1();
                t.tvs();
                break;

            case 4:
                System.out.println("welcome to RE collection");
                twowheeler1 r=new twowheeler1();
                r.RE();
                break;

            case 5:
                System.out.println("welcome to hero collection");
                twowheeler1 he=new twowheeler1();
                he.hero();
                break;

            default:System.out.println("enter valid no");
                twoWheeler();
                break;
        }
    }
    public void honda()
    {
        System.out.println("--------------------");
        System.out.println("press 1 for splender");
        System.out.println("press 2 for unicorn");
        System.out.println("press 3 for shine");
        System.out.println("press 4 for activa 6g");
        System.out.println("press 5 for Honda Hness CB350");

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value for honda brand name");
        int n=sc.nextInt();

        switch(n)
        {
            case 1:System.out.println("you have selected splender");
                System.out.println("--------------------------------");
                System.out.println("features of splender");
                System.out.println("Showroom price:49500-74500");
                System.out.println("fuel tank capacity:8.5 to 11 Ltr");
                System.out.println("displacement:97.2 to 113.2cc");
                break;

            case 2:System.out.println("you have selected unicorn");
                System.out.println("--------------------------------");
                System.out.println("features of unicorn");
                System.out.println("Showroom price:72000-1.07 Lakhs");
                System.out.println("fuel tank capacity:13 Ltr");
                System.out.println("displacement:149.2 TO 162.7cc");
                break;

            case 3:System.out.println("you have selected shine");
                System.out.println("--------------------------------");
                System.out.println("features of shine");
                System.out.println("Showroom price:57000-84300");
                System.out.println("fuel tank capacity:10.5 Ltr");
                System.out.println("displacement:124cc");
                break;

            case 4:System.out.println("you have selected activa 6g");
                System.out.println("--------------------------------");
                System.out.println("features of activa 6g");
                System.out.println("Showroom price:70500-78000");
                System.out.println("fuel tank capacity:5.3 Ltr");
                System.out.println("displacement:109.5cc");
                break;

            case 5:System.out.println("you have selected Honda Hness CB350");
                System.out.println("--------------------------------");
                System.out.println("features of Honda Hness CB350");
                System.out.println("Showroom price:Rs.1,95.458-Rs.2,05,243");
                System.out.println("fuel tank capacity:15 Ltr");
                System.out.println("displacement:348cc");
                System.out.println("mileage: 35");
                System.out.println("kerb weight: 181 Kg");
                System.out.println("Transmission: 5 speed manual");
                System.out.println("seat height :800mm");
                break;

            default:System.out.println("enter valid no");
                honda();
                break;
        }
    }
    public void bajaj()
    {

        System.out.println("--------------------");
        System.out.println("press 1 for pulsar 220");
        System.out.println("press 2 for platina");
        System.out.println("press 3 for dominar 400");
        System.out.println("press 4 for bajaj CT-110");
        System.out.println("press 5 for Bajaj Avenger Cruise 220");

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value for bajaj brand name");
        int n=sc.nextInt();

        switch(n)
        {
            case 1:System.out.println("you have selected pulsar 220");
                System.out.println("--------------------------------");
                System.out.println("features of pulsar 220");
                System.out.println("Showroom price:1.18 Lakhs-1.38 Lakhs");
                System.out.println("fuel tank capacity:15 Ltr");
                System.out.println("displacement:220cc");

                break;

            case 2:System.out.println("you have selected platina");
                System.out.println("--------------------------------");
                System.out.println("features of platina");
                System.out.println("Showroom price:65500-70000");
                System.out.println("fuel tank capacity:11 Ltr");
                System.out.println("displacement:115.45cc");
                break;

            case 3:System.out.println("you have selected dominar 400");
                System.out.println("--------------------------------");
                System.out.println("features of dominar 400");
                System.out.println("Showroom price:1.69Lakhs");
                System.out.println("colour:light Grey");
                System.out.println("fuel tank capacity:13 Ltr");
                System.out.println("displacement:373.3cc");
                break;

            case 4:System.out.println("you have selected bajaj CT-110");
                System.out.println("--------------------------------");
                System.out.println("features of bajaj CT-110");
                System.out.println("Showroom price:39600-66500");
                System.out.println("fuel tank capacity:10.5 to 11 Ltr");
                System.out.println("displacement:115 to 115.4cc");
                break;

            case 5:
                System.out.println("you have Bajaj Avenger Cruise 220");
                System.out.println("--------------------------------");
                System.out.println("features of Bajaj Avenger Cruise 220");
                System.out.println("Showroom price:Rs.1,33,432-Rs.1,42,433");
                System.out.println("fuel tank capacity: 13 Ltr");
                System.out.println("displacement: 220 cc");
                System.out.println("mileage: 40");
                System.out.println("kerb weight: 164 Kg");
                System.out.println("Transmission: 5 speed manual");
                System.out.println("seat height :737mm");
                break;

            default:System.out.println("enter valid no");
                bajaj();
                break;
        }
    }
    public void tvs()
    {

        System.out.println("--------------------");
        System.out.println("press 1 for apache");
        System.out.println("press 2 for TVS raider 125");
        System.out.println("press 3 for TVS jupiter");
        System.out.println("press 4 for TVS Radeon");
        System.out.println("press 5 for TVS Star City Plus");

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value for TVS brand name");
        int n=sc.nextInt();

        switch(n)
        {
            case 1:System.out.println("you have selected Apache");
                System.out.println("--------------------------------");
                System.out.println("features of Apache");
                System.out.println("Showroom price:77800-2.65Lakhs");
                System.out.println("fuel tank capacity:11-16 Ltr");
                System.out.println("displacement:159.7cc");
                break;

            case 2:System.out.println("you have selected TVS raider 125");
                System.out.println("--------------------------------");
                System.out.println("features of TVS raider 125");
                System.out.println("Showroom price:84550-95700");
                System.out.println("fuel tank capacity:10 Ltr");
                System.out.println("displacement:124.8 cc");
                break;

            case 3:System.out.println("you have selected TVS jupiter");
                System.out.println("--------------------------------");
                System.out.println("features of TVS Jupiter");
                System.out.println("Showroom price:53700-90000");
                System.out.println("fuel tank capacity:5-5.1 Ltr");
                System.out.println("displacement:109.7to 124.8 cc");
                break;

            case 4:System.out.println("you have selected TVS Radeon");
                System.out.println("--------------------------------");
                System.out.println("features of TVS Radeon");
                System.out.println("Showroom price:Rs.68,700-Rs.75,000");
                System.out.println("fuel tank capacity:10 Ltr");
                System.out.println("displacement:109.6cc");
                System.out.println("mileage: 65");
                System.out.println("kerb weight: 116 Kg");
                System.out.println("Transmission: 4 speed manual");
                System.out.println("Max power :8.08 bhp");
                break;

            case 5:System.out.println("you have selected TVS Star City Plus");
                System.out.println("--------------------------------");
                System.out.println("features of TVS Star City Plus");
                System.out.println("Showroom price:Rs.69,876-Rs.74,890");
                System.out.println("fuel tank capacity:10 Ltr");
                System.out.println("displacement:109.7cc");
                System.out.println("mileage: 67.5");
                System.out.println("kerb weight: 115 Kg");
                System.out.println("Transmission: 4 speed manual");
                System.out.println("seat height :785mm");
                break;

            default:System.out.println("enter valid no");
                tvs();
                break;
        }
    }
    public void RE()
    {
        System.out.println("press 1 for classic 350");
        System.out.println("press 2 for Himalayan");
        System.out.println("press 3 for Meteor 350");
        System.out.println("press 4 for Interceptor");
        System.out.println("press 5 for Bullet 350");

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for RE brand name");
        int n=sc.nextInt();

        switch(n)
        {
            case 1:
                System.out.println("you have selected classic 350");
                System.out.println("********************");
                System.out.println("features of classic 350");
                System.out.println("Ex-Showroom price: Rs.1,90,200-RS.2,20,000");
                System.out.println("Engine capacity: 349cc");
                System.out.println("Mileage: 35 Kmpl");
                System.out.println("Transmission: 5 speed manual");
                System.out.println("kerb weight: 195 Kg");
                System.out.println("Fuel capacity: 13 Ltr");
                System.out.println("seat height: 805 mm");
                break;

            case 2:
                System.out.println("you have selected Himalayan");
                System.out.println("********************");
                System.out.println("features of Himalayan");
                System.out.println("Ex-Showroom price: Rs.2,14,200-Rs.2,22,120");
                System.out.println("Engine capacity: 411cc");
                System.out.println("Mileage: 30 Kmpl");
                System.out.println("Transmission: 5 speed manual");
                System.out.println("kerb weight: 199 Kg");
                System.out.println("Fuel capacity: 15 Ltr");
                System.out.println("seat height: 800 mm");
                break;

            case 3:
                System.out.println("you have selected Meteor 350");
                System.out.println("********************");
                System.out.println("features of Meteor 350");
                System.out.println("Ex-Showroom price: Rs.2,05,200-Rs.2,21,120");
                System.out.println("Engine capacity: 349cc");
                System.out.println("Mileage: 35 Kmpl");
                System.out.println("Transmission: 5 speed manual");
                System.out.println("kerb weight: 191 Kg");
                System.out.println("Fuel capacity: 15 Ltr");
                System.out.println("seat height: 765 mm");
                break;

            case 4:
                System.out.println("you have selected Interceptor");
                System.out.println("********************");
                System.out.println("features of Interceptor");
                System.out.println("Ex-Showroom price: Rs.2,88,180-Rs.3,14,123");
                System.out.println("Engine capacity: 648cc");
                System.out.println("Mileage: 23 Kmpl");
                System.out.println("Transmission: 6 speed manual");
                System.out.println("kerb weight: 202 Kg");
                System.out.println("Fuel capacity: 13.7 Ltr");
                System.out.println("seat height: 804 mm");
                break;

            case 5:
                System.out.println("you have selected Bullet 350");
                System.out.println("********************");
                System.out.println("features of Bullet 350");
                System.out.println("Ex-Showroom price: Rs.1,48,700-Rs.1,63,223");
                System.out.println("Engine capacity: 346cc");
                System.out.println("Mileage: 38 Kmpl");
                System.out.println("Transmission: 5 speed manual");
                System.out.println("kerb weight: 191 Kg");
                System.out.println("Fuel capacity: 13.5 Ltr");
                System.out.println("seat height: 800 mm");
                break;
            default:
                System.out.println("enter valid no");
                RE();
                break;
        }
    }
    public void hero()
    {
        System.out.println("press 1 for Hero Passion Pro ");
        System.out.println("press 2 for Hero Glamour");
        System.out.println("press 3 for Hero Xtreme 160R");
        System.out.println("press 4 for Hero Xpulse 200 4V");
        System.out.println("press 5 for Hero HF Deluxe");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for hero brand name");
        int n = sc.nextInt();

        switch (n)
        {
            case 1:
                System.out.println("you have selected Hero Passion Pro ");
                System.out.println("********************");
                System.out.println("features of Hero Passion Pro");
                System.out.println("Ex-Showroom price:Rs.70,000-Rs.78,800");
                System.out.println("Engine capacity: 110cc");
                System.out.println("Mileage: 55 Kmpl");
                System.out.println("Transmission: 4 speed manual");
                System.out.println("kerb weight: 117 Kg");
                System.out.println("Fuel capacity: 10 Ltr");
                System.out.println("seat height: 799 mm");
                break;

            case 2:
                System.out.println("you have selected Hero Glamour ");
                System.out.println("********************");
                System.out.println("features of Hero Glamour");
                System.out.println("Ex-Showroom price:Rs.76,000-Rs.88,800");
                System.out.println("Engine capacity: 125cc");
                System.out.println("Mileage: 55 Kmpl");
                System.out.println("Transmission: 5 speed manual");
                System.out.println("kerb weight: 122 Kg");
                System.out.println("Fuel capacity: 10 Ltr");
                System.out.println("seat height: 793 mm");
                break;

            case 3:
                System.out.println("you have selected Hero Xtreme 160R");
                System.out.println("********************");
                System.out.println("features of Hero Xtreme 160R");
                System.out.println("Ex-Showroom price:Rs.1,13,000-Rs.1,23,400");
                System.out.println("Engine capacity: 163cc");
                System.out.println("Mileage: 47 Kmpl");
                System.out.println("Transmission: 5 speed manual");
                System.out.println("kerb weight: 139 Kg");
                System.out.println("Fuel capacity: 12 Ltr");
                System.out.println("seat height: 790 mm");
                break;

            case 4:
                System.out.println("you have selected Hero Xpulse 200 4V");
                System.out.println("********************");
                System.out.println("features of Hero Xpulse 200 4V");
                System.out.println("Ex-Showroom price:Rs.1,35,450-Rs.1,44,450");
                System.out.println("Engine capacity: 199cc");
                System.out.println("Mileage: 40 Kmpl");
                System.out.println("Transmission: 5 speed manual");
                System.out.println("kerb weight: 158 Kg");
                System.out.println("Fuel capacity: 13 Ltr");
                System.out.println("seat height: 825 mm");
                break;

            case 5:
                System.out.println("you have selected Hero HF Deluxe");
                System.out.println("********************");
                System.out.println("features of Hero HF Deluxe");
                System.out.println("Ex-Showroom price:Rs.53,350-Rs.65,490");
                System.out.println("Engine capacity: 97cc");
                System.out.println("Mileage: 65 Kmpl");
                System.out.println("Transmission: 4 speed manual");
                System.out.println("kerb weight: 110 Kg");
                System.out.println("Fuel capacity: 9.1 Ltr");
                System.out.println("seat height: 805 mm");
                break;

            default:
                System.out.println("enter valid no");
                hero();
                break;
        }
    }
}
class threewheeler1
{
    public void threeWheeler()
    {
        System.out.println("*****************************");
        System.out.println("press 1 for TumTum");
        System.out.println("press 2 for Auto");

        Scanner sc=new Scanner(System.in);
        System.out.println("*****************************");
        System.out.println("Enter the value for type");
        int n=sc.nextInt();

        switch(n)
        {
            case 1:
                System.out.println("you have selected TumTum");
                threewheeler1 tum=new threewheeler1();
                tum.tumtum();
                break;

            case 2:
                System.out.println("you have selected Auto");
                threewheeler1 au=new threewheeler1();
                au.auto();
                break;

            default :
                System.out.println("Enter valid no:");
                threeWheeler();
                break;
        }
    }
    public void tumtum()
    {
        System.out.println("**********************");
        System.out.println("press 1 for Super Eco Tumtum With Z1 Kit ");
        System.out.println("press 2 for Tumtum Battery E-Rickshaw ");

        Scanner sc=new Scanner(System.in);
        System.out.println("--------------------");
        System.out.println("enter the value for tumtum name");
        int n=sc.nextInt();

        switch(n)
        {
            case 1:
                System.out.println("you have selected Super Eco Tumtum With Z1 Kit");
                System.out.println("-----------------------------");
                System.out.println("features of Super Eco Tumtum With Z1 Kit");
                System.out.println("Mileage:40 - 50 Km /Charge");
                System.out.println("Max speed: 25 Kmph");
                System.out.println("Motor power:1000 W");
                break;

            case 2:
                System.out.println("you have selected Tumtum Battery E-Rickshaw ");
                System.out.println("-----------------------------");
                System.out.println("features of Tumtum Battery E-Rickshaw ");
                System.out.println("Price:Rs.1,10,000 to 1,70,000");
                System.out.println("Seating capacity: 5 Seater");
                System.out.println("Speed :40Kmph");
                break;

            default :
                System.out.println("Enter valid no");
                tumtum();
                break;
        }
    }
    public void auto()
    {
        System.out.println("**********************");
        System.out.println("press 1 for Bajaj re Diesel ");
        System.out.println("press 2 for Bajaj re CNG ");

        Scanner sc=new Scanner(System.in);
        System.out.println("--------------------");
        System.out.println("enter the value for Auto name");
        int n=sc.nextInt();

        switch(n)
        {
            case 1:
                System.out.println("you have selected Bajaj re Diesel");
                System.out.println("-----------------------------");
                System.out.println("features of Bajaj re Diesel");
                System.out.println("Engine displacement:470.5 cc");
                System.out.println("Max net power:6.24kW");
                System.out.println("Clutch type:Dry, SIngleplate");
                System.out.println("fuel tank:8 ltr");
                System.out.println("cooling system:oil-cooled engine");
                break;

            case 2:
                System.out.println("you have selected Bajaj re CNG");
                System.out.println("-----------------------------");
                System.out.println("features of Bajaj re CNG ");
                System.out.println("Engine displacement:236.3 cc");
                System.out.println("Max net power:6.9kW");
                System.out.println("cooling system:oil-cooled engine");
                System.out.println("Fuel tank capacity:30 l");
                System.out.println("Clutch type:Wet, Multiplate");
                System.out.println("Drive Shaft:CV Shaft");
                break;

            default :
                System.out.println("Enter valid no");
                auto();
                break;
        }
    }
}
class fourwheeler1
{
    public void fourWheeler()
    {
        System.out.println("--------------------");
        System.out.println("press 1 for diesel fourwheeler");
        System.out.println("press 2 for petrol fourwheeler");
        System.out.println("press 3 for EV fourwheeler");

        Scanner sc=new Scanner(System.in);
        System.out.println("--------------------");
        System.out.println("enter the value for type");
        int n=sc.nextInt();

        switch(n)
        {
            case 1:System.out.println("You have selected diesel car");
                fourwheeler1 d=new fourwheeler1();
                d.diesel();

                break;

            case 2:System.out.println("You have selected petrol car");
                fourwheeler1 p=new fourwheeler1();
                p.petrol();
                break;

            case 3:System.out.println("You have selected EV car");
                fourwheeler1 e=new fourwheeler1();
                e.ev();
                break;

            default:System.out.println("enter valid no");
                fourWheeler();
                break;
        }
    }
    public void diesel()
    {
        System.out.println("--------------------");
        System.out.println("press 1 for Mahindra Scorpio-N");
        System.out.println("press 2 for Land Rover Range");
        System.out.println("press 3 for Mercedes-Benz C-Class");
        System.out.println("press 4 for Jeep Maridian");
        System.out.println("press 5 for Hyundai Verna");

        Scanner sc=new Scanner(System.in);
        System.out.println("--------------------");
        System.out.println("enter the value for diesel car name");
        int n=sc.nextInt();

        switch(n)
        {
            case 1:System.out.println("you have selected Mahindra Scorpio-N");
                System.out.println("--------------------------------");
                System.out.println("features of Mahindra Scorpio-N");
                System.out.println("Showroom price:11.99 Lakhs-19.49 Lakhs");
                System.out.println("fuel tank capacity:57 Ltr");
                System.out.println("displacement:2198 cc");

                break;

            case 2:System.out.println("you have selected Land Rover Range");
                System.out.println("--------------------------------");
                System.out.println("features of Land Rover Range");
                System.out.println("Showroom price:86 Lakhs-2.11 Cr");
                System.out.println("fuel tank capacity:80-90 Ltr");
                System.out.println("displacement:4367 cc");
                break;

            case 3:System.out.println("you have selected Mercedes-Benz C-Class");
                System.out.println("--------------------------------");
                System.out.println("features of Mercedes-Benz C-Class");
                System.out.println("Showroom price:55 Lakhs-65 Lakhs");
                System.out.println("fuel tank capacity:40-50 Ltr");
                System.out.println("displacement:1500 cc");
                break;

            case 4:System.out.println("you have selected Jeep Maridian");
                System.out.println("--------------------------------");
                System.out.println("features of Jeep Maridian");
                System.out.println("Showroom price:30 Lakhs-37 Lakhs");
                System.out.println("fuel tank capacity:60 Ltr");
                System.out.println("displacement:1956 cc");
                break;

            case 5:System.out.println("you have selected Hyundai Verna");
                System.out.println("--------------------------------");
                System.out.println("features of Hyundai Verna");
                System.out.println("Showroom price:Rs.9.42 lakhs onwards-");
                System.out.println("fuel tank capacity:56 Ltr");
                System.out.println("displacement:1497 cc");
                System.out.println("seating capacity: 5 seater");
                System.out.println("Transmission: Manual, Automatic (CVT), Automatic (TC) & Automatic (DCT)");
                System.out.println("mileage: 17.4 to 23.6 Kmpl");
                break;

            default:System.out.println("enter valid no");
                diesel();
                break;
        }
    }
    public void petrol()
    {

        System.out.println("--------------------");
        System.out.println("press 1 for Mercedes-Benz GLA");
        System.out.println("press 2 for Mc Laren GT");
        System.out.println("press 3 for Maruti alto");
        System.out.println("press 4 for Volkswagen virtus");
        System.out.println("press 5 for Renault Kwid");

        Scanner sc=new Scanner(System.in);
        System.out.println("--------------------");
        System.out.println("enter the value for petrol car name");
        int n=sc.nextInt();

        switch(n)
        {
            case 1 :System.out.println("you have selected Mercedes-Benz GLA");
                System.out.println("--------------------------------");
                System.out.println("features of Mercedes-Benz GLA");
                System.out.println("Showroom price:45 Lakhs-49 Lakhs");
                System.out.println("fuel tank capacity:50 Ltr");
                System.out.println("displacement:2143 cc");
                break;

            case 2 :System.out.println("you have selected Mc Laren GT");
                System.out.println("--------------------------------");
                System.out.println("features of Mc Laren GT");
                System.out.println("Showroom price:3.72 Cr");
                System.out.println("fuel tank capacity:72 Ltr");
                System.out.println("displacement:3994 cc");
                break;

            case 3 :System.out.println("you have selected Maruti alto");
                System.out.println("--------------------------------");
                System.out.println("features of Maruti alto");
                System.out.println("Showroom price:3.25 Lakhs-5.02 Lakhs");
                System.out.println("fuel tank capacity:35-60 Ltr");
                System.out.println("displacement:796 cc");
                break;

            case 4 :System.out.println("you have selected Volkswagen virtus");
                System.out.println("--------------------------------");
                System.out.println("features of Volkswagen virtus");
                System.out.println("Showroom price:11 Lakhs-18 Lakhs");
                System.out.println("fuel tank capacity:45 Ltr");
                System.out.println("displacement:1498 cc");
                break;

            case 5 :System.out.println("you have selected Renault Kwid");
                System.out.println("--------------------------------");
                System.out.println("features of Renault Kwid");
                System.out.println("Showroom price:4.5 Lakhs-4.9 Lakhs");
                System.out.println("fuel tank capacity:41 Ltr");
                System.out.println("displacement:999 cc");
                System.out.println("transmission:Manual & Automatic (AMT)");
                System.out.println("Seating capacity: 5 seater");
                System.out.println("safety: 1 Star (Global NCAP)");
                break;

            default:System.out.println("enter valid no");
                petrol();
                break;
        }
    }
    public void ev()
    {

        System.out.println("--------------------");
        System.out.println("press 1 for Tata nexon EV");
        System.out.println("press 2 for MG ZS EV");
        System.out.println("press 3 for Hyundai kona EV");
        System.out.println("press 4 for Tata Tiger EV");
        System.out.println("press 5 for Honda City Hybrid eHEV");

        Scanner sc=new Scanner(System.in);
        System.out.println("--------------------");
        System.out.println("enter the value for EV car name");
        int n=sc.nextInt();

        switch(n)
        {
            case 1:System.out.println("you have selected Tata nexon EV");
                System.out.println("--------------------------------");
                System.out.println("features of Tata nexon EV");
                System.out.println("Showroom price:15 Lakhs-20 Lakhs");
                System.out.println("range:312 km");
                System.out.println("battery capacity:30.2KWH");

                break;

            case 2:System.out.println("you have selected MG ZS EV");
                System.out.println("--------------------------------");
                System.out.println("features of MG ZS EV");
                System.out.println("Showroom price:22 Lakhs-26 Lakhs");
                System.out.println("range:461 km");
                System.out.println("battery capacity:50.3 KWH");
                break;

            case 3:System.out.println("you have selected Hyundai kona EV");
                System.out.println("--------------------------------");
                System.out.println("features of Hyundai kona EV");
                System.out.println("Showroom price:22 Lakhs-25 Lakhs");
                System.out.println("range:484 km");
                System.out.println("battery capacity:250 KWH");
                break;

            case 4:System.out.println("you have selected Tata Tiger EV");
                System.out.println("--------------------------------");
                System.out.println("features of Tata Tiger EV");
                System.out.println("Showroom price:11 Lakhs-14 Lakhs");
                System.out.println("range:306 km");
                System.out.println("battery capacity:26 KWH");
                break;

            case 5:System.out.println("you have selected Honda City Hybrid eHEV");
                System.out.println("--------------------------------");
                System.out.println("features of Honda City Hybrid eHEV");
                System.out.println("Showroom price:19.53 lakhs onwards-");
                System.out.println("range:345 km");
                System.out.println("battery capacity:35 KWH");
                System.out.println("Transmission: Automatic (EV/Hybrid)");
                System.out.println("Engine: 1499 cc");
                System.out.println("Seating capacity: 5 Seater");
                break;

            default:System.out.println("enter valid no");
                ev();
                break;
        }
    }
}
class sixwheeler1
{
    public void sixWheeler()
    {
        System.out.println("--------------------");
        System.out.println("press 1 for Bus");
        System.out.println("press 2 for Truck");

        Scanner sc=new Scanner(System.in);
        System.out.println("--------------------");
        System.out.println("choose six wheeler");
        int n=sc.nextInt();

        switch(n)
        {
            case 1:System.out.println("You have selected bus");
                sixwheeler1 b=new sixwheeler1();
                b.bus();
                break;

            case 2:System.out.println("You have selected truck");
                sixwheeler1 tr=new sixwheeler1();
                tr.truck();
                break;

            default:System.out.println("enter valid no");
                sixWheeler();
                break;
        }
    }
    public void bus()
    {
        System.out.println("--------------------");
        System.out.println("press 1 for Tata magna LPO");
        System.out.println("press 2 for Tata LP 407");
        System.out.println("press 3 for Tata magna");
        System.out.println("press 4 for Tata LP 709");
        System.out.println("press 5 for Volvo 9400 14.5M Bus");
        System.out.println("press 6 for Mahindra Cruzio 3800: 26 Seater Bus");
        System.out.println("press 7 for Force Traveller Monobus Scholar 5200 ");
        System.out.println("press 8 for Eicher 2075H CNG Bus");
        System.out.println("press 9 for Mercedes Benz 2441 Super High Deck Coach Bus");
        System.out.println("press 10 for BharatBenz 1014 bus ");

        Scanner sc=new Scanner(System.in);
        System.out.println("--------------------");
        System.out.println("enter the value for bus");
        int n=sc.nextInt();

        switch(n)
        {
            case 1:System.out.println("you have selected Tata magna LPO");
                System.out.println("--------------------------------");
                System.out.println("features of Tata magna LPO");
                System.out.println("Seating capacity:35 seater");
                System.out.println("Power:228 hp");
                System.out.println("Engine Displacement:5883 cc");

                break;

            case 2:System.out.println("you have selected Tata LP 407");
                System.out.println("--------------------------------");
                System.out.println("features of Tata LP 407");
                System.out.println("Seating capacity:11 seater");
                System.out.println("Power:85 hp");
                System.out.println("Engine Displacement:3783 cc");
                break;

            case 3:System.out.println("you have selected Tata magna");
                System.out.println("--------------------------------");
                System.out.println("features of Tata LP 407");
                System.out.println("Seating capacity:40 seater");
                System.out.println("Power:85 hp");
                System.out.println("Engine Displacement:2956 cc");
                break;

            case 4:System.out.println("you have selected Tata LP 709");
                System.out.println("--------------------------------");
                System.out.println("features of Tata LP 709");
                System.out.println("Seating capacity:44 seater");
                System.out.println("Power:180 hp");
                System.out.println("Engine Displacement:5883 cc");
                break;

            case 5:
                System.out.println("you have selected Volvo 9400 14.5M Bus");
                System.out.println("***********************************");
                System.out.println("features of Volvo 9400 14.5M Bus");
                System.out.println("Steering :Power Steering Adjustment Tilt and Telescopic");
                System.out.println("Power : 410HP");
                System.out.println("GVW:22000 Kg");
                System.out.println("Fuel: Diesel");
                System.out.println("Engine:10800 cc");
                System.out.println("Cylinders : 6");
                break;

            case 6:
                System.out.println("you have selected Mahindra Cruzio 3800: 26 Seater Bus");
                System.out.println("***********************************");
                System.out.println("features of Mahindra Cruzio 3800: 26 Seater Bus");
                System.out.println("Power : 80HP");
                System.out.println("GVW:6700 Kg");
                System.out.println("Fuel: Diesel");
                System.out.println("Engine:2500 cc");
                System.out.println("Cylinders : 4");
                break;

            case 7:
                System.out.println("you have selected Force Traveller Monobus Scholar 5200");
                System.out.println("***********************************");
                System.out.println("features of Force Traveller Monobus Scholar 5200");
                System.out.println("Power : 115HP");
                System.out.println("GVW:8540 Kg");
                System.out.println("Fuel: Diesel");
                System.out.println("Engine:3245 cc");
                System.out.println("Cylinders : 5");
                break;

            case 8:
                System.out.println("you have selected Eicher 2075H CNG Bus");
                System.out.println("***********************************");
                System.out.println("features of Eicher 2075H CNG Bus");
                System.out.println("Power : 115HP");
                System.out.println("GVW:8000 Kg");
                System.out.println("Fuel: CNG");
                System.out.println("Engine:3298 cc");
                System.out.println("Cylinders : 4");
                break;

            case 9:
                System.out.println("you have selected Mercedes Benz 2441 Super High Deck Coach Bus");
                System.out.println("***********************************");
                System.out.println("features of Mercedes Benz 2441 Super High Deck Coach Bus");
                System.out.println("Power : 408HP");
                System.out.println("GVW:22000 Kg");
                System.out.println("Fuel: Diesel");
                System.out.println("Engine:OM457, Vertical in-line ,Water Cooled");
                System.out.println("Cylinders : 6");
                break;

            case 10:
                System.out.println("you have selected BharatBenz 1014 bus");
                System.out.println("***********************************");
                System.out.println("features of BharatBenz 1014 bus");
                System.out.println("Power : 4147HP");
                System.out.println("GVW:10600 Kg");
                System.out.println("Fuel: Diesel");
                System.out.println("Seating Capacity: 49 Seater");
                System.out.println("Engine:3907 cc");
                System.out.println("Cylinders : 4");
                break;

            default:System.out.println("enter valid no");
                bus();
                break;
        }
    }
    public void truck()
    {

        System.out.println("--------------------");
        System.out.println("press 1 for Tata 1412 LPT");
        System.out.println("press 2 for Bharat Benz");
        System.out.println("press 3 for Ashok Layland");
        System.out.println("press 4 for Eicher pro");

        Scanner sc=new Scanner(System.in);
        System.out.println("--------------------");
        System.out.println("enter the value for truck name");
        int n=sc.nextInt();

        switch(n)
        {
            case 1:System.out.println("you have selected Tata 1412 LPT");
                System.out.println("--------------------------------");
                System.out.println("features of Tata 1412 LPT");
                System.out.println("Fuel tank:160 Ltr");
                System.out.println("Engine:3.3L NG BS6");
                System.out.println("Engine Displacement:3300 cc");

                break;

            case 2:System.out.println("you have selected Bharat Benz");
                System.out.println("--------------------------------");
                System.out.println("features of Tata 1412 LPT");
                System.out.println("Fuel tank:370 Ltr");
                System.out.println("Engine:DE 170");
                System.out.println("Engine Displacement:6373 cc");
                break;

            case 3:System.out.println("you have selected Ashok Layland");
                System.out.println("--------------------------------");
                System.out.println("features of Ashok Layland");
                System.out.println("Fuel tank:400 Ltr");
                System.out.println("Engine:5660cc 6 cylinder");
                System.out.println("Engine Displacement:1461 cc");
                break;

            case 4:System.out.println("you have selected Eicher pro");
                System.out.println("--------------------------------");
                System.out.println("features of Eicher pro");
                System.out.println("Fuel tank:350 Ltr");
                System.out.println("Engine:174 Hp 4 cyl 4 valve");
                System.out.println("Engine Displacement:2960 cc");
                break;

            default:System.out.println("enter valid no");
                truck();
                break;
        }
    }
}
class  vehicle
{
    public static void login()
    {
        {
            Scanner sc = new Scanner(System.in);
            String sp=" ";
            System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
            System.out.println("!!-------------------   Registration Process   --------------------!!");
            System.out.println("Enter the Username---");
            String uname = sc.nextLine();
            if((uname.contains(sp)) || uname.length()<4){
                System.out.println("Invalid Username");
                login();
            }

            System.out.println("Enter the Password");
            String upass = sc.nextLine();
            if((upass.contains(sp)) || upass.length()<8){
                System.out.println("Invalid Password");
                login();
            }

            System.out.println(uname+" you are Registered Successfully");

            System.out.println("Enter the Username");
            String lname = sc.nextLine();
            System.out.println("Enter the Password");
            String lpass = sc.nextLine();

            if(uname.equals(lname) && upass.equals(lpass)){
                System.out.println("Welcome "+lname+" you have Logged-in Successfully");
            }
            else{
                System.out.println("Username or password Mismatch");
                login();
            }
        }
    }

    static
    {
        System.out.println("***-------------------**************-------------------***");
        System.out.println("***------     WELCOME TO SIDDHIVINAYAK MOTORS     -----***");
        System.out.println("***-------------------**************-------------------***");
        System.out.println("||---------------------------------------------------------||");
        System.out.println("||                 Press 1 for Two Wheeler                 ||");
        System.out.println("||                 Press 2 for Four Wheeler                ||");
        System.out.println("||                 Press 3 for Six Wheeler                 ||");
        System.out.println("||                 Press 4 for Three Wheeler               ||");
        System.out.println("||                 Press 5 for Ten Wheeler                 ||");
        System.out.println("||---------------------------------------------------------||");
    }
    public static void main(String[] args)
    {
        login();
        Scanner sc=new Scanner(System.in);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("||---------------------------------------------------------||");
        System.out.println("||                 Press 1 for Two Wheeler                 ||");
        System.out.println("||                 Press 2 for Four Wheeler                ||");
        System.out.println("||                 Press 3 for Six Wheeler                 ||");
        System.out.println("||                 Press 4 for Three Wheeler               ||");
        System.out.println("||                 Press 5 for Ten Wheeler                 ||");
        System.out.println("||---------------------------------------------------------||");
        System.out.println("~~~~~~~~~~~~        Enter the value        ~~~~~~~~~~~~");
        int n=sc.nextInt();

        switch(n)
        {
            case 1:System.out.println("welcome to two wheeler collection");
                twowheeler1 ref=new twowheeler1();
                ref.twoWheeler();
                break;

            case 2:System.out.println("welcome to four wheeler collection");
                fourwheeler1 ref1=new fourwheeler1();
                ref1.fourWheeler();
                break;

            case 3:System.out.println("welcome to six wheeler collection");
                sixwheeler1 ref2=new sixwheeler1();
                ref2.sixWheeler();
                break;

            case 4:
                System.out.println("welcome to three wheeler collection");
                threewheeler1 ref3=new threewheeler1();
                ref3.threeWheeler();
                break;

            case 5:
                System.out.println("welcome to ten wheeler collection");
                Motor m1=new Motor("Ten_wheeler");
                System.out.println(m1.vehicle_type);
                System.out.println("Thank you for choosing Ten wheeler");
                System.out.println("=============================================");
                Motor.vehicleT();
                break;

            default:System.out.println("enter valid no");
                break;
        }
    }
}