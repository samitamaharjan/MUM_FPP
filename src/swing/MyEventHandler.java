package swing;
import java.util.HashMap;
import java.util.Map;

class MyEventHandler {
    
    public static void main (String[] args) {
        
        char button1 = 'a';
        char button2 = 'b';
        
        Action action1 = new Action() {
            @Override
            public void doIt() {
                System.out.println("A for Apple!");
            }
        };
        
        Action action2 = new Action() {
            @Override
            public void doIt() {
                System.out.println("B for Ball!");
            }
        };
        
        EventHandler eventHandler = new EventHandlerImpl();
        eventHandler.registerEvent(button1, action1);
        eventHandler.registerEvent(button2, action2);
        
        char clickedButton = button1; // button clicked by user
        eventHandler.performEvent(clickedButton);
    }
}

interface Action {
    public void doIt();
}

interface EventHandler {
    public void registerEvent(Character ch, Action action);
    public void performEvent(Character ch);
}

class EventHandlerImpl implements EventHandler {
    
    private Map<Character, Action> map = new HashMap<>();
    
    public void registerEvent(Character ch, Action action) {
        map.put(ch, action);
    }
    
    public void performEvent(Character ch) {
        Action action = map.get(ch);
        action.doIt();
    }
}