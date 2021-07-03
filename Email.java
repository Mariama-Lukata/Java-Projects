import java.util.*;
public class Email {
    private String firstName;
    private String lastName;
    private  String password;
    private  String department;
    private  int mailboxCapacity =500;
    private int defaultPasswordlength = 10;
    private String alternateEmail;
    private String Email;
    private String companySuffix = ".aeycompany.com";
    //Constructor recieve first and last name
    public Email(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName =lastName;

        this.department = setDepartment();
        this.password = ranPassword(defaultPasswordlength);
        System.out.println("Your password is: "+this.password);
        Email = firstName.toLowerCase()+"."+lastName.toLowerCase()+ "@"+ department+companySuffix;
        System.out.println("Your Email is: "+Email);
    }
    //Ask for department
    private String setDepartment(){
        System.out.print("New Worker "+firstName+". Department CODES:\n 1 for sales\n 2 For Development\n 3 for Accountant\n 0 for none\n Enter department code");
        Scanner in = new Scanner(System.in);
       int depChoice = in.nextInt();
       if( depChoice ==1){ return "sales";}
       else if( depChoice ==2){ return "dev";}
        else if( depChoice ==3){ return "acct";}
        else{return"";}

    }
    //Generate random pw
    private String ranPassword(int length){
        String passwordSet= "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char [] password = new char[length];
        for(int i=0;i < length; i++){
           int ran = (int)(Math.random()*passwordSet.length());
           password[i]= passwordSet.charAt(ran);

        }
        return new String(password);
    }
    //set mailbox capacity
    //Set alt email
    //change pw
public void setEmaiilCapacity(int capacity){
        this.mailboxCapacity=capacity;
}
public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
}
public void changePassword(String password){
        this.password=password;
}
//get mail capacity
    public int getMailboxCapacity(){
        return mailboxCapacity;
    }
    public String getAlternateEmail(){
        return alternateEmail;
    }
    public String getPassword(){
        return password;
    }
    public String showInfo(){
        return "DISPLAY NAME:"+ firstName+" "+lastName +"\nCompany Name: "+Email+"\nMailbox Capacity: "+mailboxCapacity+"mb";
    }
}
