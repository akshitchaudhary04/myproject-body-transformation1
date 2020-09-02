import java.util.Scanner;
class Myproject
{static double female_calorie,men_calorie,total_calorie,total_calorie1;
static void male(int height,int weight,int age)
	{Scanner t1=new Scanner(System.in);
		
		double men_calorie= 66+(6.2*weight)+(12.7*height)+(6.76*age);
		System.out.println("\n"+"What type of workout you perform: "+"\n"+"A.Low intensity"+"\n"+"B.Moderate intensity"+"\n"+"C.vigorous intensity");
		String intensity=t1.next();
		if(intensity.equals("A"))
		{
			men_calorie=men_calorie+230;
		}
		else if(intensity.equals("B"))
		{
			men_calorie=men_calorie+370;
		}
		else if(intensity.equals("C"))
		{
			men_calorie=men_calorie+500;
		}
System.out.println("========================================");
System.out.println("Your per day calorie burn is: "+ men_calorie);
System.out.println("========================================"+"\n");



	}
	static void female(int height,int weight,int age)
	{Scanner t2=new Scanner(System.in);
		
		female_calorie= 655.1+(4.35*weight)+(4.7*height)+(4.7*age);
		System.out.println("\n"+"What type of workout you perform: "+"\n"+"A.Low intensity"+"\n"+"B.Moderate intensity"+"\n"+"C.vigorous intensity");
		String intensity2=t2.next();
                
		if(intensity2.equals("A"))
		{
			female_calorie=female_calorie+200;
		}
		else if(intensity2.equals("B"))
		{
			female_calorie=female_calorie+300;
		}
		else if(intensity2.equals("C"))
		{
			female_calorie=female_calorie+400;
		}
System.out.println("==============================");
System.out.println("Your per day calorie burn is: "+ female_calorie);
System.out.println("=============================="+"\n");


	}
       static void veg()
{
total_calorie=0;
Scanner t3=new Scanner(System.in);
System.out.println("no. of chappati in a day:");
float chappati=t3.nextInt();
total_calorie=chappati*104;
System.out.println("amount of rice take per day(in gm):");
float rice=t3.nextInt();
total_calorie=total_calorie+rice*1.3;
System.out.println("amount of dairy products take per day(in gm):");
float dairy=t3.nextInt();
total_calorie=total_calorie+dairy*2.4;
System.out.println("amount of legume take per day(in gm):");
float legume=t3.nextInt();
total_calorie=total_calorie+legume*1.39;
System.out.println("amount of salad take per day(in gm):");
float salad=t3.nextInt();
total_calorie=total_calorie+salad*0.20;
System.out.println("no. of fruits take per day:");
float fruit=t3.nextInt();
total_calorie=total_calorie+fruit*.60;
System.out.println("================================================");

System.out.println("Your per day calories intake are "+total_calorie);
System.out.println("================================================="+"\n");

}
static void non_veg()
{
total_calorie1=0;
Scanner t4=new Scanner(System.in);
System.out.println("no. of chappati in a day:");
float chappati1=t4.nextInt();
total_calorie1=chappati1*104;
System.out.println("amount of rice consume per day(in gm):");
float rice1=t4.nextInt();
total_calorie1=total_calorie1+rice1*1.3;
System.out.println("amount of dairy products consume per day(in gm):");
float dairy1=t4.nextInt();
total_calorie1=total_calorie1+dairy1*2.4;
System.out.println("amount of legume consume per day(in gm):");
float legume1=t4.nextInt();
total_calorie1=total_calorie1+legume1*1.39;
System.out.println("amount of salad consume per day(in gm):");
float salad1=t4.nextInt();
total_calorie1=total_calorie1+salad1*0.20;
System.out.println("no. of fruits consume per day:");
float fruit1=t4.nextInt();
total_calorie1=total_calorie1+fruit1*.60;
System.out.println("Amount of chicken consume per day(in gm):");
float chicken=t4.nextInt();
total_calorie1=total_calorie1+chicken*1.9;
System.out.println("Amount of mutton consume per day(in gm):");
float mutton=t4.nextInt();
total_calorie1=total_calorie1+mutton*2.3;
System.out.println("Amount of fish take per day(in gm):");
float fish=t4.nextInt();
total_calorie1=total_calorie1+fish*2.5;
System.out.println("no. of eggs you consume per day:");
float egg=t4.nextInt();
total_calorie1=total_calorie1+egg*0.63;

System.out.println("\n"+"================================================");

System.out.println("Your per day calories intake are "+total_calorie1);
System.out.println("================================================="+"\n");

}
static void men_weight_loss(double men_calory,double total_calory)
{
if(men_calory>total_calory)
{
System.out.println("\n"+"Good job,You're doing good.Here are some tips that will be helpful in your transformation: "+"\n\n"+"* To loss your weight 1 pond per week your daily calorie intake should be 500 less than the daily calorie burn "+"\n\n"+"* Increase the protein source in your food as protein contain less calorie and help to build muscle"+"\n\n"+"* Increase you cardio time a bit "+"\n\n"+"      THANK YOU for using our service.");
}
else
{
System.out.println("Your daily calorie intake is more then Your daily calorie burn.To loss weight here are some tips you can follow :"+"\n"+"• To loss your weight 1 pond per week your daily calorie intake should be 500 less than the daily calorie burn "+"\n"+"• Increase the protein source in your food as protein contain less calorie and help to build muscle"+"\n"+"• Increase you cardio time a bit "+"\n"+"• Immediately cut the junk foods from your diet"+"\n"+"THANK YOU for using our service.");
}


}
static void men_weight_gain(double men_calory1,double total_calory1)
{if(men_calory1<total_calory1)
{
System.out.println("\n"+"Good job,You're doing good.Here are some tips that will be helpful in your transformation: "+"\n\n"+"* To gain your weight 1 pound per week your daily calorie intake should be 500 more than the daily calorie burn "+"\n\n"+"* Increase the carbohydrate source in your food as carbohydrates contain more calorie and help in weight gain"+"\n\n"+"* Your workout should not be more than 1.5 hour  "+"\n\n"+"      THANK YOU for using our service.");
}
else
{
System.out.println("Your daily calorie intake is less than Your daily calorie burn.To gain weight here are some tips you can follow :"+"\n"+"* To gain your weight 1 pond per week your daily calorie intake should be 500 more than the daily calorie burn "+"\n"+"* Increase the carbohydrate source in your food as carbohydrates contain more calorie and helps in weight gain"+"\n"+"* Your workout should not be more than 1.5 hour  "+"\n"+"* Include some heavy shakes in your diet which include banana,peanut butter,oats to increase your calorie intake"+"\n"+"THANK YOU for using our service.");
}

}
			
		

public static void main(String[] s)
{Scanner t=new Scanner(System.in);
	System.out.println("==============================");
    System.out.println("WELCOME");
    System.out.println("=============================="+"\n");
	
	
	System.out.println("Enter your height in cms(1 inches=2.5cm):");
		int height=t.nextInt();
		System.out.println("Enter your weight in kg:");
		int weight=t.nextInt();
		System.out.println("Enter your age:");
		int age=t.nextInt();
	
System.out.println("================================================="+"\n");
System.out.println("Calculate your daily calorie intake:"+"\n");
System.out.println("================================================="+"\n");
System.out.println("Select the type of food you eat:"+"\n"+"A.Vegetarian"+"\n"+"B.Non-Vegeterian");
    String meal=t.next();

switch(meal)
{         case "A":
                  veg();
                  break;
          case "B":
                  non_veg();
                  break; 
       
          default:
                  System.out.println("You have entered the wrong choice(please check that you have used uppercase letter).");




}
System.out.println("================================================="+"\n");
System.out.println("Calculate your daily calorie burn:"+"\n");
System.out.println("================================================="+"\n");
	System.out.println("Select your gender:");
		System.out.println("A.Male"+"\n"+"B.female");
	String gender=t.next();
	switch(gender){
		case "A":
		     male(height,weight,age);
System.out.println("what type of transformation you want to do:"+"\n"+"A.Weight gain"+"\n"+"B.Weight loss");
String type=t.next();
switch(type)
{
case "A":
System.out.println("==========================================================");
System.out.println("Enter the calorie burn in a day that you have calculated:");
System.out.println("=========================================================="+"\n");
double men_calory1=t.nextInt();
System.out.println("===========================================================");
System.out.println("Enter the calorie intake in a day that you have calculated:");
System.out.println("==========================================================="+"\n");
double total_calory1=t.nextInt();

men_weight_gain(men_calory1,total_calory1);
break;


case "B":
System.out.println("============================================================");
System.out.println("Enter the calory burn in a day that you have calculated:");
System.out.println("============================================================"+"\n");
double men_calory=t.nextInt();
System.out.println("============================================================");
System.out.println("Enter the calory intake in a day that you have calculated:");
System.out.println("============================================================"+"\n");
double total_calory=t.nextInt();

men_weight_loss(men_calory,total_calory);
break;
}



                 
			 break;
	    case "B":
	        female(height,weight,age);
System.out.println("what type of transformation you want to do:"+"\n"+"A.Weight gain"+"\n"+"B.Weight loss");
String type1=t.next();
switch(type1)
{
case "A":
System.out.println("=============================================================");
System.out.println("Enter the calorie burn in a day that you have calculated:");
System.out.println("============================================================="+"\n");
double men_calory12=t.nextInt();
System.out.println("=============================================================");
System.out.println("Enter the calorie intake in a day that you have calculated:");
System.out.println("============================================================="+"\n");
double total_calory12=t.nextInt();

men_weight_gain(men_calory12,total_calory12);
break;


case "B":
System.out.println("===============================================================");
System.out.println("Enter the calory burn in a day that you have calculated:"+"\n");
System.out.println("===============================================================");
double men_calory123=t.nextInt();
System.out.println("===============================================================");
System.out.println("Enter the calory intake in a day that you have calculated");
System.out.println("==============================================================="+"\n");
double total_calory123=t.nextInt();

men_weight_loss(men_calory123,total_calory123);
break;
}

	        break;
	   default:
	   System.out.println("You have entered the wrong choice(please check that you have used uppercase letter).");
	    }

}
}