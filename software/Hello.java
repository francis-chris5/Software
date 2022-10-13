
package software;


public class Hello implements SoftwareInterfacingRules {
    private Greeting greeting;
    
    public Hello(){
        
    }
    
    /**
     * the constructor we probably want to use...
     * @param greeting Greeting for the message to send back
     */
    public Hello(Greeting greeting){
        this.greeting = greeting;
    }
    
    
    public String getGreeting(){
        return greeting.getGreeting();
    }
    
    
    /**
     * actually outputting the hello message...
     * @return String representing the greeting...
     */
    @Override
    public String SayHi(){
        return this.getGreeting();
    }
    
}
