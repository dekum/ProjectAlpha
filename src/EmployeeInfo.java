import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * EmployeeInfo.java
 * 10/26/2018
 * Philemon Petit-Frere
 * The department code is made up of four letters and two numbers.
 * The format of the department code is the first letter must be in uppercase with the following three all
 * being lowercase and no spaces.
 *
 *
 * sources: https://regexr.com/ (For making java patterns)
 */

public class EmployeeInfo {

  StringBuilder name = new StringBuilder(); //Need to Initalize a stringbuilder because you can append it.
 String code;
  String deptId;
  Pattern p;
  Scanner in;

  public String reverseString(String id){
    String reverse = "";


    for(int i = id.length() - 1; i >= 0; i--)
    {
      reverse = reverse + id.charAt(i);
    }

    System.out.println("Reversed string is:");
    System.out.println(reverse);
    return id;

  };

  public String getDeptId(){
    System.out.println("Print Dept ID");
    String input2 = in.nextLine();
 //   String input2 = "Jake22";;
    return input2;

  }
 private void setDeptId(){
   String inputId = getDeptId();
   //Boolean isValid = validId(deptId);
   if (validId(inputId)){
     //if the ID is valid, then match them
     reverseString(inputId); //Really confused on Step 20, is DeptId supposed to be reversed, or what the user inputted.
     deptId = deptId;
   }else{
     deptId = "None01";
   }
   System.out.println(deptId);

 }
 private String getId(){
   return deptId;
  }
 private boolean validId(String id){
Boolean matches =false;

   Matcher matcher = p.matcher(id);
   matches = matcher.matches();
   if (matches){
     System.out.println("MATCGHES!!!");
   }

    return matches;
   // return deptId.equals(id);

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
    in = new Scanner(System.in);

    setName();
    checkName(name);
    createEmployeeCode(name);
    String patternString = "([A-Z])[a-z][a-z][a-z]\\d\\d";
    p = Pattern.compile(patternString);
    setDeptId();
    in.close();


  }

  @Override
  public String toString() {
    return "EmployeeInfo" +
        "code='" + code + '\'' +
        ", deptId='" + deptId + '\'' +
        '}';
  }
}
