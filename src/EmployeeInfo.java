import java.util.Scanner;
import java.util.regex.Pattern;

public class EmployeeInfo {

  StringBuilder name = new StringBuilder(); //Need to Initalize a stringbuilder because you can append it.
 String code;
  String deptId;
  Pattern p;
  Scanner in;

  public String getDeptId(){

  }
 private void setDeptId(){

 }
 private String getId(){

 }
 private boolean validId(String id){

 }

  public StringBuilder getName(){
return name;
  }
 public String getCode(){
return code;
 }
 private void setName()
 {
    name.append(inputName());
 }
 private void createEmployeeCode(StringBuilder name)
 {
   Boolean containsSpace = name.toString().contains(" ");
   if (containsSpace){
     code = name.toString().substring(0,1);
     int spot = name.toString().indexOf(" ");
     int spot1 = spot;
     code += name.toString().substring(++spot,name.length());

   } else
   {
     //No space default guest
     code = "Guest";
   }
   System.out.println(code);



 }
 private String inputName(){
   Scanner scanner = new Scanner(System.in);

   System.out.println("Enter First Name and Last Named separated by a space");
   String input1 = scanner.nextLine();
   //name.append(input1);
   System.out.println(input1);

   return input1;
 }
 private boolean checkName(StringBuilder name)
 {
   Boolean validInput = false;
   if (name.length()==0){
     System.out.println("Sorry you didn't enter anything try again");
     inputName();
   } else{

   }
   Boolean containsSpace = name.toString().contains(" ");
   if (containsSpace)
   {
     //String isn't empty and has a space  so it must be valid
      validInput= true;
   }
   else
   {
     System.out.println("No Space");

   }
   return validInput;
 }

  public EmployeeInfo() {
    Scanner scanner = new Scanner(System.in);

    setName();
    checkName(name);
    createEmployeeCode(name);

  }
}
