package subside.plugins.koth.events;

import lombok.Getter;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import subside.plugins.koth.adapter.KothDummy;
import subside.plugins.koth.area.Area;

public class KothLeftEvent extends Event implements IEvent {
    private String capper;
    private @Getter int amountSecondsCapped;
    private String nextCapper;
    private @Getter KothDummy koth;
    
    public KothLeftEvent(Area area, String capper, int amountSecondsCapped){
        this.koth = new KothDummy(area);
        this.capper = capper;
        this.amountSecondsCapped = amountSecondsCapped;
    }
    
    public String getPlayerCapping(){
        return capper;
    }
    
    public String getNextCapper(){
        return nextCapper;
    }
    
    public void setNextCapper(String nextCapper){
        this.nextCapper = nextCapper;
    }
    

    private static final HandlerList handlers = new HandlerList();

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    
    public static HandlerList getHandlerList() {
        return handlers;
    }
}