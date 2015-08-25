package FakturaProjekt.client.application.wystawianiefaktur;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HasHandlers;
import com.google.web.bindery.event.shared.HandlerRegistration;

public class EventPrzekazEvent extends GwtEvent<EventPrzekazEvent.EventPrzekazHandler> {
    private static Type<EventPrzekazHandler> TYPE = new Type<EventPrzekazHandler>();
    
    public interface EventPrzekazHandler extends EventHandler {
        void onEventPrzekaz(EventPrzekazEvent event);
    }
    
    public interface EventPrzekazHandlers extends HasHandlers {
        HandlerRegistration addEventPrzekazHandler(EventPrzekazHandler handler);
    }
    
    private final String message;
   
    public EventPrzekazEvent(final String message) {
        this.message = message;
    }

    public static Type<EventPrzekazHandler> getType() {
        return TYPE;
    }

    @Override
    protected void dispatch(final EventPrzekazHandler handler) {
        handler.onEventPrzekaz(this);
    }

    @Override
    public Type<EventPrzekazHandler> getAssociatedType() {
        return TYPE;
    }
    
    public String getMessage() {
        return this.message;
    }
}