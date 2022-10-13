
package software;


/**
 * the list of possible ways to greet someone...
 * @author chris
 */
public enum Greeting {
    SIMPLE, BUGS_BUNNY, GERMAN, AMERICAN;
    
    public String getGreeting(){
        switch(this){
            case SIMPLE:
                return "Hello World!!!";
            case BUGS_BUNNY:
                return "nah... What's up doc?";
            case GERMAN:
                return "Guten Abend";
            case AMERICAN:
                return "Hey... (head nod)";
            default:
                return "hi";
        }
    }
}
