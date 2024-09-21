package java_methods;
/*
In Java, variables are only accessible inside the region they are created. This is called scope.
    When the variable is created inside the region, like curly braces {}, they're just accessible there.
    So if you create a variable in a block code, you can't access it's in other block of code
 */
public class BlockScope {
    public static void main(String[] args) {
        System.out.println(printingName());

        // Trying to access the variable name directly
        //System.out.print(name);
        // Erro: java: cannot find symbol
        //  symbol:   variable name
        //  location: class java_methods.BlockScope
    }
    public static String printingName(){
        // For example here we're storing a variable
        String name = "André";

        // We can access this variable's value returning the method, but just using the method, like:
        return name;
    }
}
