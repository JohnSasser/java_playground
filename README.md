## Y'all, its called JAVA, like a cup of coffee.... whats not to like. 

1: start by creating a public class to house the root of the program;
  
  public class mainGame {
  public static void main(String[] args) {
  }
 } 
 
 # All classes, functions, variables and logic are rendered from the main public class, so give good definition to your documents.
 
 2: instanciating a variable 
    - declare the variable by assigning the data type and then the name of the variable.
    - Arrays can NOT be updated. 
    - ArrayList() CAN be updated, but is a constructor and needs to be instanciated; 
    
    
  String x = "Guess a random number and narrow until you find it. ";
  int yourNumber = 0;
  float theSecretNumber = 23.5;
  ArrayList<Integer> unluckyNumbers = new ArrayList<>();
  int [] luckyNumbers = {13, 14, 19, 29, 99};
  
 3: logging data to the console
  - System.out.println("");
  
 4: Array & ArrayList<>();
   - arrays can NOT be mutated, it is a static datatype.  
  int [] luckyNumbers = {13, 14, 19, 29, 99};
  
   - ArrayList<> must be instanciated with "new" as a constructor function.
  ArrayList<Integer> unluckyNumbers = new ArrayList<>();

        unluckyNumbers.add(7);
        unluckyNumbers.add(13);
        unluckyNumbers.add(77);
        unluckyNumbers.add(81);
        unluckyNumbers.add(514);
  
 5: LOOPS -- while, for & forEach loops
  - WHILE 
<!--  while condition is true, keep looping  -->
        while(theSecretNumber != yourNumber) {
            // get the input from the user;
            yourNumber = scan.nextInt();
            // check to see if the guess was correct;
            if(yourNumber < theSecretNumber) {
                System.out.println("Your number is too low. ");
            } else if (yourNumber > theSecretNumber) {
                System.out.println("Your number is too high. ");
            }
        }
        System.out.println("You got the random number.");
  
  - FOR
<!--  prints the index each ittiration  -->
    for (int i = 0; i < 9; i++) {
            System.out.println("The Number is " + i + ", ");
          }
                          
  - FOR -- ArrayList<int>():
<!--  use the methods to access properties of unluckyNumners -->
  for (int i = 0; i < unluckyNumbers.size(); i++) {
            System.out.println("The UnluckyNumber at index " + i + " is " + unluckyNumbers.get(i));
        }
        // .size() Method for arrayList index length;
        // .get() Method will extract the index from the active loop;
                          
  - ForEach 
<!--   for loop, but passed an array or ArrayList to loop over   -->
     for (int number : unluckyNumbers) {
            System.out.println("The UnluckyNumber is " + number);
        }
                          
                          
                          
                          
  
