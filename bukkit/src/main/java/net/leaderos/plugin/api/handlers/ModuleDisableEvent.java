package net.leaderos.plugin.api.handlers;

import lombok.Getter;
import net.leaderos.shared.module.Modulable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * @author poyrazinan
 * @since 1.0
 */
public class ModuleDisableEvent extends Event {

    /**
     * Disabled module object
     * @see Modulable
     */
    @Getter
    private final Modulable module;

    /**
     * ModuleDisableEvent constructor
     *
     * @param module ModuleDisableEvent Object
     *               @see Modulable
     */
    public ModuleDisableEvent(Modulable module) {
        this.module = module;
    }

    /**
     * Spigot handlers requirements
     * @see HandlerList
     */
    private static final HandlerList HANDLERS = new HandlerList();

    /**
     * Spigot handlers requirement
     * @return handler list
     */
    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    /**
     * Spigot handlers requirement
     *      * @return handler list
     * @return HandlerList list
     */
    public static HandlerList getHandlerList() {
        return HANDLERS;
    }
}
