package Evencik;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HasHandlers;

public class EventDoPrzeslaniaEvent extends GwtEvent<EventDoPrzeslaniaEvent.EventDoPrzeslaniaHandler> {
    private static Type<EventDoPrzeslaniaHandler> TYPE = new Type<EventDoPrzeslaniaHandler>();
    
    public interface EventDoPrzeslaniaHandler extends EventHandler {
        void onEventDoPrzeslania(EventDoPrzeslaniaEvent event);
    }
    
    private final String message;
   
    EventDoPrzeslaniaEvent(final String message) {
        this.message = message;
    }
    public static void fire(HasHandlers source, String message) {
        source.fireEvent(new EventDoPrzeslaniaEvent(message));
    }

    public static Type<EventDoPrzeslaniaHandler> getType() {
        return TYPE;
    }

    @Override
    protected void dispatch(EventDoPrzeslaniaHandler handler) {
        handler.onEventDoPrzeslania(this);
    }

    @Override
    public Type<EventDoPrzeslaniaHandler> getAssociatedType() {
        return TYPE;
    }
    
    public String getMessage() {
        return this.message;
    }
}