import java.util.Scanner;
interface colours{

	static String bgred="\u001B[41m";
 	static String bgblue="\u001B[44m";
    	static String bgmegenta="\u001B[45";
    	static String bggreen="\u001B[42m";
  	static String bgyellow="\u001B[43m";
    	static String SET_BOLD_TEXT = "\033[0;1m";
	static String REDBRI= "\033[1;91m";
	static String increaseFontSize = "\033[1;31m";
	static String resetFormatting = "\033[0m";
	static String BOLD="\u001B[1m";
	static String blink ="\u001B[5m";
	static String whitebg="\u001B[47m";
	static String black ="\u001B[30m";
	String skblue = "\u001B[36m";
	static String magent = "\u001B[95m";
	static final String ital = "\u001B[3m";
	static String ul = "\u001B[4m";
	static String reset = "\u001B[0m";
    	static String red = "\u001B[31m";
    	static String green = "\u001B[32m";
    	static String yellow = "\u001B[33m";
	static String blue="\u001B[34m";
	static String purple="\u001B[35m";
	static String white="\u001B[37m";
	static String cyan="\u001B[36m";
	static String orange="\u001B[0m";

}


abstract class register implements colours{
	private boolean b=true;
	abstract String name();
	abstract String gmail(String gmail);
	
	private String pass;
	private String Username;
	void setpassUser(String pass,String Username){
		this.pass=pass;
		this.Username=Username;
	}
	
	void setUsername(String Username){
		this.Username=Username;
	}	
	void setpass(String pass){
		this.pass=pass;
	}
	
	String getUsername(){
		return Username;
	}
	String getpass(){
		return pass;
	}
	void setB(boolean m){
		this.b=m;
	}
	boolean getB(){
		return b;
	}
}
class reg extends register{
	
	String name(){
		return B.sc.nextLine();
	}



	String gmail(String gmail){
		int c=0;
	        for(int i=1;	;i++){
	        String duplicate=gmail;
		if(i==1){
			duplicate=gmail;	
		}
		else{
		      gmail=B.sc.next();
		}
		duplicate=gmail;
		if(duplicate.length()<10){
			
	    			System.out.println(red+"The Email you entered is  not valid. "+reset);	
				System.out.println(red+"So,Please enter a Valid Email Address "+reset);	

			continue;
	
		}
	        String a="";
        	for(int j=duplicate.length()-1;j>=duplicate.length()-10;j--){
           	 char ch=duplicate.charAt(j);
			
	            a=ch+a;
	        }
		int m=0,n=0,p=0;
		for(int j=0;j<duplicate.length()-10;j++){
			char ch=duplicate.charAt(j);
			if(ch>='a'&&ch<='z'){
				if(j>=0){
				 m++;	
				}
				else{
				System.out.println(red+"Your gmail is not Valid.So,please try again"+reset);
				setB(false);
				
				}
			}
			else if(ch>='A'&&ch<='Z'){
				if(j==0){
				 m++;	
				}
				else{
				
				n++;
				setB(false);
				
				}
			}	

				
			
			else if(j>2&&ch>='0'&&ch<='9'){
				p++;
			}
			else{
			     n++;
			}
		}
       		if(a.equals("@gmail.com")&&n==0&&p!=0&&m!=0){
			
		    break;
       		 }
		else if(getB()==false){
			
			System.out.println(red+"The Email you entered is  not valid.So,please try agian"+reset);
			continue;
		}
		
        	else{
        	    System.out.println(red+"The Email you entered is  not valid.So,please try agian"+reset);
        	   continue;
       		}
        }
	return gmail;
    }
	




void phone_no(){
	
	String cell_no=B.sc.next();
        int c=0,d=0,x=0;
        if(cell_no.length()==10){
            for(int i=0;i<=cell_no.length()-1;i++){
                char ch=cell_no.charAt(i);
                if(ch>='0'&&ch<='9'){
                    if(i==0&&ch>='6'&&ch<='9'){
                        c++;
                    }
                    else{
                        d++;
                    }
                   
                }
		else{
			x++;
                }
            }
        }
        
        if(c==1&&x==0){
            	
        }
        else if(d!=0||x!=0){
            System.out.println(red+"Enter a Valid Mobile Number"+reset);phone_no();
        }
        else{
            System.out.println(red+"Your Mobile Number Must Contain a 10 digits"+reset);phone_no();
        }
		
	}

	
}



abstract class IND_INR implements colours{

	abstract double INR(double INR);
	double Dollar=83;
	double Russian=0.91;
	double France=89.69;
	double Japan=0.56;
	double Dubai=22.6;
	double Turkey=2.72;
	double Malaysia=17.59;
	double Norway=7.83;
	double Brazil=16.7;
	
}
class Dollar extends IND_INR{
	double INR(double INR){
		System.out.println(skblue+"Converting Dollar(USA) to Indian Rupees......."+reset);
	return INR*Dollar;
	}
}
class Russian extends IND_INR{
	double INR(double INR){
		System.out.println(skblue+"Converting Ruble(Russian) to Indian Rupees......."+reset);
	return INR*Russian;
	}
}
class France extends IND_INR{
	double INR(double INR){
		System.out.println(skblue+"Converting Euro(France) to Indian Rupees......."+reset);
	return INR*France;
	}
}
class Japan extends IND_INR{
	double INR(double INR){
		System.out.println(skblue+"Converting Yen(Japan) to Indian Rupees......."+reset);
	return INR*Japan;
	}
}
class Dubai extends IND_INR{
	double INR(double INR){
		System.out.println(skblue+"Converting Dirham(Dubai) to Indian Rupees......."+reset);
	return INR*Dubai;
	}
}
class Turkey extends IND_INR{
	double INR(double INR){
		System.out.println(skblue+"Converting Lira(Turkey) to Indian Rupees......."+reset);
	return INR*Turkey;
	}
}
class Malaysia extends IND_INR{
	double INR(double INR){
		System.out.println(skblue+"Converting Ringgit(Malaysia) to Indian Rupees......."+reset);
	return INR*Malaysia;
	}
}

class  Norway extends IND_INR{
	double INR(double INR){
		System.out.println(skblue+"Converting Kronr(Norway)  to Indian Rupees......."+reset);
	return INR*Norway;
	}
}

class Brazil extends IND_INR{
	double INR(double INR){
		System.out.println(skblue+"Converting Real(Brazil) to Indian Rupees......."+reset);
	return INR*Brazil;
	}
}




abstract class Dollar1 extends IND_INR{

	abstract double INR(double Dollar);
	double India=83;
	double Russian=90.53;
	double France=0.93;
	double Japan=147.89;
	double Dubai=0.27;
	double Turkey=30.60;
	double Malaysia=4.47;
	double Norway=10.57;
	double Brazil=4.96;
	
}
class India1 extends Dollar1{
	 double INR(double Dollar){
		System.out.println(skblue+"Converting Rupees(India) to United States(Dollar)......."+reset);
	return Dollar/India;
	}
}
class Russian1 extends Dollar1{
	 double INR(double Dollar){
		System.out.println(skblue+"Converting Ruble(Russian) to United States(Dollar)......."+reset);
	return Dollar/Russian;
	}
}
class France1 extends Dollar1{
	 double INR(double Dollar){
		System.out.println(skblue+"Converting Euro(France) to United States(Dollar)......."+reset);
	return Dollar*France;
	}
}
class Japan1 extends Dollar1{
	 double INR(double Dollar){
		System.out.println(skblue+"Converting Yen(Japan) to United States(Dollar)......."+reset);
	return Dollar/Japan;
	}
}
class Dubai1 extends Dollar1{
	 double INR(double Dollar){
		System.out.println(skblue+"Converting Dirham(Dubai) to United States(Dollar)......."+reset);
	return Dollar*Dubai;
	}
}
class Turkey1 extends Dollar1{
	 double INR(double Dollar){
		System.out.println(skblue+"Converting Lira(Turkey) to United States(Dollar)......."+reset);
	return Dollar/Turkey;
	}
}
class Malaysia1 extends Dollar1{
	 double INR(double Dollar){
		System.out.println(skblue+"Converting Ringgit(Malaysia) to United States(Dollar)......."+reset);
	return Dollar/Malaysia;
	}
}

class  Norway1 extends Dollar1{
	 double INR(double Dollar){
		System.out.println(skblue+"Converting Krone(Norway)  to United States(Dollar)......."+reset);
	return Dollar/Norway;
	}
}

class Brazil1 extends Dollar1{
	 double INR(double Dollar){
		System.out.println(skblue+"Converting Real(Brazil) to United States(Dollar)......."+reset);
	return Dollar/Brazil;
	}
}


abstract class Dirham2 extends IND_INR{

	abstract double INR(double Dirham);
	double India=22.6;
	double Dollar=3.67;
	double Russian=24.65;
	double France=3.96;
	double Japan=40.33;
	double Turkey=8.33;
	double Malaysia=1.30;
	double Norway=2.88;
	double Brazil=1.35;
	
}
class India2 extends Dirham2{
	 double INR(double Dirham){
		System.out.println(skblue+"Converting Rupees(India) to Dubai(Dirham)......."+reset);
	return India/Dirham;
	}
}
class Dollar2 extends Dirham2{
	 double INR(double Dirham){
		System.out.println(skblue+"Converting Dirham(Dubai) to Dubai(Dirham)......."+reset);
	return Dirham*Dollar;
		
	}
}

class Russian2 extends Dirham2{
	 double INR(double Dirham){
		System.out.println(skblue+"Converting Ruble(Russian) to Dubai(Dirham)......."+reset);
	return Dirham/Russian;
	}
}
class France2 extends Dirham2{
	 double INR(double Dirham){
		System.out.println(skblue+"Converting Euro(France) to Dubai(Dirham)......."+reset);
	return Dirham*France;
	}
		
}
class Japan2 extends Dirham2{
	 double INR(double Dirham){
		System.out.println(skblue+"Converting Yen(Japan) to Dubai(Dirham)......."+reset);
	return Dirham/Japan;
	}
		
}
class Turkey2 extends Dirham2{
	 double INR(double Dirham){
		System.out.println(skblue+"Converting Lira(Turkey) to United Dubai(Dirham)......."+reset);
	return Dirham/Turkey;
	}

}
class Malaysia2 extends Dirham2{
	 double INR(double Dirham){
		System.out.println(skblue+"Converting Ringgit(Malaysia) to Dubai(Dirham)......."+reset);
	return Dirham/Malaysia;
	}
}

class  Norway2 extends Dirham2{
	 double INR(double Dirham){
		System.out.println(skblue+"Converting Krone(Norway)  to Dubai(Dirham)......."+reset);
	return Dirham/Norway;
	}
}

class Brazil2 extends Dirham2{
	 double INR(double Dirham){
		System.out.println(skblue+"Converting Real(Brazil) to Dubai(Dirham)......."+reset);
	return Dollar/Brazil;
	}
}



abstract class saudi extends IND_INR{

	abstract double INR(double saudi);
	double India=22.12;
	double Dollar=3.75;
	double Russian=24.62;
	double France=4.05;
	double Japan=40.01;
	double Turkey=8.26;
	double Malaysia=1.28;
	double Norway=2.80;
	double Brazil=1.31;
	
}
class India3 extends saudi{
	 double INR(double saudi){
		System.out.println(skblue+"Converting Rupees(India) to Saudi(Riyal)......."+reset);
	return saudi/India;
	}
}
class Dollar3 extends saudi{
	 double INR(double saudi){
		System.out.println(skblue+"Converting Dirham(Dubai) to Saudi(Riyal)......."+reset);
	return saudi*Dollar;
		
	}
}

class Russian3 extends saudi{
	 double INR(double saudi){
		System.out.println(skblue+"Converting Ruble(Russian) to Saudi(Riyal)......."+reset);
	return saudi/Russian;
	}
}
class France3 extends saudi{
	 double INR(double saudi){
		System.out.println(skblue+"Converting Euro(France) to Saudi(Riyal)......."+reset);
	return saudi*France;
	}
		
}
class Japan3 extends saudi{
	 double INR(double saudi){
		System.out.println(skblue+"Converting Yen(Japan) to Saudi(Riyal)......."+reset);
	return saudi/Japan;
	}
		
}
class Turkey3 extends saudi{
	 double INR(double saudi){
		System.out.println(skblue+"Converting Lira(Turkey) to United Saudi(Riyal)......."+reset);
	return saudi/Turkey;
	}

}
class Malaysia3 extends saudi{
	 double INR(double saudi){
		System.out.println(skblue+"Converting Ringgit(Malaysia) to Saudi(Riyal)......."+reset);
	return saudi/Malaysia;
	}
}

class  Norway3 extends saudi{
	 double INR(double saudi){
		System.out.println(skblue+"Converting Krone(Norway)  to Saudi(Riyal)......."+reset);
	return saudi/Norway;
	}
}

class Brazil3 extends saudi{
	 double INR(double saudi){
		System.out.println(skblue+"Converting Real(Brazil) to Saudi(Riyal)......."+reset);
	return saudi/Brazil;
	}
}





class B implements colours 
{
static reg obj2=new reg();
static Scanner sc=new Scanner(System.in);
//static login obj=new login();
	static void display(IND_INR a){
		System.out.println(green+"Enter the amount ..."+reset);
		System.out.println(a.INR(sc.nextDouble()));
	}

	
void M(){
	System.out.println("                      "+REDBRI+"****TO WHICH CURRENCY DO YOU WANT TO CONVERT****\n1.Indian Rupees.... \n2.Dollars..... \n3.Dirhams.....\n4.Saudi(Riyals).... "+reset+"                     ");
	String x=sc.next();		
	switch(x){
			case "1": M1();break;

			case "2": M2();break;
			
			case "3": M3();break;
		
			case "4": M4();break;

			default: System.out.println(red+"You choose Invalid  data...."+reset);
				M();
				break;			
		}
	


}


   void M1( )
{
	
	System.out.println(REDBRI+"which currency do you want to convert into Rupees...?"+reset);	
		System.out.println("1.Dollar \n2. Russian \n3. France \n4. Japan \n5. Dubai \n6. Turkey \n7. Malaysia \n8. Norway \n9. Brazil");
		String x=sc.next(); 
		switch(x){
			case "1": display(new Dollar());M5();break;

			case "2": display(new Russian());M5();break;
			case "3": display(new France());M5();break;
			case "4": display(new Japan());M5();break;
			case "5": display(new Dubai());M5();break;
			case "6": display(new Turkey());M5();break;
			case "7": display(new Malaysia());M5();break;
			case "8": display(new Norway());M5();break;
			case "9": display(new Brazil());M5();break;

			default: System.out.println(red+"You choose Invalid  data...."+reset);
				M1();
				break;	
		}
       
}


void M2( )
	{
	
	System.out.println(REDBRI+"which currency do you want to convert into Dollar......"+reset);
		System.out.println("1.India \n2. Russian \n3. France \n4. Japan \n5. Dubai \n6. Turkey \n7. Malaysia \n8. Norway \n9. Brazil");
		String x=sc.next(); 
		switch(x){
			case "1": display(new India1());M5();break;

			case "2": display(new Russian1());M5();break;
			case "3": display(new France1());M5();break;
			case "4": display(new Japan1());M5();break;
			case "5": display(new Dubai1());M5();break;
			case "6": display(new Turkey1());M5();break;
			case "7": display(new Malaysia1());M5();break;
			case "8": display(new Norway1());M5();break;
			case "9": display(new Brazil1());M5();break;

			default: System.out.println(red+"You choose Invalid  data...."+reset);
				M2();
				break;	
		}
       
}


void M3( )
	{
	
	System.out.println(REDBRI+"which currency do you want to convert into Dirhams...?"+reset);		
		System.out.println("1.India \n2.Dollar \n3. Russian \n4. France \n5. Japan  \n6. Turkey \n7. Malaysia \n8. Norway \n9. Brazil");
		String x=sc.next(); 
		switch(x){
			case "1": display(new India2());M5();break;
			case "2": display(new Dollar2());M5();break;
			case "3": display(new Russian2());M5();break;
			case "4": display(new France2());M5();break;
			case "5": display(new Japan2());M5();break;
			case "6": display(new Turkey2());M5();break;
			case "7": display(new Malaysia2());M5();break;
			case "8": display(new Norway2());M5();break;
			case "9": display(new Brazil2());M5();break;

			default: System.out.println(red+"You choose Invalid  data...."+reset);
				M3();
				break;	
		}
       
}



void M4( )
	{
	System.out.println(REDBRI+"which currency do you want to convert into Saudi(Riyal)...?"+reset);		
		System.out.println("1.India \n2.Dollar \n3. Russian \n4. France \n5. Japan  \n6. Turkey \n7. Malaysia \n8. Norway \n9. Brazil");
		String x=sc.next(); 
		switch(x){
			case "1": display(new India3());M5();break;
			case "2": display(new Dollar3());M5();break;
			case "3": display(new Russian3());M5();break;
			case "4": display(new France3());M5();break;
			case "5": display(new Japan3());M5();break;
			case "6": display(new Turkey3());M5();break;
			case "7": display(new Malaysia3());M5();break;
			case "8": display(new Norway3());M5();break;
			case "9": display(new Brazil3());M5();break;

			default: System.out.println(red+"You choose Invalid  data...."+reset);
				M4();
				break;	
		}
       
}

void M5(){
	System.out.println(green+"Enter 1 to Continue for Conversion "+reset);
	System.out.println(green+"Enter any other key to Exit from Currency Converter "+reset);
	String x=sc.next(); 
		switch(x){
			case "1":M();break;
			
			default: System.out.println("                  "+bgyellow+blink+"THANKYOU FOR USING CURRENCY CONVERTER HAVE A NICE DAY......"+reset+"              ");
			
				break;	
		}
       


}


void password(){
	System.out.println(green+"Set a password...."+reset);
					
			obj2.setpass(sc.next());
			int c=0,s=0,x=0,d=0;
			for(int i=0;i<(obj2.getpass()).length();i++)
			{
				char ch=(obj2.getpass()).charAt(i);
				if(i==0&&(ch>='A'&&ch<='Z'))
				{
					c++;	
				}
				else if(ch>='a' && ch<='z')
				{
					s++;
				}
				else if(ch>='0'&& ch<='9')
				{
					d++;
				}
				else if(ch!=' ')
				{
					x++;
				}
			}
			if(c==0 || s==0 || d==0 || x==0)
			{
				
				System.out.println(red+"The password you entered is not stable."+reset);
				System.out.println(red+"So,please try again"+reset);
				password();
		
			}
			else
			{		
				obj2.setpassUser(obj2.getpass(),obj2.getUsername());
				
			}
			
}	


void loginpage()
{
	System.out.print(green+"Enter Username:"+reset);
	String u=sc.nextLine();
	System.out.print(green+"Enter password:"+reset);
	String p=sc.nextLine();
	  
	String un=obj2.getUsername();
	String pw=obj2.getpass();
        if( un==null||pw==null)
	{
		System.out.println(red+"you did not register yet...please register now");
		test.obj1.registerpage();
	}
	else{

	}
	System.out.println(green+"Enter Username :"+reset);
	obj2.setUsername(sc.next());
		password();
	if(obj2.getB()==false){
		System.out.println(red+"Your Password Atempts are out of Limit So,try again later"+reset);
		
		
}
		
}
void log(){
				System.out.println(green+"Enter Useraname:"+reset);
				String Username1 = sc.next();
				System.out.println(green+"Enter your Password:"+reset);
				String Password = sc.next();
			
				if(Username1.equals(obj2.getUsername())&&Password.equals(obj2.getpass()))
				{
					System.out.println("                      "+green+"you are Succesfully login in Currency Conveter"+reset+"             ");		
					M();
					System.exit(0);
					
				}
				
				else {
					System.out.println(red+"Invalid Username (or) password please try again..."+reset);
					log();
					
			           }
			
			}

void registerpage()
{
	
			 
			System.out.println(green+"Enter your first name:  "+reset);
			String h=obj2.name();
			System.out.println(green+"Enter your  Last name:   "+reset);
			String g=obj2.name();
				int c=0,d=0;
			String t=h+g;
			int s=h.length();
  		for(int i=0;i<t.length();i++)
		{
		char ch=t.charAt(i);
		if(i==0&&ch>='A'&&ch<='Z')
		{
			d++;
		}
		else if(i==s&&ch>='A'&&ch<='Z')
		{
			d++;
		}
		else if(ch>='a'&&ch<='z')
		{
			d++;
		}
		else
		{
			c++;
			break;
		}
	}
		if(c==1||d>=1&&d<=3)
		{
			System.out.println(red+"Invalid Name"+reset);
			 registerpage();
			
		}
		else if(d>3)
		{
			System.out.println(green+"Enter your gmail"+reset);
			obj2.gmail(sc.next());
			System.out.println(green+"Enter your Mobile Number"+reset);
			obj2.phone_no();
							
			System.out.println(green+"Enter your Username:  "+reset);
			obj2.setUsername(sc.next());
			password();
			
					
			System.out.println(yellow+blink+"                           You are Succesfully Registerd into CURRENCY CONVERTER"+reset);
			System.out.println(green+blink+ "                                  Login into CURRENCY CONVERTER"+reset);
			
			
			log();
		
		}
		
	}
}


class test implements colours{
		static B obj1=new B();
	public static void display(){
		
        System.out.print("                 "+whitebg+blink+REDBRI+"******WELCOME TO CURRENCY CONVERTER*****"+reset+"                ");
	System.out.println("                         "+skblue+"\nEnter 1 for login\nEnter 2 to register"+reset+"                 ");
	String a=B.sc.next();
	switch(a)
	{
	case "1":
		 obj1.loginpage();
			break;
	case "2": obj1.registerpage();
			break;
	default:System.out.println("Invalid Input");
			display();
				break;
        }
	}
	public static void main(String[]args){
		display();
	
}
}
