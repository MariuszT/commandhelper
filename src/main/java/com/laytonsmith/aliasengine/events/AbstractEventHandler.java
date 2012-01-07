/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laytonsmith.aliasengine.events;

import com.laytonsmith.aliasengine.Constructs.CArray;
import com.laytonsmith.aliasengine.Constructs.Construct;
import com.laytonsmith.aliasengine.exceptions.EventException;
import com.laytonsmith.aliasengine.exceptions.PrefilterNonMatchException;
import java.util.Map;

/**
 * This interface contains all the methods needed to manipulate a particular
 * event in a particular implementation. Methods that are common to all events
 * in this implementation go in AbstractEventMixin instead.
 * @author layton
 */
public interface AbstractEventHandler {
    /**
     * If a given prefilter matches the given implementation specific event.
     * @param prefilter
     * @param e
     * @return
     * @throws PrefilterNonMatchException 
     */
    public boolean matches(Map<String, Construct> prefilter, Object e) throws PrefilterNonMatchException;
    /**
     * Given the specified event, change the event data into a Map of data (which is then further
     * converted into a CArray later)
     * @param e
     * @param mixin
     * @return
     * @throws EventException 
     */
    public Map<String, Construct> evaluate(Object e, AbstractEventMixin mixin) throws EventException;
    /**
     * Converts a CArray into an actual implementation specific event, so it can be
     * manually triggered
     * @param manual
     * @return 
     */
    public Object convert(CArray manual);
    /**
     * Given a key, a value, and an event, this function should modify the implementation
     * event as specified.
     * @param key
     * @param value
     * @param event 
     */
    public void modifyEvent(String key, Construct value, Object event);
}
