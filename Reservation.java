import java.util.Scanner;
class Reservation{
    static Scanner sc = new Scanner(System.in);
    static String username = "admin";
    static String password = "1234";
    static String passengerName;
    static int trainNo;
    static String trainName;
    static String classType;
    static String from;
    static String to;
    static String date;
    static int pnr = 1001;
    static boolean isBooked = false;

public static void main(String args[]) 
{
    System.out.println("*****ONLINE RESERVATION SYSTEM*****");
    System.out.println("Enter username: ");
    String u = sc.next();
    System.out.print("Enter password: ");
    String p = sc.next();
    if (u.equals(username) && p.equals(password))
     {
        System.out.println("\nLogin successful!!\n");
        menu();

     }

    else
    {
        System.out.println("\nInvalid login credentials!");

    }

}

static void menu()
{
     int choice;
     do
     {
        System.out.println("\n1.Reservation");
        System.out.println("2.Cancellation");
        System.out.println("3.Exit");
        System.out.println("Enter your choice: ");

        choice = sc.nextInt();
        switch(choice)
        {
            case 1: reservation();
                    break;
            case 2: cancellation();
                    break;
            case 3: System.out.println("Thank you for using online reservation system!");
                    break;
            
            default: System.out.println("Invalid choices!");        
        }
     }
     while(choice != 3);

}

static void reservation()
{
    
    System.out.println("\n****Reservation form****");
    

    System.out.print("Enter Passenger Name:");
     passengerName = sc.nextLine();

    System.out.print("Enter Train Number: ");
    trainNo = sc.nextInt();
     sc.nextLine();
     System.out.print("Enter train name: ");
     trainName = sc.nextLine();

     System.out.print("Enter class Type(sleeper/AC): ");
     classType = sc.nextLine();

     System.out.print("From: ");
     from = sc.nextLine();

     System.out.print("To: ");
     to = sc.nextLine();

     System.out.print("Date of journey: ");
     date = sc.nextLine();

     isBooked = true;
     System.out.println("/nTicket booked successfully!!");
     System.out.println("Your PNR number is: " + pnr);

    
}

   static void cancellation()
   {
     if(!isBooked)
     {
        System.out.println("\nNo ticket booked yet!");
        return;
     }
     System.out.println("\nEnter PNR number to cancel ticket: ");
     int enteredPnr = sc.nextInt();
     if (enteredPnr == pnr)
        System.out.println("****Ticket details****");
        System.out.println("Train No: " + trainNo);
        System.out.println("Train Name: " + trainName);
        System.out.println("From: " + from);
        System.out.println("To: " + to);
        System.out.println("Date: " + date);
        System.out.println("\nConfirm cancellation (Y/N): ");
        char ch = sc.next().charAt(0);
        if(ch == 'Y' || ch == 'y')
        {
            isBooked = false;
            System.out.println("Ticket cancellation successful!");

        }
        else
        {
            System.out.println("Cancellation Aborted!");

        }
        
            
   }
}