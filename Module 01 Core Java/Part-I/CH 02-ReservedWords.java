/*
 * Understanding Reserved Words (Keywords) in Java
 */

/*
 * Reserved words are predefined words in Java that have special meanings
 * and cannot be used as identifiers (variable names, method names, class names).
 * 
 * Java has 50 reserved words divided into different categories:
 * 1. Access Modifiers: public, private, protected
 * 2. Class/Method/Variable Modifiers: static, final, abstract, synchronized, etc.
 * 3. Control Flow: if, else, switch, case, default, for, while, do, break, continue
 * 4. Data Types: boolean, byte, char, short, int, long, float, double, void
 * 5. Exception Handling: try, catch, finally, throw, throws
 * 6. Object-Oriented: class, interface, extends, implements, super, this
 * 7. Package/Import: package, import
 * 8. Others: new, return, instanceof, native, strictfp, transient, volatile
 * 
 * Reserved literals: true, false, null
 * Unused reserved words: const, goto
 */

public class ReservedWords {
    
    // Class-level variables demonstrating access modifiers
    // defining the String publicVar
    // public static final String MY_NAME = "anything";

    public static int statticConter = 0;
    
    public String publicVar = "Accessible everywhere";
    private String privateVar = "Only within this class";
    protected String protectedVar = "Within package and subclasses";
    
    // Static and final modifiers
    public static final String CONSTANT = "This is a constant";
    public static int staticCounter = 0;
    
    public static void main(String[] args) {
        System.out.println("1. Access Modifiers and Variable Modifiers:");
        
        ReservedWords obj = new ReservedWords();
        System.out.println("Public variable: " + obj.publicVar);
        // we are making an object then we are accessing it that's why it gives compilation error
        // System.out.println(obj.privateVar); // This would cause compilation error
        System.out.println("Protected variable: " + obj.protectedVar);
        System.out.println("Static constant: " + CONSTANT);
        
        // 2. Data Type Keywords
        System.out.println("\n2. Data Type Keywords:");
        
        boolean booleanVar = true;
        byte byteVar = 127;
        char charVar = 'A';
        short shortVar = 32767;
        int intVar = 2147483647;
        long longVar = 9223372036854775807L;
        float floatVar = 3.14f;
        double doubleVar = 3.14159265359;
        
        System.out.println("boolean: " + booleanVar);
        System.out.println("byte: " + byteVar);
        System.out.println("char: " + charVar);
        System.out.println("short: " + shortVar);
        System.out.println("int: " + intVar);
        System.out.println("long: " + longVar);
        System.out.println("float: " + floatVar);
        System.out.println("double: " + doubleVar);
        
        // 3. Control Flow Keywords
        System.out.println("\n3. Control Flow Keywords:");
        
        // if-else
        if (intVar > 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is not positive");
        }
        
        // switch-case-default
        // charVar which is switch case
        switch(charVar){
            case 'A': 
                System.out.println("hwllo hi!!!!")
                break;
            case 'B':
                System.out.println("hello second!!!");
                break;
            ....
            default:
                System.out.println("anything");
                break;
        }

        
        switch (charVar) {
            case 'A':
                System.out.println("Character is A");
                break;
            case 'B':
                System.out.println("Character is B");
                break;
            default:
                System.out.println("Character is something else");
                break;
        }
        
        // for loop
        System.out.println("For loop with break and continue:");
        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                continue; // Skip iteration when i = 3
            }
            if (i == 7) {
                break; // Exit loop when i = 7
            }
            System.out.print(i + " ");
        }
        System.out.println();
        
        // while loop
        System.out.println("While loop:");
        int count = 0;
        while (count < 3) {
            System.out.println("Count: " + count);
            count++;
        }
        
        // do-while loop
        System.out.println("Do-while loop:");
        int num = 0;
        do {
            System.out.println("Number: " + num);
            num++;
        } while (num < 2);
        
        // 4. Object-Oriented Keywords
        System.out.println("\n4. Object-Oriented Keywords:");
        
        // new keyword

        // java.lang.String

        // here java using the string constant pool
        // Before creating a new object, Java checks the "Pool" (a special memory area in the Heap) to see if that string already exists.
        // memory saving suppose if same object then java points to that...
        // point to the exact same memory address. means same reference
        // str1 == str2 always same as == check for memory value + reference
        String str = "hwllo anything!";

        // explicitly tells the java to bypass the java optmization ....
        // here it is false as reference changes
        String str = new String("Created using new keyword");
        System.out.println(str);
        
        // instanceof keyword
        // str which is String is always an instance of String ....
        if (str instanceof String) {
            System.out.println("str is an instance of String");
        }
        
        // this keyword (demonstrated in method)
        // 
        obj.demonstrateThis();
        
        // 5. Exception Handling Keywords
        // how exception is handled in java....
        System.out.println("\n5. Exception Handling Keywords:");
        
        try {
            int result = 10 / 2; // This won't throw exception
            System.out.println("Division result: " + result);
            
            // This would throw an exception
            // int error = 10 / 0;
            
        } catch (ArithmeticException e) {
            // cathc the exception and show the message....
            System.out.println("Caught arithmetic exception: " + e.getMessage());
        } finally {
            // runs after the try and catch always....
            // either try runs or catch rns....
            // sually for cleanup .... like db connections etc...
            System.out.println("Finally block always executes");
        }

        // wen there is multiple catch block then se the specific one first then gerneral one
        try{
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Finally block always executes");
        }

        // as here str is null so that why it retirns false....
        String str = null;
        if (str instanceof String) {
            // This block will NOT execute
        }

        // even if we have a return statemnt inside try or catch thn also finally block 
        // will execute before the actuall method returns.
        
        // 6. Return keyword
        System.out.println("\n6. Return keyword:");
        int sum = calculateSum(5, 10);
        System.out.println("Sum: " + sum);
        
        // 7. Reserved Literals
        System.out.println("\n7. Reserved Literals:");
        System.out.println("true: " + true);
        System.out.println("false: " + false);
        System.out.println("null: " + null);
    }
    
    // Method demonstrating 'this' keyword
    public void demonstrateThis() {
        // here this is the local keyword - privateVar
        // when we have tp access tje class variable then user - this.privateVar
        String privateVar = "Local variable"; // Same name as instance variable
        System.out.println("Local variable: " + privateVar);
        System.out.println("Instance variable using 'this': " + this.privateVar);
    }
    
    // Method demonstrating 'return' keyword
    public static int calculateSum(int a, int b) {
        return a + b; // return keyword sends value back to caller
    }
}

/*
 * Important Notes about Reserved Words:
 * 
 * 1. Case-sensitive: 'if' is reserved, but 'If' or 'IF' are not
 * 2. Cannot be used as:
 *    - Variable names
 *    - Method names
 *    - Class names
 *    - Package names
 * 3. 'const' and 'goto' are reserved but not used in Java
 * 4. Some words like 'String' are not reserved words but are predefined classes
 * 5. Always use meaningful names that don't conflict with reserved words
 * 
 * Common Mistakes:
 * - Using 'class' as variable name: int class = 10; // ERROR
 * - Using 'public' as method name: void public() {} // ERROR
 * - Case matters: int If = 10; // This is valid (capital I)
 */
